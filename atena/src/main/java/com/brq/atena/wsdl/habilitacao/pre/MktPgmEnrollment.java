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
 * <p>Classe Java de MktPgmEnrollment complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MktPgmEnrollment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="csa" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="mktPgmDesc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="mktPgmId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="enrollDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MktPgmEnrollment", namespace = "http://www.vivo.com.br/atlys/")
public class MktPgmEnrollment {

    @XmlAttribute(name = "csa")
    protected String csa;
    @XmlAttribute(name = "mktPgmDesc")
    protected String mktPgmDesc;
    @XmlAttribute(name = "mktPgmId")
    protected String mktPgmId;
    @XmlAttribute(name = "enrollDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar enrollDt;

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
     * Obtém o valor da propriedade mktPgmDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktPgmDesc() {
        return mktPgmDesc;
    }

    /**
     * Define o valor da propriedade mktPgmDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktPgmDesc(String value) {
        this.mktPgmDesc = value;
    }

    /**
     * Obtém o valor da propriedade mktPgmId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktPgmId() {
        return mktPgmId;
    }

    /**
     * Define o valor da propriedade mktPgmId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktPgmId(String value) {
        this.mktPgmId = value;
    }

    /**
     * Obtém o valor da propriedade enrollDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnrollDt() {
        return enrollDt;
    }

    /**
     * Define o valor da propriedade enrollDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnrollDt(XMLGregorianCalendar value) {
        this.enrollDt = value;
    }

}
