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
 *       &lt;attribute name="NOME-DO-AUTOR-TRADUZIDO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TITULO-DA-OBRA-ORIGINAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISSN-ISBN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="IDIOMA-DA-OBRA-ORIGINAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="EDITORA-DA-TRADUCAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CIDADE-DA-EDITORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-DE-PAGINAS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-DA-EDICAO-REVISAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="VOLUME" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FASCICULO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SERIE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DETALHAMENTO-DA-TRADUCAO")
public class DETALHAMENTODATRADUCAO {

    @XmlAttribute(name = "NOME-DO-AUTOR-TRADUZIDO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedoautortraduzido;
    @XmlAttribute(name = "TITULO-DA-OBRA-ORIGINAL")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulodaobraoriginal;
    @XmlAttribute(name = "ISSN-ISBN")
    @XmlSchemaType(name = "anySimpleType")
    protected String issnisbn;
    @XmlAttribute(name = "IDIOMA-DA-OBRA-ORIGINAL")
    @XmlSchemaType(name = "anySimpleType")
    protected String idiomadaobraoriginal;
    @XmlAttribute(name = "EDITORA-DA-TRADUCAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String editoradatraducao;
    @XmlAttribute(name = "CIDADE-DA-EDITORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String cidadedaeditora;
    @XmlAttribute(name = "NUMERO-DE-PAGINAS")
    @XmlSchemaType(name = "anySimpleType")
    protected String numerodepaginas;
    @XmlAttribute(name = "NUMERO-DA-EDICAO-REVISAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String numerodaedicaorevisao;
    @XmlAttribute(name = "VOLUME")
    @XmlSchemaType(name = "anySimpleType")
    protected String volume;
    @XmlAttribute(name = "FASCICULO")
    @XmlSchemaType(name = "anySimpleType")
    protected String fasciculo;
    @XmlAttribute(name = "SERIE")
    @XmlSchemaType(name = "anySimpleType")
    protected String serie;

    /**
     * Obt�m o valor da propriedade nomedoautortraduzido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDOAUTORTRADUZIDO() {
        return nomedoautortraduzido;
    }

    /**
     * Define o valor da propriedade nomedoautortraduzido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDOAUTORTRADUZIDO(String value) {
        this.nomedoautortraduzido = value;
    }

    /**
     * Obt�m o valor da propriedade titulodaobraoriginal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULODAOBRAORIGINAL() {
        return titulodaobraoriginal;
    }

    /**
     * Define o valor da propriedade titulodaobraoriginal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULODAOBRAORIGINAL(String value) {
        this.titulodaobraoriginal = value;
    }

    /**
     * Obt�m o valor da propriedade issnisbn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSNISBN() {
        return issnisbn;
    }

    /**
     * Define o valor da propriedade issnisbn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSNISBN(String value) {
        this.issnisbn = value;
    }

    /**
     * Obt�m o valor da propriedade idiomadaobraoriginal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDIOMADAOBRAORIGINAL() {
        return idiomadaobraoriginal;
    }

    /**
     * Define o valor da propriedade idiomadaobraoriginal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDIOMADAOBRAORIGINAL(String value) {
        this.idiomadaobraoriginal = value;
    }

    /**
     * Obt�m o valor da propriedade editoradatraducao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDITORADATRADUCAO() {
        return editoradatraducao;
    }

    /**
     * Define o valor da propriedade editoradatraducao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDITORADATRADUCAO(String value) {
        this.editoradatraducao = value;
    }

    /**
     * Obt�m o valor da propriedade cidadedaeditora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIDADEDAEDITORA() {
        return cidadedaeditora;
    }

    /**
     * Define o valor da propriedade cidadedaeditora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIDADEDAEDITORA(String value) {
        this.cidadedaeditora = value;
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
     * Obt�m o valor da propriedade numerodaedicaorevisao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODAEDICAOREVISAO() {
        return numerodaedicaorevisao;
    }

    /**
     * Define o valor da propriedade numerodaedicaorevisao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODAEDICAOREVISAO(String value) {
        this.numerodaedicaorevisao = value;
    }

    /**
     * Obt�m o valor da propriedade volume.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOLUME() {
        return volume;
    }

    /**
     * Define o valor da propriedade volume.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOLUME(String value) {
        this.volume = value;
    }

    /**
     * Obt�m o valor da propriedade fasciculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASCICULO() {
        return fasciculo;
    }

    /**
     * Define o valor da propriedade fasciculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASCICULO(String value) {
        this.fasciculo = value;
    }

    /**
     * Obt�m o valor da propriedade serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERIE() {
        return serie;
    }

    /**
     * Define o valor da propriedade serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERIE(String value) {
        this.serie = value;
    }

}
