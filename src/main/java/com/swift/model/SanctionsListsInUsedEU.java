/*
 * KYC API
 */


package com.swift.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * SanctionsListsInUsedEU
 */
public class SanctionsListsInUsedEU {
  @SerializedName("SanctionsListInUsedEU")
  private String sanctionsListInUsedEU = null;

  public SanctionsListsInUsedEU sanctionsListInUsedEU(String sanctionsListInUsedEU) {
    this.sanctionsListInUsedEU = sanctionsListInUsedEU;
    return this;
  }

   /**
   * 
   * @return sanctionsListInUsedEU
  **/
  @ApiModelProperty(example = "Used for filtering transactional data (MT fields)", value = "")
  public String getSanctionsListInUsedEU() {
    return sanctionsListInUsedEU;
  }

  public void setSanctionsListInUsedEU(String sanctionsListInUsedEU) {
    this.sanctionsListInUsedEU = sanctionsListInUsedEU;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SanctionsListsInUsedEU sanctionsListsInUsedEU = (SanctionsListsInUsedEU) o;
    return Objects.equals(this.sanctionsListInUsedEU, sanctionsListsInUsedEU.sanctionsListInUsedEU);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sanctionsListInUsedEU);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SanctionsListsInUsedEU {\n");
    
    sb.append("    sanctionsListInUsedEU: ").append(toIndentedString(sanctionsListInUsedEU)).append("\n");
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

