//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.03.13 às 04:53:53 PM BRT 
//


package com.brq.atena.wsdl.conector;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.brq.atena.wsdl.conector package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetTicketMessageResponse_QNAME = new QName("http://ws.soa.cleartech.com.br/", "getTicketMessageResponse");
    private final static QName _PortabilityTicketSearchException_QNAME = new QName("http://ws.soa.cleartech.com.br/", "PortabilityTicketSearchException");
    private final static QName _GetTicketHistoryResponse_QNAME = new QName("http://ws.soa.cleartech.com.br/", "getTicketHistoryResponse");
    private final static QName _GetCurrentTicket_QNAME = new QName("http://ws.soa.cleartech.com.br/", "getCurrentTicket");
    private final static QName _GetCurrentTicketResponse_QNAME = new QName("http://ws.soa.cleartech.com.br/", "getCurrentTicketResponse");
    private final static QName _GetPortabilityHistoryResponse_QNAME = new QName("http://ws.soa.cleartech.com.br/", "getPortabilityHistoryResponse");
    private final static QName _GetPortabilityHistory_QNAME = new QName("http://ws.soa.cleartech.com.br/", "getPortabilityHistory");
    private final static QName _GetTicketHistory_QNAME = new QName("http://ws.soa.cleartech.com.br/", "getTicketHistory");
    private final static QName _GetTicketMessage_QNAME = new QName("http://ws.soa.cleartech.com.br/", "getTicketMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.brq.atena.wsdl.conector
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTicketMessageResponse }
     * 
     */
    public GetTicketMessageResponse createGetTicketMessageResponse() {
        return new GetTicketMessageResponse();
    }

    /**
     * Create an instance of {@link PortabilityTicketSearchException }
     * 
     */
    public PortabilityTicketSearchException createPortabilityTicketSearchException() {
        return new PortabilityTicketSearchException();
    }

    /**
     * Create an instance of {@link GetTicketHistoryResponse }
     * 
     */
    public GetTicketHistoryResponse createGetTicketHistoryResponse() {
        return new GetTicketHistoryResponse();
    }

    /**
     * Create an instance of {@link GetCurrentTicket }
     * 
     */
    public GetCurrentTicket createGetCurrentTicket() {
        return new GetCurrentTicket();
    }

    /**
     * Create an instance of {@link GetCurrentTicketResponse }
     * 
     */
    public GetCurrentTicketResponse createGetCurrentTicketResponse() {
        return new GetCurrentTicketResponse();
    }

    /**
     * Create an instance of {@link GetPortabilityHistoryResponse }
     * 
     */
    public GetPortabilityHistoryResponse createGetPortabilityHistoryResponse() {
        return new GetPortabilityHistoryResponse();
    }

    /**
     * Create an instance of {@link GetPortabilityHistory }
     * 
     */
    public GetPortabilityHistory createGetPortabilityHistory() {
        return new GetPortabilityHistory();
    }

    /**
     * Create an instance of {@link GetTicketHistory }
     * 
     */
    public GetTicketHistory createGetTicketHistory() {
        return new GetTicketHistory();
    }

    /**
     * Create an instance of {@link GetTicketMessage }
     * 
     */
    public GetTicketMessage createGetTicketMessage() {
        return new GetTicketMessage();
    }

    /**
     * Create an instance of {@link MessageHistoryOut }
     * 
     */
    public MessageHistoryOut createMessageHistoryOut() {
        return new MessageHistoryOut();
    }

    /**
     * Create an instance of {@link PortabilityHistoryIn }
     * 
     */
    public PortabilityHistoryIn createPortabilityHistoryIn() {
        return new PortabilityHistoryIn();
    }

    /**
     * Create an instance of {@link MessageHistoryIn }
     * 
     */
    public MessageHistoryIn createMessageHistoryIn() {
        return new MessageHistoryIn();
    }

    /**
     * Create an instance of {@link PortabilityTicketOut }
     * 
     */
    public PortabilityTicketOut createPortabilityTicketOut() {
        return new PortabilityTicketOut();
    }

    /**
     * Create an instance of {@link PortabilityTicketIn }
     * 
     */
    public PortabilityTicketIn createPortabilityTicketIn() {
        return new PortabilityTicketIn();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.cleartech.com.br/", name = "getTicketMessageResponse")
    public JAXBElement<GetTicketMessageResponse> createGetTicketMessageResponse(GetTicketMessageResponse value) {
        return new JAXBElement<GetTicketMessageResponse>(_GetTicketMessageResponse_QNAME, GetTicketMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortabilityTicketSearchException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.cleartech.com.br/", name = "PortabilityTicketSearchException")
    public JAXBElement<PortabilityTicketSearchException> createPortabilityTicketSearchException(PortabilityTicketSearchException value) {
        return new JAXBElement<PortabilityTicketSearchException>(_PortabilityTicketSearchException_QNAME, PortabilityTicketSearchException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.cleartech.com.br/", name = "getTicketHistoryResponse")
    public JAXBElement<GetTicketHistoryResponse> createGetTicketHistoryResponse(GetTicketHistoryResponse value) {
        return new JAXBElement<GetTicketHistoryResponse>(_GetTicketHistoryResponse_QNAME, GetTicketHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.cleartech.com.br/", name = "getCurrentTicket")
    public JAXBElement<GetCurrentTicket> createGetCurrentTicket(GetCurrentTicket value) {
        return new JAXBElement<GetCurrentTicket>(_GetCurrentTicket_QNAME, GetCurrentTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.cleartech.com.br/", name = "getCurrentTicketResponse")
    public JAXBElement<GetCurrentTicketResponse> createGetCurrentTicketResponse(GetCurrentTicketResponse value) {
        return new JAXBElement<GetCurrentTicketResponse>(_GetCurrentTicketResponse_QNAME, GetCurrentTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPortabilityHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.cleartech.com.br/", name = "getPortabilityHistoryResponse")
    public JAXBElement<GetPortabilityHistoryResponse> createGetPortabilityHistoryResponse(GetPortabilityHistoryResponse value) {
        return new JAXBElement<GetPortabilityHistoryResponse>(_GetPortabilityHistoryResponse_QNAME, GetPortabilityHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPortabilityHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.cleartech.com.br/", name = "getPortabilityHistory")
    public JAXBElement<GetPortabilityHistory> createGetPortabilityHistory(GetPortabilityHistory value) {
        return new JAXBElement<GetPortabilityHistory>(_GetPortabilityHistory_QNAME, GetPortabilityHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.cleartech.com.br/", name = "getTicketHistory")
    public JAXBElement<GetTicketHistory> createGetTicketHistory(GetTicketHistory value) {
        return new JAXBElement<GetTicketHistory>(_GetTicketHistory_QNAME, GetTicketHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.cleartech.com.br/", name = "getTicketMessage")
    public JAXBElement<GetTicketMessage> createGetTicketMessage(GetTicketMessage value) {
        return new JAXBElement<GetTicketMessage>(_GetTicketMessage_QNAME, GetTicketMessage.class, null, value);
    }

}
