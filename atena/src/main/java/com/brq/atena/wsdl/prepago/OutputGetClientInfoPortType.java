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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OutputGetClientInfoPortType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OutputGetClientInfoPortType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="outType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outNome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outRG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outRGOrgEmiss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outCPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outCNPJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outPassaporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outTelContato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outDataNasc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outSexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outNomeContato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outRua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outComplemento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outBairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outCEP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outCEP2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outCidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outNacionalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outPortStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outObs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputGetClientInfoPortType", namespace = "br/com/vivo/spn/integration/schema/consulta/ConsultaInformacoesPrePagoResponse", propOrder = {
    "outType",
    "outNome",
    "outRG",
    "outRGOrgEmiss",
    "outCPF",
    "outCNPJ",
    "outPassaporte",
    "outTelContato",
    "outFax",
    "outDataNasc",
    "outSexo",
    "outNomeContato",
    "outRua",
    "outNumero",
    "outComplemento",
    "outBairro",
    "outCEP",
    "outCEP2",
    "outCidade",
    "outEstado",
    "outEmail",
    "outNacionalidade",
    "outStatus",
    "outPortStatus",
    "outObs"
})
public class OutputGetClientInfoPortType {

    protected String outType;
    protected String outNome;
    protected String outRG;
    protected String outRGOrgEmiss;
    protected String outCPF;
    protected String outCNPJ;
    protected String outPassaporte;
    protected String outTelContato;
    protected String outFax;
    protected String outDataNasc;
    protected String outSexo;
    protected String outNomeContato;
    protected String outRua;
    protected String outNumero;
    protected String outComplemento;
    protected String outBairro;
    protected String outCEP;
    protected String outCEP2;
    protected String outCidade;
    protected String outEstado;
    protected String outEmail;
    protected String outNacionalidade;
    @XmlElement(required = true)
    protected String outStatus;
    protected String outPortStatus;
    protected String outObs;

    /**
     * Obtém o valor da propriedade outType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutType() {
        return outType;
    }

    /**
     * Define o valor da propriedade outType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutType(String value) {
        this.outType = value;
    }

    /**
     * Obtém o valor da propriedade outNome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutNome() {
        return outNome;
    }

    /**
     * Define o valor da propriedade outNome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutNome(String value) {
        this.outNome = value;
    }

    /**
     * Obtém o valor da propriedade outRG.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRG() {
        return outRG;
    }

    /**
     * Define o valor da propriedade outRG.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRG(String value) {
        this.outRG = value;
    }

    /**
     * Obtém o valor da propriedade outRGOrgEmiss.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRGOrgEmiss() {
        return outRGOrgEmiss;
    }

    /**
     * Define o valor da propriedade outRGOrgEmiss.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRGOrgEmiss(String value) {
        this.outRGOrgEmiss = value;
    }

    /**
     * Obtém o valor da propriedade outCPF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCPF() {
        return outCPF;
    }

    /**
     * Define o valor da propriedade outCPF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCPF(String value) {
        this.outCPF = value;
    }

    /**
     * Obtém o valor da propriedade outCNPJ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCNPJ() {
        return outCNPJ;
    }

    /**
     * Define o valor da propriedade outCNPJ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCNPJ(String value) {
        this.outCNPJ = value;
    }

    /**
     * Obtém o valor da propriedade outPassaporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPassaporte() {
        return outPassaporte;
    }

    /**
     * Define o valor da propriedade outPassaporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPassaporte(String value) {
        this.outPassaporte = value;
    }

    /**
     * Obtém o valor da propriedade outTelContato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTelContato() {
        return outTelContato;
    }

    /**
     * Define o valor da propriedade outTelContato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTelContato(String value) {
        this.outTelContato = value;
    }

    /**
     * Obtém o valor da propriedade outFax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFax() {
        return outFax;
    }

    /**
     * Define o valor da propriedade outFax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFax(String value) {
        this.outFax = value;
    }

    /**
     * Obtém o valor da propriedade outDataNasc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDataNasc() {
        return outDataNasc;
    }

    /**
     * Define o valor da propriedade outDataNasc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDataNasc(String value) {
        this.outDataNasc = value;
    }

    /**
     * Obtém o valor da propriedade outSexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSexo() {
        return outSexo;
    }

    /**
     * Define o valor da propriedade outSexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSexo(String value) {
        this.outSexo = value;
    }

    /**
     * Obtém o valor da propriedade outNomeContato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutNomeContato() {
        return outNomeContato;
    }

    /**
     * Define o valor da propriedade outNomeContato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutNomeContato(String value) {
        this.outNomeContato = value;
    }

    /**
     * Obtém o valor da propriedade outRua.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRua() {
        return outRua;
    }

    /**
     * Define o valor da propriedade outRua.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRua(String value) {
        this.outRua = value;
    }

    /**
     * Obtém o valor da propriedade outNumero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutNumero() {
        return outNumero;
    }

    /**
     * Define o valor da propriedade outNumero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutNumero(String value) {
        this.outNumero = value;
    }

    /**
     * Obtém o valor da propriedade outComplemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutComplemento() {
        return outComplemento;
    }

    /**
     * Define o valor da propriedade outComplemento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutComplemento(String value) {
        this.outComplemento = value;
    }

    /**
     * Obtém o valor da propriedade outBairro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBairro() {
        return outBairro;
    }

    /**
     * Define o valor da propriedade outBairro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBairro(String value) {
        this.outBairro = value;
    }

    /**
     * Obtém o valor da propriedade outCEP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCEP() {
        return outCEP;
    }

    /**
     * Define o valor da propriedade outCEP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCEP(String value) {
        this.outCEP = value;
    }

    /**
     * Obtém o valor da propriedade outCEP2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCEP2() {
        return outCEP2;
    }

    /**
     * Define o valor da propriedade outCEP2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCEP2(String value) {
        this.outCEP2 = value;
    }

    /**
     * Obtém o valor da propriedade outCidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCidade() {
        return outCidade;
    }

    /**
     * Define o valor da propriedade outCidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCidade(String value) {
        this.outCidade = value;
    }

    /**
     * Obtém o valor da propriedade outEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEstado() {
        return outEstado;
    }

    /**
     * Define o valor da propriedade outEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEstado(String value) {
        this.outEstado = value;
    }

    /**
     * Obtém o valor da propriedade outEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmail() {
        return outEmail;
    }

    /**
     * Define o valor da propriedade outEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmail(String value) {
        this.outEmail = value;
    }

    /**
     * Obtém o valor da propriedade outNacionalidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutNacionalidade() {
        return outNacionalidade;
    }

    /**
     * Define o valor da propriedade outNacionalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutNacionalidade(String value) {
        this.outNacionalidade = value;
    }

    /**
     * Obtém o valor da propriedade outStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatus() {
        return outStatus;
    }

    /**
     * Define o valor da propriedade outStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatus(String value) {
        this.outStatus = value;
    }

    /**
     * Obtém o valor da propriedade outPortStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPortStatus() {
        return outPortStatus;
    }

    /**
     * Define o valor da propriedade outPortStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPortStatus(String value) {
        this.outPortStatus = value;
    }

    /**
     * Obtém o valor da propriedade outObs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutObs() {
        return outObs;
    }

    /**
     * Define o valor da propriedade outObs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutObs(String value) {
        this.outObs = value;
    }

}
