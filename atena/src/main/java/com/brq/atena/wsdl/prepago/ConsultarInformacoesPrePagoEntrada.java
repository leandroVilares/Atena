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
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{br/com/vivo/spn/integration/schema/consulta/ConsultaInformacoesPrePagoRequest}consultaInformacoesPrePagoRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consultaInformacoesPrePagoRequest"
})
@XmlRootElement(name = "consultarInformacoesPrePagoEntrada", namespace = "http://www.openuri.org/")
public class ConsultarInformacoesPrePagoEntrada {

    @XmlElement(required = true)
    protected ConsultaInformacoesPrePagoRequestType consultaInformacoesPrePagoRequest;

    /**
     * Obtém o valor da propriedade consultaInformacoesPrePagoRequest.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaInformacoesPrePagoRequestType }
     *     
     */
    public ConsultaInformacoesPrePagoRequestType getConsultaInformacoesPrePagoRequest() {
        return consultaInformacoesPrePagoRequest;
    }

    /**
     * Define o valor da propriedade consultaInformacoesPrePagoRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaInformacoesPrePagoRequestType }
     *     
     */
    public void setConsultaInformacoesPrePagoRequest(ConsultaInformacoesPrePagoRequestType value) {
        this.consultaInformacoesPrePagoRequest = value;
    }

}
