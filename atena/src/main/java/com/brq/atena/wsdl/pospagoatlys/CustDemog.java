//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.28 às 12:31:47 PM BRT 
//


package com.brq.atena.wsdl.pospagoatlys;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;StructureName xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;CustDemog&lt;/StructureName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Description xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;custDemog type represents demographics of a customer&lt;/Description&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CVGInternalInformation xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;File Name       : $BLS/XML/customer.xs
 *          Last Updated    : 05/10/2001
 *          Last Updated By : snarayan
 *          Comments        : added schema documentation&lt;/CVGInternalInformation&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java de CustDemog complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustDemog"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="autoTypCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="busYrQty" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="citznshpCntry" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="deptNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dsblDirctCallFlg" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="dsblDirctMailFlg" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="empMthsQty" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="empName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="empQty" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ethOrginCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="gndrCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="househldNbrQty" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="incRangeCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="jurisdictionCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="maritalStatusCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="nationalOrgFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ownResFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="psychoCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SICCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="occupationCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="prfssnCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="educLevelCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="emplmnTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustDemog")
public class CustDemog {

    @XmlAttribute(name = "autoTypCd")
    protected String autoTypCd;
    @XmlAttribute(name = "busYrQty")
    protected Integer busYrQty;
    @XmlAttribute(name = "citznshpCntry")
    protected String citznshpCntry;
    @XmlAttribute(name = "deptNm")
    protected String deptNm;
    @XmlAttribute(name = "dsblDirctCallFlg")
    protected Boolean dsblDirctCallFlg;
    @XmlAttribute(name = "dsblDirctMailFlg")
    protected Boolean dsblDirctMailFlg;
    @XmlAttribute(name = "empMthsQty")
    protected Integer empMthsQty;
    @XmlAttribute(name = "empName")
    protected String empName;
    @XmlAttribute(name = "empQty")
    protected Integer empQty;
    @XmlAttribute(name = "ethOrginCd")
    protected String ethOrginCd;
    @XmlAttribute(name = "gndrCd")
    protected String gndrCd;
    @XmlAttribute(name = "househldNbrQty")
    protected Integer househldNbrQty;
    @XmlAttribute(name = "incRangeCd")
    protected String incRangeCd;
    @XmlAttribute(name = "jurisdictionCd")
    protected String jurisdictionCd;
    @XmlAttribute(name = "maritalStatusCd")
    protected String maritalStatusCd;
    @XmlAttribute(name = "nationalOrgFlag")
    protected Boolean nationalOrgFlag;
    @XmlAttribute(name = "ownResFlag")
    protected Boolean ownResFlag;
    @XmlAttribute(name = "psychoCd")
    protected String psychoCd;
    @XmlAttribute(name = "SICCd")
    protected String sicCd;
    @XmlAttribute(name = "occupationCd")
    protected String occupationCd;
    @XmlAttribute(name = "prfssnCd")
    protected String prfssnCd;
    @XmlAttribute(name = "educLevelCd")
    protected String educLevelCd;
    @XmlAttribute(name = "emplmnTypeCd")
    protected String emplmnTypeCd;

    /**
     * Obtém o valor da propriedade autoTypCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoTypCd() {
        return autoTypCd;
    }

    /**
     * Define o valor da propriedade autoTypCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoTypCd(String value) {
        this.autoTypCd = value;
    }

    /**
     * Obtém o valor da propriedade busYrQty.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBusYrQty() {
        return busYrQty;
    }

    /**
     * Define o valor da propriedade busYrQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBusYrQty(Integer value) {
        this.busYrQty = value;
    }

    /**
     * Obtém o valor da propriedade citznshpCntry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitznshpCntry() {
        return citznshpCntry;
    }

    /**
     * Define o valor da propriedade citznshpCntry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitznshpCntry(String value) {
        this.citznshpCntry = value;
    }

    /**
     * Obtém o valor da propriedade deptNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptNm() {
        return deptNm;
    }

    /**
     * Define o valor da propriedade deptNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptNm(String value) {
        this.deptNm = value;
    }

    /**
     * Obtém o valor da propriedade dsblDirctCallFlg.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDsblDirctCallFlg() {
        return dsblDirctCallFlg;
    }

    /**
     * Define o valor da propriedade dsblDirctCallFlg.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDsblDirctCallFlg(Boolean value) {
        this.dsblDirctCallFlg = value;
    }

    /**
     * Obtém o valor da propriedade dsblDirctMailFlg.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDsblDirctMailFlg() {
        return dsblDirctMailFlg;
    }

    /**
     * Define o valor da propriedade dsblDirctMailFlg.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDsblDirctMailFlg(Boolean value) {
        this.dsblDirctMailFlg = value;
    }

    /**
     * Obtém o valor da propriedade empMthsQty.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmpMthsQty() {
        return empMthsQty;
    }

    /**
     * Define o valor da propriedade empMthsQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmpMthsQty(Integer value) {
        this.empMthsQty = value;
    }

    /**
     * Obtém o valor da propriedade empName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * Define o valor da propriedade empName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpName(String value) {
        this.empName = value;
    }

    /**
     * Obtém o valor da propriedade empQty.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmpQty() {
        return empQty;
    }

    /**
     * Define o valor da propriedade empQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmpQty(Integer value) {
        this.empQty = value;
    }

    /**
     * Obtém o valor da propriedade ethOrginCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthOrginCd() {
        return ethOrginCd;
    }

    /**
     * Define o valor da propriedade ethOrginCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthOrginCd(String value) {
        this.ethOrginCd = value;
    }

    /**
     * Obtém o valor da propriedade gndrCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGndrCd() {
        return gndrCd;
    }

    /**
     * Define o valor da propriedade gndrCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGndrCd(String value) {
        this.gndrCd = value;
    }

    /**
     * Obtém o valor da propriedade househldNbrQty.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHousehldNbrQty() {
        return househldNbrQty;
    }

    /**
     * Define o valor da propriedade househldNbrQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHousehldNbrQty(Integer value) {
        this.househldNbrQty = value;
    }

    /**
     * Obtém o valor da propriedade incRangeCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncRangeCd() {
        return incRangeCd;
    }

    /**
     * Define o valor da propriedade incRangeCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncRangeCd(String value) {
        this.incRangeCd = value;
    }

    /**
     * Obtém o valor da propriedade jurisdictionCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdictionCd() {
        return jurisdictionCd;
    }

    /**
     * Define o valor da propriedade jurisdictionCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdictionCd(String value) {
        this.jurisdictionCd = value;
    }

    /**
     * Obtém o valor da propriedade maritalStatusCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatusCd() {
        return maritalStatusCd;
    }

    /**
     * Define o valor da propriedade maritalStatusCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatusCd(String value) {
        this.maritalStatusCd = value;
    }

    /**
     * Obtém o valor da propriedade nationalOrgFlag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNationalOrgFlag() {
        return nationalOrgFlag;
    }

    /**
     * Define o valor da propriedade nationalOrgFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNationalOrgFlag(Boolean value) {
        this.nationalOrgFlag = value;
    }

    /**
     * Obtém o valor da propriedade ownResFlag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOwnResFlag() {
        return ownResFlag;
    }

    /**
     * Define o valor da propriedade ownResFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwnResFlag(Boolean value) {
        this.ownResFlag = value;
    }

    /**
     * Obtém o valor da propriedade psychoCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsychoCd() {
        return psychoCd;
    }

    /**
     * Define o valor da propriedade psychoCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsychoCd(String value) {
        this.psychoCd = value;
    }

    /**
     * Obtém o valor da propriedade sicCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSICCd() {
        return sicCd;
    }

    /**
     * Define o valor da propriedade sicCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSICCd(String value) {
        this.sicCd = value;
    }

    /**
     * Obtém o valor da propriedade occupationCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupationCd() {
        return occupationCd;
    }

    /**
     * Define o valor da propriedade occupationCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupationCd(String value) {
        this.occupationCd = value;
    }

    /**
     * Obtém o valor da propriedade prfssnCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrfssnCd() {
        return prfssnCd;
    }

    /**
     * Define o valor da propriedade prfssnCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrfssnCd(String value) {
        this.prfssnCd = value;
    }

    /**
     * Obtém o valor da propriedade educLevelCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducLevelCd() {
        return educLevelCd;
    }

    /**
     * Define o valor da propriedade educLevelCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducLevelCd(String value) {
        this.educLevelCd = value;
    }

    /**
     * Obtém o valor da propriedade emplmnTypeCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmplmnTypeCd() {
        return emplmnTypeCd;
    }

    /**
     * Define o valor da propriedade emplmnTypeCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmplmnTypeCd(String value) {
        this.emplmnTypeCd = value;
    }

}
