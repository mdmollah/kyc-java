/*
 * KYC API
 */


package com.swift.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * IndustryClassifications
 */
public class IndustryClassifications {
  @SerializedName("IndustryClassification")
  private String industryClassification = null;

  public IndustryClassifications industryClassification(String industryClassification) {
    this.industryClassification = industryClassification;
    return this;
  }

   /**
   * 
   * @return industryClassification
  **/
  @ApiModelProperty(example = "SIC", value = "")
  public String getIndustryClassification() {
    return industryClassification;
  }

  public void setIndustryClassification(String industryClassification) {
    this.industryClassification = industryClassification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndustryClassifications industryClassifications = (IndustryClassifications) o;
    return Objects.equals(this.industryClassification, industryClassifications.industryClassification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(industryClassification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndustryClassifications {\n");
    
    sb.append("    industryClassification: ").append(toIndentedString(industryClassification)).append("\n");
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

