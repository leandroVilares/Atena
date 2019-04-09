//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.04.09 às 04:27:25 PM BRT 
//


package com.brq.atena.wsdl.habilitacao.pre;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de SvcItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SvcItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicSvcList" type="{http://www.vivo.com.br/atlys/}BasicSvcItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="depositAmt" type="{http://www.vivo.com.br/atlys/}Currency" minOccurs="0"/&gt;
 *         &lt;element name="charge" type="{http://www.vivo.com.br/atlys/}ChargeInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="svcAttr" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="callCircle" type="{http://www.vivo.com.br/atlys/}CallCircleItem" minOccurs="0"/&gt;
 *         &lt;element name="negotPrice" type="{http://www.vivo.com.br/atlys/}NegotPrice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="svcNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="suspendStat" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="svcTyp" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="svcId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="svcDesc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="provsnable" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="svcCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="srchCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="svcAttrGrpId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="callngCircleTypeInd" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="extnClassNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="extnId" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="effDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="exprDt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="chnlTypeInd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="svcDurQty" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="oneTmInd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="swapSvcId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="swapSvcNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ealtimeSharedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="sharingGroupId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sharingGroupDesc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcItem", namespace = "http://www.vivo.com.br/atlys/", propOrder = {
    "basicSvcList",
    "depositAmt",
    "charge",
    "svcAttr",
    "callCircle",
    "negotPrice"
})
public class SvcItem {

    protected List<BasicSvcItem> basicSvcList;
    protected Currency depositAmt;
    protected List<ChargeInfo> charge;
    protected Object svcAttr;
    protected CallCircleItem callCircle;
    protected List<NegotPrice> negotPrice;
    @XmlAttribute(name = "svcNm")
    protected String svcNm;
    @XmlAttribute(name = "suspendStat")
    protected String suspendStat;
    @XmlAttribute(name = "svcTyp")
    protected String svcTyp;
    @XmlAttribute(name = "svcId")
    protected String svcId;
    @XmlAttribute(name = "svcDesc")
    protected String svcDesc;
    @XmlAttribute(name = "provsnable")
    protected String provsnable;
    @XmlAttribute(name = "svcCategory")
    protected String svcCategory;
    @XmlAttribute(name = "srchCategory")
    protected String srchCategory;
    @XmlAttribute(name = "svcAttrGrpId")
    protected String svcAttrGrpId;
    @XmlAttribute(name = "callngCircleTypeInd")
    protected BigInteger callngCircleTypeInd;
    @XmlAttribute(name = "extnClassNm")
    protected String extnClassNm;
    @XmlAttribute(name = "extnId")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar extnId;
    @XmlAttribute(name = "effDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effDt;
    @XmlAttribute(name = "exprDt")
    protected String exprDt;
    @XmlAttribute(name = "chnlTypeInd")
    protected String chnlTypeInd;
    @XmlAttribute(name = "svcDurQty")
    protected BigInteger svcDurQty;
    @XmlAttribute(name = "oneTmInd")
    protected String oneTmInd;
    @XmlAttribute(name = "swapSvcId")
    protected String swapSvcId;
    @XmlAttribute(name = "swapSvcNm")
    protected String swapSvcNm;
    @XmlAttribute(name = "ealtimeSharedFlag")
    protected Boolean ealtimeSharedFlag;
    @XmlAttribute(name = "sharingGroupId")
    protected String sharingGroupId;
    @XmlAttribute(name = "sharingGroupDesc")
    protected String sharingGroupDesc;

    /**
     * Gets the value of the basicSvcList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basicSvcList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasicSvcList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicSvcItem }
     * 
     * 
     */
    public List<BasicSvcItem> getBasicSvcList() {
        if (basicSvcList == null) {
            basicSvcList = new ArrayList<BasicSvcItem>();
        }
        return this.basicSvcList;
    }

    /**
     * Obtém o valor da propriedade depositAmt.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getDepositAmt() {
        return depositAmt;
    }

    /**
     * Define o valor da propriedade depositAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setDepositAmt(Currency value) {
        this.depositAmt = value;
    }

    /**
     * Gets the value of the charge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargeInfo }
     * 
     * 
     */
    public List<ChargeInfo> getCharge() {
        if (charge == null) {
            charge = new ArrayList<ChargeInfo>();
        }
        return this.charge;
    }

    /**
     * Obtém o valor da propriedade svcAttr.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSvcAttr() {
        return svcAttr;
    }

    /**
     * Define o valor da propriedade svcAttr.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSvcAttr(Object value) {
        this.svcAttr = value;
    }

    /**
     * Obtém o valor da propriedade callCircle.
     * 
     * @return
     *     possible object is
     *     {@link CallCircleItem }
     *     
     */
    public CallCircleItem getCallCircle() {
        return callCircle;
    }

    /**
     * Define o valor da propriedade callCircle.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCircleItem }
     *     
     */
    public void setCallCircle(CallCircleItem value) {
        this.callCircle = value;
    }

    /**
     * Gets the value of the negotPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the negotPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNegotPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NegotPrice }
     * 
     * 
     */
    public List<NegotPrice> getNegotPrice() {
        if (negotPrice == null) {
            negotPrice = new ArrayList<NegotPrice>();
        }
        return this.negotPrice;
    }

    /**
     * Obtém o valor da propriedade svcNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcNm() {
        return svcNm;
    }

    /**
     * Define o valor da propriedade svcNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcNm(String value) {
        this.svcNm = value;
    }

    /**
     * Obtém o valor da propriedade suspendStat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendStat() {
        return suspendStat;
    }

    /**
     * Define o valor da propriedade suspendStat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendStat(String value) {
        this.suspendStat = value;
    }

    /**
     * Obtém o valor da propriedade svcTyp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcTyp() {
        return svcTyp;
    }

    /**
     * Define o valor da propriedade svcTyp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcTyp(String value) {
        this.svcTyp = value;
    }

    /**
     * Obtém o valor da propriedade svcId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcId() {
        return svcId;
    }

    /**
     * Define o valor da propriedade svcId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcId(String value) {
        this.svcId = value;
    }

    /**
     * Obtém o valor da propriedade svcDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcDesc() {
        return svcDesc;
    }

    /**
     * Define o valor da propriedade svcDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcDesc(String value) {
        this.svcDesc = value;
    }

    /**
     * Obtém o valor da propriedade provsnable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvsnable() {
        return provsnable;
    }

    /**
     * Define o valor da propriedade provsnable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvsnable(String value) {
        this.provsnable = value;
    }

    /**
     * Obtém o valor da propriedade svcCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcCategory() {
        return svcCategory;
    }

    /**
     * Define o valor da propriedade svcCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcCategory(String value) {
        this.svcCategory = value;
    }

    /**
     * Obtém o valor da propriedade srchCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrchCategory() {
        return srchCategory;
    }

    /**
     * Define o valor da propriedade srchCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrchCategory(String value) {
        this.srchCategory = value;
    }

    /**
     * Obtém o valor da propriedade svcAttrGrpId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcAttrGrpId() {
        return svcAttrGrpId;
    }

    /**
     * Define o valor da propriedade svcAttrGrpId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcAttrGrpId(String value) {
        this.svcAttrGrpId = value;
    }

    /**
     * Obtém o valor da propriedade callngCircleTypeInd.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCallngCircleTypeInd() {
        return callngCircleTypeInd;
    }

    /**
     * Define o valor da propriedade callngCircleTypeInd.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCallngCircleTypeInd(BigInteger value) {
        this.callngCircleTypeInd = value;
    }

    /**
     * Obtém o valor da propriedade extnClassNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtnClassNm() {
        return extnClassNm;
    }

    /**
     * Define o valor da propriedade extnClassNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtnClassNm(String value) {
        this.extnClassNm = value;
    }

    /**
     * Obtém o valor da propriedade extnId.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExtnId() {
        return extnId;
    }

    /**
     * Define o valor da propriedade extnId.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExtnId(XMLGregorianCalendar value) {
        this.extnId = value;
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
     * Obtém o valor da propriedade exprDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExprDt() {
        return exprDt;
    }

    /**
     * Define o valor da propriedade exprDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExprDt(String value) {
        this.exprDt = value;
    }

    /**
     * Obtém o valor da propriedade chnlTypeInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChnlTypeInd() {
        return chnlTypeInd;
    }

    /**
     * Define o valor da propriedade chnlTypeInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChnlTypeInd(String value) {
        this.chnlTypeInd = value;
    }

    /**
     * Obtém o valor da propriedade svcDurQty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSvcDurQty() {
        return svcDurQty;
    }

    /**
     * Define o valor da propriedade svcDurQty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSvcDurQty(BigInteger value) {
        this.svcDurQty = value;
    }

    /**
     * Obtém o valor da propriedade oneTmInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneTmInd() {
        return oneTmInd;
    }

    /**
     * Define o valor da propriedade oneTmInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneTmInd(String value) {
        this.oneTmInd = value;
    }

    /**
     * Obtém o valor da propriedade swapSvcId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwapSvcId() {
        return swapSvcId;
    }

    /**
     * Define o valor da propriedade swapSvcId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwapSvcId(String value) {
        this.swapSvcId = value;
    }

    /**
     * Obtém o valor da propriedade swapSvcNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwapSvcNm() {
        return swapSvcNm;
    }

    /**
     * Define o valor da propriedade swapSvcNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwapSvcNm(String value) {
        this.swapSvcNm = value;
    }

    /**
     * Obtém o valor da propriedade ealtimeSharedFlag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEaltimeSharedFlag() {
        return ealtimeSharedFlag;
    }

    /**
     * Define o valor da propriedade ealtimeSharedFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEaltimeSharedFlag(Boolean value) {
        this.ealtimeSharedFlag = value;
    }

    /**
     * Obtém o valor da propriedade sharingGroupId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharingGroupId() {
        return sharingGroupId;
    }

    /**
     * Define o valor da propriedade sharingGroupId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharingGroupId(String value) {
        this.sharingGroupId = value;
    }

    /**
     * Obtém o valor da propriedade sharingGroupDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharingGroupDesc() {
        return sharingGroupDesc;
    }

    /**
     * Define o valor da propriedade sharingGroupDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharingGroupDesc(String value) {
        this.sharingGroupDesc = value;
    }

}
