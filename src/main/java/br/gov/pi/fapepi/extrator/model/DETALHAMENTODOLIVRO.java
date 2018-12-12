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


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="NUMERO-DE-VOLUMES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-DE-PAGINAS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISBN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-DA-EDICAO-REVISAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-DA-SERIE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CIDADE-DA-EDITORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DA-EDITORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DETALHAMENTO-DO-LIVRO")
public class DETALHAMENTODOLIVRO {

    @XmlAttribute(name = "NUMERO-DE-VOLUMES")
    @XmlSchemaType(name = "anySimpleType")
    protected String numerodevolumes;
    @XmlAttribute(name = "NUMERO-DE-PAGINAS")
    @XmlSchemaType(name = "anySimpleType")
    protected String numerodepaginas;
    @XmlAttribute(name = "ISBN")
    @XmlSchemaType(name = "anySimpleType")
    protected String isbn;
    @XmlAttribute(name = "NUMERO-DA-EDICAO-REVISAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String numerodaedicaorevisao;
    @XmlAttribute(name = "NUMERO-DA-SERIE")
    @XmlSchemaType(name = "anySimpleType")
    protected String numerodaserie;
    @XmlAttribute(name = "CIDADE-DA-EDITORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String cidadedaeditora;
    @XmlAttribute(name = "NOME-DA-EDITORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedaeditora;

    /**
     * Obtém o valor da propriedade numerodevolumes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODEVOLUMES() {
        return numerodevolumes;
    }

    /**
     * Define o valor da propriedade numerodevolumes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODEVOLUMES(String value) {
        this.numerodevolumes = value;
    }

    /**
     * Obtém o valor da propriedade numerodepaginas.
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
     * Obtém o valor da propriedade isbn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * Define o valor da propriedade isbn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN(String value) {
        this.isbn = value;
    }

    /**
     * Obtém o valor da propriedade numerodaedicaorevisao.
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
     * Obtém o valor da propriedade numerodaserie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODASERIE() {
        return numerodaserie;
    }

    /**
     * Define o valor da propriedade numerodaserie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODASERIE(String value) {
        this.numerodaserie = value;
    }

    /**
     * Obtém o valor da propriedade cidadedaeditora.
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
     * Obtém o valor da propriedade nomedaeditora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDAEDITORA() {
        return nomedaeditora;
    }

    /**
     * Define o valor da propriedade nomedaeditora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDAEDITORA(String value) {
        this.nomedaeditora = value;
    }

}
