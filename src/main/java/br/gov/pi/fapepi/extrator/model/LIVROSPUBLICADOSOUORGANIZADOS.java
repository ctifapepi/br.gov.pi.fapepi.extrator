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
 *         &lt;element ref="{}LIVRO-PUBLICADO-OU-ORGANIZADO" maxOccurs="unbounded" minOccurs="0"/>
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
    "livropublicadoouorganizado"
})
@XmlRootElement(name = "LIVROS-PUBLICADOS-OU-ORGANIZADOS")
public class LIVROSPUBLICADOSOUORGANIZADOS {

    @XmlElement(name = "LIVRO-PUBLICADO-OU-ORGANIZADO")
    protected List<LIVROPUBLICADOOUORGANIZADO> livropublicadoouorganizado;

    /**
     * Gets the value of the livropublicadoouorganizado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the livropublicadoouorganizado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLIVROPUBLICADOOUORGANIZADO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LIVROPUBLICADOOUORGANIZADO }
     * 
     * 
     */
    public List<LIVROPUBLICADOOUORGANIZADO> getLIVROPUBLICADOOUORGANIZADO() {
        if (livropublicadoouorganizado == null) {
            livropublicadoouorganizado = new ArrayList<LIVROPUBLICADOOUORGANIZADO>();
        }
        return this.livropublicadoouorganizado;
    }

}
