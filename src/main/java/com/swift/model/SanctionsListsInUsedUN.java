/*
 * KYC API
 */


package com.swift.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * SanctionsListsInUsedUN
 */
public class SanctionsListsInUsedUN {
  @SerializedName("SanctionsListInUsedUN")
  private String sanctionsListInUsedUN = null;

  public SanctionsListsInUsedUN sanctionsListInUsedUN(String sanctionsListInUsedUN) {
    this.sanctionsListInUsedUN = sanctionsListInUsedUN;
    return this;
  }

   /**
   * 
   * @return sanctionsListInUsedUN
  **/
  @ApiModelProperty(example = "Used for screening customers and beneficial owners (i.e. reference data)", value = "")
  public String getSanctionsListInUsedUN() {
    return sanctionsListInUsedUN;
  }

  public void setSanctionsListInUsedUN(String sanctionsListInUsedUN) {
    this.sanctionsListInUsedUN = sanctionsListInUsedUN;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SanctionsListsInUsedUN sanctionsListsInUsedUN = (SanctionsListsInUsedUN) o;
    return Objects.equals(this.sanctionsListInUsedUN, sanctionsListsInUsedUN.sanctionsListInUsedUN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sanctionsListInUsedUN);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SanctionsListsInUsedUN {\n");
    
    sb.append("    sanctionsListInUsedUN: ").append(toIndentedString(sanctionsListInUsedUN)).append("\n");
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

