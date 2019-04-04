//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.21 às 05:10:11 PM BRT 
//


package com.brq.atena.wsdl.pospago;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponseType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="spnHeader" type="{br/com/vivo/spn/integration/schema/SPNHeader}SPNHeader"/&gt;
 *         &lt;element name="spnReturnMessage" type="{br/com/vivo/spn/integration/schema/SPNReturnMessage}SPNReturnMessage"/&gt;
 *         &lt;element name="outputSearchCustAcctSbscrpByAttribute" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse}OutputSearchCustAcctSbscrpByAttributeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponseType", propOrder = {
    "spnHeader",
    "spnReturnMessage",
    "outputSearchCustAcctSbscrpByAttribute"
})
public class SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponseType {

    @XmlElement(namespace = "br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse", required = true)
    protected SPNHeader spnHeader;
    @XmlElement(namespace = "br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse", required = true)
    protected SPNReturnMessage spnReturnMessage;
    @XmlElement(namespace = "br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse", required = true)
    protected OutputSearchCustAcctSbscrpByAttributeType outputSearchCustAcctSbscrpByAttribute;

    /**
     * Obtém o valor da propriedade spnHeader.
     * 
     * @return
     *     possible object is
     *     {@link SPNHeader }
     *     
     */
    public SPNHeader getSpnHeader() {
        return spnHeader;
    }

    /**
     * Define o valor da propriedade spnHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link SPNHeader }
     *     
     */
    public void setSpnHeader(SPNHeader value) {
        this.spnHeader = value;
    }

    /**
     * Obtém o valor da propriedade spnReturnMessage.
     * 
     * @return
     *     possible object is
     *     {@link SPNReturnMessage }
     *     
     */
    public SPNReturnMessage getSpnReturnMessage() {
        return spnReturnMessage;
    }

    /**
     * Define o valor da propriedade spnReturnMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link SPNReturnMessage }
     *     
     */
    public void setSpnReturnMessage(SPNReturnMessage value) {
        this.spnReturnMessage = value;
    }

    /**
     * Obtém o valor da propriedade outputSearchCustAcctSbscrpByAttribute.
     * 
     * @return
     *     possible object is
     *     {@link OutputSearchCustAcctSbscrpByAttributeType }
     *     
     */
    public OutputSearchCustAcctSbscrpByAttributeType getOutputSearchCustAcctSbscrpByAttribute() {
        return outputSearchCustAcctSbscrpByAttribute;
    }

    /**
     * Define o valor da propriedade outputSearchCustAcctSbscrpByAttribute.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputSearchCustAcctSbscrpByAttributeType }
     *     
     */
    public void setOutputSearchCustAcctSbscrpByAttribute(OutputSearchCustAcctSbscrpByAttributeType value) {
        this.outputSearchCustAcctSbscrpByAttribute = value;
    }

}
