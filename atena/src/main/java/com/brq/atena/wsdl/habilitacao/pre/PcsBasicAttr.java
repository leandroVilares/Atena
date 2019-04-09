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
 * <p>Classe Java de PcsBasicAttr complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PcsBasicAttr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pcsEpq" type="{http://www.vivo.com.br/atlys/}PcsEqpAttr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pcsAcsNbr" type="{http://www.vivo.com.br/atlys/}AccessNbrAttr" minOccurs="0"/&gt;
 *         &lt;element name="addlAttrs" type="{http://www.vivo.com.br/atlys/}AttrValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MSID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MSIDReserved" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PcsBasicAttr", namespace = "http://www.vivo.com.br/atlys/", propOrder = {
    "pcsEpq",
    "pcsAcsNbr",
    "addlAttrs"
})
public class PcsBasicAttr {

    protected List<PcsEqpAttr> pcsEpq;
    protected AccessNbrAttr pcsAcsNbr;
    protected List<AttrValue> addlAttrs;
    @XmlAttribute(name = "MSID")
    protected String msid;
    @XmlAttribute(name = "MSIDReserved")
    protected Boolean msidReserved;

    /**
     * Gets the value of the pcsEpq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pcsEpq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPcsEpq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PcsEqpAttr }
     * 
     * 
     */
    public List<PcsEqpAttr> getPcsEpq() {
        if (pcsEpq == null) {
            pcsEpq = new ArrayList<PcsEqpAttr>();
        }
        return this.pcsEpq;
    }

    /**
     * Obtém o valor da propriedade pcsAcsNbr.
     * 
     * @return
     *     possible object is
     *     {@link AccessNbrAttr }
     *     
     */
    public AccessNbrAttr getPcsAcsNbr() {
        return pcsAcsNbr;
    }

    /**
     * Define o valor da propriedade pcsAcsNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessNbrAttr }
     *     
     */
    public void setPcsAcsNbr(AccessNbrAttr value) {
        this.pcsAcsNbr = value;
    }

    /**
     * Gets the value of the addlAttrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addlAttrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddlAttrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttrValue }
     * 
     * 
     */
    public List<AttrValue> getAddlAttrs() {
        if (addlAttrs == null) {
            addlAttrs = new ArrayList<AttrValue>();
        }
        return this.addlAttrs;
    }

    /**
     * Obtém o valor da propriedade msid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSID() {
        return msid;
    }

    /**
     * Define o valor da propriedade msid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSID(String value) {
        this.msid = value;
    }

    /**
     * Obtém o valor da propriedade msidReserved.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMSIDReserved() {
        return msidReserved;
    }

    /**
     * Define o valor da propriedade msidReserved.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMSIDReserved(Boolean value) {
        this.msidReserved = value;
    }

}
