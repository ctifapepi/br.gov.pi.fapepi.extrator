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
 *       &lt;attribute name="NOME-COMPLETO-DO-PARTICIPANTE-DA-BANCA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-PARA-CITACAO-DO-PARTICIPANTE-DA-BANCA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ORDEM-PARTICIPANTE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CPF-DO-PARTICIPANTE-DA-BANCA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlRootElement(name = "PARTICIPANTE-BANCA")
public class PARTICIPANTEBANCA {

    @XmlAttribute(name = "NOME-COMPLETO-DO-PARTICIPANTE-DA-BANCA")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomecompletodoparticipantedabanca;
    @XmlAttribute(name = "NOME-PARA-CITACAO-DO-PARTICIPANTE-DA-BANCA")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomeparacitacaodoparticipantedabanca;
    @XmlAttribute(name = "ORDEM-PARTICIPANTE")
    @XmlSchemaType(name = "anySimpleType")
    protected String ordemparticipante;
    @XmlAttribute(name = "CPF-DO-PARTICIPANTE-DA-BANCA")
    @XmlSchemaType(name = "anySimpleType")
    protected String cpfdoparticipantedabanca;
    @XmlAttribute(name = "NRO-ID-CNPQ")
    @XmlSchemaType(name = "anySimpleType")
    protected String nroidcnpq;

    /**
     * Obtém o valor da propriedade nomecompletodoparticipantedabanca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMECOMPLETODOPARTICIPANTEDABANCA() {
        return nomecompletodoparticipantedabanca;
    }

    /**
     * Define o valor da propriedade nomecompletodoparticipantedabanca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMECOMPLETODOPARTICIPANTEDABANCA(String value) {
        this.nomecompletodoparticipantedabanca = value;
    }

    /**
     * Obtém o valor da propriedade nomeparacitacaodoparticipantedabanca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEPARACITACAODOPARTICIPANTEDABANCA() {
        return nomeparacitacaodoparticipantedabanca;
    }

    /**
     * Define o valor da propriedade nomeparacitacaodoparticipantedabanca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEPARACITACAODOPARTICIPANTEDABANCA(String value) {
        this.nomeparacitacaodoparticipantedabanca = value;
    }

    /**
     * Obtém o valor da propriedade ordemparticipante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDEMPARTICIPANTE() {
        return ordemparticipante;
    }

    /**
     * Define o valor da propriedade ordemparticipante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDEMPARTICIPANTE(String value) {
        this.ordemparticipante = value;
    }

    /**
     * Obtém o valor da propriedade cpfdoparticipantedabanca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPFDOPARTICIPANTEDABANCA() {
        return cpfdoparticipantedabanca;
    }

    /**
     * Define o valor da propriedade cpfdoparticipantedabanca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPFDOPARTICIPANTEDABANCA(String value) {
        this.cpfdoparticipantedabanca = value;
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
