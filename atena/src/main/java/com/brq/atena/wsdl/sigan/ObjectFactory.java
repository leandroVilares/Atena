//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.21 às 05:14:10 PM BRT 
//


package com.brq.atena.wsdl.sigan;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.brq.atena.wsdl.sigan package. 
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

    private final static QName _RespostaNumeroVivoWSTOReason_QNAME = new QName("http://to.webservice.portabilidade.sigan.indrasistemas.com.br", "reason");
    private final static QName _RespostaNumeroVivoWSTOReasonCode_QNAME = new QName("http://to.webservice.portabilidade.sigan.indrasistemas.com.br", "reasonCode");
    private final static QName _RequestInfoWSTOServiceName_QNAME = new QName("http://to.webservice.sigan.indrasistemas.com.br", "serviceName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.brq.atena.wsdl.sigan
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestInfoWSTO }
     * 
     */
    public RequestInfoWSTO createRequestInfoWSTO() {
        return new RequestInfoWSTO();
    }

    /**
     * Create an instance of {@link ConsultarDadosNumero }
     * 
     */
    public ConsultarDadosNumero createConsultarDadosNumero() {
        return new ConsultarDadosNumero();
    }

    /**
     * Create an instance of {@link ArrayOfLong }
     * 
     */
    public ArrayOfLong createArrayOfLong() {
        return new ArrayOfLong();
    }

    /**
     * Create an instance of {@link ConsultarDadosNumeroResponse }
     * 
     */
    public ConsultarDadosNumeroResponse createConsultarDadosNumeroResponse() {
        return new ConsultarDadosNumeroResponse();
    }

    /**
     * Create an instance of {@link RespostaNumeroVivoWSTO }
     * 
     */
    public RespostaNumeroVivoWSTO createRespostaNumeroVivoWSTO() {
        return new RespostaNumeroVivoWSTO();
    }

    /**
     * Create an instance of {@link ArrayOfNumeroWSTO }
     * 
     */
    public ArrayOfNumeroWSTO createArrayOfNumeroWSTO() {
        return new ArrayOfNumeroWSTO();
    }

    /**
     * Create an instance of {@link NumeroWSTO }
     * 
     */
    public NumeroWSTO createNumeroWSTO() {
        return new NumeroWSTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://to.webservice.portabilidade.sigan.indrasistemas.com.br", name = "reason", scope = RespostaNumeroVivoWSTO.class)
    public JAXBElement<String> createRespostaNumeroVivoWSTOReason(String value) {
        return new JAXBElement<String>(_RespostaNumeroVivoWSTOReason_QNAME, String.class, RespostaNumeroVivoWSTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://to.webservice.portabilidade.sigan.indrasistemas.com.br", name = "reasonCode", scope = RespostaNumeroVivoWSTO.class)
    public JAXBElement<Integer> createRespostaNumeroVivoWSTOReasonCode(Integer value) {
        return new JAXBElement<Integer>(_RespostaNumeroVivoWSTOReasonCode_QNAME, Integer.class, RespostaNumeroVivoWSTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://to.webservice.sigan.indrasistemas.com.br", name = "serviceName", scope = RequestInfoWSTO.class)
    public JAXBElement<String> createRequestInfoWSTOServiceName(String value) {
        return new JAXBElement<String>(_RequestInfoWSTOServiceName_QNAME, String.class, RequestInfoWSTO.class, value);
    }

}
