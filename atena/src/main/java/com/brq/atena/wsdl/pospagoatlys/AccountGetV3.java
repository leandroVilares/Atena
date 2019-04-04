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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;StructureName xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema" see="AccountGetV2" since="C10.0"&gt;AccountGetV3&lt;/StructureName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Description xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AccountGetV3 describes data returned when an account is created.&lt;/Description&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CVGInternalInformation xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;File Name       : $ARELIBS/common/xml/accountGetV3.xs
 * 		 Last Updated    : 04/27/2002
 * 		 Last Updated By : Abdus Samad
 * 		 Comments        : Modified for feature F5150A&lt;/CVGInternalInformation&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java de AccountGetV3 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AccountGetV3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="custId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="actNbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="acsNbr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="singleUser" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="largeAccountFlag" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="preEvtStdMsgFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="crdtClss" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="passwd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="actEstDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="actSwpDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="inColltns" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="actTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="csa" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="majActNbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="mlngAddrSeq" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="balLmtTyp" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountGetV3")
public class AccountGetV3 {

    @XmlAttribute(name = "custId", required = true)
    protected String custId;
    @XmlAttribute(name = "actNbr")
    protected String actNbr;
    @XmlAttribute(name = "acsNbr", required = true)
    protected String acsNbr;
    @XmlAttribute(name = "singleUser")
    protected Boolean singleUser;
    @XmlAttribute(name = "largeAccountFlag", required = true)
    protected boolean largeAccountFlag;
    @XmlAttribute(name = "preEvtStdMsgFlag")
    protected Boolean preEvtStdMsgFlag;
    @XmlAttribute(name = "crdtClss")
    protected String crdtClss;
    @XmlAttribute(name = "passwd")
    protected String passwd;
    @XmlAttribute(name = "actEstDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actEstDt;
    @XmlAttribute(name = "actSwpDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actSwpDt;
    @XmlAttribute(name = "inColltns")
    protected Boolean inColltns;
    @XmlAttribute(name = "actTypeCd")
    protected String actTypeCd;
    @XmlAttribute(name = "csa", required = true)
    protected String csa;
    @XmlAttribute(name = "majActNbr")
    protected String majActNbr;
    @XmlAttribute(name = "mlngAddrSeq")
    protected Integer mlngAddrSeq;
    @XmlAttribute(name = "balLmtTyp", required = true)
    protected int balLmtTyp;

    /**
     * Obtém o valor da propriedade custId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustId() {
        return custId;
    }

    /**
     * Define o valor da propriedade custId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustId(String value) {
        this.custId = value;
    }

    /**
     * Obtém o valor da propriedade actNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActNbr() {
        return actNbr;
    }

    /**
     * Define o valor da propriedade actNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActNbr(String value) {
        this.actNbr = value;
    }

    /**
     * Obtém o valor da propriedade acsNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcsNbr() {
        return acsNbr;
    }

    /**
     * Define o valor da propriedade acsNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcsNbr(String value) {
        this.acsNbr = value;
    }

    /**
     * Obtém o valor da propriedade singleUser.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSingleUser() {
        return singleUser;
    }

    /**
     * Define o valor da propriedade singleUser.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSingleUser(Boolean value) {
        this.singleUser = value;
    }

    /**
     * Obtém o valor da propriedade largeAccountFlag.
     * 
     */
    public boolean isLargeAccountFlag() {
        return largeAccountFlag;
    }

    /**
     * Define o valor da propriedade largeAccountFlag.
     * 
     */
    public void setLargeAccountFlag(boolean value) {
        this.largeAccountFlag = value;
    }

    /**
     * Obtém o valor da propriedade preEvtStdMsgFlag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreEvtStdMsgFlag() {
        return preEvtStdMsgFlag;
    }

    /**
     * Define o valor da propriedade preEvtStdMsgFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreEvtStdMsgFlag(Boolean value) {
        this.preEvtStdMsgFlag = value;
    }

    /**
     * Obtém o valor da propriedade crdtClss.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdtClss() {
        return crdtClss;
    }

    /**
     * Define o valor da propriedade crdtClss.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrdtClss(String value) {
        this.crdtClss = value;
    }

    /**
     * Obtém o valor da propriedade passwd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * Define o valor da propriedade passwd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswd(String value) {
        this.passwd = value;
    }

    /**
     * Obtém o valor da propriedade actEstDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActEstDt() {
        return actEstDt;
    }

    /**
     * Define o valor da propriedade actEstDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActEstDt(XMLGregorianCalendar value) {
        this.actEstDt = value;
    }

    /**
     * Obtém o valor da propriedade actSwpDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActSwpDt() {
        return actSwpDt;
    }

    /**
     * Define o valor da propriedade actSwpDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActSwpDt(XMLGregorianCalendar value) {
        this.actSwpDt = value;
    }

    /**
     * Obtém o valor da propriedade inColltns.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInColltns() {
        return inColltns;
    }

    /**
     * Define o valor da propriedade inColltns.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInColltns(Boolean value) {
        this.inColltns = value;
    }

    /**
     * Obtém o valor da propriedade actTypeCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActTypeCd() {
        return actTypeCd;
    }

    /**
     * Define o valor da propriedade actTypeCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActTypeCd(String value) {
        this.actTypeCd = value;
    }

    /**
     * Obtém o valor da propriedade csa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsa() {
        return csa;
    }

    /**
     * Define o valor da propriedade csa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsa(String value) {
        this.csa = value;
    }

    /**
     * Obtém o valor da propriedade majActNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajActNbr() {
        return majActNbr;
    }

    /**
     * Define o valor da propriedade majActNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajActNbr(String value) {
        this.majActNbr = value;
    }

    /**
     * Obtém o valor da propriedade mlngAddrSeq.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMlngAddrSeq() {
        return mlngAddrSeq;
    }

    /**
     * Define o valor da propriedade mlngAddrSeq.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMlngAddrSeq(Integer value) {
        this.mlngAddrSeq = value;
    }

    /**
     * Obtém o valor da propriedade balLmtTyp.
     * 
     */
    public int getBalLmtTyp() {
        return balLmtTyp;
    }

    /**
     * Define o valor da propriedade balLmtTyp.
     * 
     */
    public void setBalLmtTyp(int value) {
        this.balLmtTyp = value;
    }

}
