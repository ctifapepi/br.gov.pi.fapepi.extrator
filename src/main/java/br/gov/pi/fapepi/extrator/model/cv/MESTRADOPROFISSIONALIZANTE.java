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
 *         &lt;element ref="{}PALAVRAS-CHAVE" minOccurs="0"/>
 *         &lt;element ref="{}AREAS-DO-CONHECIMENTO" minOccurs="0"/>
 *         &lt;element ref="{}SETORES-DE-ATIVIDADE" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SEQUENCIA-FORMACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NIVEL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-INSTITUICAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-INSTITUICAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-ORGAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-ORGAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-CURSO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-CURSO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-AREA-CURSO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="STATUS-DO-CURSO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="EM_ANDAMENTO"/>
 *             &lt;enumeration value="CONCLUIDO"/>
 *             &lt;enumeration value="INCOMPLETO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ANO-DE-INICIO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ANO-DE-CONCLUSAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FLAG-BOLSA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-AGENCIA-FINANCIADORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-AGENCIA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ANO-DE-OBTENCAO-DO-TITULO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TITULO-DA-DISSERTACAO-TESE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-COMPLETO-DO-ORIENTADOR" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-ID-ORIENTADOR" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-CURSO-CAPES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TITULO-DA-DISSERTACAO-TESE-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-CURSO-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DO-CO-ORIENTADOR" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "palavraschave",
    "areasdoconhecimento",
    "setoresdeatividade"
})
@XmlRootElement(name = "MESTRADO-PROFISSIONALIZANTE")
public class MESTRADOPROFISSIONALIZANTE {

    @XmlElement(name = "PALAVRAS-CHAVE")
    protected PALAVRASCHAVE palavraschave;
    @XmlElement(name = "AREAS-DO-CONHECIMENTO")
    protected AREASDOCONHECIMENTO areasdoconhecimento;
    @XmlElement(name = "SETORES-DE-ATIVIDADE")
    protected SETORESDEATIVIDADE setoresdeatividade;
    @XmlAttribute(name = "SEQUENCIA-FORMACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String sequenciaformacao;
    @XmlAttribute(name = "NIVEL")
    @XmlSchemaType(name = "anySimpleType")
    protected String nivel;
    @XmlAttribute(name = "CODIGO-INSTITUICAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigoinstituicao;
    @XmlAttribute(name = "NOME-INSTITUICAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomeinstituicao;
    @XmlAttribute(name = "CODIGO-ORGAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigoorgao;
    @XmlAttribute(name = "NOME-ORGAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomeorgao;
    @XmlAttribute(name = "CODIGO-CURSO")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigocurso;
    @XmlAttribute(name = "NOME-CURSO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomecurso;
    @XmlAttribute(name = "CODIGO-AREA-CURSO")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigoareacurso;
    @XmlAttribute(name = "STATUS-DO-CURSO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String statusdocurso;
    @XmlAttribute(name = "ANO-DE-INICIO")
    @XmlSchemaType(name = "anySimpleType")
    protected String anodeinicio;
    @XmlAttribute(name = "ANO-DE-CONCLUSAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String anodeconclusao;
    @XmlAttribute(name = "FLAG-BOLSA")
    @XmlSchemaType(name = "anySimpleType")
    protected String flagbolsa;
    @XmlAttribute(name = "CODIGO-AGENCIA-FINANCIADORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigoagenciafinanciadora;
    @XmlAttribute(name = "NOME-AGENCIA")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomeagencia;
    @XmlAttribute(name = "ANO-DE-OBTENCAO-DO-TITULO")
    @XmlSchemaType(name = "anySimpleType")
    protected String anodeobtencaodotitulo;
    @XmlAttribute(name = "TITULO-DA-DISSERTACAO-TESE")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulodadissertacaotese;
    @XmlAttribute(name = "NOME-COMPLETO-DO-ORIENTADOR")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomecompletodoorientador;
    @XmlAttribute(name = "NUMERO-ID-ORIENTADOR")
    @XmlSchemaType(name = "anySimpleType")
    protected String numeroidorientador;
    @XmlAttribute(name = "CODIGO-CURSO-CAPES")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigocursocapes;
    @XmlAttribute(name = "TITULO-DA-DISSERTACAO-TESE-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulodadissertacaoteseingles;
    @XmlAttribute(name = "NOME-CURSO-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomecursoingles;
    @XmlAttribute(name = "NOME-DO-CO-ORIENTADOR")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedocoorientador;

    /**
     * Obt�m o valor da propriedade palavraschave.
     * 
     * @return
     *     possible object is
     *     {@link PALAVRASCHAVE }
     *     
     */
    public PALAVRASCHAVE getPALAVRASCHAVE() {
        return palavraschave;
    }

    /**
     * Define o valor da propriedade palavraschave.
     * 
     * @param value
     *     allowed object is
     *     {@link PALAVRASCHAVE }
     *     
     */
    public void setPALAVRASCHAVE(PALAVRASCHAVE value) {
        this.palavraschave = value;
    }

    /**
     * Obt�m o valor da propriedade areasdoconhecimento.
     * 
     * @return
     *     possible object is
     *     {@link AREASDOCONHECIMENTO }
     *     
     */
    public AREASDOCONHECIMENTO getAREASDOCONHECIMENTO() {
        return areasdoconhecimento;
    }

    /**
     * Define o valor da propriedade areasdoconhecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link AREASDOCONHECIMENTO }
     *     
     */
    public void setAREASDOCONHECIMENTO(AREASDOCONHECIMENTO value) {
        this.areasdoconhecimento = value;
    }

    /**
     * Obt�m o valor da propriedade setoresdeatividade.
     * 
     * @return
     *     possible object is
     *     {@link SETORESDEATIVIDADE }
     *     
     */
    public SETORESDEATIVIDADE getSETORESDEATIVIDADE() {
        return setoresdeatividade;
    }

    /**
     * Define o valor da propriedade setoresdeatividade.
     * 
     * @param value
     *     allowed object is
     *     {@link SETORESDEATIVIDADE }
     *     
     */
    public void setSETORESDEATIVIDADE(SETORESDEATIVIDADE value) {
        this.setoresdeatividade = value;
    }

    /**
     * Obt�m o valor da propriedade sequenciaformacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEQUENCIAFORMACAO() {
        return sequenciaformacao;
    }

    /**
     * Define o valor da propriedade sequenciaformacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEQUENCIAFORMACAO(String value) {
        this.sequenciaformacao = value;
    }

    /**
     * Obt�m o valor da propriedade nivel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIVEL() {
        return nivel;
    }

    /**
     * Define o valor da propriedade nivel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIVEL(String value) {
        this.nivel = value;
    }

    /**
     * Obt�m o valor da propriedade codigoinstituicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOINSTITUICAO() {
        return codigoinstituicao;
    }

    /**
     * Define o valor da propriedade codigoinstituicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOINSTITUICAO(String value) {
        this.codigoinstituicao = value;
    }

    /**
     * Obt�m o valor da propriedade nomeinstituicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEINSTITUICAO() {
        return nomeinstituicao;
    }

    /**
     * Define o valor da propriedade nomeinstituicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEINSTITUICAO(String value) {
        this.nomeinstituicao = value;
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
     * Obt�m o valor da propriedade codigocurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOCURSO() {
        return codigocurso;
    }

    /**
     * Define o valor da propriedade codigocurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOCURSO(String value) {
        this.codigocurso = value;
    }

    /**
     * Obt�m o valor da propriedade nomecurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMECURSO() {
        return nomecurso;
    }

    /**
     * Define o valor da propriedade nomecurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMECURSO(String value) {
        this.nomecurso = value;
    }

    /**
     * Obt�m o valor da propriedade codigoareacurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOAREACURSO() {
        return codigoareacurso;
    }

    /**
     * Define o valor da propriedade codigoareacurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOAREACURSO(String value) {
        this.codigoareacurso = value;
    }

    /**
     * Obt�m o valor da propriedade statusdocurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUSDOCURSO() {
        return statusdocurso;
    }

    /**
     * Define o valor da propriedade statusdocurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUSDOCURSO(String value) {
        this.statusdocurso = value;
    }

    /**
     * Obt�m o valor da propriedade anodeinicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANODEINICIO() {
        return anodeinicio;
    }

    /**
     * Define o valor da propriedade anodeinicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANODEINICIO(String value) {
        this.anodeinicio = value;
    }

    /**
     * Obt�m o valor da propriedade anodeconclusao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANODECONCLUSAO() {
        return anodeconclusao;
    }

    /**
     * Define o valor da propriedade anodeconclusao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANODECONCLUSAO(String value) {
        this.anodeconclusao = value;
    }

    /**
     * Obt�m o valor da propriedade flagbolsa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGBOLSA() {
        return flagbolsa;
    }

    /**
     * Define o valor da propriedade flagbolsa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGBOLSA(String value) {
        this.flagbolsa = value;
    }

    /**
     * Obt�m o valor da propriedade codigoagenciafinanciadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOAGENCIAFINANCIADORA() {
        return codigoagenciafinanciadora;
    }

    /**
     * Define o valor da propriedade codigoagenciafinanciadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOAGENCIAFINANCIADORA(String value) {
        this.codigoagenciafinanciadora = value;
    }

    /**
     * Obt�m o valor da propriedade nomeagencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEAGENCIA() {
        return nomeagencia;
    }

    /**
     * Define o valor da propriedade nomeagencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEAGENCIA(String value) {
        this.nomeagencia = value;
    }

    /**
     * Obt�m o valor da propriedade anodeobtencaodotitulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANODEOBTENCAODOTITULO() {
        return anodeobtencaodotitulo;
    }

    /**
     * Define o valor da propriedade anodeobtencaodotitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANODEOBTENCAODOTITULO(String value) {
        this.anodeobtencaodotitulo = value;
    }

    /**
     * Obt�m o valor da propriedade titulodadissertacaotese.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULODADISSERTACAOTESE() {
        return titulodadissertacaotese;
    }

    /**
     * Define o valor da propriedade titulodadissertacaotese.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULODADISSERTACAOTESE(String value) {
        this.titulodadissertacaotese = value;
    }

    /**
     * Obt�m o valor da propriedade nomecompletodoorientador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMECOMPLETODOORIENTADOR() {
        return nomecompletodoorientador;
    }

    /**
     * Define o valor da propriedade nomecompletodoorientador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMECOMPLETODOORIENTADOR(String value) {
        this.nomecompletodoorientador = value;
    }

    /**
     * Obt�m o valor da propriedade numeroidorientador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROIDORIENTADOR() {
        return numeroidorientador;
    }

    /**
     * Define o valor da propriedade numeroidorientador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROIDORIENTADOR(String value) {
        this.numeroidorientador = value;
    }

    /**
     * Obt�m o valor da propriedade codigocursocapes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOCURSOCAPES() {
        return codigocursocapes;
    }

    /**
     * Define o valor da propriedade codigocursocapes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOCURSOCAPES(String value) {
        this.codigocursocapes = value;
    }

    /**
     * Obt�m o valor da propriedade titulodadissertacaoteseingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULODADISSERTACAOTESEINGLES() {
        return titulodadissertacaoteseingles;
    }

    /**
     * Define o valor da propriedade titulodadissertacaoteseingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULODADISSERTACAOTESEINGLES(String value) {
        this.titulodadissertacaoteseingles = value;
    }

    /**
     * Obt�m o valor da propriedade nomecursoingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMECURSOINGLES() {
        return nomecursoingles;
    }

    /**
     * Define o valor da propriedade nomecursoingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMECURSOINGLES(String value) {
        this.nomecursoingles = value;
    }

    /**
     * Obt�m o valor da propriedade nomedocoorientador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDOCOORIENTADOR() {
        return nomedocoorientador;
    }

    /**
     * Define o valor da propriedade nomedocoorientador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDOCOORIENTADOR(String value) {
        this.nomedocoorientador = value;
    }

}
