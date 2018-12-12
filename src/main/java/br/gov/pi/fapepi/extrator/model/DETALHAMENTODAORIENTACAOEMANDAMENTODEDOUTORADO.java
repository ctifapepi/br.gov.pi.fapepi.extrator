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
 *       &lt;attribute name="TIPO-DE-ORIENTACAO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="ORIENTADOR_PRINCIPAL"/>
 *             &lt;enumeration value="CO_ORIENTADOR"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NOME-DO-ORIENTANDO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-INSTITUICAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-INSTITUICAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-ORGAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-ORGAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-CURSO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-CURSO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FLAG-BOLSA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-AGENCIA-FINANCIADORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DA-AGENCIA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-ID-ORIENTANDO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-CURSO-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DETALHAMENTO-DA-ORIENTACAO-EM-ANDAMENTO-DE-DOUTORADO")
public class DETALHAMENTODAORIENTACAOEMANDAMENTODEDOUTORADO {

    @XmlAttribute(name = "TIPO-DE-ORIENTACAO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tipodeorientacao;
    @XmlAttribute(name = "NOME-DO-ORIENTANDO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedoorientando;
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
    @XmlAttribute(name = "FLAG-BOLSA")
    @XmlSchemaType(name = "anySimpleType")
    protected String flagbolsa;
    @XmlAttribute(name = "CODIGO-AGENCIA-FINANCIADORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigoagenciafinanciadora;
    @XmlAttribute(name = "NOME-DA-AGENCIA")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedaagencia;
    @XmlAttribute(name = "NUMERO-ID-ORIENTANDO")
    @XmlSchemaType(name = "anySimpleType")
    protected String numeroidorientando;
    @XmlAttribute(name = "NOME-CURSO-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomecursoingles;

    /**
     * Obtém o valor da propriedade tipodeorientacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEORIENTACAO() {
        return tipodeorientacao;
    }

    /**
     * Define o valor da propriedade tipodeorientacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEORIENTACAO(String value) {
        this.tipodeorientacao = value;
    }

    /**
     * Obtém o valor da propriedade nomedoorientando.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDOORIENTANDO() {
        return nomedoorientando;
    }

    /**
     * Define o valor da propriedade nomedoorientando.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDOORIENTANDO(String value) {
        this.nomedoorientando = value;
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
     * Obtém o valor da propriedade nomedaagencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDAAGENCIA() {
        return nomedaagencia;
    }

    /**
     * Define o valor da propriedade nomedaagencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDAAGENCIA(String value) {
        this.nomedaagencia = value;
    }

    /**
     * Obtém o valor da propriedade numeroidorientando.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROIDORIENTANDO() {
        return numeroidorientando;
    }

    /**
     * Define o valor da propriedade numeroidorientando.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROIDORIENTANDO(String value) {
        this.numeroidorientando = value;
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

}
