//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.26 às 04:03:40 PM BRT 
//


package com.brq.atena.wsdl.prepago;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ConsultaInformacoesPrePagoResponseType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ConsultaInformacoesPrePagoResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="snpHeader" type="{br/com/vivo/spn/integration/schema/SPNHeader}SPNHeader"/&gt;
 *         &lt;element name="spnReturnMessage" type="{br/com/vivo/spn/integration/schema/SPNReturnMessage}SPNReturnMessage"/&gt;
 *         &lt;element name="outputGetClientInfoPort" type="{br/com/vivo/spn/integration/schema/consulta/ConsultaInformacoesPrePagoResponse}OutputGetClientInfoPortType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaInformacoesPrePagoResponseType", namespace = "br/com/vivo/spn/integration/schema/consulta/ConsultaInformacoesPrePagoResponse", propOrder = {
    "snpHeader",
    "spnReturnMessage",
    "outputGetClientInfoPort"
})

@XmlRootElement(name = "consultaInformacoesPrePagoResponse", namespace = "br/com/vivo/spn/integration/schema/consulta/ConsultaInformacoesPrePagoResponse")
public class ConsultaInformacoesPrePagoResponseType {

    @XmlElement(required = true)
    protected SPNHeader snpHeader;
    @XmlElement(required = true)
    protected SPNReturnMessage spnReturnMessage;
    @XmlElement(required = true)
    protected OutputGetClientInfoPortType outputGetClientInfoPort;

    /**
     * Obtém o valor da propriedade snpHeader.
     * 
     * @return
     *     possible object is
     *     {@link SPNHeader }
     *     
     */
    public SPNHeader getSnpHeader() {
        return snpHeader;
    }

    /**
     * Define o valor da propriedade snpHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link SPNHeader }
     *     
     */
    public void setSnpHeader(SPNHeader value) {
        this.snpHeader = value;
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
     * Obtém o valor da propriedade outputGetClientInfoPort.
     * 
     * @return
     *     possible object is
     *     {@link OutputGetClientInfoPortType }
     *     
     */
    public OutputGetClientInfoPortType getOutputGetClientInfoPort() {
        return outputGetClientInfoPort;
    }

    /**
     * Define o valor da propriedade outputGetClientInfoPort.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputGetClientInfoPortType }
     *     
     */
    public void setOutputGetClientInfoPort(OutputGetClientInfoPortType value) {
        this.outputGetClientInfoPort = value;
    }

}
