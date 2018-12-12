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
 *         &lt;element ref="{}ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ORIENTACAO-EM-ANDAMENTO-DE-DOUTORADO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ORIENTACAO-EM-ANDAMENTO-DE-POS-DOUTORADO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ORIENTACAO-EM-ANDAMENTO-DE-APERFEICOAMENTO-ESPECIALIZACAO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ORIENTACAO-EM-ANDAMENTO-DE-GRADUACAO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ORIENTACAO-EM-ANDAMENTO-DE-INICIACAO-CIENTIFICA" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}OUTRAS-ORIENTACOES-EM-ANDAMENTO" maxOccurs="unbounded" minOccurs="0"/>
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
    "orientacaoemandamentodemestrado",
    "orientacaoemandamentodedoutorado",
    "orientacaoemandamentodeposdoutorado",
    "orientacaoemandamentodeaperfeicoamentoespecializacao",
    "orientacaoemandamentodegraduacao",
    "orientacaoemandamentodeiniciacaocientifica",
    "outrasorientacoesemandamento"
})
@XmlRootElement(name = "ORIENTACOES-EM-ANDAMENTO")
public class ORIENTACOESEMANDAMENTO {

    @XmlElement(name = "ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO")
    protected List<ORIENTACAOEMANDAMENTODEMESTRADO> orientacaoemandamentodemestrado;
    @XmlElement(name = "ORIENTACAO-EM-ANDAMENTO-DE-DOUTORADO")
    protected List<ORIENTACAOEMANDAMENTODEDOUTORADO> orientacaoemandamentodedoutorado;
    @XmlElement(name = "ORIENTACAO-EM-ANDAMENTO-DE-POS-DOUTORADO")
    protected List<ORIENTACAOEMANDAMENTODEPOSDOUTORADO> orientacaoemandamentodeposdoutorado;
    @XmlElement(name = "ORIENTACAO-EM-ANDAMENTO-DE-APERFEICOAMENTO-ESPECIALIZACAO")
    protected List<ORIENTACAOEMANDAMENTODEAPERFEICOAMENTOESPECIALIZACAO> orientacaoemandamentodeaperfeicoamentoespecializacao;
    @XmlElement(name = "ORIENTACAO-EM-ANDAMENTO-DE-GRADUACAO")
    protected List<ORIENTACAOEMANDAMENTODEGRADUACAO> orientacaoemandamentodegraduacao;
    @XmlElement(name = "ORIENTACAO-EM-ANDAMENTO-DE-INICIACAO-CIENTIFICA")
    protected List<ORIENTACAOEMANDAMENTODEINICIACAOCIENTIFICA> orientacaoemandamentodeiniciacaocientifica;
    @XmlElement(name = "OUTRAS-ORIENTACOES-EM-ANDAMENTO")
    protected List<OUTRASORIENTACOESEMANDAMENTO> outrasorientacoesemandamento;

    /**
     * Gets the value of the orientacaoemandamentodemestrado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orientacaoemandamentodemestrado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getORIENTACAOEMANDAMENTODEMESTRADO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ORIENTACAOEMANDAMENTODEMESTRADO }
     * 
     * 
     */
    public List<ORIENTACAOEMANDAMENTODEMESTRADO> getORIENTACAOEMANDAMENTODEMESTRADO() {
        if (orientacaoemandamentodemestrado == null) {
            orientacaoemandamentodemestrado = new ArrayList<ORIENTACAOEMANDAMENTODEMESTRADO>();
        }
        return this.orientacaoemandamentodemestrado;
    }

    /**
     * Gets the value of the orientacaoemandamentodedoutorado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orientacaoemandamentodedoutorado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getORIENTACAOEMANDAMENTODEDOUTORADO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ORIENTACAOEMANDAMENTODEDOUTORADO }
     * 
     * 
     */
    public List<ORIENTACAOEMANDAMENTODEDOUTORADO> getORIENTACAOEMANDAMENTODEDOUTORADO() {
        if (orientacaoemandamentodedoutorado == null) {
            orientacaoemandamentodedoutorado = new ArrayList<ORIENTACAOEMANDAMENTODEDOUTORADO>();
        }
        return this.orientacaoemandamentodedoutorado;
    }

    /**
     * Gets the value of the orientacaoemandamentodeposdoutorado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orientacaoemandamentodeposdoutorado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getORIENTACAOEMANDAMENTODEPOSDOUTORADO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ORIENTACAOEMANDAMENTODEPOSDOUTORADO }
     * 
     * 
     */
    public List<ORIENTACAOEMANDAMENTODEPOSDOUTORADO> getORIENTACAOEMANDAMENTODEPOSDOUTORADO() {
        if (orientacaoemandamentodeposdoutorado == null) {
            orientacaoemandamentodeposdoutorado = new ArrayList<ORIENTACAOEMANDAMENTODEPOSDOUTORADO>();
        }
        return this.orientacaoemandamentodeposdoutorado;
    }

    /**
     * Gets the value of the orientacaoemandamentodeaperfeicoamentoespecializacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orientacaoemandamentodeaperfeicoamentoespecializacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getORIENTACAOEMANDAMENTODEAPERFEICOAMENTOESPECIALIZACAO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ORIENTACAOEMANDAMENTODEAPERFEICOAMENTOESPECIALIZACAO }
     * 
     * 
     */
    public List<ORIENTACAOEMANDAMENTODEAPERFEICOAMENTOESPECIALIZACAO> getORIENTACAOEMANDAMENTODEAPERFEICOAMENTOESPECIALIZACAO() {
        if (orientacaoemandamentodeaperfeicoamentoespecializacao == null) {
            orientacaoemandamentodeaperfeicoamentoespecializacao = new ArrayList<ORIENTACAOEMANDAMENTODEAPERFEICOAMENTOESPECIALIZACAO>();
        }
        return this.orientacaoemandamentodeaperfeicoamentoespecializacao;
    }

    /**
     * Gets the value of the orientacaoemandamentodegraduacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orientacaoemandamentodegraduacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getORIENTACAOEMANDAMENTODEGRADUACAO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ORIENTACAOEMANDAMENTODEGRADUACAO }
     * 
     * 
     */
    public List<ORIENTACAOEMANDAMENTODEGRADUACAO> getORIENTACAOEMANDAMENTODEGRADUACAO() {
        if (orientacaoemandamentodegraduacao == null) {
            orientacaoemandamentodegraduacao = new ArrayList<ORIENTACAOEMANDAMENTODEGRADUACAO>();
        }
        return this.orientacaoemandamentodegraduacao;
    }

    /**
     * Gets the value of the orientacaoemandamentodeiniciacaocientifica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orientacaoemandamentodeiniciacaocientifica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getORIENTACAOEMANDAMENTODEINICIACAOCIENTIFICA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ORIENTACAOEMANDAMENTODEINICIACAOCIENTIFICA }
     * 
     * 
     */
    public List<ORIENTACAOEMANDAMENTODEINICIACAOCIENTIFICA> getORIENTACAOEMANDAMENTODEINICIACAOCIENTIFICA() {
        if (orientacaoemandamentodeiniciacaocientifica == null) {
            orientacaoemandamentodeiniciacaocientifica = new ArrayList<ORIENTACAOEMANDAMENTODEINICIACAOCIENTIFICA>();
        }
        return this.orientacaoemandamentodeiniciacaocientifica;
    }

    /**
     * Gets the value of the outrasorientacoesemandamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outrasorientacoesemandamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOUTRASORIENTACOESEMANDAMENTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OUTRASORIENTACOESEMANDAMENTO }
     * 
     * 
     */
    public List<OUTRASORIENTACOESEMANDAMENTO> getOUTRASORIENTACOESEMANDAMENTO() {
        if (outrasorientacoesemandamento == null) {
            outrasorientacoesemandamento = new ArrayList<OUTRASORIENTACOESEMANDAMENTO>();
        }
        return this.outrasorientacoesemandamento;
    }

}
