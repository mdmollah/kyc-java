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
import com.swift.kyc.model.SanctionsListsInUsedEU;
import com.swift.kyc.model.SanctionsListsInUsedG7;
import com.swift.kyc.model.SanctionsListsInUsedOFAC;
import com.swift.kyc.model.SanctionsListsInUsedOFSI;
import com.swift.kyc.model.SanctionsListsInUsedUN;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SanctionsListsInUsed
 */
public class SanctionsListsInUsed {
  @SerializedName("SanctionsListsInUsedUN")
  private SanctionsListsInUsedUN sanctionsListsInUsedUN = null;

  @SerializedName("SanctionsListsInUsedOFAC")
  private SanctionsListsInUsedOFAC sanctionsListsInUsedOFAC = null;

  @SerializedName("SanctionsListsInUsedOFSI")
  private SanctionsListsInUsedOFSI sanctionsListsInUsedOFSI = null;

  @SerializedName("SanctionsListsInUsedEU")
  private SanctionsListsInUsedEU sanctionsListsInUsedEU = null;

  @SerializedName("SanctionsListsInUsedG7")
  private SanctionsListsInUsedG7 sanctionsListsInUsedG7 = null;

  public SanctionsListsInUsed sanctionsListsInUsedUN(SanctionsListsInUsedUN sanctionsListsInUsedUN) {
    this.sanctionsListsInUsedUN = sanctionsListsInUsedUN;
    return this;
  }

   /**
   * Get sanctionsListsInUsedUN
   * @return sanctionsListsInUsedUN
  **/
  @ApiModelProperty(value = "")
  public SanctionsListsInUsedUN getSanctionsListsInUsedUN() {
    return sanctionsListsInUsedUN;
  }

  public void setSanctionsListsInUsedUN(SanctionsListsInUsedUN sanctionsListsInUsedUN) {
    this.sanctionsListsInUsedUN = sanctionsListsInUsedUN;
  }

  public SanctionsListsInUsed sanctionsListsInUsedOFAC(SanctionsListsInUsedOFAC sanctionsListsInUsedOFAC) {
    this.sanctionsListsInUsedOFAC = sanctionsListsInUsedOFAC;
    return this;
  }

   /**
   * Get sanctionsListsInUsedOFAC
   * @return sanctionsListsInUsedOFAC
  **/
  @ApiModelProperty(value = "")
  public SanctionsListsInUsedOFAC getSanctionsListsInUsedOFAC() {
    return sanctionsListsInUsedOFAC;
  }

  public void setSanctionsListsInUsedOFAC(SanctionsListsInUsedOFAC sanctionsListsInUsedOFAC) {
    this.sanctionsListsInUsedOFAC = sanctionsListsInUsedOFAC;
  }

  public SanctionsListsInUsed sanctionsListsInUsedOFSI(SanctionsListsInUsedOFSI sanctionsListsInUsedOFSI) {
    this.sanctionsListsInUsedOFSI = sanctionsListsInUsedOFSI;
    return this;
  }

   /**
   * Get sanctionsListsInUsedOFSI
   * @return sanctionsListsInUsedOFSI
  **/
  @ApiModelProperty(value = "")
  public SanctionsListsInUsedOFSI getSanctionsListsInUsedOFSI() {
    return sanctionsListsInUsedOFSI;
  }

  public void setSanctionsListsInUsedOFSI(SanctionsListsInUsedOFSI sanctionsListsInUsedOFSI) {
    this.sanctionsListsInUsedOFSI = sanctionsListsInUsedOFSI;
  }

  public SanctionsListsInUsed sanctionsListsInUsedEU(SanctionsListsInUsedEU sanctionsListsInUsedEU) {
    this.sanctionsListsInUsedEU = sanctionsListsInUsedEU;
    return this;
  }

   /**
   * Get sanctionsListsInUsedEU
   * @return sanctionsListsInUsedEU
  **/
  @ApiModelProperty(value = "")
  public SanctionsListsInUsedEU getSanctionsListsInUsedEU() {
    return sanctionsListsInUsedEU;
  }

  public void setSanctionsListsInUsedEU(SanctionsListsInUsedEU sanctionsListsInUsedEU) {
    this.sanctionsListsInUsedEU = sanctionsListsInUsedEU;
  }

  public SanctionsListsInUsed sanctionsListsInUsedG7(SanctionsListsInUsedG7 sanctionsListsInUsedG7) {
    this.sanctionsListsInUsedG7 = sanctionsListsInUsedG7;
    return this;
  }

   /**
   * Get sanctionsListsInUsedG7
   * @return sanctionsListsInUsedG7
  **/
  @ApiModelProperty(value = "")
  public SanctionsListsInUsedG7 getSanctionsListsInUsedG7() {
    return sanctionsListsInUsedG7;
  }

  public void setSanctionsListsInUsedG7(SanctionsListsInUsedG7 sanctionsListsInUsedG7) {
    this.sanctionsListsInUsedG7 = sanctionsListsInUsedG7;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SanctionsListsInUsed sanctionsListsInUsed = (SanctionsListsInUsed) o;
    return Objects.equals(this.sanctionsListsInUsedUN, sanctionsListsInUsed.sanctionsListsInUsedUN) &&
        Objects.equals(this.sanctionsListsInUsedOFAC, sanctionsListsInUsed.sanctionsListsInUsedOFAC) &&
        Objects.equals(this.sanctionsListsInUsedOFSI, sanctionsListsInUsed.sanctionsListsInUsedOFSI) &&
        Objects.equals(this.sanctionsListsInUsedEU, sanctionsListsInUsed.sanctionsListsInUsedEU) &&
        Objects.equals(this.sanctionsListsInUsedG7, sanctionsListsInUsed.sanctionsListsInUsedG7);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sanctionsListsInUsedUN, sanctionsListsInUsedOFAC, sanctionsListsInUsedOFSI, sanctionsListsInUsedEU, sanctionsListsInUsedG7);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SanctionsListsInUsed {\n");
    
    sb.append("    sanctionsListsInUsedUN: ").append(toIndentedString(sanctionsListsInUsedUN)).append("\n");
    sb.append("    sanctionsListsInUsedOFAC: ").append(toIndentedString(sanctionsListsInUsedOFAC)).append("\n");
    sb.append("    sanctionsListsInUsedOFSI: ").append(toIndentedString(sanctionsListsInUsedOFSI)).append("\n");
    sb.append("    sanctionsListsInUsedEU: ").append(toIndentedString(sanctionsListsInUsedEU)).append("\n");
    sb.append("    sanctionsListsInUsedG7: ").append(toIndentedString(sanctionsListsInUsedG7)).append("\n");
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

