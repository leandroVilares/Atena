//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.28 às 12:31:47 PM BRT 
//


package com.brq.atena.wsdl.pospagoatlys;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SolicitacaoInformacaoClienteContaPosPagoResponseType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SolicitacaoInformacaoClienteContaPosPagoResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="spnHeader" type="{br/com/vivo/spn/integration/schema/SPNHeader}SPNHeader"/&gt;
 *         &lt;element name="spnReturnMessage" type="{br/com/vivo/spn/integration/schema/SPNReturnMessage}SPNReturnMessage"/&gt;
 *         &lt;element name="outputGetCustomerAccountInfoV3" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}OutputGetCustomerAccountInfoV3Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolicitacaoInformacaoClienteContaPosPagoResponseType", propOrder = {
    "spnHeader",
    "spnReturnMessage",
    "outputGetCustomerAccountInfoV3"
})

public class SolicitacaoInformacaoClienteContaPosPagoResponseType {

    @XmlElement(required = true)
    protected SPNHeader spnHeader;
    @XmlElement(required = true)
    protected SPNReturnMessage spnReturnMessage;
    @XmlElement(required = true)
    protected OutputGetCustomerAccountInfoV3Type outputGetCustomerAccountInfoV3;

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
     * Obtém o valor da propriedade outputGetCustomerAccountInfoV3.
     * 
     * @return
     *     possible object is
     *     {@link OutputGetCustomerAccountInfoV3Type }
     *     
     */
    public OutputGetCustomerAccountInfoV3Type getOutputGetCustomerAccountInfoV3() {
        return outputGetCustomerAccountInfoV3;
    }

    /**
     * Define o valor da propriedade outputGetCustomerAccountInfoV3.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputGetCustomerAccountInfoV3Type }
     *     
     */
    public void setOutputGetCustomerAccountInfoV3(OutputGetCustomerAccountInfoV3Type value) {
        this.outputGetCustomerAccountInfoV3 = value;
    }

}
