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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ENSINO-FUNDAMENTAL-PRIMEIRO-GRAU")
public class ENSINOFUNDAMENTALPRIMEIROGRAU {

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

}
