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
 *       &lt;attribute name="PREMIACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ATIVIDADE-DOS-AUTORES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="INSTITUICAO-PROMOTORA-DO-EVENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="LOCAL-DO-EVENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CIDADE-DO-EVENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TEMPORADA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DETALHAMENTO-DE-ARTES-VISUAIS")
public class DETALHAMENTODEARTESVISUAIS {

    @XmlAttribute(name = "PREMIACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String premiacao;
    @XmlAttribute(name = "ATIVIDADE-DOS-AUTORES")
    @XmlSchemaType(name = "anySimpleType")
    protected String atividadedosautores;
    @XmlAttribute(name = "INSTITUICAO-PROMOTORA-DO-EVENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String instituicaopromotoradoevento;
    @XmlAttribute(name = "LOCAL-DO-EVENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String localdoevento;
    @XmlAttribute(name = "CIDADE-DO-EVENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String cidadedoevento;
    @XmlAttribute(name = "TEMPORADA")
    @XmlSchemaType(name = "anySimpleType")
    protected String temporada;

    /**
     * Obtém o valor da propriedade premiacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREMIACAO() {
        return premiacao;
    }

    /**
     * Define o valor da propriedade premiacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREMIACAO(String value) {
        this.premiacao = value;
    }

    /**
     * Obtém o valor da propriedade atividadedosautores.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATIVIDADEDOSAUTORES() {
        return atividadedosautores;
    }

    /**
     * Define o valor da propriedade atividadedosautores.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATIVIDADEDOSAUTORES(String value) {
        this.atividadedosautores = value;
    }

    /**
     * Obtém o valor da propriedade instituicaopromotoradoevento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTITUICAOPROMOTORADOEVENTO() {
        return instituicaopromotoradoevento;
    }

    /**
     * Define o valor da propriedade instituicaopromotoradoevento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTITUICAOPROMOTORADOEVENTO(String value) {
        this.instituicaopromotoradoevento = value;
    }

    /**
     * Obtém o valor da propriedade localdoevento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCALDOEVENTO() {
        return localdoevento;
    }

    /**
     * Define o valor da propriedade localdoevento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCALDOEVENTO(String value) {
        this.localdoevento = value;
    }

    /**
     * Obtém o valor da propriedade cidadedoevento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIDADEDOEVENTO() {
        return cidadedoevento;
    }

    /**
     * Define o valor da propriedade cidadedoevento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIDADEDOEVENTO(String value) {
        this.cidadedoevento = value;
    }

    /**
     * Obtém o valor da propriedade temporada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEMPORADA() {
        return temporada;
    }

    /**
     * Define o valor da propriedade temporada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEMPORADA(String value) {
        this.temporada = value;
    }

}
