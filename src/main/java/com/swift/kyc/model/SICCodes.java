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
 * SICCodes
 */
public class SICCodes {
  @SerializedName("SICCode")
  private String siCCode = null;

  public SICCodes siCCode(String siCCode) {
    this.siCCode = siCCode;
    return this;
  }

   /**
   * 
   * @return siCCode
  **/
  @ApiModelProperty(example = "6021 - National Commercial Banks", value = "")
  public String getSiCCode() {
    return siCCode;
  }

  public void setSiCCode(String siCCode) {
    this.siCCode = siCCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SICCodes siCCodes = (SICCodes) o;
    return Objects.equals(this.siCCode, siCCodes.siCCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siCCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SICCodes {\n");
    
    sb.append("    siCCode: ").append(toIndentedString(siCCode)).append("\n");
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

