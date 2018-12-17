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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{}PARTICIPACAO-EM-CONGRESSO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PARTICIPACAO-EM-FEIRA" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PARTICIPACAO-EM-SEMINARIO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PARTICIPACAO-EM-SIMPOSIO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PARTICIPACAO-EM-OFICINA" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PARTICIPACAO-EM-ENCONTRO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PARTICIPACAO-EM-EXPOSICAO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PARTICIPACAO-EM-OLIMPIADA" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}OUTRAS-PARTICIPACOES-EM-EVENTOS-CONGRESSOS" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "participacaoemcongresso",
    "participacaoemfeira",
    "participacaoemseminario",
    "participacaoemsimposio",
    "participacaoemoficina",
    "participacaoemencontro",
    "participacaoemexposicao",
    "participacaoemolimpiada",
    "outrasparticipacoesemeventoscongressos"
})
@XmlRootElement(name = "PARTICIPACAO-EM-EVENTOS-CONGRESSOS")
public class PARTICIPACAOEMEVENTOSCONGRESSOS {

    @XmlElement(name = "PARTICIPACAO-EM-CONGRESSO")
    protected List<PARTICIPACAOEMCONGRESSO> participacaoemcongresso;
    @XmlElement(name = "PARTICIPACAO-EM-FEIRA")
    protected List<PARTICIPACAOEMFEIRA> participacaoemfeira;
    @XmlElement(name = "PARTICIPACAO-EM-SEMINARIO")
    protected List<PARTICIPACAOEMSEMINARIO> participacaoemseminario;
    @XmlElement(name = "PARTICIPACAO-EM-SIMPOSIO")
    protected List<PARTICIPACAOEMSIMPOSIO> participacaoemsimposio;
    @XmlElement(name = "PARTICIPACAO-EM-OFICINA")
    protected List<PARTICIPACAOEMOFICINA> participacaoemoficina;
    @XmlElement(name = "PARTICIPACAO-EM-ENCONTRO")
    protected List<PARTICIPACAOEMENCONTRO> participacaoemencontro;
    @XmlElement(name = "PARTICIPACAO-EM-EXPOSICAO")
    protected List<PARTICIPACAOEMEXPOSICAO> participacaoemexposicao;
    @XmlElement(name = "PARTICIPACAO-EM-OLIMPIADA")
    protected List<PARTICIPACAOEMOLIMPIADA> participacaoemolimpiada;
    @XmlElement(name = "OUTRAS-PARTICIPACOES-EM-EVENTOS-CONGRESSOS")
    protected List<OUTRASPARTICIPACOESEMEVENTOSCONGRESSOS> outrasparticipacoesemeventoscongressos;

    /**
     * Gets the value of the participacaoemcongresso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participacaoemcongresso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTICIPACAOEMCONGRESSO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTICIPACAOEMCONGRESSO }
     * 
     * 
     */
    public List<PARTICIPACAOEMCONGRESSO> getPARTICIPACAOEMCONGRESSO() {
        if (participacaoemcongresso == null) {
            participacaoemcongresso = new ArrayList<PARTICIPACAOEMCONGRESSO>();
        }
        return this.participacaoemcongresso;
    }

    /**
     * Gets the value of the participacaoemfeira property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participacaoemfeira property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTICIPACAOEMFEIRA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTICIPACAOEMFEIRA }
     * 
     * 
     */
    public List<PARTICIPACAOEMFEIRA> getPARTICIPACAOEMFEIRA() {
        if (participacaoemfeira == null) {
            participacaoemfeira = new ArrayList<PARTICIPACAOEMFEIRA>();
        }
        return this.participacaoemfeira;
    }

    /**
     * Gets the value of the participacaoemseminario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participacaoemseminario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTICIPACAOEMSEMINARIO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTICIPACAOEMSEMINARIO }
     * 
     * 
     */
    public List<PARTICIPACAOEMSEMINARIO> getPARTICIPACAOEMSEMINARIO() {
        if (participacaoemseminario == null) {
            participacaoemseminario = new ArrayList<PARTICIPACAOEMSEMINARIO>();
        }
        return this.participacaoemseminario;
    }

    /**
     * Gets the value of the participacaoemsimposio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participacaoemsimposio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTICIPACAOEMSIMPOSIO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTICIPACAOEMSIMPOSIO }
     * 
     * 
     */
    public List<PARTICIPACAOEMSIMPOSIO> getPARTICIPACAOEMSIMPOSIO() {
        if (participacaoemsimposio == null) {
            participacaoemsimposio = new ArrayList<PARTICIPACAOEMSIMPOSIO>();
        }
        return this.participacaoemsimposio;
    }

    /**
     * Gets the value of the participacaoemoficina property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participacaoemoficina property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTICIPACAOEMOFICINA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTICIPACAOEMOFICINA }
     * 
     * 
     */
    public List<PARTICIPACAOEMOFICINA> getPARTICIPACAOEMOFICINA() {
        if (participacaoemoficina == null) {
            participacaoemoficina = new ArrayList<PARTICIPACAOEMOFICINA>();
        }
        return this.participacaoemoficina;
    }

    /**
     * Gets the value of the participacaoemencontro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participacaoemencontro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTICIPACAOEMENCONTRO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTICIPACAOEMENCONTRO }
     * 
     * 
     */
    public List<PARTICIPACAOEMENCONTRO> getPARTICIPACAOEMENCONTRO() {
        if (participacaoemencontro == null) {
            participacaoemencontro = new ArrayList<PARTICIPACAOEMENCONTRO>();
        }
        return this.participacaoemencontro;
    }

    /**
     * Gets the value of the participacaoemexposicao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participacaoemexposicao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTICIPACAOEMEXPOSICAO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTICIPACAOEMEXPOSICAO }
     * 
     * 
     */
    public List<PARTICIPACAOEMEXPOSICAO> getPARTICIPACAOEMEXPOSICAO() {
        if (participacaoemexposicao == null) {
            participacaoemexposicao = new ArrayList<PARTICIPACAOEMEXPOSICAO>();
        }
        return this.participacaoemexposicao;
    }

    /**
     * Gets the value of the participacaoemolimpiada property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participacaoemolimpiada property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTICIPACAOEMOLIMPIADA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTICIPACAOEMOLIMPIADA }
     * 
     * 
     */
    public List<PARTICIPACAOEMOLIMPIADA> getPARTICIPACAOEMOLIMPIADA() {
        if (participacaoemolimpiada == null) {
            participacaoemolimpiada = new ArrayList<PARTICIPACAOEMOLIMPIADA>();
        }
        return this.participacaoemolimpiada;
    }

    /**
     * Gets the value of the outrasparticipacoesemeventoscongressos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outrasparticipacoesemeventoscongressos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOUTRASPARTICIPACOESEMEVENTOSCONGRESSOS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OUTRASPARTICIPACOESEMEVENTOSCONGRESSOS }
     * 
     * 
     */
    public List<OUTRASPARTICIPACOESEMEVENTOSCONGRESSOS> getOUTRASPARTICIPACOESEMEVENTOSCONGRESSOS() {
        if (outrasparticipacoesemeventoscongressos == null) {
            outrasparticipacoesemeventoscongressos = new ArrayList<OUTRASPARTICIPACOESEMEVENTOSCONGRESSOS>();
        }
        return this.outrasparticipacoesemeventoscongressos;
    }

}
