//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2018.11.30 �s 02:01:16 PM GMT-03:00 
//


package br.gov.pi.fapepi.extrator.model.cv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="CODIGO-INSTITUICAO-EMPRESA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-INSTITUICAO-EMPRESA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-ORGAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-ORGAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-UNIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-UNIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="LOGRADOURO-COMPLEMENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PAIS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="UF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CEP" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BAIRRO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DDD" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TELEFONE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RAMAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FAX" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CAIXA-POSTAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="E-MAIL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="HOME-PAGE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ENDERECO-PROFISSIONAL")
public class ENDERECOPROFISSIONAL {

    @XmlAttribute(name = "CODIGO-INSTITUICAO-EMPRESA")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigoinstituicaoempresa;
    @XmlAttribute(name = "NOME-INSTITUICAO-EMPRESA")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomeinstituicaoempresa;
    @XmlAttribute(name = "CODIGO-ORGAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigoorgao;
    @XmlAttribute(name = "NOME-ORGAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomeorgao;
    @XmlAttribute(name = "CODIGO-UNIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigounidade;
    @XmlAttribute(name = "NOME-UNIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomeunidade;
    @XmlAttribute(name = "LOGRADOURO-COMPLEMENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String logradourocomplemento;
    @XmlAttribute(name = "PAIS")
    @XmlSchemaType(name = "anySimpleType")
    protected String pais;
    @XmlAttribute(name = "UF")
    @XmlSchemaType(name = "anySimpleType")
    protected String uf;
    @XmlAttribute(name = "CEP")
    @XmlSchemaType(name = "anySimpleType")
    protected String cep;
    @XmlAttribute(name = "CIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String cidade;
    @XmlAttribute(name = "BAIRRO")
    @XmlSchemaType(name = "anySimpleType")
    protected String bairro;
    @XmlAttribute(name = "DDD")
    @XmlSchemaType(name = "anySimpleType")
    protected String ddd;
    @XmlAttribute(name = "TELEFONE")
    @XmlSchemaType(name = "anySimpleType")
    protected String telefone;
    @XmlAttribute(name = "RAMAL")
    @XmlSchemaType(name = "anySimpleType")
    protected String ramal;
    @XmlAttribute(name = "FAX")
    @XmlSchemaType(name = "anySimpleType")
    protected String fax;
    @XmlAttribute(name = "CAIXA-POSTAL")
    @XmlSchemaType(name = "anySimpleType")
    protected String caixapostal;
    @XmlAttribute(name = "E-MAIL")
    @XmlSchemaType(name = "anySimpleType")
    protected String email;
    @XmlAttribute(name = "HOME-PAGE")
    @XmlSchemaType(name = "anySimpleType")
    protected String homepage;

    /**
     * Obt�m o valor da propriedade codigoinstituicaoempresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOINSTITUICAOEMPRESA() {
        return codigoinstituicaoempresa;
    }

    /**
     * Define o valor da propriedade codigoinstituicaoempresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOINSTITUICAOEMPRESA(String value) {
        this.codigoinstituicaoempresa = value;
    }

    /**
     * Obt�m o valor da propriedade nomeinstituicaoempresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEINSTITUICAOEMPRESA() {
        return nomeinstituicaoempresa;
    }

    /**
     * Define o valor da propriedade nomeinstituicaoempresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEINSTITUICAOEMPRESA(String value) {
        this.nomeinstituicaoempresa = value;
    }

    /**
     * Obt�m o valor da propriedade codigoorgao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOORGAO() {
        return codigoorgao;
    }

    /**
     * Define o valor da propriedade codigoorgao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOORGAO(String value) {
        this.codigoorgao = value;
    }

    /**
     * Obt�m o valor da propriedade nomeorgao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEORGAO() {
        return nomeorgao;
    }

    /**
     * Define o valor da propriedade nomeorgao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEORGAO(String value) {
        this.nomeorgao = value;
    }

    /**
     * Obt�m o valor da propriedade codigounidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOUNIDADE() {
        return codigounidade;
    }

    /**
     * Define o valor da propriedade codigounidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOUNIDADE(String value) {
        this.codigounidade = value;
    }

    /**
     * Obt�m o valor da propriedade nomeunidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEUNIDADE() {
        return nomeunidade;
    }

    /**
     * Define o valor da propriedade nomeunidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEUNIDADE(String value) {
        this.nomeunidade = value;
    }

    /**
     * Obt�m o valor da propriedade logradourocomplemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOGRADOUROCOMPLEMENTO() {
        return logradourocomplemento;
    }

    /**
     * Define o valor da propriedade logradourocomplemento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOGRADOUROCOMPLEMENTO(String value) {
        this.logradourocomplemento = value;
    }

    /**
     * Obt�m o valor da propriedade pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAIS() {
        return pais;
    }

    /**
     * Define o valor da propriedade pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAIS(String value) {
        this.pais = value;
    }

    /**
     * Obt�m o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUF() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUF(String value) {
        this.uf = value;
    }

    /**
     * Obt�m o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEP() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEP(String value) {
        this.cep = value;
    }

    /**
     * Obt�m o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIDADE() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIDADE(String value) {
        this.cidade = value;
    }

    /**
     * Obt�m o valor da propriedade bairro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBAIRRO() {
        return bairro;
    }

    /**
     * Define o valor da propriedade bairro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBAIRRO(String value) {
        this.bairro = value;
    }

    /**
     * Obt�m o valor da propriedade ddd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDD() {
        return ddd;
    }

    /**
     * Define o valor da propriedade ddd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDD(String value) {
        this.ddd = value;
    }

    /**
     * Obt�m o valor da propriedade telefone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEFONE() {
        return telefone;
    }

    /**
     * Define o valor da propriedade telefone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEFONE(String value) {
        this.telefone = value;
    }

    /**
     * Obt�m o valor da propriedade ramal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAMAL() {
        return ramal;
    }

    /**
     * Define o valor da propriedade ramal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAMAL(String value) {
        this.ramal = value;
    }

    /**
     * Obt�m o valor da propriedade fax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAX() {
        return fax;
    }

    /**
     * Define o valor da propriedade fax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAX(String value) {
        this.fax = value;
    }

    /**
     * Obt�m o valor da propriedade caixapostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAIXAPOSTAL() {
        return caixapostal;
    }

    /**
     * Define o valor da propriedade caixapostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAIXAPOSTAL(String value) {
        this.caixapostal = value;
    }

    /**
     * Obt�m o valor da propriedade email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAIL() {
        return email;
    }

    /**
     * Define o valor da propriedade email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAIL(String value) {
        this.email = value;
    }

    /**
     * Obt�m o valor da propriedade homepage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOMEPAGE() {
        return homepage;
    }

    /**
     * Define o valor da propriedade homepage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOMEPAGE(String value) {
        this.homepage = value;
    }

}
