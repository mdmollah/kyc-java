/*
 * KYC API
 */



package com.swift.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * SanctionsListsInUsedG7
 */
public class SanctionsListsInUsedG7 {
  @SerializedName("SanctionsListInUsedG7")
  private String sanctionsListInUsedG7 = null;

  public SanctionsListsInUsedG7 sanctionsListInUsedG7(String sanctionsListInUsedG7) {
    this.sanctionsListInUsedG7 = sanctionsListInUsedG7;
    return this;
  }

   /**
   * 
   * @return sanctionsListInUsedG7
  **/
  @ApiModelProperty(example = "Used for filtering transactional data (MT fields)", value = "")
  public String getSanctionsListInUsedG7() {
    return sanctionsListInUsedG7;
  }

  public void setSanctionsListInUsedG7(String sanctionsListInUsedG7) {
    this.sanctionsListInUsedG7 = sanctionsListInUsedG7;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SanctionsListsInUsedG7 sanctionsListsInUsedG7 = (SanctionsListsInUsedG7) o;
    return Objects.equals(this.sanctionsListInUsedG7, sanctionsListsInUsedG7.sanctionsListInUsedG7);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sanctionsListInUsedG7);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SanctionsListsInUsedG7 {\n");
    
    sb.append("    sanctionsListInUsedG7: ").append(toIndentedString(sanctionsListInUsedG7)).append("\n");
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

