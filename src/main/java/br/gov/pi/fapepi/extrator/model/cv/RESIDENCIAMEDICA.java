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
 *       &lt;attribute name="TITULO-DA-RESIDENCIA-MEDICA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-DO-REGISTRO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TITULO-DA-RESIDENCIA-MEDICA-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlRootElement(name = "RESIDENCIA-MEDICA")
public class RESIDENCIAMEDICA {

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
    @XmlAttribute(name = "TITULO-DA-RESIDENCIA-MEDICA")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulodaresidenciamedica;
    @XmlAttribute(name = "NUMERO-DO-REGISTRO")
    @XmlSchemaType(name = "anySimpleType")
    protected String numerodoregistro;
    @XmlAttribute(name = "TITULO-DA-RESIDENCIA-MEDICA-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulodaresidenciamedicaingles;

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
     * Obt�m o valor da propriedade titulodaresidenciamedica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULODARESIDENCIAMEDICA() {
        return titulodaresidenciamedica;
    }

    /**
     * Define o valor da propriedade titulodaresidenciamedica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULODARESIDENCIAMEDICA(String value) {
        this.titulodaresidenciamedica = value;
    }

    /**
     * Obt�m o valor da propriedade numerodoregistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODOREGISTRO() {
        return numerodoregistro;
    }

    /**
     * Define o valor da propriedade numerodoregistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODOREGISTRO(String value) {
        this.numerodoregistro = value;
    }

    /**
     * Obt�m o valor da propriedade titulodaresidenciamedicaingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULODARESIDENCIAMEDICAINGLES() {
        return titulodaresidenciamedicaingles;
    }

    /**
     * Define o valor da propriedade titulodaresidenciamedicaingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULODARESIDENCIAMEDICAINGLES(String value) {
        this.titulodaresidenciamedicaingles = value;
    }

}
