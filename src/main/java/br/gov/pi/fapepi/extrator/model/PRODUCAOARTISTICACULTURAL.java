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
 *         &lt;element ref="{}APRESENTACAO-DE-OBRA-ARTISTICA" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}APRESENTACAO-EM-RADIO-OU-TV" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ARRANJO-MUSICAL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}COMPOSICAO-MUSICAL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}CURSO-DE-CURTA-DURACAO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}OBRA-DE-ARTES-VISUAIS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}OUTRA-PRODUCAO-ARTISTICA-CULTURAL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}SONOPLASTIA" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ARTES-CENICAS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ARTES-VISUAIS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}MUSICA" maxOccurs="unbounded" minOccurs="0"/>
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
    "apresentacaodeobraartistica",
    "apresentacaoemradiooutv",
    "arranjomusical",
    "composicaomusical",
    "cursodecurtaduracao",
    "obradeartesvisuais",
    "outraproducaoartisticacultural",
    "sonoplastia",
    "artescenicas",
    "artesvisuais",
    "musica"
})
@XmlRootElement(name = "PRODUCAO-ARTISTICA-CULTURAL")
public class PRODUCAOARTISTICACULTURAL {

    @XmlElement(name = "APRESENTACAO-DE-OBRA-ARTISTICA")
    protected List<APRESENTACAODEOBRAARTISTICA> apresentacaodeobraartistica;
    @XmlElement(name = "APRESENTACAO-EM-RADIO-OU-TV")
    protected List<APRESENTACAOEMRADIOOUTV> apresentacaoemradiooutv;
    @XmlElement(name = "ARRANJO-MUSICAL")
    protected List<ARRANJOMUSICAL> arranjomusical;
    @XmlElement(name = "COMPOSICAO-MUSICAL")
    protected List<COMPOSICAOMUSICAL> composicaomusical;
    @XmlElement(name = "CURSO-DE-CURTA-DURACAO")
    protected List<CURSODECURTADURACAO> cursodecurtaduracao;
    @XmlElement(name = "OBRA-DE-ARTES-VISUAIS")
    protected List<OBRADEARTESVISUAIS> obradeartesvisuais;
    @XmlElement(name = "OUTRA-PRODUCAO-ARTISTICA-CULTURAL")
    protected List<OUTRAPRODUCAOARTISTICACULTURAL> outraproducaoartisticacultural;
    @XmlElement(name = "SONOPLASTIA")
    protected List<SONOPLASTIA> sonoplastia;
    @XmlElement(name = "ARTES-CENICAS")
    protected List<ARTESCENICAS> artescenicas;
    @XmlElement(name = "ARTES-VISUAIS")
    protected List<ARTESVISUAIS> artesvisuais;
    @XmlElement(name = "MUSICA")
    protected List<MUSICA> musica;

    /**
     * Gets the value of the apresentacaodeobraartistica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apresentacaodeobraartistica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAPRESENTACAODEOBRAARTISTICA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APRESENTACAODEOBRAARTISTICA }
     * 
     * 
     */
    public List<APRESENTACAODEOBRAARTISTICA> getAPRESENTACAODEOBRAARTISTICA() {
        if (apresentacaodeobraartistica == null) {
            apresentacaodeobraartistica = new ArrayList<APRESENTACAODEOBRAARTISTICA>();
        }
        return this.apresentacaodeobraartistica;
    }

    /**
     * Gets the value of the apresentacaoemradiooutv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apresentacaoemradiooutv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAPRESENTACAOEMRADIOOUTV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APRESENTACAOEMRADIOOUTV }
     * 
     * 
     */
    public List<APRESENTACAOEMRADIOOUTV> getAPRESENTACAOEMRADIOOUTV() {
        if (apresentacaoemradiooutv == null) {
            apresentacaoemradiooutv = new ArrayList<APRESENTACAOEMRADIOOUTV>();
        }
        return this.apresentacaoemradiooutv;
    }

    /**
     * Gets the value of the arranjomusical property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arranjomusical property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getARRANJOMUSICAL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ARRANJOMUSICAL }
     * 
     * 
     */
    public List<ARRANJOMUSICAL> getARRANJOMUSICAL() {
        if (arranjomusical == null) {
            arranjomusical = new ArrayList<ARRANJOMUSICAL>();
        }
        return this.arranjomusical;
    }

    /**
     * Gets the value of the composicaomusical property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the composicaomusical property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOMPOSICAOMUSICAL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COMPOSICAOMUSICAL }
     * 
     * 
     */
    public List<COMPOSICAOMUSICAL> getCOMPOSICAOMUSICAL() {
        if (composicaomusical == null) {
            composicaomusical = new ArrayList<COMPOSICAOMUSICAL>();
        }
        return this.composicaomusical;
    }

    /**
     * Gets the value of the cursodecurtaduracao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cursodecurtaduracao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCURSODECURTADURACAO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CURSODECURTADURACAO }
     * 
     * 
     */
    public List<CURSODECURTADURACAO> getCURSODECURTADURACAO() {
        if (cursodecurtaduracao == null) {
            cursodecurtaduracao = new ArrayList<CURSODECURTADURACAO>();
        }
        return this.cursodecurtaduracao;
    }

    /**
     * Gets the value of the obradeartesvisuais property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obradeartesvisuais property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOBRADEARTESVISUAIS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OBRADEARTESVISUAIS }
     * 
     * 
     */
    public List<OBRADEARTESVISUAIS> getOBRADEARTESVISUAIS() {
        if (obradeartesvisuais == null) {
            obradeartesvisuais = new ArrayList<OBRADEARTESVISUAIS>();
        }
        return this.obradeartesvisuais;
    }

    /**
     * Gets the value of the outraproducaoartisticacultural property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outraproducaoartisticacultural property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOUTRAPRODUCAOARTISTICACULTURAL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OUTRAPRODUCAOARTISTICACULTURAL }
     * 
     * 
     */
    public List<OUTRAPRODUCAOARTISTICACULTURAL> getOUTRAPRODUCAOARTISTICACULTURAL() {
        if (outraproducaoartisticacultural == null) {
            outraproducaoartisticacultural = new ArrayList<OUTRAPRODUCAOARTISTICACULTURAL>();
        }
        return this.outraproducaoartisticacultural;
    }

    /**
     * Gets the value of the sonoplastia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sonoplastia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSONOPLASTIA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SONOPLASTIA }
     * 
     * 
     */
    public List<SONOPLASTIA> getSONOPLASTIA() {
        if (sonoplastia == null) {
            sonoplastia = new ArrayList<SONOPLASTIA>();
        }
        return this.sonoplastia;
    }

    /**
     * Gets the value of the artescenicas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artescenicas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getARTESCENICAS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ARTESCENICAS }
     * 
     * 
     */
    public List<ARTESCENICAS> getARTESCENICAS() {
        if (artescenicas == null) {
            artescenicas = new ArrayList<ARTESCENICAS>();
        }
        return this.artescenicas;
    }

    /**
     * Gets the value of the artesvisuais property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artesvisuais property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getARTESVISUAIS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ARTESVISUAIS }
     * 
     * 
     */
    public List<ARTESVISUAIS> getARTESVISUAIS() {
        if (artesvisuais == null) {
            artesvisuais = new ArrayList<ARTESVISUAIS>();
        }
        return this.artesvisuais;
    }

    /**
     * Gets the value of the musica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the musica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMUSICA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MUSICA }
     * 
     * 
     */
    public List<MUSICA> getMUSICA() {
        if (musica == null) {
            musica = new ArrayList<MUSICA>();
        }
        return this.musica;
    }

}
