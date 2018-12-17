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
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{}PALAVRAS-CHAVE" minOccurs="0"/>
 *         &lt;element ref="{}AREAS-DO-CONHECIMENTO" minOccurs="0"/>
 *         &lt;element ref="{}SETORES-DE-ATIVIDADE" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SEQUENCIA-LINHA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TITULO-DA-LINHA-DE-PESQUISA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FLAG-LINHA-DE-PESQUISA-ATIVA">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="SIM"/>
 *             &lt;enumeration value="NAO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="OBJETIVOS-LINHA-DE-PESQUISA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TITULO-DA-LINHA-DE-PESQUISA-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="OBJETIVOS-LINHA-DE-PESQUISA-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "palavraschave",
    "areasdoconhecimento",
    "setoresdeatividade"
})
@XmlRootElement(name = "LINHA-DE-PESQUISA")
public class LINHADEPESQUISA {

    @XmlElement(name = "PALAVRAS-CHAVE")
    protected PALAVRASCHAVE palavraschave;
    @XmlElement(name = "AREAS-DO-CONHECIMENTO")
    protected AREASDOCONHECIMENTO areasdoconhecimento;
    @XmlElement(name = "SETORES-DE-ATIVIDADE")
    protected SETORESDEATIVIDADE setoresdeatividade;
    @XmlAttribute(name = "SEQUENCIA-LINHA")
    @XmlSchemaType(name = "anySimpleType")
    protected String sequencialinha;
    @XmlAttribute(name = "TITULO-DA-LINHA-DE-PESQUISA")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulodalinhadepesquisa;
    @XmlAttribute(name = "FLAG-LINHA-DE-PESQUISA-ATIVA")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flaglinhadepesquisaativa;
    @XmlAttribute(name = "OBJETIVOS-LINHA-DE-PESQUISA")
    @XmlSchemaType(name = "anySimpleType")
    protected String objetivoslinhadepesquisa;
    @XmlAttribute(name = "TITULO-DA-LINHA-DE-PESQUISA-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulodalinhadepesquisaingles;
    @XmlAttribute(name = "OBJETIVOS-LINHA-DE-PESQUISA-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String objetivoslinhadepesquisaingles;

    /**
     * Obt�m o valor da propriedade palavraschave.
     * 
     * @return
     *     possible object is
     *     {@link PALAVRASCHAVE }
     *     
     */
    public PALAVRASCHAVE getPALAVRASCHAVE() {
        return palavraschave;
    }

    /**
     * Define o valor da propriedade palavraschave.
     * 
     * @param value
     *     allowed object is
     *     {@link PALAVRASCHAVE }
     *     
     */
    public void setPALAVRASCHAVE(PALAVRASCHAVE value) {
        this.palavraschave = value;
    }

    /**
     * Obt�m o valor da propriedade areasdoconhecimento.
     * 
     * @return
     *     possible object is
     *     {@link AREASDOCONHECIMENTO }
     *     
     */
    public AREASDOCONHECIMENTO getAREASDOCONHECIMENTO() {
        return areasdoconhecimento;
    }

    /**
     * Define o valor da propriedade areasdoconhecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link AREASDOCONHECIMENTO }
     *     
     */
    public void setAREASDOCONHECIMENTO(AREASDOCONHECIMENTO value) {
        this.areasdoconhecimento = value;
    }

    /**
     * Obt�m o valor da propriedade setoresdeatividade.
     * 
     * @return
     *     possible object is
     *     {@link SETORESDEATIVIDADE }
     *     
     */
    public SETORESDEATIVIDADE getSETORESDEATIVIDADE() {
        return setoresdeatividade;
    }

    /**
     * Define o valor da propriedade setoresdeatividade.
     * 
     * @param value
     *     allowed object is
     *     {@link SETORESDEATIVIDADE }
     *     
     */
    public void setSETORESDEATIVIDADE(SETORESDEATIVIDADE value) {
        this.setoresdeatividade = value;
    }

    /**
     * Obt�m o valor da propriedade sequencialinha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEQUENCIALINHA() {
        return sequencialinha;
    }

    /**
     * Define o valor da propriedade sequencialinha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEQUENCIALINHA(String value) {
        this.sequencialinha = value;
    }

    /**
     * Obt�m o valor da propriedade titulodalinhadepesquisa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULODALINHADEPESQUISA() {
        return titulodalinhadepesquisa;
    }

    /**
     * Define o valor da propriedade titulodalinhadepesquisa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULODALINHADEPESQUISA(String value) {
        this.titulodalinhadepesquisa = value;
    }

    /**
     * Obt�m o valor da propriedade flaglinhadepesquisaativa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGLINHADEPESQUISAATIVA() {
        return flaglinhadepesquisaativa;
    }

    /**
     * Define o valor da propriedade flaglinhadepesquisaativa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGLINHADEPESQUISAATIVA(String value) {
        this.flaglinhadepesquisaativa = value;
    }

    /**
     * Obt�m o valor da propriedade objetivoslinhadepesquisa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBJETIVOSLINHADEPESQUISA() {
        return objetivoslinhadepesquisa;
    }

    /**
     * Define o valor da propriedade objetivoslinhadepesquisa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBJETIVOSLINHADEPESQUISA(String value) {
        this.objetivoslinhadepesquisa = value;
    }

    /**
     * Obt�m o valor da propriedade titulodalinhadepesquisaingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULODALINHADEPESQUISAINGLES() {
        return titulodalinhadepesquisaingles;
    }

    /**
     * Define o valor da propriedade titulodalinhadepesquisaingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULODALINHADEPESQUISAINGLES(String value) {
        this.titulodalinhadepesquisaingles = value;
    }

    /**
     * Obt�m o valor da propriedade objetivoslinhadepesquisaingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBJETIVOSLINHADEPESQUISAINGLES() {
        return objetivoslinhadepesquisaingles;
    }

    /**
     * Define o valor da propriedade objetivoslinhadepesquisaingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBJETIVOSLINHADEPESQUISAINGLES(String value) {
        this.objetivoslinhadepesquisaingles = value;
    }

}
