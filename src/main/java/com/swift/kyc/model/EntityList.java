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
import com.swift.kyc.model.DataMyentity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EntityList
 */
public class EntityList {
  @SerializedName("myEntity")
  private List<DataMyentity> myEntity = null;

  public EntityList myEntity(List<DataMyentity> myEntity) {
    this.myEntity = myEntity;
    return this;
  }

  public EntityList addMyEntityItem(DataMyentity myEntityItem) {
    if (this.myEntity == null) {
      this.myEntity = new ArrayList<DataMyentity>();
    }
    this.myEntity.add(myEntityItem);
    return this;
  }

   /**
   * 
   * @return myEntity
  **/
  @ApiModelProperty(value = "")
  public List<DataMyentity> getMyEntity() {
    return myEntity;
  }

  public void setMyEntity(List<DataMyentity> myEntity) {
    this.myEntity = myEntity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityList entityList = (EntityList) o;
    return Objects.equals(this.myEntity, entityList.myEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myEntity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityList {\n");
    
    sb.append("    myEntity: ").append(toIndentedString(myEntity)).append("\n");
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

