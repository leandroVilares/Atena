//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.03.13 às 04:53:53 PM BRT 
//


package com.brq.atena.wsdl.conector;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getTicketMessage complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getTicketMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageHistoryIn" type="{http://ws.soa.cleartech.com.br/}messageHistoryIn" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTicketMessage", propOrder = {
    "messageHistoryIn"
})
public class GetTicketMessage {

    protected MessageHistoryIn messageHistoryIn;

    /**
     * Obtém o valor da propriedade messageHistoryIn.
     * 
     * @return
     *     possible object is
     *     {@link MessageHistoryIn }
     *     
     */
    public MessageHistoryIn getMessageHistoryIn() {
        return messageHistoryIn;
    }

    /**
     * Define o valor da propriedade messageHistoryIn.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHistoryIn }
     *     
     */
    public void setMessageHistoryIn(MessageHistoryIn value) {
        this.messageHistoryIn = value;
    }

}
