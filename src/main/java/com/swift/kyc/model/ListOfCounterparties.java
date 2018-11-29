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
import com.swift.kyc.model.DataMycounterparty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ListOfCounterparties
 */
public class ListOfCounterparties {
  @SerializedName("myCounterparty")
  private List<DataMycounterparty> myCounterparty = null;

  public ListOfCounterparties myCounterparty(List<DataMycounterparty> myCounterparty) {
    this.myCounterparty = myCounterparty;
    return this;
  }

  public ListOfCounterparties addMyCounterpartyItem(DataMycounterparty myCounterpartyItem) {
    if (this.myCounterparty == null) {
      this.myCounterparty = new ArrayList<DataMycounterparty>();
    }
    this.myCounterparty.add(myCounterpartyItem);
    return this;
  }

   /**
   * 
   * @return myCounterparty
  **/
  @ApiModelProperty(value = "")
  public List<DataMycounterparty> getMyCounterparty() {
    return myCounterparty;
  }

  public void setMyCounterparty(List<DataMycounterparty> myCounterparty) {
    this.myCounterparty = myCounterparty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOfCounterparties listOfCounterparties = (ListOfCounterparties) o;
    return Objects.equals(this.myCounterparty, listOfCounterparties.myCounterparty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myCounterparty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOfCounterparties {\n");
    
    sb.append("    myCounterparty: ").append(toIndentedString(myCounterparty)).append("\n");
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

