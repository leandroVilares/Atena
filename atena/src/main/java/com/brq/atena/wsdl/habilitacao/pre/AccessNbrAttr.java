//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.04.09 às 04:27:25 PM BRT 
//


package com.brq.atena.wsdl.habilitacao.pre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AccessNbrAttr complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AccessNbrAttr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="MDN" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MDNActionFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MDNEffDt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MDNEffTm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MDNExpTm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MDNExpDt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="reasonCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="portStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessNbrAttr", namespace = "http://www.vivo.com.br/atlys/")
public class AccessNbrAttr {

    @XmlAttribute(name = "MDN")
    protected String mdn;
    @XmlAttribute(name = "MDNActionFlag")
    protected String mdnActionFlag;
    @XmlAttribute(name = "MDNEffDt")
    protected String mdnEffDt;
    @XmlAttribute(name = "MDNEffTm")
    protected String mdnEffTm;
    @XmlAttribute(name = "MDNExpTm")
    protected String mdnExpTm;
    @XmlAttribute(name = "MDNExpDt")
    protected String mdnExpDt;
    @XmlAttribute(name = "reasonCd")
    protected String reasonCd;
    @XmlAttribute(name = "portStatus")
    protected String portStatus;

    /**
     * Obtém o valor da propriedade mdn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDN() {
        return mdn;
    }

    /**
     * Define o valor da propriedade mdn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDN(String value) {
        this.mdn = value;
    }

    /**
     * Obtém o valor da propriedade mdnActionFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDNActionFlag() {
        return mdnActionFlag;
    }

    /**
     * Define o valor da propriedade mdnActionFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDNActionFlag(String value) {
        this.mdnActionFlag = value;
    }

    /**
     * Obtém o valor da propriedade mdnEffDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDNEffDt() {
        return mdnEffDt;
    }

    /**
     * Define o valor da propriedade mdnEffDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDNEffDt(String value) {
        this.mdnEffDt = value;
    }

    /**
     * Obtém o valor da propriedade mdnEffTm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDNEffTm() {
        return mdnEffTm;
    }

    /**
     * Define o valor da propriedade mdnEffTm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDNEffTm(String value) {
        this.mdnEffTm = value;
    }

    /**
     * Obtém o valor da propriedade mdnExpTm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDNExpTm() {
        return mdnExpTm;
    }

    /**
     * Define o valor da propriedade mdnExpTm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDNExpTm(String value) {
        this.mdnExpTm = value;
    }

    /**
     * Obtém o valor da propriedade mdnExpDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDNExpDt() {
        return mdnExpDt;
    }

    /**
     * Define o valor da propriedade mdnExpDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDNExpDt(String value) {
        this.mdnExpDt = value;
    }

    /**
     * Obtém o valor da propriedade reasonCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCd() {
        return reasonCd;
    }

    /**
     * Define o valor da propriedade reasonCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCd(String value) {
        this.reasonCd = value;
    }

    /**
     * Obtém o valor da propriedade portStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortStatus() {
        return portStatus;
    }

    /**
     * Define o valor da propriedade portStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortStatus(String value) {
        this.portStatus = value;
    }

}
