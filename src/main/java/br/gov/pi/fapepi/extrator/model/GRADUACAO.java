//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.30 às 02:01:16 PM GMT-03:00 
//


package br.gov.pi.fapepi.extrator.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SEQUENCIA-FORMACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NIVEL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TITULO-DO-TRABALHO-DE-CONCLUSAO-DE-CURSO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DO-ORIENTADOR" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
 *       &lt;attribute name="NUMERO-ID-ORIENTADOR" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-CURSO-CAPES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TITULO-DO-TRABALHO-DE-CONCLUSAO-DE-CURSO-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-CURSO-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FORMACAO-ACADEMICA-TITULACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TIPO-GRADUACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-INSTITUICAO-GRAD" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-INSTITUICAO-GRAD" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-INSTITUICAO-OUTRA-GRAD" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-INSTITUICAO-OUTRA-GRAD" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-ORIENTADOR-GRAD" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "GRADUACAO")
public class GRADUACAO {

    @XmlAttribute(name = "SEQUENCIA-FORMACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String sequenciaformacao;
    @XmlAttribute(name = "NIVEL")
    @XmlSchemaType(name = "anySimpleType")
    protected String nivel;
    @XmlAttribute(name = "TITULO-DO-TRABALHO-DE-CONCLUSAO-DE-CURSO")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulodotrabalhodeconclusaodecurso;
    @XmlAttribute(name = "NOME-DO-ORIENTADOR")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedoorientador;
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
    @XmlAttribute(name = "NUMERO-ID-ORIENTADOR")
    @XmlSchemaType(name = "anySimpleType")
    protected String numeroidorientador;
    @XmlAttribute(name = "CODIGO-CURSO-CAPES")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigocursocapes;
    @XmlAttribute(name = "TITULO-DO-TRABALHO-DE-CONCLUSAO-DE-CURSO-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulodotrabalhodeconclusaodecursoingles;
    @XmlAttribute(name = "NOME-CURSO-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomecursoingles;
    @XmlAttribute(name = "FORMACAO-ACADEMICA-TITULACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String formacaoacademicatitulacao;
    @XmlAttribute(name = "TIPO-GRADUACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String tipograduacao;
    @XmlAttribute(name = "CODIGO-INSTITUICAO-GRAD")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigoinstituicaograd;
    @XmlAttribute(name = "NOME-INSTITUICAO-GRAD")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomeinstituicaograd;
    @XmlAttribute(name = "CODIGO-INSTITUICAO-OUTRA-GRAD")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigoinstituicaooutragrad;
    @XmlAttribute(name = "NOME-INSTITUICAO-OUTRA-GRAD")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomeinstituicaooutragrad;
    @XmlAttribute(name = "NOME-ORIENTADOR-GRAD")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomeorientadorgrad;

    /**
     * Obtém o valor da propriedade sequenciaformacao.
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
     * Obtém o valor da propriedade nivel.
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
     * Obtém o valor da propriedade titulodotrabalhodeconclusaodecurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULODOTRABALHODECONCLUSAODECURSO() {
        return titulodotrabalhodeconclusaodecurso;
    }

    /**
     * Define o valor da propriedade titulodotrabalhodeconclusaodecurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULODOTRABALHODECONCLUSAODECURSO(String value) {
        this.titulodotrabalhodeconclusaodecurso = value;
    }

    /**
     * Obtém o valor da propriedade nomedoorientador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDOORIENTADOR() {
        return nomedoorientador;
    }

    /**
     * Define o valor da propriedade nomedoorientador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDOORIENTADOR(String value) {
        this.nomedoorientador = value;
    }

    /**
     * Obtém o valor da propriedade codigoinstituicao.
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
     * Obtém o valor da propriedade nomeinstituicao.
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
     * Obtém o valor da propriedade codigoorgao.
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
     * Obtém o valor da propriedade nomeorgao.
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
     * Obtém o valor da propriedade codigocurso.
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
     * Obtém o valor da propriedade nomecurso.
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
     * Obtém o valor da propriedade codigoareacurso.
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
     * Obtém o valor da propriedade statusdocurso.
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
     * Obtém o valor da propriedade anodeinicio.
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
     * Obtém o valor da propriedade anodeconclusao.
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
     * Obtém o valor da propriedade flagbolsa.
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
     * Obtém o valor da propriedade codigoagenciafinanciadora.
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
     * Obtém o valor da propriedade nomeagencia.
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
     * Obtém o valor da propriedade numeroidorientador.
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
     * Obtém o valor da propriedade codigocursocapes.
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
     * Obtém o valor da propriedade titulodotrabalhodeconclusaodecursoingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULODOTRABALHODECONCLUSAODECURSOINGLES() {
        return titulodotrabalhodeconclusaodecursoingles;
    }

    /**
     * Define o valor da propriedade titulodotrabalhodeconclusaodecursoingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULODOTRABALHODECONCLUSAODECURSOINGLES(String value) {
        this.titulodotrabalhodeconclusaodecursoingles = value;
    }

    /**
     * Obtém o valor da propriedade nomecursoingles.
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
     * Obtém o valor da propriedade formacaoacademicatitulacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMACAOACADEMICATITULACAO() {
        return formacaoacademicatitulacao;
    }

    /**
     * Define o valor da propriedade formacaoacademicatitulacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMACAOACADEMICATITULACAO(String value) {
        this.formacaoacademicatitulacao = value;
    }

    /**
     * Obtém o valor da propriedade tipograduacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOGRADUACAO() {
        return tipograduacao;
    }

    /**
     * Define o valor da propriedade tipograduacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOGRADUACAO(String value) {
        this.tipograduacao = value;
    }

    /**
     * Obtém o valor da propriedade codigoinstituicaograd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOINSTITUICAOGRAD() {
        return codigoinstituicaograd;
    }

    /**
     * Define o valor da propriedade codigoinstituicaograd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOINSTITUICAOGRAD(String value) {
        this.codigoinstituicaograd = value;
    }

    /**
     * Obtém o valor da propriedade nomeinstituicaograd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEINSTITUICAOGRAD() {
        return nomeinstituicaograd;
    }

    /**
     * Define o valor da propriedade nomeinstituicaograd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEINSTITUICAOGRAD(String value) {
        this.nomeinstituicaograd = value;
    }

    /**
     * Obtém o valor da propriedade codigoinstituicaooutragrad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOINSTITUICAOOUTRAGRAD() {
        return codigoinstituicaooutragrad;
    }

    /**
     * Define o valor da propriedade codigoinstituicaooutragrad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOINSTITUICAOOUTRAGRAD(String value) {
        this.codigoinstituicaooutragrad = value;
    }

    /**
     * Obtém o valor da propriedade nomeinstituicaooutragrad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEINSTITUICAOOUTRAGRAD() {
        return nomeinstituicaooutragrad;
    }

    /**
     * Define o valor da propriedade nomeinstituicaooutragrad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEINSTITUICAOOUTRAGRAD(String value) {
        this.nomeinstituicaooutragrad = value;
    }

    /**
     * Obtém o valor da propriedade nomeorientadorgrad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEORIENTADORGRAD() {
        return nomeorientadorgrad;
    }

    /**
     * Define o valor da propriedade nomeorientadorgrad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEORIENTADORGRAD(String value) {
        this.nomeorientadorgrad = value;
    }

}
