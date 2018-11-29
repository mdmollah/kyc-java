/*
 * KYC API
 * Move your app forward with the kyc API
 */

package com.swift.kyc.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.swift.kyc.model.DocumentObj;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Document201
 */
public class Document201 {
  @SerializedName("bic")
  private String bic = null;

  @SerializedName("documents")
  private List<DocumentObj> documents = null;

  public Document201 bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * 
   * @return bic
  **/
  @ApiModelProperty(value = "")
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public Document201 documents(List<DocumentObj> documents) {
    this.documents = documents;
    return this;
  }

  public Document201 addDocumentsItem(DocumentObj documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<DocumentObj>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * 
   * @return documents
  **/
  @ApiModelProperty(value = "")
  public List<DocumentObj> getDocuments() {
    return documents;
  }

  public void setDocuments(List<DocumentObj> documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document201 document201 = (Document201) o;
    return Objects.equals(this.bic, document201.bic) &&
        Objects.equals(this.documents, document201.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bic, documents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document201 {\n");
    
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

