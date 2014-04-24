/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * Modify at your own risk.
 */

package com.google.api.services.genomics.model;

/**
 * The variant data export request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 */
@SuppressWarnings("javadoc")
public final class ExportVariantsRequest extends com.google.api.client.json.GenericJson {

  /**
   * If provided, only variant call information from the specified callsets will be exported. By
   * default all variant calls are exported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> callsetIds;

  /**
   * The IDs of the datasets that contain variant data which should be exported. At least one
   * dataset ID must be provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> datasetIds;

  /**
   * The URI to export to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String exportUri;

  /**
   * The format for the exported data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String format;

  /**
   * The Google Cloud project number that owns this export. This is the project that will be billed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long projectId;

  /**
   * If provided, only variant call information from the specified callsets will be exported. By
   * default all variant calls are exported.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCallsetIds() {
    return callsetIds;
  }

  /**
   * If provided, only variant call information from the specified callsets will be exported. By
   * default all variant calls are exported.
   * @param callsetIds callsetIds or {@code null} for none
   */
  public ExportVariantsRequest setCallsetIds(java.util.List<java.lang.String> callsetIds) {
    this.callsetIds = callsetIds;
    return this;
  }

  /**
   * The IDs of the datasets that contain variant data which should be exported. At least one
   * dataset ID must be provided.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDatasetIds() {
    return datasetIds;
  }

  /**
   * The IDs of the datasets that contain variant data which should be exported. At least one
   * dataset ID must be provided.
   * @param datasetIds datasetIds or {@code null} for none
   */
  public ExportVariantsRequest setDatasetIds(java.util.List<java.lang.String> datasetIds) {
    this.datasetIds = datasetIds;
    return this;
  }

  /**
   * The URI to export to.
   * @return value or {@code null} for none
   */
  public java.lang.String getExportUri() {
    return exportUri;
  }

  /**
   * The URI to export to.
   * @param exportUri exportUri or {@code null} for none
   */
  public ExportVariantsRequest setExportUri(java.lang.String exportUri) {
    this.exportUri = exportUri;
    return this;
  }

  /**
   * The format for the exported data.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormat() {
    return format;
  }

  /**
   * The format for the exported data.
   * @param format format or {@code null} for none
   */
  public ExportVariantsRequest setFormat(java.lang.String format) {
    this.format = format;
    return this;
  }

  /**
   * The Google Cloud project number that owns this export. This is the project that will be billed.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProjectId() {
    return projectId;
  }

  /**
   * The Google Cloud project number that owns this export. This is the project that will be billed.
   * @param projectId projectId or {@code null} for none
   */
  public ExportVariantsRequest setProjectId(java.lang.Long projectId) {
    this.projectId = projectId;
    return this;
  }

  @Override
  public ExportVariantsRequest set(String fieldName, Object value) {
    return (ExportVariantsRequest) super.set(fieldName, value);
  }

  @Override
  public ExportVariantsRequest clone() {
    return (ExportVariantsRequest) super.clone();
  }

}