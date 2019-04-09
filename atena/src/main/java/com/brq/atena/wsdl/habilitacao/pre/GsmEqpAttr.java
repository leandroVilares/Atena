//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.04.09 às 04:27:25 PM BRT 
//


package com.brq.atena.wsdl.habilitacao.pre;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GsmEqpAttr complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GsmEqpAttr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eqpMfc" type="{http://www.vivo.com.br/atlys/}EqpManufacturer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="simData" type="{http://www.vivo.com.br/atlys/}EqpAttrData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="imei" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="asn" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IMSI" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GsmEqpAttr", namespace = "http://www.vivo.com.br/atlys/", propOrder = {
    "eqpMfc",
    "simData"
})
public class GsmEqpAttr {

    protected List<EqpManufacturer> eqpMfc;
    protected EqpAttrData simData;
    @XmlAttribute(name = "imei")
    protected String imei;
    @XmlAttribute(name = "asn")
    protected String asn;
    @XmlAttribute(name = "IMSI")
    protected String imsi;
    @XmlAttribute(name = "reasonCode")
    protected String reasonCode;

    /**
     * Gets the value of the eqpMfc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eqpMfc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEqpMfc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EqpManufacturer }
     * 
     * 
     */
    public List<EqpManufacturer> getEqpMfc() {
        if (eqpMfc == null) {
            eqpMfc = new ArrayList<EqpManufacturer>();
        }
        return this.eqpMfc;
    }

    /**
     * Obtém o valor da propriedade simData.
     * 
     * @return
     *     possible object is
     *     {@link EqpAttrData }
     *     
     */
    public EqpAttrData getSimData() {
        return simData;
    }

    /**
     * Define o valor da propriedade simData.
     * 
     * @param value
     *     allowed object is
     *     {@link EqpAttrData }
     *     
     */
    public void setSimData(EqpAttrData value) {
        this.simData = value;
    }

    /**
     * Obtém o valor da propriedade imei.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImei() {
        return imei;
    }

    /**
     * Define o valor da propriedade imei.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImei(String value) {
        this.imei = value;
    }

    /**
     * Obtém o valor da propriedade asn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsn() {
        return asn;
    }

    /**
     * Define o valor da propriedade asn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsn(String value) {
        this.asn = value;
    }

    /**
     * Obtém o valor da propriedade imsi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMSI() {
        return imsi;
    }

    /**
     * Define o valor da propriedade imsi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMSI(String value) {
        this.imsi = value;
    }

    /**
     * Obtém o valor da propriedade reasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Define o valor da propriedade reasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

}
