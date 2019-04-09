//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.04.09 às 04:27:25 PM BRT 
//


package com.brq.atena.wsdl.habilitacao.pre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GsmBasicAttr complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GsmBasicAttr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gsmEqp" type="{http://www.vivo.com.br/atlys/}GsmEqpAttr" minOccurs="0"/&gt;
 *         &lt;element name="gsmAcsNbr" type="{http://www.vivo.com.br/atlys/}AccessNbrAttr" minOccurs="0"/&gt;
 *         &lt;element name="addlAttrs" type="{http://www.vivo.com.br/atlys/}AttrValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GsmBasicAttr", namespace = "http://www.vivo.com.br/atlys/", propOrder = {
    "gsmEqp",
    "gsmAcsNbr",
    "addlAttrs"
})
public class GsmBasicAttr {

    protected GsmEqpAttr gsmEqp;
    protected AccessNbrAttr gsmAcsNbr;
    protected AttrValue addlAttrs;

    /**
     * Obtém o valor da propriedade gsmEqp.
     * 
     * @return
     *     possible object is
     *     {@link GsmEqpAttr }
     *     
     */
    public GsmEqpAttr getGsmEqp() {
        return gsmEqp;
    }

    /**
     * Define o valor da propriedade gsmEqp.
     * 
     * @param value
     *     allowed object is
     *     {@link GsmEqpAttr }
     *     
     */
    public void setGsmEqp(GsmEqpAttr value) {
        this.gsmEqp = value;
    }

    /**
     * Obtém o valor da propriedade gsmAcsNbr.
     * 
     * @return
     *     possible object is
     *     {@link AccessNbrAttr }
     *     
     */
    public AccessNbrAttr getGsmAcsNbr() {
        return gsmAcsNbr;
    }

    /**
     * Define o valor da propriedade gsmAcsNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessNbrAttr }
     *     
     */
    public void setGsmAcsNbr(AccessNbrAttr value) {
        this.gsmAcsNbr = value;
    }

    /**
     * Obtém o valor da propriedade addlAttrs.
     * 
     * @return
     *     possible object is
     *     {@link AttrValue }
     *     
     */
    public AttrValue getAddlAttrs() {
        return addlAttrs;
    }

    /**
     * Define o valor da propriedade addlAttrs.
     * 
     * @param value
     *     allowed object is
     *     {@link AttrValue }
     *     
     */
    public void setAddlAttrs(AttrValue value) {
        this.addlAttrs = value;
    }

}
