//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.04.09 às 04:27:25 PM BRT 
//


package com.brq.atena.wsdl.habilitacao.pre;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Currency complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Currency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="crncyCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="amntDue" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Currency", namespace = "http://www.vivo.com.br/atlys/")
@XmlSeeAlso({
    com.brq.atena.wsdl.habilitacao.pre.ChargeInfo.ChgAmt.class
})
public class Currency {

    @XmlAttribute(name = "crncyCd")
    protected String crncyCd;
    @XmlAttribute(name = "amntDue")
    protected BigDecimal amntDue;

    /**
     * Obtém o valor da propriedade crncyCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrncyCd() {
        return crncyCd;
    }

    /**
     * Define o valor da propriedade crncyCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrncyCd(String value) {
        this.crncyCd = value;
    }

    /**
     * Obtém o valor da propriedade amntDue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmntDue() {
        return amntDue;
    }

    /**
     * Define o valor da propriedade amntDue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmntDue(BigDecimal value) {
        this.amntDue = value;
    }

}
