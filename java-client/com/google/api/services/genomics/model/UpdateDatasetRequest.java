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
 * Model definition for UpdateDatasetRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 */
@SuppressWarnings("javadoc")
public final class UpdateDatasetRequest extends com.google.api.client.json.GenericJson {

  /**
   * The dataset ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Flag indicating whether or not a dataset is publicly viewable. If a dataset is not public, it
   * inherits viewing permissions from its project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isPublic;

  /**
   * The Google Cloud Console project number that this dataset belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long projectId;

  /**
   * The dataset ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The dataset ID.
   * @param id id or {@code null} for none
   */
  public UpdateDatasetRequest setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Flag indicating whether or not a dataset is publicly viewable. If a dataset is not public, it
   * inherits viewing permissions from its project.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsPublic() {
    return isPublic;
  }

  /**
   * Flag indicating whether or not a dataset is publicly viewable. If a dataset is not public, it
   * inherits viewing permissions from its project.
   * @param isPublic isPublic or {@code null} for none
   */
  public UpdateDatasetRequest setIsPublic(java.lang.Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

  /**
   * The Google Cloud Console project number that this dataset belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProjectId() {
    return projectId;
  }

  /**
   * The Google Cloud Console project number that this dataset belongs to.
   * @param projectId projectId or {@code null} for none
   */
  public UpdateDatasetRequest setProjectId(java.lang.Long projectId) {
    this.projectId = projectId;
    return this;
  }

  @Override
  public UpdateDatasetRequest set(String fieldName, Object value) {
    return (UpdateDatasetRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateDatasetRequest clone() {
    return (UpdateDatasetRequest) super.clone();
  }

}
