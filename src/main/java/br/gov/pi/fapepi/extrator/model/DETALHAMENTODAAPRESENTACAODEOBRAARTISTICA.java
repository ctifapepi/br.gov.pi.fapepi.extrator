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
 *       &lt;attribute name="TIPO-DE-EVENTO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="CONCERTO"/>
 *             &lt;enumeration value="CONCURSO"/>
 *             &lt;enumeration value="FESTIVAL"/>
 *             &lt;enumeration value="GRAVACAO"/>
 *             &lt;enumeration value="RECITAL"/>
 *             &lt;enumeration value="OUTRO"/>
 *             &lt;enumeration value="NAO_INFORMADO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ATIVIDADE-DOS-AUTORES">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="CANTO"/>
 *             &lt;enumeration value="CRIACAO"/>
 *             &lt;enumeration value="DANCA"/>
 *             &lt;enumeration value="DIRECAO"/>
 *             &lt;enumeration value="ENCENACAO"/>
 *             &lt;enumeration value="INSTRUMENTO_MUSICAL"/>
 *             &lt;enumeration value="REGENCIA"/>
 *             &lt;enumeration value="ROTEIRO"/>
 *             &lt;enumeration value="OUTRA"/>
 *             &lt;enumeration value="VARIAS"/>
 *             &lt;enumeration value="NAO_INFORMADO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="FLAG-INEDITISMO-DA-OBRA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PREMIACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="OBRA-DE-REFERENCIA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="AUTOR-DA-OBRA-DE-REFERENCIA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ANO-DA-OBRA-DE-REFERENCIA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DURACAO-EM-MINUTOS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlRootElement(name = "DETALHAMENTO-DA-APRESENTACAO-DE-OBRA-ARTISTICA")
public class DETALHAMENTODAAPRESENTACAODEOBRAARTISTICA {

    @XmlAttribute(name = "TIPO-DE-EVENTO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tipodeevento;
    @XmlAttribute(name = "ATIVIDADE-DOS-AUTORES")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String atividadedosautores;
    @XmlAttribute(name = "FLAG-INEDITISMO-DA-OBRA")
    @XmlSchemaType(name = "anySimpleType")
    protected String flagineditismodaobra;
    @XmlAttribute(name = "PREMIACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String premiacao;
    @XmlAttribute(name = "OBRA-DE-REFERENCIA")
    @XmlSchemaType(name = "anySimpleType")
    protected String obradereferencia;
    @XmlAttribute(name = "AUTOR-DA-OBRA-DE-REFERENCIA")
    @XmlSchemaType(name = "anySimpleType")
    protected String autordaobradereferencia;
    @XmlAttribute(name = "ANO-DA-OBRA-DE-REFERENCIA")
    @XmlSchemaType(name = "anySimpleType")
    protected String anodaobradereferencia;
    @XmlAttribute(name = "DURACAO-EM-MINUTOS")
    @XmlSchemaType(name = "anySimpleType")
    protected String duracaoemminutos;
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
     * Obtém o valor da propriedade tipodeevento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEEVENTO() {
        return tipodeevento;
    }

    /**
     * Define o valor da propriedade tipodeevento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEEVENTO(String value) {
        this.tipodeevento = value;
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
     * Obtém o valor da propriedade flagineditismodaobra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGINEDITISMODAOBRA() {
        return flagineditismodaobra;
    }

    /**
     * Define o valor da propriedade flagineditismodaobra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGINEDITISMODAOBRA(String value) {
        this.flagineditismodaobra = value;
    }

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
     * Obtém o valor da propriedade obradereferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBRADEREFERENCIA() {
        return obradereferencia;
    }

    /**
     * Define o valor da propriedade obradereferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBRADEREFERENCIA(String value) {
        this.obradereferencia = value;
    }

    /**
     * Obtém o valor da propriedade autordaobradereferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTORDAOBRADEREFERENCIA() {
        return autordaobradereferencia;
    }

    /**
     * Define o valor da propriedade autordaobradereferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTORDAOBRADEREFERENCIA(String value) {
        this.autordaobradereferencia = value;
    }

    /**
     * Obtém o valor da propriedade anodaobradereferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANODAOBRADEREFERENCIA() {
        return anodaobradereferencia;
    }

    /**
     * Define o valor da propriedade anodaobradereferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANODAOBRADEREFERENCIA(String value) {
        this.anodaobradereferencia = value;
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
