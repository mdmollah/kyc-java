/*
 * KYC API
 */


package com.swift.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * Data11
 */
public class Data11 {
  @SerializedName("SharesPercentage")
  private String sharesPercentage = null;

  @SerializedName("StockExchangeCountryPrimary")
  private String stockExchangeCountryPrimary = null;

  @SerializedName("StockExchangeNamePrimary")
  private String stockExchangeNamePrimary = null;

  @SerializedName("StockExchangeWebsitePrimary")
  private String stockExchangeWebsitePrimary = null;

  @SerializedName("StockExchangeCodePrimary")
  private String stockExchangeCodePrimary = null;

  @SerializedName("StockExchangeCountrySecondary")
  private String stockExchangeCountrySecondary = null;

  @SerializedName("BearerShares")
  private String bearerShares = null;

  @SerializedName("ShareholdingEntitiesStatement")
  private String shareholdingEntitiesStatement = null;

  @SerializedName("TrustInStructure")
  private String trustInStructure = null;

  @SerializedName("FoundationInStructure")
  private String foundationInStructure = null;

  @SerializedName("UBOsStatement")
  private String ubOsStatement = null;

  @SerializedName("FactualControl")
  private String factualControl = null;

  @SerializedName("AuditedAnnualReport")
  private String auditedAnnualReport = null;

  @SerializedName("ReportingCurrency")
  private String reportingCurrency = null;

  @SerializedName("SourceOfWealthBusiness")
  private String sourceOfWealthBusiness = null;

  public Data11 sharesPercentage(String sharesPercentage) {
    this.sharesPercentage = sharesPercentage;
    return this;
  }

   /**
   * 
   * @return sharesPercentage
  **/
  @ApiModelProperty(example = "12", value = "")
  public String getSharesPercentage() {
    return sharesPercentage;
  }

  public void setSharesPercentage(String sharesPercentage) {
    this.sharesPercentage = sharesPercentage;
  }

  public Data11 stockExchangeCountryPrimary(String stockExchangeCountryPrimary) {
    this.stockExchangeCountryPrimary = stockExchangeCountryPrimary;
    return this;
  }

   /**
   * 
   * @return stockExchangeCountryPrimary
  **/
  @ApiModelProperty(example = "Germany", value = "")
  public String getStockExchangeCountryPrimary() {
    return stockExchangeCountryPrimary;
  }

  public void setStockExchangeCountryPrimary(String stockExchangeCountryPrimary) {
    this.stockExchangeCountryPrimary = stockExchangeCountryPrimary;
  }

  public Data11 stockExchangeNamePrimary(String stockExchangeNamePrimary) {
    this.stockExchangeNamePrimary = stockExchangeNamePrimary;
    return this;
  }

   /**
   * 
   * @return stockExchangeNamePrimary
  **/
  @ApiModelProperty(example = "Börse Stuttgart AG", value = "")
  public String getStockExchangeNamePrimary() {
    return stockExchangeNamePrimary;
  }

  public void setStockExchangeNamePrimary(String stockExchangeNamePrimary) {
    this.stockExchangeNamePrimary = stockExchangeNamePrimary;
  }

  public Data11 stockExchangeWebsitePrimary(String stockExchangeWebsitePrimary) {
    this.stockExchangeWebsitePrimary = stockExchangeWebsitePrimary;
    return this;
  }

   /**
   * 
   * @return stockExchangeWebsitePrimary
  **/
  @ApiModelProperty(example = "http://www.boerse-stuttgart.de", value = "")
  public String getStockExchangeWebsitePrimary() {
    return stockExchangeWebsitePrimary;
  }

  public void setStockExchangeWebsitePrimary(String stockExchangeWebsitePrimary) {
    this.stockExchangeWebsitePrimary = stockExchangeWebsitePrimary;
  }

  public Data11 stockExchangeCodePrimary(String stockExchangeCodePrimary) {
    this.stockExchangeCodePrimary = stockExchangeCodePrimary;
    return this;
  }

   /**
   * 
   * @return stockExchangeCodePrimary
  **/
  @ApiModelProperty(example = "XSTU", value = "")
  public String getStockExchangeCodePrimary() {
    return stockExchangeCodePrimary;
  }

  public void setStockExchangeCodePrimary(String stockExchangeCodePrimary) {
    this.stockExchangeCodePrimary = stockExchangeCodePrimary;
  }

  public Data11 stockExchangeCountrySecondary(String stockExchangeCountrySecondary) {
    this.stockExchangeCountrySecondary = stockExchangeCountrySecondary;
    return this;
  }

   /**
   * 
   * @return stockExchangeCountrySecondary
  **/
  @ApiModelProperty(example = "Not applicable", value = "")
  public String getStockExchangeCountrySecondary() {
    return stockExchangeCountrySecondary;
  }

  public void setStockExchangeCountrySecondary(String stockExchangeCountrySecondary) {
    this.stockExchangeCountrySecondary = stockExchangeCountrySecondary;
  }

  public Data11 bearerShares(String bearerShares) {
    this.bearerShares = bearerShares;
    return this;
  }

   /**
   * 
   * @return bearerShares
  **/
  @ApiModelProperty(example = "No", value = "")
  public String getBearerShares() {
    return bearerShares;
  }

  public void setBearerShares(String bearerShares) {
    this.bearerShares = bearerShares;
  }

  public Data11 shareholdingEntitiesStatement(String shareholdingEntitiesStatement) {
    this.shareholdingEntitiesStatement = shareholdingEntitiesStatement;
    return this;
  }

   /**
   * 
   * @return shareholdingEntitiesStatement
  **/
  @ApiModelProperty(example = "We confirm that no company owns directly and/or indirectly 10 % or more of the entity's shares", value = "")
  public String getShareholdingEntitiesStatement() {
    return shareholdingEntitiesStatement;
  }

  public void setShareholdingEntitiesStatement(String shareholdingEntitiesStatement) {
    this.shareholdingEntitiesStatement = shareholdingEntitiesStatement;
  }

  public Data11 trustInStructure(String trustInStructure) {
    this.trustInStructure = trustInStructure;
    return this;
  }

   /**
   * 
   * @return trustInStructure
  **/
  @ApiModelProperty(example = "Yes", value = "")
  public String getTrustInStructure() {
    return trustInStructure;
  }

  public void setTrustInStructure(String trustInStructure) {
    this.trustInStructure = trustInStructure;
  }

  public Data11 foundationInStructure(String foundationInStructure) {
    this.foundationInStructure = foundationInStructure;
    return this;
  }

   /**
   * 
   * @return foundationInStructure
  **/
  @ApiModelProperty(example = "No", value = "")
  public String getFoundationInStructure() {
    return foundationInStructure;
  }

  public void setFoundationInStructure(String foundationInStructure) {
    this.foundationInStructure = foundationInStructure;
  }

  public Data11 ubOsStatement(String ubOsStatement) {
    this.ubOsStatement = ubOsStatement;
    return this;
  }

   /**
   * 
   * @return ubOsStatement
  **/
  @ApiModelProperty(example = "We confirm that our Ultimate Beneficial Owners are as follows and that no other natural person controls or owns directly and/or indirectly 10 % or more of the entity's shares", value = "")
  public String getUbOsStatement() {
    return ubOsStatement;
  }

  public void setUbOsStatement(String ubOsStatement) {
    this.ubOsStatement = ubOsStatement;
  }

  public Data11 factualControl(String factualControl) {
    this.factualControl = factualControl;
    return this;
  }

   /**
   * 
   * @return factualControl
  **/
  @ApiModelProperty(example = "Yes", value = "")
  public String getFactualControl() {
    return factualControl;
  }

  public void setFactualControl(String factualControl) {
    this.factualControl = factualControl;
  }

  public Data11 auditedAnnualReport(String auditedAnnualReport) {
    this.auditedAnnualReport = auditedAnnualReport;
    return this;
  }

   /**
   * 
   * @return auditedAnnualReport
  **/
  @ApiModelProperty(example = "Yes", value = "")
  public String getAuditedAnnualReport() {
    return auditedAnnualReport;
  }

  public void setAuditedAnnualReport(String auditedAnnualReport) {
    this.auditedAnnualReport = auditedAnnualReport;
  }

  public Data11 reportingCurrency(String reportingCurrency) {
    this.reportingCurrency = reportingCurrency;
    return this;
  }

   /**
   * 
   * @return reportingCurrency
  **/
  @ApiModelProperty(example = "EUR - EURO", value = "")
  public String getReportingCurrency() {
    return reportingCurrency;
  }

  public void setReportingCurrency(String reportingCurrency) {
    this.reportingCurrency = reportingCurrency;
  }

  public Data11 sourceOfWealthBusiness(String sourceOfWealthBusiness) {
    this.sourceOfWealthBusiness = sourceOfWealthBusiness;
    return this;
  }

   /**
   * 
   * @return sourceOfWealthBusiness
  **/
  @ApiModelProperty(example = "Funding from parent / beneficial owner", value = "")
  public String getSourceOfWealthBusiness() {
    return sourceOfWealthBusiness;
  }

  public void setSourceOfWealthBusiness(String sourceOfWealthBusiness) {
    this.sourceOfWealthBusiness = sourceOfWealthBusiness;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Data11 data11 = (Data11) o;
    return Objects.equals(this.sharesPercentage, data11.sharesPercentage) &&
        Objects.equals(this.stockExchangeCountryPrimary, data11.stockExchangeCountryPrimary) &&
        Objects.equals(this.stockExchangeNamePrimary, data11.stockExchangeNamePrimary) &&
        Objects.equals(this.stockExchangeWebsitePrimary, data11.stockExchangeWebsitePrimary) &&
        Objects.equals(this.stockExchangeCodePrimary, data11.stockExchangeCodePrimary) &&
        Objects.equals(this.stockExchangeCountrySecondary, data11.stockExchangeCountrySecondary) &&
        Objects.equals(this.bearerShares, data11.bearerShares) &&
        Objects.equals(this.shareholdingEntitiesStatement, data11.shareholdingEntitiesStatement) &&
        Objects.equals(this.trustInStructure, data11.trustInStructure) &&
        Objects.equals(this.foundationInStructure, data11.foundationInStructure) &&
        Objects.equals(this.ubOsStatement, data11.ubOsStatement) &&
        Objects.equals(this.factualControl, data11.factualControl) &&
        Objects.equals(this.auditedAnnualReport, data11.auditedAnnualReport) &&
        Objects.equals(this.reportingCurrency, data11.reportingCurrency) &&
        Objects.equals(this.sourceOfWealthBusiness, data11.sourceOfWealthBusiness);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharesPercentage, stockExchangeCountryPrimary, stockExchangeNamePrimary, stockExchangeWebsitePrimary, stockExchangeCodePrimary, stockExchangeCountrySecondary, bearerShares, shareholdingEntitiesStatement, trustInStructure, foundationInStructure, ubOsStatement, factualControl, auditedAnnualReport, reportingCurrency, sourceOfWealthBusiness);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data11 {\n");
    
    sb.append("    sharesPercentage: ").append(toIndentedString(sharesPercentage)).append("\n");
    sb.append("    stockExchangeCountryPrimary: ").append(toIndentedString(stockExchangeCountryPrimary)).append("\n");
    sb.append("    stockExchangeNamePrimary: ").append(toIndentedString(stockExchangeNamePrimary)).append("\n");
    sb.append("    stockExchangeWebsitePrimary: ").append(toIndentedString(stockExchangeWebsitePrimary)).append("\n");
    sb.append("    stockExchangeCodePrimary: ").append(toIndentedString(stockExchangeCodePrimary)).append("\n");
    sb.append("    stockExchangeCountrySecondary: ").append(toIndentedString(stockExchangeCountrySecondary)).append("\n");
    sb.append("    bearerShares: ").append(toIndentedString(bearerShares)).append("\n");
    sb.append("    shareholdingEntitiesStatement: ").append(toIndentedString(shareholdingEntitiesStatement)).append("\n");
    sb.append("    trustInStructure: ").append(toIndentedString(trustInStructure)).append("\n");
    sb.append("    foundationInStructure: ").append(toIndentedString(foundationInStructure)).append("\n");
    sb.append("    ubOsStatement: ").append(toIndentedString(ubOsStatement)).append("\n");
    sb.append("    factualControl: ").append(toIndentedString(factualControl)).append("\n");
    sb.append("    auditedAnnualReport: ").append(toIndentedString(auditedAnnualReport)).append("\n");
    sb.append("    reportingCurrency: ").append(toIndentedString(reportingCurrency)).append("\n");
    sb.append("    sourceOfWealthBusiness: ").append(toIndentedString(sourceOfWealthBusiness)).append("\n");
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

