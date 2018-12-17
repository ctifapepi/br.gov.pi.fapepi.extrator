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
 *         &lt;element ref="{}OUTRA-PRODUCAO-BIBLIOGRAFICA" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PARTITURA-MUSICAL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PREFACIO-POSFACIO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}TRADUCAO" maxOccurs="unbounded" minOccurs="0"/>
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
    "outraproducaobibliografica",
    "partituramusical",
    "prefacioposfacio",
    "traducao"
})
@XmlRootElement(name = "DEMAIS-TIPOS-DE-PRODUCAO-BIBLIOGRAFICA")
public class DEMAISTIPOSDEPRODUCAOBIBLIOGRAFICA {

    @XmlElement(name = "OUTRA-PRODUCAO-BIBLIOGRAFICA")
    protected List<OUTRAPRODUCAOBIBLIOGRAFICA> outraproducaobibliografica;
    @XmlElement(name = "PARTITURA-MUSICAL")
    protected List<PARTITURAMUSICAL> partituramusical;
    @XmlElement(name = "PREFACIO-POSFACIO")
    protected List<PREFACIOPOSFACIO> prefacioposfacio;
    @XmlElement(name = "TRADUCAO")
    protected List<TRADUCAO> traducao;

    /**
     * Gets the value of the outraproducaobibliografica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outraproducaobibliografica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOUTRAPRODUCAOBIBLIOGRAFICA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OUTRAPRODUCAOBIBLIOGRAFICA }
     * 
     * 
     */
    public List<OUTRAPRODUCAOBIBLIOGRAFICA> getOUTRAPRODUCAOBIBLIOGRAFICA() {
        if (outraproducaobibliografica == null) {
            outraproducaobibliografica = new ArrayList<OUTRAPRODUCAOBIBLIOGRAFICA>();
        }
        return this.outraproducaobibliografica;
    }

    /**
     * Gets the value of the partituramusical property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partituramusical property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTITURAMUSICAL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTITURAMUSICAL }
     * 
     * 
     */
    public List<PARTITURAMUSICAL> getPARTITURAMUSICAL() {
        if (partituramusical == null) {
            partituramusical = new ArrayList<PARTITURAMUSICAL>();
        }
        return this.partituramusical;
    }

    /**
     * Gets the value of the prefacioposfacio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefacioposfacio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPREFACIOPOSFACIO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PREFACIOPOSFACIO }
     * 
     * 
     */
    public List<PREFACIOPOSFACIO> getPREFACIOPOSFACIO() {
        if (prefacioposfacio == null) {
            prefacioposfacio = new ArrayList<PREFACIOPOSFACIO>();
        }
        return this.prefacioposfacio;
    }

    /**
     * Gets the value of the traducao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traducao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTRADUCAO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRADUCAO }
     * 
     * 
     */
    public List<TRADUCAO> getTRADUCAO() {
        if (traducao == null) {
            traducao = new ArrayList<TRADUCAO>();
        }
        return this.traducao;
    }

}
