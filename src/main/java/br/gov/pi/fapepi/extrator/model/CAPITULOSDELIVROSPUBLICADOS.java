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
 *         &lt;element ref="{}CAPITULO-DE-LIVRO-PUBLICADO" maxOccurs="unbounded" minOccurs="0"/>
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
    "capitulodelivropublicado"
})
@XmlRootElement(name = "CAPITULOS-DE-LIVROS-PUBLICADOS")
public class CAPITULOSDELIVROSPUBLICADOS {

    @XmlElement(name = "CAPITULO-DE-LIVRO-PUBLICADO")
    protected List<CAPITULODELIVROPUBLICADO> capitulodelivropublicado;

    /**
     * Gets the value of the capitulodelivropublicado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capitulodelivropublicado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCAPITULODELIVROPUBLICADO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CAPITULODELIVROPUBLICADO }
     * 
     * 
     */
    public List<CAPITULODELIVROPUBLICADO> getCAPITULODELIVROPUBLICADO() {
        if (capitulodelivropublicado == null) {
            capitulodelivropublicado = new ArrayList<CAPITULODELIVROPUBLICADO>();
        }
        return this.capitulodelivropublicado;
    }

}
