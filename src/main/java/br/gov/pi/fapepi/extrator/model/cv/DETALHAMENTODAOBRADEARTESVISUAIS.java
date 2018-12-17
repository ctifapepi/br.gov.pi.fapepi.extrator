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
 *       &lt;attribute name="MATERIAL-EMPREGADO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TIPO-DE-EVENTO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="APRESENTACAO"/>
 *             &lt;enumeration value="CONCURSO"/>
 *             &lt;enumeration value="CRIACAO"/>
 *             &lt;enumeration value="EXPOSICAO"/>
 *             &lt;enumeration value="FESTIVAL"/>
 *             &lt;enumeration value="OUTRO"/>
 *             &lt;enumeration value="NAO_INFORMADO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="EVENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PREMIACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ACERVO" default="NAO_INFORMADO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="PUBLICO"/>
 *             &lt;enumeration value="PRIVADO"/>
 *             &lt;enumeration value="NAO_INFORMADO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="INSTITUICAO-PROMOTORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DETALHAMENTO-DA-OBRA-DE-ARTES-VISUAIS")
public class DETALHAMENTODAOBRADEARTESVISUAIS {

    @XmlAttribute(name = "MATERIAL-EMPREGADO")
    @XmlSchemaType(name = "anySimpleType")
    protected String materialempregado;
    @XmlAttribute(name = "TIPO-DE-EVENTO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tipodeevento;
    @XmlAttribute(name = "EVENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String evento;
    @XmlAttribute(name = "PREMIACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String premiacao;
    @XmlAttribute(name = "ACERVO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String acervo;
    @XmlAttribute(name = "INSTITUICAO-PROMOTORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String instituicaopromotora;

    /**
     * Obt�m o valor da propriedade materialempregado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATERIALEMPREGADO() {
        return materialempregado;
    }

    /**
     * Define o valor da propriedade materialempregado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATERIALEMPREGADO(String value) {
        this.materialempregado = value;
    }

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
     * Obt�m o valor da propriedade evento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVENTO() {
        return evento;
    }

    /**
     * Define o valor da propriedade evento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVENTO(String value) {
        this.evento = value;
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
     * Obt�m o valor da propriedade acervo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACERVO() {
        if (acervo == null) {
            return "NAO_INFORMADO";
        } else {
            return acervo;
        }
    }

    /**
     * Define o valor da propriedade acervo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACERVO(String value) {
        this.acervo = value;
    }

    /**
     * Obt�m o valor da propriedade instituicaopromotora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTITUICAOPROMOTORA() {
        return instituicaopromotora;
    }

    /**
     * Define o valor da propriedade instituicaopromotora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTITUICAOPROMOTORA(String value) {
        this.instituicaopromotora = value;
    }

}
