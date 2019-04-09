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
 * <p>Classe Java de PcsEqpAttr complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PcsEqpAttr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eqpMfc" type="{http://www.vivo.com.br/atlys/}EqpManufacturer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Esn" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="esnType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Asn" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PcsEqpAttr", namespace = "http://www.vivo.com.br/atlys/", propOrder = {
    "eqpMfc"
})
public class PcsEqpAttr {

    protected EqpManufacturer eqpMfc;
    @XmlAttribute(name = "Esn")
    protected String esn;
    @XmlAttribute(name = "esnType")
    protected String esnType;
    @XmlAttribute(name = "Asn")
    protected String asn;

    /**
     * Obtém o valor da propriedade eqpMfc.
     * 
     * @return
     *     possible object is
     *     {@link EqpManufacturer }
     *     
     */
    public EqpManufacturer getEqpMfc() {
        return eqpMfc;
    }

    /**
     * Define o valor da propriedade eqpMfc.
     * 
     * @param value
     *     allowed object is
     *     {@link EqpManufacturer }
     *     
     */
    public void setEqpMfc(EqpManufacturer value) {
        this.eqpMfc = value;
    }

    /**
     * Obtém o valor da propriedade esn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsn() {
        return esn;
    }

    /**
     * Define o valor da propriedade esn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsn(String value) {
        this.esn = value;
    }

    /**
     * Obtém o valor da propriedade esnType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsnType() {
        return esnType;
    }

    /**
     * Define o valor da propriedade esnType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsnType(String value) {
        this.esnType = value;
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

}
