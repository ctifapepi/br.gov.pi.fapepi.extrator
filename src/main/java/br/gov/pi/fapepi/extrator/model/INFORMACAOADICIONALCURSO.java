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
 *       &lt;attribute name="CODIGO-CURSO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-ORGAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-ORGAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-INSTITUICAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-INSTITUICAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-GRANDE-AREA-DO-CONHECIMENTO" default="NAO_INFORMADO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="OUTROS"/>
 *             &lt;enumeration value="LINGUISTICA_LETRAS_E_ARTES"/>
 *             &lt;enumeration value="CIENCIAS_HUMANAS"/>
 *             &lt;enumeration value="CIENCIAS_SOCIAIS_APLICADAS"/>
 *             &lt;enumeration value="CIENCIAS_AGRARIAS"/>
 *             &lt;enumeration value="CIENCIAS_DA_SAUDE"/>
 *             &lt;enumeration value="ENGENHARIAS"/>
 *             &lt;enumeration value="CIENCIAS_BIOLOGICAS"/>
 *             &lt;enumeration value="CIENCIAS_EXATAS_E_DA_TERRA"/>
 *             &lt;enumeration value="NAO_INFORMADO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NOME-DA-AREA-DO-CONHECIMENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DA-SUB-AREA-DO-CONHECIMENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DA-ESPECIALIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NIVEL-CURSO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="APERFEICOAMENTO_ESPECIALIZACAO"/>
 *             &lt;enumeration value="APERFEICOAMENTO"/>
 *             &lt;enumeration value="CURSO_DE_CURTA_DURACAO"/>
 *             &lt;enumeration value="ESPECIALIZACAO"/>
 *             &lt;enumeration value="ESTAGIO"/>
 *             &lt;enumeration value="EXTENSAO_UNIVERSITARIA"/>
 *             &lt;enumeration value="DOUTORADO"/>
 *             &lt;enumeration value="GRADUACAO"/>
 *             &lt;enumeration value="MESTRADO"/>
 *             &lt;enumeration value="MESTRADO_DOUTORADO"/>
 *             &lt;enumeration value="OT"/>
 *             &lt;enumeration value="OUTRO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "INFORMACAO-ADICIONAL-CURSO")
public class INFORMACAOADICIONALCURSO {

    @XmlAttribute(name = "CODIGO-CURSO")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigocurso;
    @XmlAttribute(name = "CODIGO-ORGAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigoorgao;
    @XmlAttribute(name = "NOME-ORGAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomeorgao;
    @XmlAttribute(name = "CODIGO-INSTITUICAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigoinstituicao;
    @XmlAttribute(name = "NOME-INSTITUICAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomeinstituicao;
    @XmlAttribute(name = "NOME-GRANDE-AREA-DO-CONHECIMENTO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nomegrandeareadoconhecimento;
    @XmlAttribute(name = "NOME-DA-AREA-DO-CONHECIMENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedaareadoconhecimento;
    @XmlAttribute(name = "NOME-DA-SUB-AREA-DO-CONHECIMENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedasubareadoconhecimento;
    @XmlAttribute(name = "NOME-DA-ESPECIALIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedaespecialidade;
    @XmlAttribute(name = "NIVEL-CURSO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nivelcurso;

    /**
     * Obtém o valor da propriedade codigocurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOCURSO() {
        return codigocurso;
    }

    /**
     * Define o valor da propriedade codigocurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOCURSO(String value) {
        this.codigocurso = value;
    }

    /**
     * Obtém o valor da propriedade codigoorgao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOORGAO() {
        return codigoorgao;
    }

    /**
     * Define o valor da propriedade codigoorgao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOORGAO(String value) {
        this.codigoorgao = value;
    }

    /**
     * Obtém o valor da propriedade nomeorgao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEORGAO() {
        return nomeorgao;
    }

    /**
     * Define o valor da propriedade nomeorgao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEORGAO(String value) {
        this.nomeorgao = value;
    }

    /**
     * Obtém o valor da propriedade codigoinstituicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOINSTITUICAO() {
        return codigoinstituicao;
    }

    /**
     * Define o valor da propriedade codigoinstituicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOINSTITUICAO(String value) {
        this.codigoinstituicao = value;
    }

    /**
     * Obtém o valor da propriedade nomeinstituicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEINSTITUICAO() {
        return nomeinstituicao;
    }

    /**
     * Define o valor da propriedade nomeinstituicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEINSTITUICAO(String value) {
        this.nomeinstituicao = value;
    }

    /**
     * Obtém o valor da propriedade nomegrandeareadoconhecimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEGRANDEAREADOCONHECIMENTO() {
        if (nomegrandeareadoconhecimento == null) {
            return "NAO_INFORMADO";
        } else {
            return nomegrandeareadoconhecimento;
        }
    }

    /**
     * Define o valor da propriedade nomegrandeareadoconhecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEGRANDEAREADOCONHECIMENTO(String value) {
        this.nomegrandeareadoconhecimento = value;
    }

    /**
     * Obtém o valor da propriedade nomedaareadoconhecimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDAAREADOCONHECIMENTO() {
        return nomedaareadoconhecimento;
    }

    /**
     * Define o valor da propriedade nomedaareadoconhecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDAAREADOCONHECIMENTO(String value) {
        this.nomedaareadoconhecimento = value;
    }

    /**
     * Obtém o valor da propriedade nomedasubareadoconhecimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDASUBAREADOCONHECIMENTO() {
        return nomedasubareadoconhecimento;
    }

    /**
     * Define o valor da propriedade nomedasubareadoconhecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDASUBAREADOCONHECIMENTO(String value) {
        this.nomedasubareadoconhecimento = value;
    }

    /**
     * Obtém o valor da propriedade nomedaespecialidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDAESPECIALIDADE() {
        return nomedaespecialidade;
    }

    /**
     * Define o valor da propriedade nomedaespecialidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDAESPECIALIDADE(String value) {
        this.nomedaespecialidade = value;
    }

    /**
     * Obtém o valor da propriedade nivelcurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIVELCURSO() {
        return nivelcurso;
    }

    /**
     * Define o valor da propriedade nivelcurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIVELCURSO(String value) {
        this.nivelcurso = value;
    }

}
