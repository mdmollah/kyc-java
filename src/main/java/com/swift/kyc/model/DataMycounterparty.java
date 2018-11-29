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
 * DataMycounterparty
 */
public class DataMycounterparty {
  @SerializedName("bic")
  private String bic = null;

  @SerializedName("legalName")
  private String legalName = null;

  public DataMycounterparty bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * 
   * @return bic
  **/
  @ApiModelProperty(example = "LONGAEADXXX", value = "")
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public DataMycounterparty legalName(String legalName) {
    this.legalName = legalName;
    return this;
  }

   /**
   * 
   * @return legalName
  **/
  @ApiModelProperty(example = "LONGBRIDGE BANK N.A.", value = "")
  public String getLegalName() {
    return legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataMycounterparty dataMycounterparty = (DataMycounterparty) o;
    return Objects.equals(this.bic, dataMycounterparty.bic) &&
        Objects.equals(this.legalName, dataMycounterparty.legalName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bic, legalName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataMycounterparty {\n");
    
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
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

