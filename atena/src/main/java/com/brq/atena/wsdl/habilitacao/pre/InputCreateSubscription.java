//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.04.09 às 04:27:25 PM BRT 
//


package com.brq.atena.wsdl.habilitacao.pre;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de InputCreateSubscription complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="InputCreateSubscription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriberInfo" type="{http://www.vivo.com.br/atlys/}Subscriber" minOccurs="0"/&gt;
 *         &lt;element name="sbscrpMktPgm" type="{http://www.vivo.com.br/atlys/}MktPgmEnrollment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sbscrpSvcAsgm" type="{http://www.vivo.com.br/atlys/}SvcAsgmItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Ixc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="isMig" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="acctBalAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputCreateSubscription", namespace = "http://www.vivo.com.br/atlys/", propOrder = {
    "subscriberInfo",
    "sbscrpMktPgm",
    "sbscrpSvcAsgm"
})
public class InputCreateSubscription {

    protected Subscriber subscriberInfo;
    protected List<MktPgmEnrollment> sbscrpMktPgm;
    protected List<SvcAsgmItem> sbscrpSvcAsgm;
    @XmlAttribute(name = "Ixc")
    protected String ixc;
    @XmlAttribute(name = "isMig")
    protected Boolean isMig;
    @XmlAttribute(name = "acctBalAmt")
    protected BigDecimal acctBalAmt;

    /**
     * Obtém o valor da propriedade subscriberInfo.
     * 
     * @return
     *     possible object is
     *     {@link Subscriber }
     *     
     */
    public Subscriber getSubscriberInfo() {
        return subscriberInfo;
    }

    /**
     * Define o valor da propriedade subscriberInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscriber }
     *     
     */
    public void setSubscriberInfo(Subscriber value) {
        this.subscriberInfo = value;
    }

    /**
     * Gets the value of the sbscrpMktPgm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbscrpMktPgm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSbscrpMktPgm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MktPgmEnrollment }
     * 
     * 
     */
    public List<MktPgmEnrollment> getSbscrpMktPgm() {
        if (sbscrpMktPgm == null) {
            sbscrpMktPgm = new ArrayList<MktPgmEnrollment>();
        }
        return this.sbscrpMktPgm;
    }

    /**
     * Gets the value of the sbscrpSvcAsgm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbscrpSvcAsgm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSbscrpSvcAsgm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SvcAsgmItem }
     * 
     * 
     */
    public List<SvcAsgmItem> getSbscrpSvcAsgm() {
        if (sbscrpSvcAsgm == null) {
            sbscrpSvcAsgm = new ArrayList<SvcAsgmItem>();
        }
        return this.sbscrpSvcAsgm;
    }

    /**
     * Obtém o valor da propriedade ixc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIxc() {
        return ixc;
    }

    /**
     * Define o valor da propriedade ixc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIxc(String value) {
        this.ixc = value;
    }

    /**
     * Obtém o valor da propriedade isMig.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMig() {
        return isMig;
    }

    /**
     * Define o valor da propriedade isMig.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMig(Boolean value) {
        this.isMig = value;
    }

    /**
     * Obtém o valor da propriedade acctBalAmt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcctBalAmt() {
        return acctBalAmt;
    }

    /**
     * Define o valor da propriedade acctBalAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcctBalAmt(BigDecimal value) {
        this.acctBalAmt = value;
    }

}
