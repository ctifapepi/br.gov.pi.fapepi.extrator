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
 *       &lt;attribute name="NOME-DO-PREMIO-OU-TITULO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DA-ENTIDADE-PROMOTORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ANO-DA-PREMIACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DO-PREMIO-OU-TITULO-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PREMIO-TITULO")
public class PREMIOTITULO {

    @XmlAttribute(name = "NOME-DO-PREMIO-OU-TITULO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedopremiooutitulo;
    @XmlAttribute(name = "NOME-DA-ENTIDADE-PROMOTORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedaentidadepromotora;
    @XmlAttribute(name = "ANO-DA-PREMIACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String anodapremiacao;
    @XmlAttribute(name = "NOME-DO-PREMIO-OU-TITULO-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedopremiooutituloingles;

    /**
     * Obtém o valor da propriedade nomedopremiooutitulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDOPREMIOOUTITULO() {
        return nomedopremiooutitulo;
    }

    /**
     * Define o valor da propriedade nomedopremiooutitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDOPREMIOOUTITULO(String value) {
        this.nomedopremiooutitulo = value;
    }

    /**
     * Obtém o valor da propriedade nomedaentidadepromotora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDAENTIDADEPROMOTORA() {
        return nomedaentidadepromotora;
    }

    /**
     * Define o valor da propriedade nomedaentidadepromotora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDAENTIDADEPROMOTORA(String value) {
        this.nomedaentidadepromotora = value;
    }

    /**
     * Obtém o valor da propriedade anodapremiacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANODAPREMIACAO() {
        return anodapremiacao;
    }

    /**
     * Define o valor da propriedade anodapremiacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANODAPREMIACAO(String value) {
        this.anodapremiacao = value;
    }

    /**
     * Obtém o valor da propriedade nomedopremiooutituloingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDOPREMIOOUTITULOINGLES() {
        return nomedopremiooutituloingles;
    }

    /**
     * Define o valor da propriedade nomedopremiooutituloingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDOPREMIOOUTITULOINGLES(String value) {
        this.nomedopremiooutituloingles = value;
    }

}
