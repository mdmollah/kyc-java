/*
 * KYC API
 */



package com.swift.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * LicenceInfo
 */
public class LicenceInfo {
  @SerializedName("LicenceTypes")
  private LicenceTypes licenceTypes = null;

  @SerializedName("OffshoreBankingLicense")
  private String offshoreBankingLicense = null;

  @SerializedName("LicenceRestriction")
  private String licenceRestriction = null;

  @SerializedName("LicenceNumber")
  private String licenceNumber = null;

  @SerializedName("LicenceAuthorityCountry")
  private String licenceAuthorityCountry = null;

  @SerializedName("LicenceAuthorityName")
  private String licenceAuthorityName = null;

  @SerializedName("RegulatedFinancialServicesYear")
  private String regulatedFinancialServicesYear = null;

  public LicenceInfo licenceTypes(LicenceTypes licenceTypes) {
    this.licenceTypes = licenceTypes;
    return this;
  }

   /**
   * Get licenceTypes
   * @return licenceTypes
  **/
  @ApiModelProperty(value = "")
  public LicenceTypes getLicenceTypes() {
    return licenceTypes;
  }

  public void setLicenceTypes(LicenceTypes licenceTypes) {
    this.licenceTypes = licenceTypes;
  }

  public LicenceInfo offshoreBankingLicense(String offshoreBankingLicense) {
    this.offshoreBankingLicense = offshoreBankingLicense;
    return this;
  }

   /**
   * 
   * @return offshoreBankingLicense
  **/
  @ApiModelProperty(example = "No", value = "")
  public String getOffshoreBankingLicense() {
    return offshoreBankingLicense;
  }

  public void setOffshoreBankingLicense(String offshoreBankingLicense) {
    this.offshoreBankingLicense = offshoreBankingLicense;
  }

  public LicenceInfo licenceRestriction(String licenceRestriction) {
    this.licenceRestriction = licenceRestriction;
    return this;
  }

   /**
   * 
   * @return licenceRestriction
  **/
  @ApiModelProperty(example = "No", value = "")
  public String getLicenceRestriction() {
    return licenceRestriction;
  }

  public void setLicenceRestriction(String licenceRestriction) {
    this.licenceRestriction = licenceRestriction;
  }

  public LicenceInfo licenceNumber(String licenceNumber) {
    this.licenceNumber = licenceNumber;
    return this;
  }

   /**
   * 
   * @return licenceNumber
  **/
  @ApiModelProperty(example = "Not applicable", value = "")
  public String getLicenceNumber() {
    return licenceNumber;
  }

  public void setLicenceNumber(String licenceNumber) {
    this.licenceNumber = licenceNumber;
  }

  public LicenceInfo licenceAuthorityCountry(String licenceAuthorityCountry) {
    this.licenceAuthorityCountry = licenceAuthorityCountry;
    return this;
  }

   /**
   * 
   * @return licenceAuthorityCountry
  **/
  @ApiModelProperty(example = "Germany", value = "")
  public String getLicenceAuthorityCountry() {
    return licenceAuthorityCountry;
  }

  public void setLicenceAuthorityCountry(String licenceAuthorityCountry) {
    this.licenceAuthorityCountry = licenceAuthorityCountry;
  }

  public LicenceInfo licenceAuthorityName(String licenceAuthorityName) {
    this.licenceAuthorityName = licenceAuthorityName;
    return this;
  }

   /**
   * 
   * @return licenceAuthorityName
  **/
  @ApiModelProperty(example = "Bundesanstalt für Finanzdienstleistungsaufsicht - Federal Financial Supervisory Authority", value = "")
  public String getLicenceAuthorityName() {
    return licenceAuthorityName;
  }

  public void setLicenceAuthorityName(String licenceAuthorityName) {
    this.licenceAuthorityName = licenceAuthorityName;
  }

  public LicenceInfo regulatedFinancialServicesYear(String regulatedFinancialServicesYear) {
    this.regulatedFinancialServicesYear = regulatedFinancialServicesYear;
    return this;
  }

   /**
   * 
   * @return regulatedFinancialServicesYear
  **/
  @ApiModelProperty(example = "2004", value = "")
  public String getRegulatedFinancialServicesYear() {
    return regulatedFinancialServicesYear;
  }

  public void setRegulatedFinancialServicesYear(String regulatedFinancialServicesYear) {
    this.regulatedFinancialServicesYear = regulatedFinancialServicesYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenceInfo licenceInfo = (LicenceInfo) o;
    return Objects.equals(this.licenceTypes, licenceInfo.licenceTypes) &&
        Objects.equals(this.offshoreBankingLicense, licenceInfo.offshoreBankingLicense) &&
        Objects.equals(this.licenceRestriction, licenceInfo.licenceRestriction) &&
        Objects.equals(this.licenceNumber, licenceInfo.licenceNumber) &&
        Objects.equals(this.licenceAuthorityCountry, licenceInfo.licenceAuthorityCountry) &&
        Objects.equals(this.licenceAuthorityName, licenceInfo.licenceAuthorityName) &&
        Objects.equals(this.regulatedFinancialServicesYear, licenceInfo.regulatedFinancialServicesYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenceTypes, offshoreBankingLicense, licenceRestriction, licenceNumber, licenceAuthorityCountry, licenceAuthorityName, regulatedFinancialServicesYear);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenceInfo {\n");
    
    sb.append("    licenceTypes: ").append(toIndentedString(licenceTypes)).append("\n");
    sb.append("    offshoreBankingLicense: ").append(toIndentedString(offshoreBankingLicense)).append("\n");
    sb.append("    licenceRestriction: ").append(toIndentedString(licenceRestriction)).append("\n");
    sb.append("    licenceNumber: ").append(toIndentedString(licenceNumber)).append("\n");
    sb.append("    licenceAuthorityCountry: ").append(toIndentedString(licenceAuthorityCountry)).append("\n");
    sb.append("    licenceAuthorityName: ").append(toIndentedString(licenceAuthorityName)).append("\n");
    sb.append("    regulatedFinancialServicesYear: ").append(toIndentedString(regulatedFinancialServicesYear)).append("\n");
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

