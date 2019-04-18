package com.brq.atena.service;



import java.math.BigInteger;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.brq.atena.wsdl.conector.GetCurrentTicket;
import com.brq.atena.wsdl.conector.GetPortabilityHistory;
import com.brq.atena.wsdl.conector.GetPortabilityHistoryResponse;
import com.brq.atena.wsdl.conector.GetTicketHistory;
import com.brq.atena.wsdl.conector.GetTicketHistoryResponse;
import com.brq.atena.wsdl.conector.GetTicketMessage;
import com.brq.atena.wsdl.conector.PortabilityHistoryIn;
import com.brq.atena.wsdl.pospago.InputSearchCustAcctSbscrpByAttributeType;
import com.brq.atena.wsdl.pospago.SPNHeader;
import com.brq.atena.wsdl.pospago.SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequestType;
import com.brq.atena.wsdl.pospago.SolicitarPesquisaClienteContaAssinaturaAtributoPosPago;
import com.brq.atena.wsdl.pospago.SolicitarPesquisaClienteContaAssinaturaAtributoPosPagoResponse;
import com.brq.atena.wsdl.pospagoatlys.InputGetCustomerAccountInfoV3Type;
import com.brq.atena.wsdl.pospagoatlys.SolicitacaoInformacaoClienteContaPosPago;
import com.brq.atena.wsdl.pospagoatlys.SolicitacaoInformacaoClienteContaPosPagoRequestType;
import com.brq.atena.wsdl.pospagoatlys.SolicitacaoInformacaoClienteContaPosPagoResponse;
import com.brq.atena.wsdl.prepago.BodyType;
import com.brq.atena.wsdl.prepago.ConsultaInformacoesPrePagoRequestType;
import com.brq.atena.wsdl.prepago.ConsultarInformacoesPrePagoEntrada;
import com.brq.atena.wsdl.prepago.ConsultarInformacoesPrePagoEntradaResponse;
import com.brq.atena.wsdl.prepago.RecordType;
import com.brq.atena.wsdl.sigan.ArrayOfLong;
import com.brq.atena.wsdl.sigan.ConsultarDadosNumero;
import com.brq.atena.wsdl.sigan.ConsultarDadosNumeroResponse;
import com.brq.atena.wsdl.sigan.ObjectFactory;
import com.brq.atena.wsdl.sigan.RequestInfoWSTO;

public class InvocarWebservice  extends WebServiceGatewaySupport {

	String adressSigan ="http://localhost:8088/SiganServices/services/ConsultarDadosNumeroVivoService";
	String contextSigan ="http://webservice.portabilidade.sigan.indrasistemas.com.br";
	String pacoteSigan = "com.brq.atena.wsdl.sigan";

	String adressNGim ="http://10.238.35.105:9010/spn/integration/interface72/ProxyService/ConsultaInformacoesPrePago/V1?wsdl";
	String contextNGim ="http://www.openuri.org/consultarInformacoesPrePagoEntrada";
	String pacoteNGim = "com.brq.atena.wsdl.prepago";

	String adressAtlys ="http://10.238.35.105:9010/spn/integration/interface81/ProxyService/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPago/V1?wsdl";
	String contextAtlys ="http://www.openuri.org/solicitarPesquisaClienteContaAssinaturaAtributoPosPago";
	String pacoteAtlys = "com.brq.atena.wsdl.pospago";

	String adressPosAtlys ="http://mariopolis:9010/spn/integration/interface79/ProxyService/SolicitacaoInformacaoClienteContaPosPago/V1?wsdl";
	String contextPosAtlys ="http://www.openuri.org/solicitacaoInformacaoClienteContaPosPago";
	String pacotePosAtlys = "com.brq.atena.wsdl.pospagoatlys";

	String adressConector ="http://conector-soa-api-cluster:80/soa-webservice/PortabilityTicketSearchService?wsdl";
	String contextConector ="http://ws.soa.cleartech.com.br/PortabilityTicketSearch/getTicketHistoryResponse";
	String pacoteConector = "com.brq.atena.wsdl.conector";



	public InvocarWebservice()  {
		super();
		// TODO Auto-generated constructor stub
	}





	public ConsultarDadosNumeroResponse createTemplateSigan(String numero) throws Exception {

		System.out.println("Invocando O serviço"); 
		WebServiceTemplate  webServiceTemplate = getWebServiceTemplate(); 

		marshall(pacoteSigan, webServiceTemplate);
		ConsultarDadosNumero request = new ObjectFactory().createConsultarDadosNumero();
		RequestInfoWSTO info = new ObjectFactory().createRequestInfoWSTO();
		info.setIp("10.0.0.0");
		//info.setServiceName();
		info.setSystemModule("ATENA");
		info.setUserName("RoboAtena");
		request.setRequestInfo(info);
		ArrayOfLong arrayOfLong =  new ObjectFactory().createArrayOfLong();
		arrayOfLong.getLong().add(new Long(numero));
		request.setListaMSISDN(arrayOfLong);

		ConsultarDadosNumeroResponse response = (ConsultarDadosNumeroResponse) getWebServiceTemplate().marshalSendAndReceive(adressSigan, request,new SoapActionCallback(contextSigan));
		System.out.println("Respopsta do SIGAN "  + "  "+ response.getRespostaWS().getMsisdnsEncontrados().getNumeroWSTO().get(0).getTipoRede());
		System.out.println("Respopsta do SIGAN "  + "  "+ response.getRespostaWS().getMsisdnsEncontrados().getNumeroWSTO().get(0).getTipoNumero());
		return response;
	}

	@ResponseBody
	public void createTemplateNGim(String numero) throws Exception {
		System.out.println("Invocando O serviço"); 
		WebServiceTemplate  webServiceTemplate = getWebServiceTemplate();
		marshall(pacoteNGim, webServiceTemplate);


		ConsultarInformacoesPrePagoEntrada  consultarInformacoesPrePagoEntrada =
				new com.brq.atena.wsdl.prepago.ObjectFactory().createConsultarInformacoesPrePagoEntrada();

		ConsultaInformacoesPrePagoRequestType consultaInformacoesPrePagoRequestType = 
				new  com.brq.atena.wsdl.prepago.ObjectFactory().createConsultaInformacoesPrePagoRequestType();

		consultarInformacoesPrePagoEntrada.setConsultaInformacoesPrePagoRequest(consultaInformacoesPrePagoRequestType);
		BodyType  bodyType = new com.brq.atena.wsdl.prepago.ObjectFactory().createBodyType();

		com.brq.atena.wsdl.prepago.SPNHeader spnHeader = new  com.brq.atena.wsdl.prepago.ObjectFactory().createSPNHeader();
		RecordType  recordType =new com.brq.atena.wsdl.prepago.ObjectFactory().createRecordType();

		consultaInformacoesPrePagoRequestType.setBody(bodyType);
		consultaInformacoesPrePagoRequestType.setSpnHeader(spnHeader);
		bodyType.setRecord(recordType);
		bodyType.setSid("8090");


		recordType.setInCellNumber(numero);
		recordType.setInUserName("SPNSYSTEM");



		ConsultarInformacoesPrePagoEntradaResponse	response = (com.brq.atena.wsdl.prepago.ConsultarInformacoesPrePagoEntradaResponse)
				getWebServiceTemplate().marshalSendAndReceive(adressNGim, consultarInformacoesPrePagoEntrada,new SoapActionCallback(contextNGim));

		//System.out.println("Respopsta do NGIM   " +  response.getConsultaInformacoesPrePagoResponse().getOutputGetClientInfoPort().getOutNumero() );

	}


	public void createTemplateAtlys(String numero) throws Exception {


		System.out.println("Invocando O serviço"); 
		WebServiceTemplate  webServiceTemplate = getWebServiceTemplate(); 
		marshall(pacoteConector, webServiceTemplate);

		SolicitarPesquisaClienteContaAssinaturaAtributoPosPago request =
				new com.brq.atena.wsdl.pospago.ObjectFactory().createSolicitarPesquisaClienteContaAssinaturaAtributoPosPago();

		SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequestType  solicitacaoPesquisaClienteContaAssinatura = 
				new com.brq.atena.wsdl.pospago.ObjectFactory().createSolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequestType();

		request.setSolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequest(solicitacaoPesquisaClienteContaAssinatura);
		SPNHeader spnHeader = new  com.brq.atena.wsdl.pospago.ObjectFactory().createSPNHeader();
		InputSearchCustAcctSbscrpByAttributeType input = new com.brq.atena.wsdl.pospago.ObjectFactory().createInputSearchCustAcctSbscrpByAttributeType();
		input.setAttrName("ACCESS_NBR");
		input.setAttrValue(numero);
		input.setRetrieveActiveAccts(Boolean.TRUE);
		input.setStartCust(null);
		input.setStartAcct(null);
		input.setStartSub(null);
		solicitacaoPesquisaClienteContaAssinatura.setInputSearchCustAcctSbscrpByAttribute(input);
		solicitacaoPesquisaClienteContaAssinatura.setSpnHeader(spnHeader);


		SolicitarPesquisaClienteContaAssinaturaAtributoPosPagoResponse response = (SolicitarPesquisaClienteContaAssinaturaAtributoPosPagoResponse)
				getWebServiceTemplate().marshalSendAndReceive(adressAtlys, solicitacaoPesquisaClienteContaAssinatura,new SoapActionCallback(contextAtlys));

		System.out.println(response.toString());

	}

	public void createTemplatePosAtlys(String numero) throws Exception {


		System.out.println("Invocando O serviço"); 
		WebServiceTemplate  webServiceTemplate = getWebServiceTemplate(); 
		marshall(pacotePosAtlys, webServiceTemplate);

		SolicitacaoInformacaoClienteContaPosPago request =
				new com.brq.atena.wsdl.pospagoatlys.ObjectFactory().createSolicitacaoInformacaoClienteContaPosPago();

		SolicitacaoInformacaoClienteContaPosPagoRequestType  solicitacaoInformacaoClienteContaPosPago = 
				new com.brq.atena.wsdl.pospagoatlys.ObjectFactory().createSolicitacaoInformacaoClienteContaPosPagoRequestType();

		request.setSolicitacaoInformacaoClienteContaPosPagoRequest(solicitacaoInformacaoClienteContaPosPago);

		com.brq.atena.wsdl.pospagoatlys.SPNHeader SPNHeader = new com.brq.atena.wsdl.pospagoatlys.ObjectFactory().createSPNHeader();
		InputGetCustomerAccountInfoV3Type input = new com.brq.atena.wsdl.pospagoatlys.ObjectFactory().createInputGetCustomerAccountInfoV3Type();

		setHeaderDefault(SPNHeader);
		input.setAcctNbr(numero);
		solicitacaoInformacaoClienteContaPosPago.setInputGetCustomerAccountInfoV3(input);
		solicitacaoInformacaoClienteContaPosPago.setSpnHeader(SPNHeader);


		SolicitacaoInformacaoClienteContaPosPagoResponse response = (SolicitacaoInformacaoClienteContaPosPagoResponse)
				getWebServiceTemplate().marshalSendAndReceive(adressPosAtlys, request, new SoapActionCallback(contextPosAtlys));

		System.out.println(response.getSolicitacaoInformacaoClienteContaPosPagoResponse().getOutputGetCustomerAccountInfoV3().getAcctStatus().getAcctStatus());

	}



	private void createTemplateConectorGetCurrentTicket(String numero, String protocolo) {

		System.out.println("Chamando o conector...");
		WebServiceTemplate  webServiceTemplate = getWebServiceTemplate(); 
		marshall(pacoteAtlys, webServiceTemplate);

		GetCurrentTicket getCurrentTicket = 
				new com.brq.atena.wsdl.conector.ObjectFactory().createGetCurrentTicket();


	}


	public GetPortabilityHistoryResponse createTemplateConectorGetPortabilityHistory(String numero) {

		System.out.println("Chamando o conector...");
		WebServiceTemplate  webServiceTemplate = getWebServiceTemplate(); 
		marshall(pacoteConector, webServiceTemplate);
        PortabilityHistoryIn  portabilityHistoryIn = new com.brq.atena.wsdl.conector.ObjectFactory().createPortabilityHistoryIn();
		GetPortabilityHistory getPortabilityHistory = 
				new com.brq.atena.wsdl.conector.ObjectFactory().createGetPortabilityHistory();
       
		getPortabilityHistory.setArg0(portabilityHistoryIn);
		portabilityHistoryIn.setTelephoneNumber(numero);
		JAXBElement<GetPortabilityHistoryResponse> response = (JAXBElement)
				getWebServiceTemplate().marshalSendAndReceive(adressConector, getPortabilityHistory ,new SoapActionCallback(contextConector));
	   
		GetPortabilityHistoryResponse getPortabilityHistoryResponse =response.getValue();
	    return getPortabilityHistoryResponse;  
	}


	public GetTicketHistoryResponse createTemplateConectorGetTicketHistory(String numero, String protocolo) throws JAXBException {

		System.out.println("Chamando o conector...");
		WebServiceTemplate  webServiceTemplate = getWebServiceTemplate(); 
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath(pacoteConector);
		webServiceTemplate.afterPropertiesSet(); 
		webServiceTemplate.setMarshaller(marshaller);
		webServiceTemplate.setUnmarshaller(marshaller);

		GetTicketHistory request = 
				new com.brq.atena.wsdl.conector.ObjectFactory().createGetTicketHistory();
          
		request.setSubscriptionVersionId(protocolo);
	
		
			
			
			JAXBElement<GetTicketHistoryResponse> response = (JAXBElement)
				getWebServiceTemplate().marshalSendAndReceive(adressConector, request ,new SoapActionCallback(contextConector));
		
			marshaller.getClassesToBeBound();
		
		GetTicketHistoryResponse getTicketHistoryResponse = response.getValue();
		return getTicketHistoryResponse;
		
		

	}


	private void createTemplateConectorGetTicketMessage(String numero, String protocolo) {

		System.out.println("Chamando o conector...");
		WebServiceTemplate  webServiceTemplate = getWebServiceTemplate(); 
		marshall(pacoteAtlys, webServiceTemplate);
		try {
			GetTicketMessage getTicketMessage = 
					new com.brq.atena.wsdl.conector.ObjectFactory().createGetTicketMessage();
		}catch(java.lang.ClassCastException ex) {
			System.out.println(ex.getMessage());
		}

	}


	public void chamarWebService() throws Exception {
		String numero ="2042614214";
		String protocolo = "64920035";
		//createTemplateSigan(numero);
		//createTemplateNGim(numero);
		//createTemplateAtlys(numero);
		//createTemplatePosAtlys(numero);
		createTemplateConectorGetTicketHistory(numero, protocolo);

	}




	private void marshall(String pacote, WebServiceTemplate  webServiceTemplate) {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath(pacote);
		webServiceTemplate.afterPropertiesSet(); 
		webServiceTemplate.setMarshaller(marshaller);
		webServiceTemplate.setUnmarshaller(marshaller);

	}

	public com.brq.atena.wsdl.pospagoatlys.SPNHeader setHeaderDefault(com.brq.atena.wsdl.pospagoatlys.SPNHeader header) throws DatatypeConfigurationException {
		header.setMinorServiceVersion(0);
		header.setRequestId("string");
		header.setClientToken("string");
		header.setDeliveryProtocol("string");
		header.setOriginClientId(3);
		header.setOriginClientIP("string");
		header.setOriginClientLogin("string");
		header.setTargetClientId(3);
		header.setEventDate(DatatypeFactory.newInstance().newXMLGregorianCalendar((GregorianCalendar)java.util.Calendar.getInstance()));	
		header.setLogLevel(new BigInteger("100"));
		return header;
	}

}
