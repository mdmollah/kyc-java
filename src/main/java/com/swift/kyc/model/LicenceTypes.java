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
 * LicenceTypes
 */
public class LicenceTypes {
  @SerializedName("LicenceType")
  private String licenceType = null;

  public LicenceTypes licenceType(String licenceType) {
    this.licenceType = licenceType;
    return this;
  }

   /**
   * 
   * @return licenceType
  **/
  @ApiModelProperty(example = "Full Licence", value = "")
  public String getLicenceType() {
    return licenceType;
  }

  public void setLicenceType(String licenceType) {
    this.licenceType = licenceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenceTypes licenceTypes = (LicenceTypes) o;
    return Objects.equals(this.licenceType, licenceTypes.licenceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenceType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenceTypes {\n");
    
    sb.append("    licenceType: ").append(toIndentedString(licenceType)).append("\n");
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

