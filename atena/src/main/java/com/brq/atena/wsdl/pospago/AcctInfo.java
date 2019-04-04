//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.21 às 05:10:11 PM BRT 
//


package com.brq.atena.wsdl.pospago;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;StructureName xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AcctInfo&lt;/StructureName&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java de AcctInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AcctInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subInfo" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse}SubInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billInfo" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse}BillInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="custId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="acctNbr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="actEstDt" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="billDueDay" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="actStatus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="liableAcct" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctInfo", propOrder = {
    "subInfo",
    "billInfo"
})
public class AcctInfo {

    @XmlElement(namespace = "br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse")
    protected List<SubInfo> subInfo;
    @XmlElement(namespace = "br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse")
    protected List<BillInfo> billInfo;
    @XmlAttribute(name = "custId", required = true)
    protected String custId;
    @XmlAttribute(name = "acctNbr", required = true)
    protected String acctNbr;
    @XmlAttribute(name = "actEstDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actEstDt;
    @XmlAttribute(name = "billDueDay")
    protected Integer billDueDay;
    @XmlAttribute(name = "actStatus", required = true)
    protected String actStatus;
    @XmlAttribute(name = "liableAcct", required = true)
    protected boolean liableAcct;

    /**
     * Gets the value of the subInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubInfo }
     * 
     * 
     */
    public List<SubInfo> getSubInfo() {
        if (subInfo == null) {
            subInfo = new ArrayList<SubInfo>();
        }
        return this.subInfo;
    }

    /**
     * Gets the value of the billInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillInfo }
     * 
     * 
     */
    public List<BillInfo> getBillInfo() {
        if (billInfo == null) {
            billInfo = new ArrayList<BillInfo>();
        }
        return this.billInfo;
    }

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
     * Obtém o valor da propriedade acctNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNbr() {
        return acctNbr;
    }

    /**
     * Define o valor da propriedade acctNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNbr(String value) {
        this.acctNbr = value;
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
     * Obtém o valor da propriedade billDueDay.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillDueDay() {
        return billDueDay;
    }

    /**
     * Define o valor da propriedade billDueDay.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillDueDay(Integer value) {
        this.billDueDay = value;
    }

    /**
     * Obtém o valor da propriedade actStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActStatus() {
        return actStatus;
    }

    /**
     * Define o valor da propriedade actStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActStatus(String value) {
        this.actStatus = value;
    }

    /**
     * Obtém o valor da propriedade liableAcct.
     * 
     */
    public boolean isLiableAcct() {
        return liableAcct;
    }

    /**
     * Define o valor da propriedade liableAcct.
     * 
     */
    public void setLiableAcct(boolean value) {
        this.liableAcct = value;
    }

}
