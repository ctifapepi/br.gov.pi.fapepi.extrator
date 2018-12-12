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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{}PARTICIPACAO-EM-BANCA-DE-MESTRADO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PARTICIPACAO-EM-BANCA-DE-DOUTORADO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PARTICIPACAO-EM-BANCA-DE-EXAME-QUALIFICACAO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PARTICIPACAO-EM-BANCA-DE-APERFEICOAMENTO-ESPECIALIZACAO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PARTICIPACAO-EM-BANCA-DE-GRADUACAO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}OUTRAS-PARTICIPACOES-EM-BANCA" maxOccurs="unbounded" minOccurs="0"/>
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
    "participacaoembancademestrado",
    "participacaoembancadedoutorado",
    "participacaoembancadeexamequalificacao",
    "participacaoembancadeaperfeicoamentoespecializacao",
    "participacaoembancadegraduacao",
    "outrasparticipacoesembanca"
})
@XmlRootElement(name = "PARTICIPACAO-EM-BANCA-TRABALHOS-CONCLUSAO")
public class PARTICIPACAOEMBANCATRABALHOSCONCLUSAO {

    @XmlElement(name = "PARTICIPACAO-EM-BANCA-DE-MESTRADO")
    protected List<PARTICIPACAOEMBANCADEMESTRADO> participacaoembancademestrado;
    @XmlElement(name = "PARTICIPACAO-EM-BANCA-DE-DOUTORADO")
    protected List<PARTICIPACAOEMBANCADEDOUTORADO> participacaoembancadedoutorado;
    @XmlElement(name = "PARTICIPACAO-EM-BANCA-DE-EXAME-QUALIFICACAO")
    protected List<PARTICIPACAOEMBANCADEEXAMEQUALIFICACAO> participacaoembancadeexamequalificacao;
    @XmlElement(name = "PARTICIPACAO-EM-BANCA-DE-APERFEICOAMENTO-ESPECIALIZACAO")
    protected List<PARTICIPACAOEMBANCADEAPERFEICOAMENTOESPECIALIZACAO> participacaoembancadeaperfeicoamentoespecializacao;
    @XmlElement(name = "PARTICIPACAO-EM-BANCA-DE-GRADUACAO")
    protected List<PARTICIPACAOEMBANCADEGRADUACAO> participacaoembancadegraduacao;
    @XmlElement(name = "OUTRAS-PARTICIPACOES-EM-BANCA")
    protected List<OUTRASPARTICIPACOESEMBANCA> outrasparticipacoesembanca;

    /**
     * Gets the value of the participacaoembancademestrado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participacaoembancademestrado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTICIPACAOEMBANCADEMESTRADO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTICIPACAOEMBANCADEMESTRADO }
     * 
     * 
     */
    public List<PARTICIPACAOEMBANCADEMESTRADO> getPARTICIPACAOEMBANCADEMESTRADO() {
        if (participacaoembancademestrado == null) {
            participacaoembancademestrado = new ArrayList<PARTICIPACAOEMBANCADEMESTRADO>();
        }
        return this.participacaoembancademestrado;
    }

    /**
     * Gets the value of the participacaoembancadedoutorado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participacaoembancadedoutorado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTICIPACAOEMBANCADEDOUTORADO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTICIPACAOEMBANCADEDOUTORADO }
     * 
     * 
     */
    public List<PARTICIPACAOEMBANCADEDOUTORADO> getPARTICIPACAOEMBANCADEDOUTORADO() {
        if (participacaoembancadedoutorado == null) {
            participacaoembancadedoutorado = new ArrayList<PARTICIPACAOEMBANCADEDOUTORADO>();
        }
        return this.participacaoembancadedoutorado;
    }

    /**
     * Gets the value of the participacaoembancadeexamequalificacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participacaoembancadeexamequalificacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTICIPACAOEMBANCADEEXAMEQUALIFICACAO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTICIPACAOEMBANCADEEXAMEQUALIFICACAO }
     * 
     * 
     */
    public List<PARTICIPACAOEMBANCADEEXAMEQUALIFICACAO> getPARTICIPACAOEMBANCADEEXAMEQUALIFICACAO() {
        if (participacaoembancadeexamequalificacao == null) {
            participacaoembancadeexamequalificacao = new ArrayList<PARTICIPACAOEMBANCADEEXAMEQUALIFICACAO>();
        }
        return this.participacaoembancadeexamequalificacao;
    }

    /**
     * Gets the value of the participacaoembancadeaperfeicoamentoespecializacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participacaoembancadeaperfeicoamentoespecializacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTICIPACAOEMBANCADEAPERFEICOAMENTOESPECIALIZACAO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTICIPACAOEMBANCADEAPERFEICOAMENTOESPECIALIZACAO }
     * 
     * 
     */
    public List<PARTICIPACAOEMBANCADEAPERFEICOAMENTOESPECIALIZACAO> getPARTICIPACAOEMBANCADEAPERFEICOAMENTOESPECIALIZACAO() {
        if (participacaoembancadeaperfeicoamentoespecializacao == null) {
            participacaoembancadeaperfeicoamentoespecializacao = new ArrayList<PARTICIPACAOEMBANCADEAPERFEICOAMENTOESPECIALIZACAO>();
        }
        return this.participacaoembancadeaperfeicoamentoespecializacao;
    }

    /**
     * Gets the value of the participacaoembancadegraduacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participacaoembancadegraduacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTICIPACAOEMBANCADEGRADUACAO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTICIPACAOEMBANCADEGRADUACAO }
     * 
     * 
     */
    public List<PARTICIPACAOEMBANCADEGRADUACAO> getPARTICIPACAOEMBANCADEGRADUACAO() {
        if (participacaoembancadegraduacao == null) {
            participacaoembancadegraduacao = new ArrayList<PARTICIPACAOEMBANCADEGRADUACAO>();
        }
        return this.participacaoembancadegraduacao;
    }

    /**
     * Gets the value of the outrasparticipacoesembanca property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outrasparticipacoesembanca property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOUTRASPARTICIPACOESEMBANCA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OUTRASPARTICIPACOESEMBANCA }
     * 
     * 
     */
    public List<OUTRASPARTICIPACOESEMBANCA> getOUTRASPARTICIPACOESEMBANCA() {
        if (outrasparticipacoesembanca == null) {
            outrasparticipacoesembanca = new ArrayList<OUTRASPARTICIPACOESEMBANCA>();
        }
        return this.outrasparticipacoesembanca;
    }

}
