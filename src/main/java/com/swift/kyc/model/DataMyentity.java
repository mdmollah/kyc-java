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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DataMyentity
 */
public class DataMyentity {
  @SerializedName("legalName")
  private String legalName = null;

  @SerializedName("bic")
  private String bic = null;

  public DataMyentity legalName(String legalName) {
    this.legalName = legalName;
    return this;
  }

   /**
   * 
   * @return legalName
  **/
  @ApiModelProperty(example = "GLOBAL BANK BADEN-WUERTTEMBERG", value = "")
  public String getLegalName() {
    return legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }

  public DataMyentity bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * 
   * @return bic
  **/
  @ApiModelProperty(example = "GLOBDESTXXX", value = "")
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataMyentity dataMyentity = (DataMyentity) o;
    return Objects.equals(this.legalName, dataMyentity.legalName) &&
        Objects.equals(this.bic, dataMyentity.bic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalName, bic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataMyentity {\n");
    
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
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

