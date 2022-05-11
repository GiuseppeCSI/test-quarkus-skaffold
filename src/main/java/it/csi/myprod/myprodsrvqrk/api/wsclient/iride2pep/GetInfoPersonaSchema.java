
package it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="in0" type="{urn:PolicyEnforcerBase.iridefed.entity}Ruolo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "in0"
})
@XmlRootElement(name = "getInfoPersonaSchema")
public class GetInfoPersonaSchema {

    protected Ruolo in0;

    /**
     * Recupera il valore della proprietà in0.
     * 
     * @return
     *     possible object is
     *     {@link Ruolo }
     *     
     */
    public Ruolo getIn0() {
        return in0;
    }

    /**
     * Imposta il valore della proprietà in0.
     * 
     * @param value
     *     allowed object is
     *     {@link Ruolo }
     *     
     */
    public void setIn0(Ruolo value) {
        this.in0 = value;
    }

}
