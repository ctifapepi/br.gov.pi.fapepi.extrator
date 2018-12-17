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
 *       &lt;attribute name="EMISSORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TEMA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FORMATO-DATA-DA-APRESENTACAO" default="DDMMAAAA">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="DDMMAAAA"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DATA-DA-APRESENTACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DURACAO-EM-MINUTOS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="VEICULO-DE-DIVULGACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DETALHAMENTO-DO-PROGRAMA-DE-RADIO-OU-TV")
public class DETALHAMENTODOPROGRAMADERADIOOUTV {

    @XmlAttribute(name = "EMISSORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String emissora;
    @XmlAttribute(name = "TEMA")
    @XmlSchemaType(name = "anySimpleType")
    protected String tema;
    @XmlAttribute(name = "FORMATO-DATA-DA-APRESENTACAO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String formatodatadaapresentacao;
    @XmlAttribute(name = "DATA-DA-APRESENTACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String datadaapresentacao;
    @XmlAttribute(name = "DURACAO-EM-MINUTOS")
    @XmlSchemaType(name = "anySimpleType")
    protected String duracaoemminutos;
    @XmlAttribute(name = "CIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String cidade;
    @XmlAttribute(name = "VEICULO-DE-DIVULGACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String veiculodedivulgacao;

    /**
     * Obt�m o valor da propriedade emissora.
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
     * Obt�m o valor da propriedade tema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEMA() {
        return tema;
    }

    /**
     * Define o valor da propriedade tema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEMA(String value) {
        this.tema = value;
    }

    /**
     * Obt�m o valor da propriedade formatodatadaapresentacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMATODATADAAPRESENTACAO() {
        if (formatodatadaapresentacao == null) {
            return "DDMMAAAA";
        } else {
            return formatodatadaapresentacao;
        }
    }

    /**
     * Define o valor da propriedade formatodatadaapresentacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMATODATADAAPRESENTACAO(String value) {
        this.formatodatadaapresentacao = value;
    }

    /**
     * Obt�m o valor da propriedade datadaapresentacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATADAAPRESENTACAO() {
        return datadaapresentacao;
    }

    /**
     * Define o valor da propriedade datadaapresentacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATADAAPRESENTACAO(String value) {
        this.datadaapresentacao = value;
    }

    /**
     * Obt�m o valor da propriedade duracaoemminutos.
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
     * Obt�m o valor da propriedade cidade.
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

    /**
     * Obt�m o valor da propriedade veiculodedivulgacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVEICULODEDIVULGACAO() {
        return veiculodedivulgacao;
    }

    /**
     * Define o valor da propriedade veiculodedivulgacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVEICULODEDIVULGACAO(String value) {
        this.veiculodedivulgacao = value;
    }

}
