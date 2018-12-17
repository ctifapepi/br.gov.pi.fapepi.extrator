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
 *       &lt;attribute name="TIPO-DE-ORIENTACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DO-ORIENTADO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-INSTITUICAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DA-INSTITUICAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-ORGAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-ORGAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-CURSO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DO-CURSO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FLAG-BOLSA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-AGENCIA-FINANCIADORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DA-AGENCIA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-DE-PAGINAS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-ID-ORIENTADO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DO-CURSO-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DETALHAMENTO-DE-ORIENTACOES-CONCLUIDAS-PARA-POS-DOUTORADO")
public class DETALHAMENTODEORIENTACOESCONCLUIDASPARAPOSDOUTORADO {

    @XmlAttribute(name = "TIPO-DE-ORIENTACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String tipodeorientacao;
    @XmlAttribute(name = "NOME-DO-ORIENTADO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedoorientado;
    @XmlAttribute(name = "CODIGO-INSTITUICAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigoinstituicao;
    @XmlAttribute(name = "NOME-DA-INSTITUICAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedainstituicao;
    @XmlAttribute(name = "CODIGO-ORGAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigoorgao;
    @XmlAttribute(name = "NOME-ORGAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomeorgao;
    @XmlAttribute(name = "CODIGO-CURSO")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigocurso;
    @XmlAttribute(name = "NOME-DO-CURSO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedocurso;
    @XmlAttribute(name = "FLAG-BOLSA")
    @XmlSchemaType(name = "anySimpleType")
    protected String flagbolsa;
    @XmlAttribute(name = "CODIGO-AGENCIA-FINANCIADORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigoagenciafinanciadora;
    @XmlAttribute(name = "NOME-DA-AGENCIA")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedaagencia;
    @XmlAttribute(name = "NUMERO-DE-PAGINAS")
    @XmlSchemaType(name = "anySimpleType")
    protected String numerodepaginas;
    @XmlAttribute(name = "NUMERO-ID-ORIENTADO")
    @XmlSchemaType(name = "anySimpleType")
    protected String numeroidorientado;
    @XmlAttribute(name = "NOME-DO-CURSO-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedocursoingles;

    /**
     * Obt�m o valor da propriedade tipodeorientacao.
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
     * Obt�m o valor da propriedade nomedoorientado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDOORIENTADO() {
        return nomedoorientado;
    }

    /**
     * Define o valor da propriedade nomedoorientado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDOORIENTADO(String value) {
        this.nomedoorientado = value;
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
     * Obt�m o valor da propriedade nomedainstituicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDAINSTITUICAO() {
        return nomedainstituicao;
    }

    /**
     * Define o valor da propriedade nomedainstituicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDAINSTITUICAO(String value) {
        this.nomedainstituicao = value;
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
     * Obt�m o valor da propriedade nomedocurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDOCURSO() {
        return nomedocurso;
    }

    /**
     * Define o valor da propriedade nomedocurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDOCURSO(String value) {
        this.nomedocurso = value;
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
     * Obt�m o valor da propriedade nomedaagencia.
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
     * Obt�m o valor da propriedade numerodepaginas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODEPAGINAS() {
        return numerodepaginas;
    }

    /**
     * Define o valor da propriedade numerodepaginas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODEPAGINAS(String value) {
        this.numerodepaginas = value;
    }

    /**
     * Obt�m o valor da propriedade numeroidorientado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROIDORIENTADO() {
        return numeroidorientado;
    }

    /**
     * Define o valor da propriedade numeroidorientado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROIDORIENTADO(String value) {
        this.numeroidorientado = value;
    }

    /**
     * Obt�m o valor da propriedade nomedocursoingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDOCURSOINGLES() {
        return nomedocursoingles;
    }

    /**
     * Define o valor da propriedade nomedocursoingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDOCURSOINGLES(String value) {
        this.nomedocursoingles = value;
    }

}
