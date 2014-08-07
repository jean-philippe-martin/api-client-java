/*
Copyright 2014 Google Inc. All rights reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.cloud.genomics.api.client.commands;

import com.beust.jcommander.internal.Lists;
import com.google.api.client.util.store.MemoryDataStoreFactory;
import com.google.api.services.genomics.model.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import java.math.BigInteger;

import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class ListDatasetsCommandTest extends CommandTest {

  @Test
  public void testListDatasets_noneAvailable() throws Exception {
    ListDatasetsCommand command = new ListDatasetsCommand();
    command.setDataStoreFactory(new MemoryDataStoreFactory());

    command.handleRequest(null /* should be unused */);

    String output = outContent.toString();
    assertTrue(output, output.contains("There aren't any"));
  }

  @Test
  public void testListDatasets_withoutDetails() throws Exception {
    ListDatasetsCommand command = new ListDatasetsCommand();
    command.setDataStoreFactory(new MemoryDataStoreFactory());

    command.addDatasetToHistory(new Dataset().setName("name").setId("id"));
    command.handleRequest(null /* should be unused */);

    String output = outContent.toString();
    assertTrue(output, output.contains("id: name"));
  }

  @Test
  public void testListDatasets_withDetails() throws Exception {
    ListDatasetsCommand command = new ListDatasetsCommand();
    command.projectId = 10L;
    command.includeDetails = true;

    Mockito.when(datasets.list()).thenReturn(datasetList);
    Mockito.when(datasetList.setProjectId(10L)).thenReturn(datasetList);
    Mockito.when(datasetList.execute()).thenReturn(new ListDatasetsResponse()
        .setDatasets(Lists.newArrayList(
            new Dataset().setId("id1").setName("name").setProjectId(1234L))));

    // Readset summary
    Mockito.when(readsets.search(new SearchReadsetsRequest()
        .setDatasetIds(Lists.newArrayList("id1")).setMaxResults(BigInteger.valueOf(100L))))
        .thenReturn(readsetSearch);
    Mockito.when(readsetSearch.execute()).thenReturn(new SearchReadsetsResponse()
        .setReadsets(Lists.newArrayList(new Readset(), new Readset())));

    // Variant summary
    Mockito.when(variants.getSummary()).thenReturn(variantSummary);
    Mockito.when(variantSummary.setDatasetId("id1")).thenReturn(variantSummary);
    Mockito.when(variantSummary.execute()).thenReturn(new GetVariantsSummaryResponse()
        .setContigBounds(Lists.newArrayList(new ContigBound().setContig("contigX"))));

    command.handleRequest(genomics);

    String output = outContent.toString();
    assertTrue(output, output.contains("id1: name"));
    assertTrue(output, output.contains("1234"));
    assertTrue(output, output.contains("Readsets: 2"));
    assertTrue(output, output.contains("Variant summary:"));
    assertTrue(output, output.contains("contigX"));
  }

}