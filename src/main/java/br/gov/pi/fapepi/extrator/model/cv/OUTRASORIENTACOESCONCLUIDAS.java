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
 *         &lt;element ref="{}DADOS-BASICOS-DE-OUTRAS-ORIENTACOES-CONCLUIDAS" minOccurs="0"/>
 *         &lt;element ref="{}DETALHAMENTO-DE-OUTRAS-ORIENTACOES-CONCLUIDAS" minOccurs="0"/>
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
    "dadosbasicosdeoutrasorientacoesconcluidas",
    "detalhamentodeoutrasorientacoesconcluidas",
    "palavraschave",
    "areasdoconhecimento",
    "setoresdeatividade",
    "informacoesadicionais"
})
@XmlRootElement(name = "OUTRAS-ORIENTACOES-CONCLUIDAS")
public class OUTRASORIENTACOESCONCLUIDAS {

    @XmlElement(name = "DADOS-BASICOS-DE-OUTRAS-ORIENTACOES-CONCLUIDAS")
    protected DADOSBASICOSDEOUTRASORIENTACOESCONCLUIDAS dadosbasicosdeoutrasorientacoesconcluidas;
    @XmlElement(name = "DETALHAMENTO-DE-OUTRAS-ORIENTACOES-CONCLUIDAS")
    protected DETALHAMENTODEOUTRASORIENTACOESCONCLUIDAS detalhamentodeoutrasorientacoesconcluidas;
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
     * Obt�m o valor da propriedade dadosbasicosdeoutrasorientacoesconcluidas.
     * 
     * @return
     *     possible object is
     *     {@link DADOSBASICOSDEOUTRASORIENTACOESCONCLUIDAS }
     *     
     */
    public DADOSBASICOSDEOUTRASORIENTACOESCONCLUIDAS getDADOSBASICOSDEOUTRASORIENTACOESCONCLUIDAS() {
        return dadosbasicosdeoutrasorientacoesconcluidas;
    }

    /**
     * Define o valor da propriedade dadosbasicosdeoutrasorientacoesconcluidas.
     * 
     * @param value
     *     allowed object is
     *     {@link DADOSBASICOSDEOUTRASORIENTACOESCONCLUIDAS }
     *     
     */
    public void setDADOSBASICOSDEOUTRASORIENTACOESCONCLUIDAS(DADOSBASICOSDEOUTRASORIENTACOESCONCLUIDAS value) {
        this.dadosbasicosdeoutrasorientacoesconcluidas = value;
    }

    /**
     * Obt�m o valor da propriedade detalhamentodeoutrasorientacoesconcluidas.
     * 
     * @return
     *     possible object is
     *     {@link DETALHAMENTODEOUTRASORIENTACOESCONCLUIDAS }
     *     
     */
    public DETALHAMENTODEOUTRASORIENTACOESCONCLUIDAS getDETALHAMENTODEOUTRASORIENTACOESCONCLUIDAS() {
        return detalhamentodeoutrasorientacoesconcluidas;
    }

    /**
     * Define o valor da propriedade detalhamentodeoutrasorientacoesconcluidas.
     * 
     * @param value
     *     allowed object is
     *     {@link DETALHAMENTODEOUTRASORIENTACOESCONCLUIDAS }
     *     
     */
    public void setDETALHAMENTODEOUTRASORIENTACOESCONCLUIDAS(DETALHAMENTODEOUTRASORIENTACOESCONCLUIDAS value) {
        this.detalhamentodeoutrasorientacoesconcluidas = value;
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
