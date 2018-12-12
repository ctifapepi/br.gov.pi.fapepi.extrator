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
 *       &lt;attribute name="SEQUENCIA-HISTORICO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TIPO-DE-VINCULO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="SERVIDOR_PUBLICO_OU_CELETISTA"/>
 *             &lt;enumeration value="SERVIDOR_PUBLICO"/>
 *             &lt;enumeration value="CELETISTA"/>
 *             &lt;enumeration value="PROFESSOR_VISITANTE"/>
 *             &lt;enumeration value="COLABORADOR"/>
 *             &lt;enumeration value="BOLSISTA_RECEM_DOUTOR"/>
 *             &lt;enumeration value="OUTRO"/>
 *             &lt;enumeration value="LIVRE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ENQUADRAMENTO-FUNCIONAL">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="PROFESSOR_TITULAR"/>
 *             &lt;enumeration value="OUTRO"/>
 *             &lt;enumeration value="LIVRE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="CARGA-HORARIA-SEMANAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FLAG-DEDICACAO-EXCLUSIVA">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="SIM"/>
 *             &lt;enumeration value="NAO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="MES-INICIO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ANO-INICIO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MES-FIM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ANO-FIM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="OUTRAS-INFORMACOES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FLAG-VINCULO-EMPREGATICIO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="SIM"/>
 *             &lt;enumeration value="NAO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="OUTRO-VINCULO-INFORMADO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="OUTRO-ENQUADRAMENTO-FUNCIONAL-INFORMADO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="OUTRO-ENQUADRAMENTO-FUNCIONAL-INFORMADO-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="OUTRAS-INFORMACOES-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "VINCULOS")
public class VINCULOS {

    @XmlAttribute(name = "SEQUENCIA-HISTORICO")
    @XmlSchemaType(name = "anySimpleType")
    protected String sequenciahistorico;
    @XmlAttribute(name = "TIPO-DE-VINCULO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tipodevinculo;
    @XmlAttribute(name = "ENQUADRAMENTO-FUNCIONAL")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String enquadramentofuncional;
    @XmlAttribute(name = "CARGA-HORARIA-SEMANAL")
    @XmlSchemaType(name = "anySimpleType")
    protected String cargahorariasemanal;
    @XmlAttribute(name = "FLAG-DEDICACAO-EXCLUSIVA")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flagdedicacaoexclusiva;
    @XmlAttribute(name = "MES-INICIO")
    @XmlSchemaType(name = "anySimpleType")
    protected String mesinicio;
    @XmlAttribute(name = "ANO-INICIO")
    @XmlSchemaType(name = "anySimpleType")
    protected String anoinicio;
    @XmlAttribute(name = "MES-FIM")
    @XmlSchemaType(name = "anySimpleType")
    protected String mesfim;
    @XmlAttribute(name = "ANO-FIM")
    @XmlSchemaType(name = "anySimpleType")
    protected String anofim;
    @XmlAttribute(name = "OUTRAS-INFORMACOES")
    @XmlSchemaType(name = "anySimpleType")
    protected String outrasinformacoes;
    @XmlAttribute(name = "FLAG-VINCULO-EMPREGATICIO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flagvinculoempregaticio;
    @XmlAttribute(name = "OUTRO-VINCULO-INFORMADO")
    @XmlSchemaType(name = "anySimpleType")
    protected String outrovinculoinformado;
    @XmlAttribute(name = "OUTRO-ENQUADRAMENTO-FUNCIONAL-INFORMADO")
    @XmlSchemaType(name = "anySimpleType")
    protected String outroenquadramentofuncionalinformado;
    @XmlAttribute(name = "OUTRO-ENQUADRAMENTO-FUNCIONAL-INFORMADO-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String outroenquadramentofuncionalinformadoingles;
    @XmlAttribute(name = "OUTRAS-INFORMACOES-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String outrasinformacoesingles;

    /**
     * Obtém o valor da propriedade sequenciahistorico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEQUENCIAHISTORICO() {
        return sequenciahistorico;
    }

    /**
     * Define o valor da propriedade sequenciahistorico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEQUENCIAHISTORICO(String value) {
        this.sequenciahistorico = value;
    }

    /**
     * Obtém o valor da propriedade tipodevinculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEVINCULO() {
        return tipodevinculo;
    }

    /**
     * Define o valor da propriedade tipodevinculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEVINCULO(String value) {
        this.tipodevinculo = value;
    }

    /**
     * Obtém o valor da propriedade enquadramentofuncional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENQUADRAMENTOFUNCIONAL() {
        return enquadramentofuncional;
    }

    /**
     * Define o valor da propriedade enquadramentofuncional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENQUADRAMENTOFUNCIONAL(String value) {
        this.enquadramentofuncional = value;
    }

    /**
     * Obtém o valor da propriedade cargahorariasemanal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARGAHORARIASEMANAL() {
        return cargahorariasemanal;
    }

    /**
     * Define o valor da propriedade cargahorariasemanal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARGAHORARIASEMANAL(String value) {
        this.cargahorariasemanal = value;
    }

    /**
     * Obtém o valor da propriedade flagdedicacaoexclusiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGDEDICACAOEXCLUSIVA() {
        return flagdedicacaoexclusiva;
    }

    /**
     * Define o valor da propriedade flagdedicacaoexclusiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGDEDICACAOEXCLUSIVA(String value) {
        this.flagdedicacaoexclusiva = value;
    }

    /**
     * Obtém o valor da propriedade mesinicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESINICIO() {
        return mesinicio;
    }

    /**
     * Define o valor da propriedade mesinicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESINICIO(String value) {
        this.mesinicio = value;
    }

    /**
     * Obtém o valor da propriedade anoinicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANOINICIO() {
        return anoinicio;
    }

    /**
     * Define o valor da propriedade anoinicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANOINICIO(String value) {
        this.anoinicio = value;
    }

    /**
     * Obtém o valor da propriedade mesfim.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESFIM() {
        return mesfim;
    }

    /**
     * Define o valor da propriedade mesfim.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESFIM(String value) {
        this.mesfim = value;
    }

    /**
     * Obtém o valor da propriedade anofim.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANOFIM() {
        return anofim;
    }

    /**
     * Define o valor da propriedade anofim.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANOFIM(String value) {
        this.anofim = value;
    }

    /**
     * Obtém o valor da propriedade outrasinformacoes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOUTRASINFORMACOES() {
        return outrasinformacoes;
    }

    /**
     * Define o valor da propriedade outrasinformacoes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOUTRASINFORMACOES(String value) {
        this.outrasinformacoes = value;
    }

    /**
     * Obtém o valor da propriedade flagvinculoempregaticio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGVINCULOEMPREGATICIO() {
        return flagvinculoempregaticio;
    }

    /**
     * Define o valor da propriedade flagvinculoempregaticio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGVINCULOEMPREGATICIO(String value) {
        this.flagvinculoempregaticio = value;
    }

    /**
     * Obtém o valor da propriedade outrovinculoinformado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOUTROVINCULOINFORMADO() {
        return outrovinculoinformado;
    }

    /**
     * Define o valor da propriedade outrovinculoinformado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOUTROVINCULOINFORMADO(String value) {
        this.outrovinculoinformado = value;
    }

    /**
     * Obtém o valor da propriedade outroenquadramentofuncionalinformado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOUTROENQUADRAMENTOFUNCIONALINFORMADO() {
        return outroenquadramentofuncionalinformado;
    }

    /**
     * Define o valor da propriedade outroenquadramentofuncionalinformado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOUTROENQUADRAMENTOFUNCIONALINFORMADO(String value) {
        this.outroenquadramentofuncionalinformado = value;
    }

    /**
     * Obtém o valor da propriedade outroenquadramentofuncionalinformadoingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOUTROENQUADRAMENTOFUNCIONALINFORMADOINGLES() {
        return outroenquadramentofuncionalinformadoingles;
    }

    /**
     * Define o valor da propriedade outroenquadramentofuncionalinformadoingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOUTROENQUADRAMENTOFUNCIONALINFORMADOINGLES(String value) {
        this.outroenquadramentofuncionalinformadoingles = value;
    }

    /**
     * Obtém o valor da propriedade outrasinformacoesingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOUTRASINFORMACOESINGLES() {
        return outrasinformacoesingles;
    }

    /**
     * Define o valor da propriedade outrasinformacoesingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOUTRASINFORMACOESINGLES(String value) {
        this.outrasinformacoesingles = value;
    }

}
