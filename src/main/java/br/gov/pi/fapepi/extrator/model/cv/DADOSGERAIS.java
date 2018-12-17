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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}RESUMO-CV" minOccurs="0"/>
 *         &lt;element ref="{}OUTRAS-INFORMACOES-RELEVANTES" minOccurs="0"/>
 *         &lt;element ref="{}ENDERECO" minOccurs="0"/>
 *         &lt;element ref="{}FORMACAO-ACADEMICA-TITULACAO" minOccurs="0"/>
 *         &lt;element ref="{}ATUACOES-PROFISSIONAIS" minOccurs="0"/>
 *         &lt;element ref="{}AREAS-DE-ATUACAO" minOccurs="0"/>
 *         &lt;element ref="{}IDIOMAS" minOccurs="0"/>
 *         &lt;element ref="{}PREMIOS-TITULOS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NOME-COMPLETO" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-EM-CITACOES-BIBLIOGRAFICAS" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NACIONALIDADE" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CPF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-DO-PASSAPORTE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PAIS-DE-NASCIMENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="UF-NASCIMENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CIDADE-NASCIMENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FORMATO-DATA-DE-NASCIMENTO" default="DDMMAAAA">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="DDMMAAAA"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DATA-NASCIMENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SEXO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="MASCULINO"/>
 *             &lt;enumeration value="FEMININO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NUMERO-IDENTIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ORGAO-EMISSOR" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="UF-ORGAO-EMISSOR" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FORMATO-DATA-DE-EMISSAO" default="DDMMAAAA">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="DDMMAAAA"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DATA-DE-EMISSAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DO-PAI" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DA-MAE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PERMISSAO-DE-DIVULGACAO" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="SIM"/>
 *             &lt;enumeration value="NAO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NOME-DO-ARQUIVO-DE-FOTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TEXTO-RESUMO-CV-RH" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="OUTRAS-INFORMACOES-RELEVANTES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DATA-FALECIMENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SIGLA-PAIS-NACIONALIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PAIS-DE-NACIONALIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RACA-OU-COR" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "resumocv",
    "valueAttribute",
    "endereco",
    "formacaoacademicatitulacao",
    "atuacoesprofissionais",
    "areasdeatuacao",
    "idiomas",
    "premiostitulos"
})
@XmlRootElement(name = "DADOS-GERAIS")
public class DADOSGERAIS {

    @XmlElement(name = "RESUMO-CV")
    protected RESUMOCV resumocv;
    @XmlElement(name = "OUTRAS-INFORMACOES-RELEVANTES")
    protected OUTRASINFORMACOESRELEVANTES valueAttribute;
    @XmlElement(name = "ENDERECO")
    protected ENDERECO endereco;
    @XmlElement(name = "FORMACAO-ACADEMICA-TITULACAO")
    protected FORMACAOACADEMICATITULACAO formacaoacademicatitulacao;
    @XmlElement(name = "ATUACOES-PROFISSIONAIS")
    protected ATUACOESPROFISSIONAIS atuacoesprofissionais;
    @XmlElement(name = "AREAS-DE-ATUACAO")
    protected AREASDEATUACAO areasdeatuacao;
    @XmlElement(name = "IDIOMAS")
    protected IDIOMAS idiomas;
    @XmlElement(name = "PREMIOS-TITULOS")
    protected PREMIOSTITULOS premiostitulos;
    @XmlAttribute(name = "NOME-COMPLETO", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String nomecompleto;
    @XmlAttribute(name = "NOME-EM-CITACOES-BIBLIOGRAFICAS", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String nomeemcitacoesbibliograficas;
    @XmlAttribute(name = "NACIONALIDADE", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String nacionalidade;
    @XmlAttribute(name = "CPF")
    @XmlSchemaType(name = "anySimpleType")
    protected String cpf;
    @XmlAttribute(name = "NUMERO-DO-PASSAPORTE")
    @XmlSchemaType(name = "anySimpleType")
    protected String numerodopassaporte;
    @XmlAttribute(name = "PAIS-DE-NASCIMENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String paisdenascimento;
    @XmlAttribute(name = "UF-NASCIMENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String ufnascimento;
    @XmlAttribute(name = "CIDADE-NASCIMENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String cidadenascimento;
    @XmlAttribute(name = "FORMATO-DATA-DE-NASCIMENTO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String formatodatadenascimento;
    @XmlAttribute(name = "DATA-NASCIMENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String datanascimento;
    @XmlAttribute(name = "SEXO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sexo;
    @XmlAttribute(name = "NUMERO-IDENTIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String numeroidentidade;
    @XmlAttribute(name = "ORGAO-EMISSOR")
    @XmlSchemaType(name = "anySimpleType")
    protected String orgaoemissor;
    @XmlAttribute(name = "UF-ORGAO-EMISSOR")
    @XmlSchemaType(name = "anySimpleType")
    protected String uforgaoemissor;
    @XmlAttribute(name = "FORMATO-DATA-DE-EMISSAO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String formatodatadeemissao;
    @XmlAttribute(name = "DATA-DE-EMISSAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String datadeemissao;
    @XmlAttribute(name = "NOME-DO-PAI")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedopai;
    @XmlAttribute(name = "NOME-DA-MAE")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedamae;
    @XmlAttribute(name = "PERMISSAO-DE-DIVULGACAO", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String permissaodedivulgacao;
    @XmlAttribute(name = "NOME-DO-ARQUIVO-DE-FOTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedoarquivodefoto;
    @XmlAttribute(name = "TEXTO-RESUMO-CV-RH")
    @XmlSchemaType(name = "anySimpleType")
    protected String textoresumocvrh;
    @XmlAttribute(name = "OUTRAS-INFORMACOES-RELEVANTES")
    @XmlSchemaType(name = "anySimpleType")
    protected String outrasinformacoesrelevantes;
    @XmlAttribute(name = "DATA-FALECIMENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String datafalecimento;
    @XmlAttribute(name = "SIGLA-PAIS-NACIONALIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String siglapaisnacionalidade;
    @XmlAttribute(name = "PAIS-DE-NACIONALIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String paisdenacionalidade;
    @XmlAttribute(name = "RACA-OU-COR")
    @XmlSchemaType(name = "anySimpleType")
    protected String racaoucor;

    /**
     * Obt�m o valor da propriedade resumocv.
     * 
     * @return
     *     possible object is
     *     {@link RESUMOCV }
     *     
     */
    public RESUMOCV getRESUMOCV() {
        return resumocv;
    }

    /**
     * Define o valor da propriedade resumocv.
     * 
     * @param value
     *     allowed object is
     *     {@link RESUMOCV }
     *     
     */
    public void setRESUMOCV(RESUMOCV value) {
        this.resumocv = value;
    }

    /**
     * Obt�m o valor da propriedade valueAttribute.
     * 
     * @return
     *     possible object is
     *     {@link OUTRASINFORMACOESRELEVANTES }
     *     
     */
    public OUTRASINFORMACOESRELEVANTES getValueAttribute() {
        return valueAttribute;
    }

    /**
     * Define o valor da propriedade valueAttribute.
     * 
     * @param value
     *     allowed object is
     *     {@link OUTRASINFORMACOESRELEVANTES }
     *     
     */
    public void setValueAttribute(OUTRASINFORMACOESRELEVANTES value) {
        this.valueAttribute = value;
    }

    /**
     * Obt�m o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link ENDERECO }
     *     
     */
    public ENDERECO getENDERECO() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDERECO }
     *     
     */
    public void setENDERECO(ENDERECO value) {
        this.endereco = value;
    }

    /**
     * Obt�m o valor da propriedade formacaoacademicatitulacao.
     * 
     * @return
     *     possible object is
     *     {@link FORMACAOACADEMICATITULACAO }
     *     
     */
    public FORMACAOACADEMICATITULACAO getFORMACAOACADEMICATITULACAO() {
        return formacaoacademicatitulacao;
    }

    /**
     * Define o valor da propriedade formacaoacademicatitulacao.
     * 
     * @param value
     *     allowed object is
     *     {@link FORMACAOACADEMICATITULACAO }
     *     
     */
    public void setFORMACAOACADEMICATITULACAO(FORMACAOACADEMICATITULACAO value) {
        this.formacaoacademicatitulacao = value;
    }

    /**
     * Obt�m o valor da propriedade atuacoesprofissionais.
     * 
     * @return
     *     possible object is
     *     {@link ATUACOESPROFISSIONAIS }
     *     
     */
    public ATUACOESPROFISSIONAIS getATUACOESPROFISSIONAIS() {
        return atuacoesprofissionais;
    }

    /**
     * Define o valor da propriedade atuacoesprofissionais.
     * 
     * @param value
     *     allowed object is
     *     {@link ATUACOESPROFISSIONAIS }
     *     
     */
    public void setATUACOESPROFISSIONAIS(ATUACOESPROFISSIONAIS value) {
        this.atuacoesprofissionais = value;
    }

    /**
     * Obt�m o valor da propriedade areasdeatuacao.
     * 
     * @return
     *     possible object is
     *     {@link AREASDEATUACAO }
     *     
     */
    public AREASDEATUACAO getAREASDEATUACAO() {
        return areasdeatuacao;
    }

    /**
     * Define o valor da propriedade areasdeatuacao.
     * 
     * @param value
     *     allowed object is
     *     {@link AREASDEATUACAO }
     *     
     */
    public void setAREASDEATUACAO(AREASDEATUACAO value) {
        this.areasdeatuacao = value;
    }

    /**
     * Obt�m o valor da propriedade idiomas.
     * 
     * @return
     *     possible object is
     *     {@link IDIOMAS }
     *     
     */
    public IDIOMAS getIDIOMAS() {
        return idiomas;
    }

    /**
     * Define o valor da propriedade idiomas.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIOMAS }
     *     
     */
    public void setIDIOMAS(IDIOMAS value) {
        this.idiomas = value;
    }

    /**
     * Obt�m o valor da propriedade premiostitulos.
     * 
     * @return
     *     possible object is
     *     {@link PREMIOSTITULOS }
     *     
     */
    public PREMIOSTITULOS getPREMIOSTITULOS() {
        return premiostitulos;
    }

    /**
     * Define o valor da propriedade premiostitulos.
     * 
     * @param value
     *     allowed object is
     *     {@link PREMIOSTITULOS }
     *     
     */
    public void setPREMIOSTITULOS(PREMIOSTITULOS value) {
        this.premiostitulos = value;
    }

    /**
     * Obt�m o valor da propriedade nomecompleto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMECOMPLETO() {
        return nomecompleto;
    }

    /**
     * Define o valor da propriedade nomecompleto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMECOMPLETO(String value) {
        this.nomecompleto = value;
    }

    /**
     * Obt�m o valor da propriedade nomeemcitacoesbibliograficas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEEMCITACOESBIBLIOGRAFICAS() {
        return nomeemcitacoesbibliograficas;
    }

    /**
     * Define o valor da propriedade nomeemcitacoesbibliograficas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEEMCITACOESBIBLIOGRAFICAS(String value) {
        this.nomeemcitacoesbibliograficas = value;
    }

    /**
     * Obt�m o valor da propriedade nacionalidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNACIONALIDADE() {
        return nacionalidade;
    }

    /**
     * Define o valor da propriedade nacionalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNACIONALIDADE(String value) {
        this.nacionalidade = value;
    }

    /**
     * Obt�m o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPF() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPF(String value) {
        this.cpf = value;
    }

    /**
     * Obt�m o valor da propriedade numerodopassaporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODOPASSAPORTE() {
        return numerodopassaporte;
    }

    /**
     * Define o valor da propriedade numerodopassaporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODOPASSAPORTE(String value) {
        this.numerodopassaporte = value;
    }

    /**
     * Obt�m o valor da propriedade paisdenascimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAISDENASCIMENTO() {
        return paisdenascimento;
    }

    /**
     * Define o valor da propriedade paisdenascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAISDENASCIMENTO(String value) {
        this.paisdenascimento = value;
    }

    /**
     * Obt�m o valor da propriedade ufnascimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUFNASCIMENTO() {
        return ufnascimento;
    }

    /**
     * Define o valor da propriedade ufnascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUFNASCIMENTO(String value) {
        this.ufnascimento = value;
    }

    /**
     * Obt�m o valor da propriedade cidadenascimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIDADENASCIMENTO() {
        return cidadenascimento;
    }

    /**
     * Define o valor da propriedade cidadenascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIDADENASCIMENTO(String value) {
        this.cidadenascimento = value;
    }

    /**
     * Obt�m o valor da propriedade formatodatadenascimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMATODATADENASCIMENTO() {
        if (formatodatadenascimento == null) {
            return "DDMMAAAA";
        } else {
            return formatodatadenascimento;
        }
    }

    /**
     * Define o valor da propriedade formatodatadenascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMATODATADENASCIMENTO(String value) {
        this.formatodatadenascimento = value;
    }

    /**
     * Obt�m o valor da propriedade datanascimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATANASCIMENTO() {
        return datanascimento;
    }

    /**
     * Define o valor da propriedade datanascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATANASCIMENTO(String value) {
        this.datanascimento = value;
    }

    /**
     * Obt�m o valor da propriedade sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEXO() {
        return sexo;
    }

    /**
     * Define o valor da propriedade sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEXO(String value) {
        this.sexo = value;
    }

    /**
     * Obt�m o valor da propriedade numeroidentidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROIDENTIDADE() {
        return numeroidentidade;
    }

    /**
     * Define o valor da propriedade numeroidentidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROIDENTIDADE(String value) {
        this.numeroidentidade = value;
    }

    /**
     * Obt�m o valor da propriedade orgaoemissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORGAOEMISSOR() {
        return orgaoemissor;
    }

    /**
     * Define o valor da propriedade orgaoemissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORGAOEMISSOR(String value) {
        this.orgaoemissor = value;
    }

    /**
     * Obt�m o valor da propriedade uforgaoemissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUFORGAOEMISSOR() {
        return uforgaoemissor;
    }

    /**
     * Define o valor da propriedade uforgaoemissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUFORGAOEMISSOR(String value) {
        this.uforgaoemissor = value;
    }

    /**
     * Obt�m o valor da propriedade formatodatadeemissao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMATODATADEEMISSAO() {
        if (formatodatadeemissao == null) {
            return "DDMMAAAA";
        } else {
            return formatodatadeemissao;
        }
    }

    /**
     * Define o valor da propriedade formatodatadeemissao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMATODATADEEMISSAO(String value) {
        this.formatodatadeemissao = value;
    }

    /**
     * Obt�m o valor da propriedade datadeemissao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATADEEMISSAO() {
        return datadeemissao;
    }

    /**
     * Define o valor da propriedade datadeemissao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATADEEMISSAO(String value) {
        this.datadeemissao = value;
    }

    /**
     * Obt�m o valor da propriedade nomedopai.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDOPAI() {
        return nomedopai;
    }

    /**
     * Define o valor da propriedade nomedopai.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDOPAI(String value) {
        this.nomedopai = value;
    }

    /**
     * Obt�m o valor da propriedade nomedamae.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDAMAE() {
        return nomedamae;
    }

    /**
     * Define o valor da propriedade nomedamae.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDAMAE(String value) {
        this.nomedamae = value;
    }

    /**
     * Obt�m o valor da propriedade permissaodedivulgacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERMISSAODEDIVULGACAO() {
        return permissaodedivulgacao;
    }

    /**
     * Define o valor da propriedade permissaodedivulgacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERMISSAODEDIVULGACAO(String value) {
        this.permissaodedivulgacao = value;
    }

    /**
     * Obt�m o valor da propriedade nomedoarquivodefoto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDOARQUIVODEFOTO() {
        return nomedoarquivodefoto;
    }

    /**
     * Define o valor da propriedade nomedoarquivodefoto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDOARQUIVODEFOTO(String value) {
        this.nomedoarquivodefoto = value;
    }

    /**
     * Obt�m o valor da propriedade textoresumocvrh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEXTORESUMOCVRH() {
        return textoresumocvrh;
    }

    /**
     * Define o valor da propriedade textoresumocvrh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEXTORESUMOCVRH(String value) {
        this.textoresumocvrh = value;
    }

    /**
     * Obt�m o valor da propriedade outrasinformacoesrelevantes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOUTRASINFORMACOESRELEVANTES() {
        return outrasinformacoesrelevantes;
    }

    /**
     * Define o valor da propriedade outrasinformacoesrelevantes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOUTRASINFORMACOESRELEVANTES(String value) {
        this.outrasinformacoesrelevantes = value;
    }

    /**
     * Obt�m o valor da propriedade datafalecimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAFALECIMENTO() {
        return datafalecimento;
    }

    /**
     * Define o valor da propriedade datafalecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAFALECIMENTO(String value) {
        this.datafalecimento = value;
    }

    /**
     * Obt�m o valor da propriedade siglapaisnacionalidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIGLAPAISNACIONALIDADE() {
        return siglapaisnacionalidade;
    }

    /**
     * Define o valor da propriedade siglapaisnacionalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIGLAPAISNACIONALIDADE(String value) {
        this.siglapaisnacionalidade = value;
    }

    /**
     * Obt�m o valor da propriedade paisdenacionalidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAISDENACIONALIDADE() {
        return paisdenacionalidade;
    }

    /**
     * Define o valor da propriedade paisdenacionalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAISDENACIONALIDADE(String value) {
        this.paisdenacionalidade = value;
    }

    /**
     * Obt�m o valor da propriedade racaoucor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRACAOUCOR() {
        return racaoucor;
    }

    /**
     * Define o valor da propriedade racaoucor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRACAOUCOR(String value) {
        this.racaoucor = value;
    }

}
