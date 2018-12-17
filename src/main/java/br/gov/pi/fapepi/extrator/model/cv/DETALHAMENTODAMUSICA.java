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
 *       &lt;attribute name="TIPO-DE-EVENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ATIVIDADE-DOS-AUTORES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FORMACAO-INSTRUMENTAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FLAG-INEDITISMO-DA-OBRA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DATA-ESTREIA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DATA-ENCERRAMENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="LOCAL-DE-ESTREIA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PREMIACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="INSTITUICAO-PROMOTORA-DO-PREMIO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="OBRA-DE-REFERENCIA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="AUTOR-DA-OBRA-DE-REFERENCIA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ANO-DA-OBRA-DE-REFERENCIA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DURACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TEMPORADA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="INSTITUICAO-PROMOTORA-DO-EVENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="LOCAL-DO-EVENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CIDADE-DO-EVENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DETALHAMENTO-DA-MUSICA")
public class DETALHAMENTODAMUSICA {

    @XmlAttribute(name = "TIPO-DE-EVENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String tipodeevento;
    @XmlAttribute(name = "ATIVIDADE-DOS-AUTORES")
    @XmlSchemaType(name = "anySimpleType")
    protected String atividadedosautores;
    @XmlAttribute(name = "FORMACAO-INSTRUMENTAL")
    @XmlSchemaType(name = "anySimpleType")
    protected String formacaoinstrumental;
    @XmlAttribute(name = "FLAG-INEDITISMO-DA-OBRA")
    @XmlSchemaType(name = "anySimpleType")
    protected String flagineditismodaobra;
    @XmlAttribute(name = "DATA-ESTREIA")
    @XmlSchemaType(name = "anySimpleType")
    protected String dataestreia;
    @XmlAttribute(name = "DATA-ENCERRAMENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String dataencerramento;
    @XmlAttribute(name = "LOCAL-DE-ESTREIA")
    @XmlSchemaType(name = "anySimpleType")
    protected String localdeestreia;
    @XmlAttribute(name = "PREMIACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String premiacao;
    @XmlAttribute(name = "INSTITUICAO-PROMOTORA-DO-PREMIO")
    @XmlSchemaType(name = "anySimpleType")
    protected String instituicaopromotoradopremio;
    @XmlAttribute(name = "OBRA-DE-REFERENCIA")
    @XmlSchemaType(name = "anySimpleType")
    protected String obradereferencia;
    @XmlAttribute(name = "AUTOR-DA-OBRA-DE-REFERENCIA")
    @XmlSchemaType(name = "anySimpleType")
    protected String autordaobradereferencia;
    @XmlAttribute(name = "ANO-DA-OBRA-DE-REFERENCIA")
    @XmlSchemaType(name = "anySimpleType")
    protected String anodaobradereferencia;
    @XmlAttribute(name = "DURACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String duracao;
    @XmlAttribute(name = "TEMPORADA")
    @XmlSchemaType(name = "anySimpleType")
    protected String temporada;
    @XmlAttribute(name = "INSTITUICAO-PROMOTORA-DO-EVENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String instituicaopromotoradoevento;
    @XmlAttribute(name = "LOCAL-DO-EVENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String localdoevento;
    @XmlAttribute(name = "CIDADE-DO-EVENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String cidadedoevento;

    /**
     * Obt�m o valor da propriedade tipodeevento.
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
     * Obt�m o valor da propriedade atividadedosautores.
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
     * Obt�m o valor da propriedade flagineditismodaobra.
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
     * Obt�m o valor da propriedade dataestreia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAESTREIA() {
        return dataestreia;
    }

    /**
     * Define o valor da propriedade dataestreia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAESTREIA(String value) {
        this.dataestreia = value;
    }

    /**
     * Obt�m o valor da propriedade dataencerramento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAENCERRAMENTO() {
        return dataencerramento;
    }

    /**
     * Define o valor da propriedade dataencerramento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAENCERRAMENTO(String value) {
        this.dataencerramento = value;
    }

    /**
     * Obt�m o valor da propriedade localdeestreia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCALDEESTREIA() {
        return localdeestreia;
    }

    /**
     * Define o valor da propriedade localdeestreia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCALDEESTREIA(String value) {
        this.localdeestreia = value;
    }

    /**
     * Obt�m o valor da propriedade premiacao.
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
     * Obt�m o valor da propriedade instituicaopromotoradopremio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTITUICAOPROMOTORADOPREMIO() {
        return instituicaopromotoradopremio;
    }

    /**
     * Define o valor da propriedade instituicaopromotoradopremio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTITUICAOPROMOTORADOPREMIO(String value) {
        this.instituicaopromotoradopremio = value;
    }

    /**
     * Obt�m o valor da propriedade obradereferencia.
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
     * Obt�m o valor da propriedade autordaobradereferencia.
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
     * Obt�m o valor da propriedade anodaobradereferencia.
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
     * Obt�m o valor da propriedade duracao.
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
     * Obt�m o valor da propriedade temporada.
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

    /**
     * Obt�m o valor da propriedade instituicaopromotoradoevento.
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
     * Obt�m o valor da propriedade localdoevento.
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
     * Obt�m o valor da propriedade cidadedoevento.
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

}
