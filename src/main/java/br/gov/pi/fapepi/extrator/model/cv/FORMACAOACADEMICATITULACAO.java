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
 *         &lt;element ref="{}GRADUACAO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ESPECIALIZACAO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}MESTRADO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}DOUTORADO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}POS-DOUTORADO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}LIVRE-DOCENCIA" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}CURSO-TECNICO-PROFISSIONALIZANTE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}MESTRADO-PROFISSIONALIZANTE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ENSINO-FUNDAMENTAL-PRIMEIRO-GRAU" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ENSINO-MEDIO-SEGUNDO-GRAU" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}RESIDENCIA-MEDICA" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}APERFEICOAMENTO" maxOccurs="unbounded" minOccurs="0"/>
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
    "graduacao",
    "especializacao",
    "mestrado",
    "doutorado",
    "posdoutorado",
    "livredocencia",
    "cursotecnicoprofissionalizante",
    "mestradoprofissionalizante",
    "ensinofundamentalprimeirograu",
    "ensinomediosegundograu",
    "residenciamedica",
    "aperfeicoamento"
})
@XmlRootElement(name = "FORMACAO-ACADEMICA-TITULACAO")
public class FORMACAOACADEMICATITULACAO {

    @XmlElement(name = "GRADUACAO")
    protected List<GRADUACAO> graduacao;
    @XmlElement(name = "ESPECIALIZACAO")
    protected List<ESPECIALIZACAO> especializacao;
    @XmlElement(name = "MESTRADO")
    protected List<MESTRADO> mestrado;
    @XmlElement(name = "DOUTORADO")
    protected List<DOUTORADO> doutorado;
    @XmlElement(name = "POS-DOUTORADO")
    protected List<POSDOUTORADO> posdoutorado;
    @XmlElement(name = "LIVRE-DOCENCIA")
    protected List<LIVREDOCENCIA> livredocencia;
    @XmlElement(name = "CURSO-TECNICO-PROFISSIONALIZANTE")
    protected List<CURSOTECNICOPROFISSIONALIZANTE> cursotecnicoprofissionalizante;
    @XmlElement(name = "MESTRADO-PROFISSIONALIZANTE")
    protected List<MESTRADOPROFISSIONALIZANTE> mestradoprofissionalizante;
    @XmlElement(name = "ENSINO-FUNDAMENTAL-PRIMEIRO-GRAU")
    protected List<ENSINOFUNDAMENTALPRIMEIROGRAU> ensinofundamentalprimeirograu;
    @XmlElement(name = "ENSINO-MEDIO-SEGUNDO-GRAU")
    protected List<ENSINOMEDIOSEGUNDOGRAU> ensinomediosegundograu;
    @XmlElement(name = "RESIDENCIA-MEDICA")
    protected List<RESIDENCIAMEDICA> residenciamedica;
    @XmlElement(name = "APERFEICOAMENTO")
    protected List<APERFEICOAMENTO> aperfeicoamento;

    /**
     * Gets the value of the graduacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graduacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGRADUACAO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GRADUACAO }
     * 
     * 
     */
    public List<GRADUACAO> getGRADUACAO() {
        if (graduacao == null) {
            graduacao = new ArrayList<GRADUACAO>();
        }
        return this.graduacao;
    }

    /**
     * Gets the value of the especializacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the especializacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getESPECIALIZACAO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ESPECIALIZACAO }
     * 
     * 
     */
    public List<ESPECIALIZACAO> getESPECIALIZACAO() {
        if (especializacao == null) {
            especializacao = new ArrayList<ESPECIALIZACAO>();
        }
        return this.especializacao;
    }

    /**
     * Gets the value of the mestrado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mestrado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMESTRADO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MESTRADO }
     * 
     * 
     */
    public List<MESTRADO> getMESTRADO() {
        if (mestrado == null) {
            mestrado = new ArrayList<MESTRADO>();
        }
        return this.mestrado;
    }

    /**
     * Gets the value of the doutorado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doutorado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOUTORADO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOUTORADO }
     * 
     * 
     */
    public List<DOUTORADO> getDOUTORADO() {
        if (doutorado == null) {
            doutorado = new ArrayList<DOUTORADO>();
        }
        return this.doutorado;
    }

    /**
     * Gets the value of the posdoutorado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posdoutorado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOSDOUTORADO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POSDOUTORADO }
     * 
     * 
     */
    public List<POSDOUTORADO> getPOSDOUTORADO() {
        if (posdoutorado == null) {
            posdoutorado = new ArrayList<POSDOUTORADO>();
        }
        return this.posdoutorado;
    }

    /**
     * Gets the value of the livredocencia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the livredocencia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLIVREDOCENCIA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LIVREDOCENCIA }
     * 
     * 
     */
    public List<LIVREDOCENCIA> getLIVREDOCENCIA() {
        if (livredocencia == null) {
            livredocencia = new ArrayList<LIVREDOCENCIA>();
        }
        return this.livredocencia;
    }

    /**
     * Gets the value of the cursotecnicoprofissionalizante property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cursotecnicoprofissionalizante property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCURSOTECNICOPROFISSIONALIZANTE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CURSOTECNICOPROFISSIONALIZANTE }
     * 
     * 
     */
    public List<CURSOTECNICOPROFISSIONALIZANTE> getCURSOTECNICOPROFISSIONALIZANTE() {
        if (cursotecnicoprofissionalizante == null) {
            cursotecnicoprofissionalizante = new ArrayList<CURSOTECNICOPROFISSIONALIZANTE>();
        }
        return this.cursotecnicoprofissionalizante;
    }

    /**
     * Gets the value of the mestradoprofissionalizante property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mestradoprofissionalizante property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMESTRADOPROFISSIONALIZANTE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MESTRADOPROFISSIONALIZANTE }
     * 
     * 
     */
    public List<MESTRADOPROFISSIONALIZANTE> getMESTRADOPROFISSIONALIZANTE() {
        if (mestradoprofissionalizante == null) {
            mestradoprofissionalizante = new ArrayList<MESTRADOPROFISSIONALIZANTE>();
        }
        return this.mestradoprofissionalizante;
    }

    /**
     * Gets the value of the ensinofundamentalprimeirograu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ensinofundamentalprimeirograu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENSINOFUNDAMENTALPRIMEIROGRAU().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENSINOFUNDAMENTALPRIMEIROGRAU }
     * 
     * 
     */
    public List<ENSINOFUNDAMENTALPRIMEIROGRAU> getENSINOFUNDAMENTALPRIMEIROGRAU() {
        if (ensinofundamentalprimeirograu == null) {
            ensinofundamentalprimeirograu = new ArrayList<ENSINOFUNDAMENTALPRIMEIROGRAU>();
        }
        return this.ensinofundamentalprimeirograu;
    }

    /**
     * Gets the value of the ensinomediosegundograu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ensinomediosegundograu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENSINOMEDIOSEGUNDOGRAU().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENSINOMEDIOSEGUNDOGRAU }
     * 
     * 
     */
    public List<ENSINOMEDIOSEGUNDOGRAU> getENSINOMEDIOSEGUNDOGRAU() {
        if (ensinomediosegundograu == null) {
            ensinomediosegundograu = new ArrayList<ENSINOMEDIOSEGUNDOGRAU>();
        }
        return this.ensinomediosegundograu;
    }

    /**
     * Gets the value of the residenciamedica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the residenciamedica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRESIDENCIAMEDICA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RESIDENCIAMEDICA }
     * 
     * 
     */
    public List<RESIDENCIAMEDICA> getRESIDENCIAMEDICA() {
        if (residenciamedica == null) {
            residenciamedica = new ArrayList<RESIDENCIAMEDICA>();
        }
        return this.residenciamedica;
    }

    /**
     * Gets the value of the aperfeicoamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aperfeicoamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAPERFEICOAMENTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APERFEICOAMENTO }
     * 
     * 
     */
    public List<APERFEICOAMENTO> getAPERFEICOAMENTO() {
        if (aperfeicoamento == null) {
            aperfeicoamento = new ArrayList<APERFEICOAMENTO>();
        }
        return this.aperfeicoamento;
    }

}
