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
import com.swift.kyc.model.LicenceInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LicencesInfo
 */
public class LicencesInfo {
  @SerializedName("LicenceInfo")
  private LicenceInfo licenceInfo = null;

  public LicencesInfo licenceInfo(LicenceInfo licenceInfo) {
    this.licenceInfo = licenceInfo;
    return this;
  }

   /**
   * Get licenceInfo
   * @return licenceInfo
  **/
  @ApiModelProperty(value = "")
  public LicenceInfo getLicenceInfo() {
    return licenceInfo;
  }

  public void setLicenceInfo(LicenceInfo licenceInfo) {
    this.licenceInfo = licenceInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicencesInfo licencesInfo = (LicencesInfo) o;
    return Objects.equals(this.licenceInfo, licencesInfo.licenceInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenceInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicencesInfo {\n");
    
    sb.append("    licenceInfo: ").append(toIndentedString(licenceInfo)).append("\n");
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

