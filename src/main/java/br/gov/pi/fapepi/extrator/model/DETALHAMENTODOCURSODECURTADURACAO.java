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
 *       &lt;attribute name="DURACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="UNIDADE" default="NAO_INFORMADO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="SEMANAS"/>
 *             &lt;enumeration value="DIAS"/>
 *             &lt;enumeration value="HORAS"/>
 *             &lt;enumeration value="NAO_INFORMADO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="INSTITUICAO-PROMOTORA-DO-EVENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="LOCAL-DO-EVENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlRootElement(name = "DETALHAMENTO-DO-CURSO-DE-CURTA-DURACAO")
public class DETALHAMENTODOCURSODECURTADURACAO {

    @XmlAttribute(name = "DURACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String duracao;
    @XmlAttribute(name = "UNIDADE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unidade;
    @XmlAttribute(name = "INSTITUICAO-PROMOTORA-DO-EVENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String instituicaopromotoradoevento;
    @XmlAttribute(name = "LOCAL-DO-EVENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String localdoevento;
    @XmlAttribute(name = "CIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String cidade;

    /**
     * Obtém o valor da propriedade duracao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDURACAO() {
        return duracao;
    }

    /**
     * Define o valor da propriedade duracao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDURACAO(String value) {
        this.duracao = value;
    }

    /**
     * Obtém o valor da propriedade unidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIDADE() {
        if (unidade == null) {
            return "NAO_INFORMADO";
        } else {
            return unidade;
        }
    }

    /**
     * Define o valor da propriedade unidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIDADE(String value) {
        this.unidade = value;
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
