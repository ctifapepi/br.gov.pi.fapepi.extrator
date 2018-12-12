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
 *       &lt;attribute name="NOME-COMPLETO-DO-AUTOR" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-PARA-CITACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ORDEM-DE-AUTORIA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CPF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NRO-ID-CNPQ" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AUTORES")
public class AUTORES {

    @XmlAttribute(name = "NOME-COMPLETO-DO-AUTOR")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomecompletodoautor;
    @XmlAttribute(name = "NOME-PARA-CITACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomeparacitacao;
    @XmlAttribute(name = "ORDEM-DE-AUTORIA")
    @XmlSchemaType(name = "anySimpleType")
    protected String ordemdeautoria;
    @XmlAttribute(name = "CPF")
    @XmlSchemaType(name = "anySimpleType")
    protected String cpf;
    @XmlAttribute(name = "NRO-ID-CNPQ")
    @XmlSchemaType(name = "anySimpleType")
    protected String nroidcnpq;

    /**
     * Obtém o valor da propriedade nomecompletodoautor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMECOMPLETODOAUTOR() {
        return nomecompletodoautor;
    }

    /**
     * Define o valor da propriedade nomecompletodoautor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMECOMPLETODOAUTOR(String value) {
        this.nomecompletodoautor = value;
    }

    /**
     * Obtém o valor da propriedade nomeparacitacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEPARACITACAO() {
        return nomeparacitacao;
    }

    /**
     * Define o valor da propriedade nomeparacitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEPARACITACAO(String value) {
        this.nomeparacitacao = value;
    }

    /**
     * Obtém o valor da propriedade ordemdeautoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDEMDEAUTORIA() {
        return ordemdeautoria;
    }

    /**
     * Define o valor da propriedade ordemdeautoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDEMDEAUTORIA(String value) {
        this.ordemdeautoria = value;
    }

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPF() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPF(String value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade nroidcnpq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNROIDCNPQ() {
        return nroidcnpq;
    }

    /**
     * Define o valor da propriedade nroidcnpq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNROIDCNPQ(String value) {
        this.nroidcnpq = value;
    }

}
