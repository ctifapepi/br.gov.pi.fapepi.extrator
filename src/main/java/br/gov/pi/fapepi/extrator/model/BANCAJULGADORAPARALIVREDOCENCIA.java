//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.30 às 02:01:16 PM GMT-03:00 
//


package br.gov.pi.fapepi.extrator.model;

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
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}DADOS-BASICOS-DA-BANCA-JULGADORA-PARA-LIVRE-DOCENCIA" minOccurs="0"/>
 *         &lt;element ref="{}DETALHAMENTO-DA-BANCA-JULGADORA-PARA-LIVRE-DOCENCIA" minOccurs="0"/>
 *         &lt;element ref="{}PARTICIPANTE-BANCA" maxOccurs="unbounded" minOccurs="0"/>
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
    "dadosbasicosdabancajulgadoraparalivredocencia",
    "detalhamentodabancajulgadoraparalivredocencia",
    "participantebanca",
    "palavraschave",
    "areasdoconhecimento",
    "setoresdeatividade",
    "informacoesadicionais"
})
@XmlRootElement(name = "BANCA-JULGADORA-PARA-LIVRE-DOCENCIA")
public class BANCAJULGADORAPARALIVREDOCENCIA {

    @XmlElement(name = "DADOS-BASICOS-DA-BANCA-JULGADORA-PARA-LIVRE-DOCENCIA")
    protected DADOSBASICOSDABANCAJULGADORAPARALIVREDOCENCIA dadosbasicosdabancajulgadoraparalivredocencia;
    @XmlElement(name = "DETALHAMENTO-DA-BANCA-JULGADORA-PARA-LIVRE-DOCENCIA")
    protected DETALHAMENTODABANCAJULGADORAPARALIVREDOCENCIA detalhamentodabancajulgadoraparalivredocencia;
    @XmlElement(name = "PARTICIPANTE-BANCA")
    protected List<PARTICIPANTEBANCA> participantebanca;
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
     * Obtém o valor da propriedade dadosbasicosdabancajulgadoraparalivredocencia.
     * 
     * @return
     *     possible object is
     *     {@link DADOSBASICOSDABANCAJULGADORAPARALIVREDOCENCIA }
     *     
     */
    public DADOSBASICOSDABANCAJULGADORAPARALIVREDOCENCIA getDADOSBASICOSDABANCAJULGADORAPARALIVREDOCENCIA() {
        return dadosbasicosdabancajulgadoraparalivredocencia;
    }

    /**
     * Define o valor da propriedade dadosbasicosdabancajulgadoraparalivredocencia.
     * 
     * @param value
     *     allowed object is
     *     {@link DADOSBASICOSDABANCAJULGADORAPARALIVREDOCENCIA }
     *     
     */
    public void setDADOSBASICOSDABANCAJULGADORAPARALIVREDOCENCIA(DADOSBASICOSDABANCAJULGADORAPARALIVREDOCENCIA value) {
        this.dadosbasicosdabancajulgadoraparalivredocencia = value;
    }

    /**
     * Obtém o valor da propriedade detalhamentodabancajulgadoraparalivredocencia.
     * 
     * @return
     *     possible object is
     *     {@link DETALHAMENTODABANCAJULGADORAPARALIVREDOCENCIA }
     *     
     */
    public DETALHAMENTODABANCAJULGADORAPARALIVREDOCENCIA getDETALHAMENTODABANCAJULGADORAPARALIVREDOCENCIA() {
        return detalhamentodabancajulgadoraparalivredocencia;
    }

    /**
     * Define o valor da propriedade detalhamentodabancajulgadoraparalivredocencia.
     * 
     * @param value
     *     allowed object is
     *     {@link DETALHAMENTODABANCAJULGADORAPARALIVREDOCENCIA }
     *     
     */
    public void setDETALHAMENTODABANCAJULGADORAPARALIVREDOCENCIA(DETALHAMENTODABANCAJULGADORAPARALIVREDOCENCIA value) {
        this.detalhamentodabancajulgadoraparalivredocencia = value;
    }

    /**
     * Gets the value of the participantebanca property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participantebanca property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTICIPANTEBANCA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTICIPANTEBANCA }
     * 
     * 
     */
    public List<PARTICIPANTEBANCA> getPARTICIPANTEBANCA() {
        if (participantebanca == null) {
            participantebanca = new ArrayList<PARTICIPANTEBANCA>();
        }
        return this.participantebanca;
    }

    /**
     * Obtém o valor da propriedade palavraschave.
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
     * Obtém o valor da propriedade areasdoconhecimento.
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
     * Obtém o valor da propriedade setoresdeatividade.
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
     * Obtém o valor da propriedade informacoesadicionais.
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
     * Obtém o valor da propriedade sequenciaproducao.
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
