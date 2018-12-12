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


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SETOR-DE-ATIVIDADE-1" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SETOR-DE-ATIVIDADE-2" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SETOR-DE-ATIVIDADE-3" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SETORES-DE-ATIVIDADE")
public class SETORESDEATIVIDADE {

    @XmlAttribute(name = "SETOR-DE-ATIVIDADE-1")
    @XmlSchemaType(name = "anySimpleType")
    protected String setordeatividade1;
    @XmlAttribute(name = "SETOR-DE-ATIVIDADE-2")
    @XmlSchemaType(name = "anySimpleType")
    protected String setordeatividade2;
    @XmlAttribute(name = "SETOR-DE-ATIVIDADE-3")
    @XmlSchemaType(name = "anySimpleType")
    protected String setordeatividade3;

    /**
     * Obtém o valor da propriedade setordeatividade1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSETORDEATIVIDADE1() {
        return setordeatividade1;
    }

    /**
     * Define o valor da propriedade setordeatividade1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSETORDEATIVIDADE1(String value) {
        this.setordeatividade1 = value;
    }

    /**
     * Obtém o valor da propriedade setordeatividade2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSETORDEATIVIDADE2() {
        return setordeatividade2;
    }

    /**
     * Define o valor da propriedade setordeatividade2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSETORDEATIVIDADE2(String value) {
        this.setordeatividade2 = value;
    }

    /**
     * Obtém o valor da propriedade setordeatividade3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSETORDEATIVIDADE3() {
        return setordeatividade3;
    }

    /**
     * Define o valor da propriedade setordeatividade3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSETORDEATIVIDADE3(String value) {
        this.setordeatividade3 = value;
    }

}
