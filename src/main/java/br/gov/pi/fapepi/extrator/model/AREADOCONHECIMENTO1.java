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
 *       &lt;attribute name="NOME-GRANDE-AREA-DO-CONHECIMENTO">
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
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NOME-DA-AREA-DO-CONHECIMENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DA-SUB-AREA-DO-CONHECIMENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DA-ESPECIALIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AREA-DO-CONHECIMENTO-1")
public class AREADOCONHECIMENTO1 {

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

    /**
     * Obtém o valor da propriedade nomegrandeareadoconhecimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEGRANDEAREADOCONHECIMENTO() {
        return nomegrandeareadoconhecimento;
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

}
