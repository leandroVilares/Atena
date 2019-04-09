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
 * <p>Classe Java de EqpManufacturer complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EqpManufacturer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="mfcCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="mfcNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="otaPinNbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="modelNbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="modelNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="freqTypCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="freqModeCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="stolenDt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="recoveryDt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EqpManufacturer", namespace = "http://www.vivo.com.br/atlys/")
public class EqpManufacturer {

    @XmlAttribute(name = "mfcCd")
    protected String mfcCd;
    @XmlAttribute(name = "mfcNm")
    protected String mfcNm;
    @XmlAttribute(name = "otaPinNbr")
    protected String otaPinNbr;
    @XmlAttribute(name = "modelNbr")
    protected String modelNbr;
    @XmlAttribute(name = "modelNm")
    protected String modelNm;
    @XmlAttribute(name = "freqTypCd")
    protected String freqTypCd;
    @XmlAttribute(name = "freqModeCd")
    protected String freqModeCd;
    @XmlAttribute(name = "stolenDt")
    protected String stolenDt;
    @XmlAttribute(name = "recoveryDt")
    protected String recoveryDt;

    /**
     * Obtém o valor da propriedade mfcCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfcCd() {
        return mfcCd;
    }

    /**
     * Define o valor da propriedade mfcCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfcCd(String value) {
        this.mfcCd = value;
    }

    /**
     * Obtém o valor da propriedade mfcNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfcNm() {
        return mfcNm;
    }

    /**
     * Define o valor da propriedade mfcNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfcNm(String value) {
        this.mfcNm = value;
    }

    /**
     * Obtém o valor da propriedade otaPinNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtaPinNbr() {
        return otaPinNbr;
    }

    /**
     * Define o valor da propriedade otaPinNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtaPinNbr(String value) {
        this.otaPinNbr = value;
    }

    /**
     * Obtém o valor da propriedade modelNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNbr() {
        return modelNbr;
    }

    /**
     * Define o valor da propriedade modelNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNbr(String value) {
        this.modelNbr = value;
    }

    /**
     * Obtém o valor da propriedade modelNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNm() {
        return modelNm;
    }

    /**
     * Define o valor da propriedade modelNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNm(String value) {
        this.modelNm = value;
    }

    /**
     * Obtém o valor da propriedade freqTypCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreqTypCd() {
        return freqTypCd;
    }

    /**
     * Define o valor da propriedade freqTypCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreqTypCd(String value) {
        this.freqTypCd = value;
    }

    /**
     * Obtém o valor da propriedade freqModeCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreqModeCd() {
        return freqModeCd;
    }

    /**
     * Define o valor da propriedade freqModeCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreqModeCd(String value) {
        this.freqModeCd = value;
    }

    /**
     * Obtém o valor da propriedade stolenDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStolenDt() {
        return stolenDt;
    }

    /**
     * Define o valor da propriedade stolenDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStolenDt(String value) {
        this.stolenDt = value;
    }

    /**
     * Obtém o valor da propriedade recoveryDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecoveryDt() {
        return recoveryDt;
    }

    /**
     * Define o valor da propriedade recoveryDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecoveryDt(String value) {
        this.recoveryDt = value;
    }

}
