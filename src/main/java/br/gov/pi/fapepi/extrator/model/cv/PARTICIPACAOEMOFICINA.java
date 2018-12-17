//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2018.11.30 �s 02:01:16 PM GMT-03:00 
//


package br.gov.pi.fapepi.extrator.model.cv;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{}DADOS-BASICOS-DA-PARTICIPACAO-EM-OFICINA" minOccurs="0"/>
 *         &lt;element ref="{}DETALHAMENTO-DA-PARTICIPACAO-EM-OFICINA" minOccurs="0"/>
 *         &lt;element ref="{}PARTICIPANTE-DE-EVENTOS-CONGRESSOS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PALAVRAS-CHAVE" minOccurs="0"/>
 *         &lt;element ref="{}AREAS-DO-CONHECIMENTO" minOccurs="0"/>
 *         &lt;element ref="{}SETORES-DE-ATIVIDADE" minOccurs="0"/>
 *         &lt;element ref="{}INFORMACOES-ADICIONAIS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SEQUENCIA-PRODUCAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dadosbasicosdaparticipacaoemoficina",
    "detalhamentodaparticipacaoemoficina",
    "participantedeeventoscongressos",
    "palavraschave",
    "areasdoconhecimento",
    "setoresdeatividade",
    "informacoesadicionais"
})
@XmlRootElement(name = "PARTICIPACAO-EM-OFICINA")
public class PARTICIPACAOEMOFICINA {

    @XmlElement(name = "DADOS-BASICOS-DA-PARTICIPACAO-EM-OFICINA")
    protected DADOSBASICOSDAPARTICIPACAOEMOFICINA dadosbasicosdaparticipacaoemoficina;
    @XmlElement(name = "DETALHAMENTO-DA-PARTICIPACAO-EM-OFICINA")
    protected DETALHAMENTODAPARTICIPACAOEMOFICINA detalhamentodaparticipacaoemoficina;
    @XmlElement(name = "PARTICIPANTE-DE-EVENTOS-CONGRESSOS")
    protected List<PARTICIPANTEDEEVENTOSCONGRESSOS> participantedeeventoscongressos;
    @XmlElement(name = "PALAVRAS-CHAVE")
    protected PALAVRASCHAVE palavraschave;
    @XmlElement(name = "AREAS-DO-CONHECIMENTO")
    protected AREASDOCONHECIMENTO areasdoconhecimento;
    @XmlElement(name = "SETORES-DE-ATIVIDADE")
    protected SETORESDEATIVIDADE setoresdeatividade;
    @XmlElement(name = "INFORMACOES-ADICIONAIS")
    protected INFORMACOESADICIONAIS informacoesadicionais;
    @XmlAttribute(name = "SEQUENCIA-PRODUCAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String sequenciaproducao;

    /**
     * Obt�m o valor da propriedade dadosbasicosdaparticipacaoemoficina.
     * 
     * @return
     *     possible object is
     *     {@link DADOSBASICOSDAPARTICIPACAOEMOFICINA }
     *     
     */
    public DADOSBASICOSDAPARTICIPACAOEMOFICINA getDADOSBASICOSDAPARTICIPACAOEMOFICINA() {
        return dadosbasicosdaparticipacaoemoficina;
    }

    /**
     * Define o valor da propriedade dadosbasicosdaparticipacaoemoficina.
     * 
     * @param value
     *     allowed object is
     *     {@link DADOSBASICOSDAPARTICIPACAOEMOFICINA }
     *     
     */
    public void setDADOSBASICOSDAPARTICIPACAOEMOFICINA(DADOSBASICOSDAPARTICIPACAOEMOFICINA value) {
        this.dadosbasicosdaparticipacaoemoficina = value;
    }

    /**
     * Obt�m o valor da propriedade detalhamentodaparticipacaoemoficina.
     * 
     * @return
     *     possible object is
     *     {@link DETALHAMENTODAPARTICIPACAOEMOFICINA }
     *     
     */
    public DETALHAMENTODAPARTICIPACAOEMOFICINA getDETALHAMENTODAPARTICIPACAOEMOFICINA() {
        return detalhamentodaparticipacaoemoficina;
    }

    /**
     * Define o valor da propriedade detalhamentodaparticipacaoemoficina.
     * 
     * @param value
     *     allowed object is
     *     {@link DETALHAMENTODAPARTICIPACAOEMOFICINA }
     *     
     */
    public void setDETALHAMENTODAPARTICIPACAOEMOFICINA(DETALHAMENTODAPARTICIPACAOEMOFICINA value) {
        this.detalhamentodaparticipacaoemoficina = value;
    }

    /**
     * Gets the value of the participantedeeventoscongressos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participantedeeventoscongressos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTICIPANTEDEEVENTOSCONGRESSOS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTICIPANTEDEEVENTOSCONGRESSOS }
     * 
     * 
     */
    public List<PARTICIPANTEDEEVENTOSCONGRESSOS> getPARTICIPANTEDEEVENTOSCONGRESSOS() {
        if (participantedeeventoscongressos == null) {
            participantedeeventoscongressos = new ArrayList<PARTICIPANTEDEEVENTOSCONGRESSOS>();
        }
        return this.participantedeeventoscongressos;
    }

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
     * Obt�m o valor da propriedade informacoesadicionais.
     * 
     * @return
     *     possible object is
     *     {@link INFORMACOESADICIONAIS }
     *     
     */
    public INFORMACOESADICIONAIS getINFORMACOESADICIONAIS() {
        return informacoesadicionais;
    }

    /**
     * Define o valor da propriedade informacoesadicionais.
     * 
     * @param value
     *     allowed object is
     *     {@link INFORMACOESADICIONAIS }
     *     
     */
    public void setINFORMACOESADICIONAIS(INFORMACOESADICIONAIS value) {
        this.informacoesadicionais = value;
    }

    /**
     * Obt�m o valor da propriedade sequenciaproducao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEQUENCIAPRODUCAO() {
        return sequenciaproducao;
    }

    /**
     * Define o valor da propriedade sequenciaproducao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEQUENCIAPRODUCAO(String value) {
        this.sequenciaproducao = value;
    }

}
