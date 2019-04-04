//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.28 às 12:31:47 PM BRT 
//


package com.brq.atena.wsdl.pospagoatlys;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OutputGetCustomerAccountInfoV3Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OutputGetCustomerAccountInfoV3Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="custInfo" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}Customer"/&gt;
 *         &lt;element name="custDemog" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}CustDemog" minOccurs="0"/&gt;
 *         &lt;element name="custLogin" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}CustLogin"/&gt;
 *         &lt;element name="priAddress" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}Address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="secAddress" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}Address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="priCustIdent" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}CustIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="secCustIdent" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}CustIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="priCntctNbr" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}CntctNbr" minOccurs="0"/&gt;
 *         &lt;element name="secCntctNbr" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}CntctNbr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="custAttr" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}CVGNVPairType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="acctInfo" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}AccountGetV3"/&gt;
 *         &lt;element name="acctAttr" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}AcctAttrValueGetV1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="curBal" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}CurrentBalance"/&gt;
 *         &lt;element name="estimatedBalance" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}EstBalance"/&gt;
 *         &lt;element name="pymtMthd" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}PaymentMethod" minOccurs="0"/&gt;
 *         &lt;element name="acctStatus" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}AcctStatus"/&gt;
 *         &lt;element name="acctBC" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}AcctBillCycle" minOccurs="0"/&gt;
 *         &lt;element name="acctDep" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}AcctDeposit" minOccurs="0"/&gt;
 *         &lt;element name="acctSplStatus" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}AcctSpltStatus"/&gt;
 *         &lt;element name="custClassif" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}CustClassIf" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputGetCustomerAccountInfoV3Type", propOrder = {
    "custInfo",
    "custDemog",
    "custLogin",
    "priAddress",
    "secAddress",
    "priCustIdent",
    "secCustIdent",
    "priCntctNbr",
    "secCntctNbr",
    "custAttr",
    "acctInfo",
    "acctAttr",
    "curBal",
    "estimatedBalance",
    "pymtMthd",
    "acctStatus",
    "acctBC",
    "acctDep",
    "acctSplStatus",
    "custClassif"
})
public class OutputGetCustomerAccountInfoV3Type {

    @XmlElement(required = true)
    protected Customer custInfo;
    protected CustDemog custDemog;
    @XmlElement(required = true)
    protected CustLogin custLogin;
    protected List<Address> priAddress;
    protected List<Address> secAddress;
    protected CustIdentifier priCustIdent;
    protected List<CustIdentifier> secCustIdent;
    protected CntctNbr priCntctNbr;
    protected List<CntctNbr> secCntctNbr;
    protected List<CVGNVPairType> custAttr;
    @XmlElement(required = true)
    protected AccountGetV3 acctInfo;
    protected List<AcctAttrValueGetV1> acctAttr;
    @XmlElement(required = true)
    protected CurrentBalance curBal;
    @XmlElement(required = true)
    protected EstBalance estimatedBalance;
    protected PaymentMethod pymtMthd;
    @XmlElement(required = true)
    protected AcctStatus acctStatus;
    protected AcctBillCycle acctBC;
    protected AcctDeposit acctDep;
    @XmlElement(required = true)
    protected AcctSpltStatus acctSplStatus;
    protected CustClassIf custClassif;

    /**
     * Obtém o valor da propriedade custInfo.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustInfo() {
        return custInfo;
    }

    /**
     * Define o valor da propriedade custInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustInfo(Customer value) {
        this.custInfo = value;
    }

    /**
     * Obtém o valor da propriedade custDemog.
     * 
     * @return
     *     possible object is
     *     {@link CustDemog }
     *     
     */
    public CustDemog getCustDemog() {
        return custDemog;
    }

    /**
     * Define o valor da propriedade custDemog.
     * 
     * @param value
     *     allowed object is
     *     {@link CustDemog }
     *     
     */
    public void setCustDemog(CustDemog value) {
        this.custDemog = value;
    }

    /**
     * Obtém o valor da propriedade custLogin.
     * 
     * @return
     *     possible object is
     *     {@link CustLogin }
     *     
     */
    public CustLogin getCustLogin() {
        return custLogin;
    }

    /**
     * Define o valor da propriedade custLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link CustLogin }
     *     
     */
    public void setCustLogin(CustLogin value) {
        this.custLogin = value;
    }

    /**
     * Gets the value of the priAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getPriAddress() {
        if (priAddress == null) {
            priAddress = new ArrayList<Address>();
        }
        return this.priAddress;
    }

    /**
     * Gets the value of the secAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getSecAddress() {
        if (secAddress == null) {
            secAddress = new ArrayList<Address>();
        }
        return this.secAddress;
    }

    /**
     * Obtém o valor da propriedade priCustIdent.
     * 
     * @return
     *     possible object is
     *     {@link CustIdentifier }
     *     
     */
    public CustIdentifier getPriCustIdent() {
        return priCustIdent;
    }

    /**
     * Define o valor da propriedade priCustIdent.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdentifier }
     *     
     */
    public void setPriCustIdent(CustIdentifier value) {
        this.priCustIdent = value;
    }

    /**
     * Gets the value of the secCustIdent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secCustIdent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecCustIdent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustIdentifier }
     * 
     * 
     */
    public List<CustIdentifier> getSecCustIdent() {
        if (secCustIdent == null) {
            secCustIdent = new ArrayList<CustIdentifier>();
        }
        return this.secCustIdent;
    }

    /**
     * Obtém o valor da propriedade priCntctNbr.
     * 
     * @return
     *     possible object is
     *     {@link CntctNbr }
     *     
     */
    public CntctNbr getPriCntctNbr() {
        return priCntctNbr;
    }

    /**
     * Define o valor da propriedade priCntctNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link CntctNbr }
     *     
     */
    public void setPriCntctNbr(CntctNbr value) {
        this.priCntctNbr = value;
    }

    /**
     * Gets the value of the secCntctNbr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secCntctNbr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecCntctNbr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CntctNbr }
     * 
     * 
     */
    public List<CntctNbr> getSecCntctNbr() {
        if (secCntctNbr == null) {
            secCntctNbr = new ArrayList<CntctNbr>();
        }
        return this.secCntctNbr;
    }

    /**
     * Gets the value of the custAttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custAttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CVGNVPairType }
     * 
     * 
     */
    public List<CVGNVPairType> getCustAttr() {
        if (custAttr == null) {
            custAttr = new ArrayList<CVGNVPairType>();
        }
        return this.custAttr;
    }

    /**
     * Obtém o valor da propriedade acctInfo.
     * 
     * @return
     *     possible object is
     *     {@link AccountGetV3 }
     *     
     */
    public AccountGetV3 getAcctInfo() {
        return acctInfo;
    }

    /**
     * Define o valor da propriedade acctInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountGetV3 }
     *     
     */
    public void setAcctInfo(AccountGetV3 value) {
        this.acctInfo = value;
    }

    /**
     * Gets the value of the acctAttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctAttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctAttrValueGetV1 }
     * 
     * 
     */
    public List<AcctAttrValueGetV1> getAcctAttr() {
        if (acctAttr == null) {
            acctAttr = new ArrayList<AcctAttrValueGetV1>();
        }
        return this.acctAttr;
    }

    /**
     * Obtém o valor da propriedade curBal.
     * 
     * @return
     *     possible object is
     *     {@link CurrentBalance }
     *     
     */
    public CurrentBalance getCurBal() {
        return curBal;
    }

    /**
     * Define o valor da propriedade curBal.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentBalance }
     *     
     */
    public void setCurBal(CurrentBalance value) {
        this.curBal = value;
    }

    /**
     * Obtém o valor da propriedade estimatedBalance.
     * 
     * @return
     *     possible object is
     *     {@link EstBalance }
     *     
     */
    public EstBalance getEstimatedBalance() {
        return estimatedBalance;
    }

    /**
     * Define o valor da propriedade estimatedBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link EstBalance }
     *     
     */
    public void setEstimatedBalance(EstBalance value) {
        this.estimatedBalance = value;
    }

    /**
     * Obtém o valor da propriedade pymtMthd.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod }
     *     
     */
    public PaymentMethod getPymtMthd() {
        return pymtMthd;
    }

    /**
     * Define o valor da propriedade pymtMthd.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod }
     *     
     */
    public void setPymtMthd(PaymentMethod value) {
        this.pymtMthd = value;
    }

    /**
     * Obtém o valor da propriedade acctStatus.
     * 
     * @return
     *     possible object is
     *     {@link AcctStatus }
     *     
     */
    public AcctStatus getAcctStatus() {
        return acctStatus;
    }

    /**
     * Define o valor da propriedade acctStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctStatus }
     *     
     */
    public void setAcctStatus(AcctStatus value) {
        this.acctStatus = value;
    }

    /**
     * Obtém o valor da propriedade acctBC.
     * 
     * @return
     *     possible object is
     *     {@link AcctBillCycle }
     *     
     */
    public AcctBillCycle getAcctBC() {
        return acctBC;
    }

    /**
     * Define o valor da propriedade acctBC.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctBillCycle }
     *     
     */
    public void setAcctBC(AcctBillCycle value) {
        this.acctBC = value;
    }

    /**
     * Obtém o valor da propriedade acctDep.
     * 
     * @return
     *     possible object is
     *     {@link AcctDeposit }
     *     
     */
    public AcctDeposit getAcctDep() {
        return acctDep;
    }

    /**
     * Define o valor da propriedade acctDep.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctDeposit }
     *     
     */
    public void setAcctDep(AcctDeposit value) {
        this.acctDep = value;
    }

    /**
     * Obtém o valor da propriedade acctSplStatus.
     * 
     * @return
     *     possible object is
     *     {@link AcctSpltStatus }
     *     
     */
    public AcctSpltStatus getAcctSplStatus() {
        return acctSplStatus;
    }

    /**
     * Define o valor da propriedade acctSplStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctSpltStatus }
     *     
     */
    public void setAcctSplStatus(AcctSpltStatus value) {
        this.acctSplStatus = value;
    }

    /**
     * Obtém o valor da propriedade custClassif.
     * 
     * @return
     *     possible object is
     *     {@link CustClassIf }
     *     
     */
    public CustClassIf getCustClassif() {
        return custClassif;
    }

    /**
     * Define o valor da propriedade custClassif.
     * 
     * @param value
     *     allowed object is
     *     {@link CustClassIf }
     *     
     */
    public void setCustClassif(CustClassIf value) {
        this.custClassif = value;
    }

}
