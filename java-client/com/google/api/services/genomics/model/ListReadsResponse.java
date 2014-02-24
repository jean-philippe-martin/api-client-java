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
 * Model definition for ListReadsResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 */
@SuppressWarnings("javadoc")
public final class ListReadsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in
   * a subsequent request to return the next page of results. This field will be empty if there
   * aren't any additional results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of matching Reads. The resulting Reads are sorted by position. Unmapped reads, which
   * have no position, are returned last and are further sorted by name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Read> reads;

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in
   * a subsequent request to return the next page of results. This field will be empty if there
   * aren't any additional results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in
   * a subsequent request to return the next page of results. This field will be empty if there
   * aren't any additional results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListReadsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of matching Reads. The resulting Reads are sorted by position. Unmapped reads, which
   * have no position, are returned last and are further sorted by name.
   * @return value or {@code null} for none
   */
  public java.util.List<Read> getReads() {
    return reads;
  }

  /**
   * The list of matching Reads. The resulting Reads are sorted by position. Unmapped reads, which
   * have no position, are returned last and are further sorted by name.
   * @param reads reads or {@code null} for none
   */
  public ListReadsResponse setReads(java.util.List<Read> reads) {
    this.reads = reads;
    return this;
  }

  @Override
  public ListReadsResponse set(String fieldName, Object value) {
    return (ListReadsResponse) super.set(fieldName, value);
  }

  @Override
  public ListReadsResponse clone() {
    return (ListReadsResponse) super.clone();
  }

}
