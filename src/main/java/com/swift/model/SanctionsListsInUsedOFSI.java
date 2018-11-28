/*
 * KYC API
 */


package com.swift.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * SanctionsListsInUsedOFSI
 */
public class SanctionsListsInUsedOFSI {
  @SerializedName("SanctionsListInUsedOFSI")
  private String sanctionsListInUsedOFSI = null;

  public SanctionsListsInUsedOFSI sanctionsListInUsedOFSI(String sanctionsListInUsedOFSI) {
    this.sanctionsListInUsedOFSI = sanctionsListInUsedOFSI;
    return this;
  }

   /**
   * 
   * @return sanctionsListInUsedOFSI
  **/
  @ApiModelProperty(example = "Used for screening customers and beneficial owners (i.e. reference data)", value = "")
  public String getSanctionsListInUsedOFSI() {
    return sanctionsListInUsedOFSI;
  }

  public void setSanctionsListInUsedOFSI(String sanctionsListInUsedOFSI) {
    this.sanctionsListInUsedOFSI = sanctionsListInUsedOFSI;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SanctionsListsInUsedOFSI sanctionsListsInUsedOFSI = (SanctionsListsInUsedOFSI) o;
    return Objects.equals(this.sanctionsListInUsedOFSI, sanctionsListsInUsedOFSI.sanctionsListInUsedOFSI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sanctionsListInUsedOFSI);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SanctionsListsInUsedOFSI {\n");
    
    sb.append("    sanctionsListInUsedOFSI: ").append(toIndentedString(sanctionsListInUsedOFSI)).append("\n");
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

