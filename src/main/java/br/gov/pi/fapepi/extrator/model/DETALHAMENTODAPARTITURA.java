//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2018.11.30 �s 02:01:16 PM GMT-03:00 
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
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="FORMACAO-INSTRUMENTAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="EDITORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CIDADE-DA-EDITORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-DE-PAGINAS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-DO-CATALOGO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DETALHAMENTO-DA-PARTITURA")
public class DETALHAMENTODAPARTITURA {

    @XmlAttribute(name = "FORMACAO-INSTRUMENTAL")
    @XmlSchemaType(name = "anySimpleType")
    protected String formacaoinstrumental;
    @XmlAttribute(name = "EDITORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String editora;
    @XmlAttribute(name = "CIDADE-DA-EDITORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String cidadedaeditora;
    @XmlAttribute(name = "NUMERO-DE-PAGINAS")
    @XmlSchemaType(name = "anySimpleType")
    protected String numerodepaginas;
    @XmlAttribute(name = "NUMERO-DO-CATALOGO")
    @XmlSchemaType(name = "anySimpleType")
    protected String numerodocatalogo;

    /**
     * Obt�m o valor da propriedade formacaoinstrumental.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMACAOINSTRUMENTAL() {
        return formacaoinstrumental;
    }

    /**
     * Define o valor da propriedade formacaoinstrumental.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMACAOINSTRUMENTAL(String value) {
        this.formacaoinstrumental = value;
    }

    /**
     * Obt�m o valor da propriedade editora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDITORA() {
        return editora;
    }

    /**
     * Define o valor da propriedade editora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDITORA(String value) {
        this.editora = value;
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
     * Obt�m o valor da propriedade numerodocatalogo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODOCATALOGO() {
        return numerodocatalogo;
    }

    /**
     * Define o valor da propriedade numerodocatalogo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODOCATALOGO(String value) {
        this.numerodocatalogo = value;
    }

}
