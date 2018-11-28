/*
 * KYC API
 */


package com.swift.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * SanctionsListsInUsedOFAC
 */
public class SanctionsListsInUsedOFAC {
  @SerializedName("SanctionsListInUsedOFAC")
  private String sanctionsListInUsedOFAC = null;

  public SanctionsListsInUsedOFAC sanctionsListInUsedOFAC(String sanctionsListInUsedOFAC) {
    this.sanctionsListInUsedOFAC = sanctionsListInUsedOFAC;
    return this;
  }

   /**
   * 
   * @return sanctionsListInUsedOFAC
  **/
  @ApiModelProperty(example = "Used for screening customers and beneficial owners (i.e. reference data)", value = "")
  public String getSanctionsListInUsedOFAC() {
    return sanctionsListInUsedOFAC;
  }

  public void setSanctionsListInUsedOFAC(String sanctionsListInUsedOFAC) {
    this.sanctionsListInUsedOFAC = sanctionsListInUsedOFAC;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SanctionsListsInUsedOFAC sanctionsListsInUsedOFAC = (SanctionsListsInUsedOFAC) o;
    return Objects.equals(this.sanctionsListInUsedOFAC, sanctionsListsInUsedOFAC.sanctionsListInUsedOFAC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sanctionsListInUsedOFAC);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SanctionsListsInUsedOFAC {\n");
    
    sb.append("    sanctionsListInUsedOFAC: ").append(toIndentedString(sanctionsListInUsedOFAC)).append("\n");
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

