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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de CallCircleMember complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CallCircleMember"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="accessNbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="accessNbrDesc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="effDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="exprDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallCircleMember", namespace = "http://www.vivo.com.br/atlys/")
public class CallCircleMember {

    @XmlAttribute(name = "accessNbr")
    protected String accessNbr;
    @XmlAttribute(name = "accessNbrDesc")
    protected String accessNbrDesc;
    @XmlAttribute(name = "effDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effDt;
    @XmlAttribute(name = "exprDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exprDt;

    /**
     * Obtém o valor da propriedade accessNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessNbr() {
        return accessNbr;
    }

    /**
     * Define o valor da propriedade accessNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessNbr(String value) {
        this.accessNbr = value;
    }

    /**
     * Obtém o valor da propriedade accessNbrDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessNbrDesc() {
        return accessNbrDesc;
    }

    /**
     * Define o valor da propriedade accessNbrDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessNbrDesc(String value) {
        this.accessNbrDesc = value;
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExprDt() {
        return exprDt;
    }

    /**
     * Define o valor da propriedade exprDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExprDt(XMLGregorianCalendar value) {
        this.exprDt = value;
    }

}
