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
 *       &lt;attribute name="NUMERO-DE-PAGINAS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="INSTITUICAO-PROMOTORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="EDITORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DETALHAMENTO-DE-EDITORACAO")
public class DETALHAMENTODEEDITORACAO {

    @XmlAttribute(name = "NUMERO-DE-PAGINAS")
    @XmlSchemaType(name = "anySimpleType")
    protected String numerodepaginas;
    @XmlAttribute(name = "INSTITUICAO-PROMOTORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String instituicaopromotora;
    @XmlAttribute(name = "EDITORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String editora;
    @XmlAttribute(name = "CIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String cidade;

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
     * Obtém o valor da propriedade instituicaopromotora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTITUICAOPROMOTORA() {
        return instituicaopromotora;
    }

    /**
     * Define o valor da propriedade instituicaopromotora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTITUICAOPROMOTORA(String value) {
        this.instituicaopromotora = value;
    }

    /**
     * Obtém o valor da propriedade editora.
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
     * Obtém o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIDADE() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIDADE(String value) {
        this.cidade = value;
    }

}
