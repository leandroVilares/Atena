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
 * <p>Classe Java de BasicSvcItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BasicSvcItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="basicSvcId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="basicSvcNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicSvcItem", namespace = "http://www.vivo.com.br/atlys/")
public class BasicSvcItem {

    @XmlAttribute(name = "basicSvcId")
    protected String basicSvcId;
    @XmlAttribute(name = "basicSvcNm")
    protected String basicSvcNm;

    /**
     * Obtém o valor da propriedade basicSvcId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasicSvcId() {
        return basicSvcId;
    }

    /**
     * Define o valor da propriedade basicSvcId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasicSvcId(String value) {
        this.basicSvcId = value;
    }

    /**
     * Obtém o valor da propriedade basicSvcNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasicSvcNm() {
        return basicSvcNm;
    }

    /**
     * Define o valor da propriedade basicSvcNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasicSvcNm(String value) {
        this.basicSvcNm = value;
    }

}
