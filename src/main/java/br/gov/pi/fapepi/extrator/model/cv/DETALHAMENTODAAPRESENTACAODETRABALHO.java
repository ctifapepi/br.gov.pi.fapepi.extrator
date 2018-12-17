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
 *       &lt;attribute name="NOME-DO-EVENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="INSTITUICAO-PROMOTORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="LOCAL-DA-APRESENTACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CIDADE-DA-APRESENTACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DO-EVENTO-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DETALHAMENTO-DA-APRESENTACAO-DE-TRABALHO")
public class DETALHAMENTODAAPRESENTACAODETRABALHO {

    @XmlAttribute(name = "NOME-DO-EVENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedoevento;
    @XmlAttribute(name = "INSTITUICAO-PROMOTORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String instituicaopromotora;
    @XmlAttribute(name = "LOCAL-DA-APRESENTACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String localdaapresentacao;
    @XmlAttribute(name = "CIDADE-DA-APRESENTACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String cidadedaapresentacao;
    @XmlAttribute(name = "NOME-DO-EVENTO-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedoeventoingles;

    /**
     * Obt�m o valor da propriedade nomedoevento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDOEVENTO() {
        return nomedoevento;
    }

    /**
     * Define o valor da propriedade nomedoevento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDOEVENTO(String value) {
        this.nomedoevento = value;
    }

    /**
     * Obt�m o valor da propriedade instituicaopromotora.
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
     * Obt�m o valor da propriedade localdaapresentacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCALDAAPRESENTACAO() {
        return localdaapresentacao;
    }

    /**
     * Define o valor da propriedade localdaapresentacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCALDAAPRESENTACAO(String value) {
        this.localdaapresentacao = value;
    }

    /**
     * Obt�m o valor da propriedade cidadedaapresentacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIDADEDAAPRESENTACAO() {
        return cidadedaapresentacao;
    }

    /**
     * Define o valor da propriedade cidadedaapresentacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIDADEDAAPRESENTACAO(String value) {
        this.cidadedaapresentacao = value;
    }

    /**
     * Obt�m o valor da propriedade nomedoeventoingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDOEVENTOINGLES() {
        return nomedoeventoingles;
    }

    /**
     * Define o valor da propriedade nomedoeventoingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDOEVENTOINGLES(String value) {
        this.nomedoeventoingles = value;
    }

}
