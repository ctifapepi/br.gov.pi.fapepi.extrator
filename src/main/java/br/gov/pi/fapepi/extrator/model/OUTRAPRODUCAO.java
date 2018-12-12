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
 *         &lt;element ref="{}PRODUCAO-ARTISTICA-CULTURAL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ORIENTACOES-CONCLUIDAS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}DEMAIS-TRABALHOS" maxOccurs="unbounded" minOccurs="0"/>
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
    "producaoartisticacultural",
    "orientacoesconcluidas",
    "demaistrabalhos"
})
@XmlRootElement(name = "OUTRA-PRODUCAO")
public class OUTRAPRODUCAO {

    @XmlElement(name = "PRODUCAO-ARTISTICA-CULTURAL")
    protected List<PRODUCAOARTISTICACULTURAL> producaoartisticacultural;
    @XmlElement(name = "ORIENTACOES-CONCLUIDAS")
    protected List<ORIENTACOESCONCLUIDAS> orientacoesconcluidas;
    @XmlElement(name = "DEMAIS-TRABALHOS")
    protected List<DEMAISTRABALHOS> demaistrabalhos;

    /**
     * Gets the value of the producaoartisticacultural property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producaoartisticacultural property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRODUCAOARTISTICACULTURAL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRODUCAOARTISTICACULTURAL }
     * 
     * 
     */
    public List<PRODUCAOARTISTICACULTURAL> getPRODUCAOARTISTICACULTURAL() {
        if (producaoartisticacultural == null) {
            producaoartisticacultural = new ArrayList<PRODUCAOARTISTICACULTURAL>();
        }
        return this.producaoartisticacultural;
    }

    /**
     * Gets the value of the orientacoesconcluidas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orientacoesconcluidas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getORIENTACOESCONCLUIDAS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ORIENTACOESCONCLUIDAS }
     * 
     * 
     */
    public List<ORIENTACOESCONCLUIDAS> getORIENTACOESCONCLUIDAS() {
        if (orientacoesconcluidas == null) {
            orientacoesconcluidas = new ArrayList<ORIENTACOESCONCLUIDAS>();
        }
        return this.orientacoesconcluidas;
    }

    /**
     * Gets the value of the demaistrabalhos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demaistrabalhos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEMAISTRABALHOS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEMAISTRABALHOS }
     * 
     * 
     */
    public List<DEMAISTRABALHOS> getDEMAISTRABALHOS() {
        if (demaistrabalhos == null) {
            demaistrabalhos = new ArrayList<DEMAISTRABALHOS>();
        }
        return this.demaistrabalhos;
    }

}
