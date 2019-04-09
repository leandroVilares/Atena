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
 * <p>Classe Java de SalesChnl complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SalesChnl"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="salesChnlId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="salesPersonId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="salesChnlName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesChnl", namespace = "http://www.vivo.com.br/atlys/")
public class SalesChnl {

    @XmlAttribute(name = "salesChnlId")
    protected String salesChnlId;
    @XmlAttribute(name = "salesPersonId")
    protected String salesPersonId;
    @XmlAttribute(name = "salesChnlName")
    protected String salesChnlName;

    /**
     * Obtém o valor da propriedade salesChnlId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChnlId() {
        return salesChnlId;
    }

    /**
     * Define o valor da propriedade salesChnlId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChnlId(String value) {
        this.salesChnlId = value;
    }

    /**
     * Obtém o valor da propriedade salesPersonId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPersonId() {
        return salesPersonId;
    }

    /**
     * Define o valor da propriedade salesPersonId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPersonId(String value) {
        this.salesPersonId = value;
    }

    /**
     * Obtém o valor da propriedade salesChnlName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChnlName() {
        return salesChnlName;
    }

    /**
     * Define o valor da propriedade salesChnlName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChnlName(String value) {
        this.salesChnlName = value;
    }

}
