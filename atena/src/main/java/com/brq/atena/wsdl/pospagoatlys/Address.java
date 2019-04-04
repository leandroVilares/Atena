//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.28 às 12:31:47 PM BRT 
//


package com.brq.atena.wsdl.pospagoatlys;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;StructureName xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Address&lt;/StructureName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Description xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;address indicates the address format used for creating and reading address for customer,
 *     account in the system.
 *     NOTE: The seqNbr, geoStCd, geoCntyCd and geoCtyCd fields form a key for retrieving
 *           tax authority information. Either all these 4 attributes have to be specified
 *           or none of these attributes need to be specified in the input.&lt;/Description&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CVGInternalInformation xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;File Location    : $BLS/XML/address.xs
 *        Last Updated     : 04/09/2001
 *        Last Updated By  : Sasidhar Vogety
 *        Comments         : Added xml documentation(this).&lt;/CVGInternalInformation&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java de Address complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="delvryTxt" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}StrElem" maxOccurs="3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="streetNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dstrbnCtr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="cityNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="countyNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="stateCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="postCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="postPlusCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="cntryCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="addrSeqNbr" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="effDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="expDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="atnTxt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="billNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="seqNbr" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="geoCtyCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="geoCntyCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="geoStCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="houseNbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="streetSuffixText" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="POBoxNbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "delvryTxt"
})
public class Address {

    protected List<StrElem> delvryTxt;
    @XmlAttribute(name = "streetNm")
    protected String streetNm;
    @XmlAttribute(name = "dstrbnCtr")
    protected String dstrbnCtr;
    @XmlAttribute(name = "cityNm")
    protected String cityNm;
    @XmlAttribute(name = "countyNm")
    protected String countyNm;
    @XmlAttribute(name = "stateCd")
    protected String stateCd;
    @XmlAttribute(name = "postCd")
    protected String postCd;
    @XmlAttribute(name = "postPlusCd")
    protected String postPlusCd;
    @XmlAttribute(name = "cntryCd")
    protected String cntryCd;
    @XmlAttribute(name = "addrSeqNbr")
    protected Integer addrSeqNbr;
    @XmlAttribute(name = "effDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effDt;
    @XmlAttribute(name = "expDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expDt;
    @XmlAttribute(name = "atnTxt")
    protected String atnTxt;
    @XmlAttribute(name = "billNm")
    protected String billNm;
    @XmlAttribute(name = "seqNbr")
    protected Integer seqNbr;
    @XmlAttribute(name = "geoCtyCd")
    protected String geoCtyCd;
    @XmlAttribute(name = "geoCntyCd")
    protected String geoCntyCd;
    @XmlAttribute(name = "geoStCd")
    protected String geoStCd;
    @XmlAttribute(name = "houseNbr")
    protected String houseNbr;
    @XmlAttribute(name = "streetSuffixText")
    protected String streetSuffixText;
    @XmlAttribute(name = "POBoxNbr")
    protected String poBoxNbr;

    /**
     * Gets the value of the delvryTxt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delvryTxt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelvryTxt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrElem }
     * 
     * 
     */
    public List<StrElem> getDelvryTxt() {
        if (delvryTxt == null) {
            delvryTxt = new ArrayList<StrElem>();
        }
        return this.delvryTxt;
    }

    /**
     * Obtém o valor da propriedade streetNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNm() {
        return streetNm;
    }

    /**
     * Define o valor da propriedade streetNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNm(String value) {
        this.streetNm = value;
    }

    /**
     * Obtém o valor da propriedade dstrbnCtr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstrbnCtr() {
        return dstrbnCtr;
    }

    /**
     * Define o valor da propriedade dstrbnCtr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDstrbnCtr(String value) {
        this.dstrbnCtr = value;
    }

    /**
     * Obtém o valor da propriedade cityNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityNm() {
        return cityNm;
    }

    /**
     * Define o valor da propriedade cityNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityNm(String value) {
        this.cityNm = value;
    }

    /**
     * Obtém o valor da propriedade countyNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyNm() {
        return countyNm;
    }

    /**
     * Define o valor da propriedade countyNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyNm(String value) {
        this.countyNm = value;
    }

    /**
     * Obtém o valor da propriedade stateCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCd() {
        return stateCd;
    }

    /**
     * Define o valor da propriedade stateCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCd(String value) {
        this.stateCd = value;
    }

    /**
     * Obtém o valor da propriedade postCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCd() {
        return postCd;
    }

    /**
     * Define o valor da propriedade postCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCd(String value) {
        this.postCd = value;
    }

    /**
     * Obtém o valor da propriedade postPlusCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostPlusCd() {
        return postPlusCd;
    }

    /**
     * Define o valor da propriedade postPlusCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostPlusCd(String value) {
        this.postPlusCd = value;
    }

    /**
     * Obtém o valor da propriedade cntryCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntryCd() {
        return cntryCd;
    }

    /**
     * Define o valor da propriedade cntryCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntryCd(String value) {
        this.cntryCd = value;
    }

    /**
     * Obtém o valor da propriedade addrSeqNbr.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAddrSeqNbr() {
        return addrSeqNbr;
    }

    /**
     * Define o valor da propriedade addrSeqNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAddrSeqNbr(Integer value) {
        this.addrSeqNbr = value;
    }

    /**
     * Obtém o valor da propriedade effDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffDt() {
        return effDt;
    }

    /**
     * Define o valor da propriedade effDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffDt(XMLGregorianCalendar value) {
        this.effDt = value;
    }

    /**
     * Obtém o valor da propriedade expDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDt() {
        return expDt;
    }

    /**
     * Define o valor da propriedade expDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDt(XMLGregorianCalendar value) {
        this.expDt = value;
    }

    /**
     * Obtém o valor da propriedade atnTxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtnTxt() {
        return atnTxt;
    }

    /**
     * Define o valor da propriedade atnTxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtnTxt(String value) {
        this.atnTxt = value;
    }

    /**
     * Obtém o valor da propriedade billNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillNm() {
        return billNm;
    }

    /**
     * Define o valor da propriedade billNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillNm(String value) {
        this.billNm = value;
    }

    /**
     * Obtém o valor da propriedade seqNbr.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeqNbr() {
        return seqNbr;
    }

    /**
     * Define o valor da propriedade seqNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeqNbr(Integer value) {
        this.seqNbr = value;
    }

    /**
     * Obtém o valor da propriedade geoCtyCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoCtyCd() {
        return geoCtyCd;
    }

    /**
     * Define o valor da propriedade geoCtyCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoCtyCd(String value) {
        this.geoCtyCd = value;
    }

    /**
     * Obtém o valor da propriedade geoCntyCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoCntyCd() {
        return geoCntyCd;
    }

    /**
     * Define o valor da propriedade geoCntyCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoCntyCd(String value) {
        this.geoCntyCd = value;
    }

    /**
     * Obtém o valor da propriedade geoStCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoStCd() {
        return geoStCd;
    }

    /**
     * Define o valor da propriedade geoStCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoStCd(String value) {
        this.geoStCd = value;
    }

    /**
     * Obtém o valor da propriedade houseNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNbr() {
        return houseNbr;
    }

    /**
     * Define o valor da propriedade houseNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNbr(String value) {
        this.houseNbr = value;
    }

    /**
     * Obtém o valor da propriedade streetSuffixText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetSuffixText() {
        return streetSuffixText;
    }

    /**
     * Define o valor da propriedade streetSuffixText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetSuffixText(String value) {
        this.streetSuffixText = value;
    }

    /**
     * Obtém o valor da propriedade poBoxNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBoxNbr() {
        return poBoxNbr;
    }

    /**
     * Define o valor da propriedade poBoxNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBoxNbr(String value) {
        this.poBoxNbr = value;
    }

}
