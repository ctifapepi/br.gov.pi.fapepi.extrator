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
 *         &lt;element ref="{}CULTIVAR-REGISTRADA" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}SOFTWARE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PATENTE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}CULTIVAR-PROTEGIDA" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}DESENHO-INDUSTRIAL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}MARCA" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}TOPOGRAFIA-DE-CIRCUITO-INTEGRADO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PRODUTO-TECNOLOGICO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PROCESSOS-OU-TECNICAS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}TRABALHO-TECNICO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}DEMAIS-TIPOS-DE-PRODUCAO-TECNICA" maxOccurs="unbounded" minOccurs="0"/>
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
    "cultivarregistrada",
    "software",
    "patente",
    "cultivarprotegida",
    "desenhoindustrial",
    "marca",
    "topografiadecircuitointegrado",
    "produtotecnologico",
    "processosoutecnicas",
    "trabalhotecnico",
    "demaistiposdeproducaotecnica"
})
@XmlRootElement(name = "PRODUCAO-TECNICA")
public class PRODUCAOTECNICA {

    @XmlElement(name = "CULTIVAR-REGISTRADA")
    protected List<CULTIVARREGISTRADA> cultivarregistrada;
    @XmlElement(name = "SOFTWARE")
    protected List<SOFTWARE> software;
    @XmlElement(name = "PATENTE")
    protected List<PATENTE> patente;
    @XmlElement(name = "CULTIVAR-PROTEGIDA")
    protected List<CULTIVARPROTEGIDA> cultivarprotegida;
    @XmlElement(name = "DESENHO-INDUSTRIAL")
    protected List<DESENHOINDUSTRIAL> desenhoindustrial;
    @XmlElement(name = "MARCA")
    protected List<MARCA> marca;
    @XmlElement(name = "TOPOGRAFIA-DE-CIRCUITO-INTEGRADO")
    protected List<TOPOGRAFIADECIRCUITOINTEGRADO> topografiadecircuitointegrado;
    @XmlElement(name = "PRODUTO-TECNOLOGICO")
    protected List<PRODUTOTECNOLOGICO> produtotecnologico;
    @XmlElement(name = "PROCESSOS-OU-TECNICAS")
    protected List<PROCESSOSOUTECNICAS> processosoutecnicas;
    @XmlElement(name = "TRABALHO-TECNICO")
    protected List<TRABALHOTECNICO> trabalhotecnico;
    @XmlElement(name = "DEMAIS-TIPOS-DE-PRODUCAO-TECNICA")
    protected List<DEMAISTIPOSDEPRODUCAOTECNICA> demaistiposdeproducaotecnica;

    /**
     * Gets the value of the cultivarregistrada property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cultivarregistrada property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCULTIVARREGISTRADA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CULTIVARREGISTRADA }
     * 
     * 
     */
    public List<CULTIVARREGISTRADA> getCULTIVARREGISTRADA() {
        if (cultivarregistrada == null) {
            cultivarregistrada = new ArrayList<CULTIVARREGISTRADA>();
        }
        return this.cultivarregistrada;
    }

    /**
     * Gets the value of the software property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the software property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSOFTWARE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SOFTWARE }
     * 
     * 
     */
    public List<SOFTWARE> getSOFTWARE() {
        if (software == null) {
            software = new ArrayList<SOFTWARE>();
        }
        return this.software;
    }

    /**
     * Gets the value of the patente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPATENTE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PATENTE }
     * 
     * 
     */
    public List<PATENTE> getPATENTE() {
        if (patente == null) {
            patente = new ArrayList<PATENTE>();
        }
        return this.patente;
    }

    /**
     * Gets the value of the cultivarprotegida property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cultivarprotegida property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCULTIVARPROTEGIDA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CULTIVARPROTEGIDA }
     * 
     * 
     */
    public List<CULTIVARPROTEGIDA> getCULTIVARPROTEGIDA() {
        if (cultivarprotegida == null) {
            cultivarprotegida = new ArrayList<CULTIVARPROTEGIDA>();
        }
        return this.cultivarprotegida;
    }

    /**
     * Gets the value of the desenhoindustrial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desenhoindustrial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDESENHOINDUSTRIAL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DESENHOINDUSTRIAL }
     * 
     * 
     */
    public List<DESENHOINDUSTRIAL> getDESENHOINDUSTRIAL() {
        if (desenhoindustrial == null) {
            desenhoindustrial = new ArrayList<DESENHOINDUSTRIAL>();
        }
        return this.desenhoindustrial;
    }

    /**
     * Gets the value of the marca property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marca property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMARCA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MARCA }
     * 
     * 
     */
    public List<MARCA> getMARCA() {
        if (marca == null) {
            marca = new ArrayList<MARCA>();
        }
        return this.marca;
    }

    /**
     * Gets the value of the topografiadecircuitointegrado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topografiadecircuitointegrado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTOPOGRAFIADECIRCUITOINTEGRADO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TOPOGRAFIADECIRCUITOINTEGRADO }
     * 
     * 
     */
    public List<TOPOGRAFIADECIRCUITOINTEGRADO> getTOPOGRAFIADECIRCUITOINTEGRADO() {
        if (topografiadecircuitointegrado == null) {
            topografiadecircuitointegrado = new ArrayList<TOPOGRAFIADECIRCUITOINTEGRADO>();
        }
        return this.topografiadecircuitointegrado;
    }

    /**
     * Gets the value of the produtotecnologico property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the produtotecnologico property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRODUTOTECNOLOGICO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRODUTOTECNOLOGICO }
     * 
     * 
     */
    public List<PRODUTOTECNOLOGICO> getPRODUTOTECNOLOGICO() {
        if (produtotecnologico == null) {
            produtotecnologico = new ArrayList<PRODUTOTECNOLOGICO>();
        }
        return this.produtotecnologico;
    }

    /**
     * Gets the value of the processosoutecnicas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processosoutecnicas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPROCESSOSOUTECNICAS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PROCESSOSOUTECNICAS }
     * 
     * 
     */
    public List<PROCESSOSOUTECNICAS> getPROCESSOSOUTECNICAS() {
        if (processosoutecnicas == null) {
            processosoutecnicas = new ArrayList<PROCESSOSOUTECNICAS>();
        }
        return this.processosoutecnicas;
    }

    /**
     * Gets the value of the trabalhotecnico property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trabalhotecnico property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTRABALHOTECNICO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRABALHOTECNICO }
     * 
     * 
     */
    public List<TRABALHOTECNICO> getTRABALHOTECNICO() {
        if (trabalhotecnico == null) {
            trabalhotecnico = new ArrayList<TRABALHOTECNICO>();
        }
        return this.trabalhotecnico;
    }

    /**
     * Gets the value of the demaistiposdeproducaotecnica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demaistiposdeproducaotecnica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEMAISTIPOSDEPRODUCAOTECNICA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEMAISTIPOSDEPRODUCAOTECNICA }
     * 
     * 
     */
    public List<DEMAISTIPOSDEPRODUCAOTECNICA> getDEMAISTIPOSDEPRODUCAOTECNICA() {
        if (demaistiposdeproducaotecnica == null) {
            demaistiposdeproducaotecnica = new ArrayList<DEMAISTIPOSDEPRODUCAOTECNICA>();
        }
        return this.demaistiposdeproducaotecnica;
    }

}
