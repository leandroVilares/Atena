//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.26 às 04:03:40 PM BRT 
//


package com.brq.atena.wsdl.prepago;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.brq.atena.wsdl.prepago package. 
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

    private final static QName _ConsultaInformacoesPrePagoRequest_QNAME = new QName("br/com/vivo/spn/integration/schema/consulta/ConsultaInformacoesPrePagoRequest", "consultaInformacoesPrePagoRequest");
    private final static QName _ConsultaInformacoesPrePagoResponse_QNAME = new QName("br/com/vivo/spn/integration/schema/consulta/ConsultaInformacoesPrePagoResponse", "consultaInformacoesPrePagoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.brq.atena.wsdl.prepago
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarInformacoesPrePagoEntrada }
     * 
     */
    public ConsultarInformacoesPrePagoEntrada createConsultarInformacoesPrePagoEntrada() {
        return new ConsultarInformacoesPrePagoEntrada();
    }

    /**
     * Create an instance of {@link ConsultaInformacoesPrePagoRequestType }
     * 
     */
    public ConsultaInformacoesPrePagoRequestType createConsultaInformacoesPrePagoRequestType() {
        return new ConsultaInformacoesPrePagoRequestType();
    }

    /**
     * Create an instance of {@link ConsultarInformacoesPrePagoEntradaResponse }
     * 
     */
    public ConsultarInformacoesPrePagoEntradaResponse createConsultarInformacoesPrePagoEntradaResponse() {
        return new ConsultarInformacoesPrePagoEntradaResponse();
    }

    /**
     * Create an instance of {@link ConsultaInformacoesPrePagoResponseType }
     * 
     */
    public ConsultaInformacoesPrePagoResponseType createConsultaInformacoesPrePagoResponseType() {
        return new ConsultaInformacoesPrePagoResponseType();
    }

    /**
     * Create an instance of {@link RecordType }
     * 
     */
    public RecordType createRecordType() {
        return new RecordType();
    }

    /**
     * Create an instance of {@link BodyType }
     * 
     */
    public BodyType createBodyType() {
        return new BodyType();
    }

    /**
     * Create an instance of {@link OutputGetClientInfoPortType }
     * 
     */
    public OutputGetClientInfoPortType createOutputGetClientInfoPortType() {
        return new OutputGetClientInfoPortType();
    }

    /**
     * Create an instance of {@link SPNHeader }
     * 
     */
    public SPNHeader createSPNHeader() {
        return new SPNHeader();
    }

    /**
     * Create an instance of {@link SPNReturnMessage }
     * 
     */
    public SPNReturnMessage createSPNReturnMessage() {
        return new SPNReturnMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaInformacoesPrePagoRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "br/com/vivo/spn/integration/schema/consulta/ConsultaInformacoesPrePagoRequest", name = "consultaInformacoesPrePagoRequest")
    public JAXBElement<ConsultaInformacoesPrePagoRequestType> createConsultaInformacoesPrePagoRequest(ConsultaInformacoesPrePagoRequestType value) {
        return new JAXBElement<ConsultaInformacoesPrePagoRequestType>(_ConsultaInformacoesPrePagoRequest_QNAME, ConsultaInformacoesPrePagoRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaInformacoesPrePagoResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "br/com/vivo/spn/integration/schema/consulta/ConsultaInformacoesPrePagoResponse", name = "consultaInformacoesPrePagoResponse")
    public JAXBElement<ConsultaInformacoesPrePagoResponseType> createConsultaInformacoesPrePagoResponse(ConsultaInformacoesPrePagoResponseType value) {
        return new JAXBElement<ConsultaInformacoesPrePagoResponseType>(_ConsultaInformacoesPrePagoResponse_QNAME, ConsultaInformacoesPrePagoResponseType.class, null, value);
    }

}
