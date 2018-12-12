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
 *       &lt;attribute name="EMISSORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FORMATO-DATA-DE-APRESENTACAO" default="DDMMAAAA">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="DDMMAAAA"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DATA-DE-APRESENTACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DURACAO-EM-MINUTOS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlRootElement(name = "DETALHAMENTO-DA-APRESENTACAO-EM-RADIO-OU-TV")
public class DETALHAMENTODAAPRESENTACAOEMRADIOOUTV {

    @XmlAttribute(name = "EMISSORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String emissora;
    @XmlAttribute(name = "FORMATO-DATA-DE-APRESENTACAO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String formatodatadeapresentacao;
    @XmlAttribute(name = "DATA-DE-APRESENTACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String datadeapresentacao;
    @XmlAttribute(name = "DURACAO-EM-MINUTOS")
    @XmlSchemaType(name = "anySimpleType")
    protected String duracaoemminutos;
    @XmlAttribute(name = "CIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String cidade;

    /**
     * Obtém o valor da propriedade emissora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMISSORA() {
        return emissora;
    }

    /**
     * Define o valor da propriedade emissora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMISSORA(String value) {
        this.emissora = value;
    }

    /**
     * Obtém o valor da propriedade formatodatadeapresentacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMATODATADEAPRESENTACAO() {
        if (formatodatadeapresentacao == null) {
            return "DDMMAAAA";
        } else {
            return formatodatadeapresentacao;
        }
    }

    /**
     * Define o valor da propriedade formatodatadeapresentacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMATODATADEAPRESENTACAO(String value) {
        this.formatodatadeapresentacao = value;
    }

    /**
     * Obtém o valor da propriedade datadeapresentacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATADEAPRESENTACAO() {
        return datadeapresentacao;
    }

    /**
     * Define o valor da propriedade datadeapresentacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATADEAPRESENTACAO(String value) {
        this.datadeapresentacao = value;
    }

    /**
     * Obtém o valor da propriedade duracaoemminutos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDURACAOEMMINUTOS() {
        return duracaoemminutos;
    }

    /**
     * Define o valor da propriedade duracaoemminutos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDURACAOEMMINUTOS(String value) {
        this.duracaoemminutos = value;
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
