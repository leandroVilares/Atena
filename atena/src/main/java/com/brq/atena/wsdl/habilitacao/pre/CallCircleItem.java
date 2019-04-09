//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.04.09 às 04:27:25 PM BRT 
//


package com.brq.atena.wsdl.habilitacao.pre;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CallCircleItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CallCircleItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callCircleMemberList" type="{http://www.vivo.com.br/atlys/}CallCircleMember" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="methodInd" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="listTypeInd" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="seqNbr" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallCircleItem", namespace = "http://www.vivo.com.br/atlys/", propOrder = {
    "callCircleMemberList"
})
public class CallCircleItem {

    protected CallCircleMember callCircleMemberList;
    @XmlAttribute(name = "methodInd")
    protected BigInteger methodInd;
    @XmlAttribute(name = "listTypeInd")
    protected BigInteger listTypeInd;
    @XmlAttribute(name = "seqNbr")
    protected BigInteger seqNbr;

    /**
     * Obtém o valor da propriedade callCircleMemberList.
     * 
     * @return
     *     possible object is
     *     {@link CallCircleMember }
     *     
     */
    public CallCircleMember getCallCircleMemberList() {
        return callCircleMemberList;
    }

    /**
     * Define o valor da propriedade callCircleMemberList.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCircleMember }
     *     
     */
    public void setCallCircleMemberList(CallCircleMember value) {
        this.callCircleMemberList = value;
    }

    /**
     * Obtém o valor da propriedade methodInd.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMethodInd() {
        return methodInd;
    }

    /**
     * Define o valor da propriedade methodInd.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMethodInd(BigInteger value) {
        this.methodInd = value;
    }

    /**
     * Obtém o valor da propriedade listTypeInd.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getListTypeInd() {
        return listTypeInd;
    }

    /**
     * Define o valor da propriedade listTypeInd.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setListTypeInd(BigInteger value) {
        this.listTypeInd = value;
    }

    /**
     * Obtém o valor da propriedade seqNbr.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeqNbr() {
        return seqNbr;
    }

    /**
     * Define o valor da propriedade seqNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeqNbr(BigInteger value) {
        this.seqNbr = value;
    }

}
