
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
 *         &lt;element name="identificaUserPasswordReturn" type="{urn:PolicyEnforcerBase.policy.entity}Identita" minOccurs="0"/&gt;
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
    "identificaUserPasswordReturn"
})
@XmlRootElement(name = "identificaUserPasswordResponse")
public class IdentificaUserPasswordResponse {

    protected Identita identificaUserPasswordReturn;

    /**
     * Recupera il valore della proprietÓ identificaUserPasswordReturn.
     * 
     * @return
     *     possible object is
     *     {@link Identita }
     *     
     */
    public Identita getIdentificaUserPasswordReturn() {
        return identificaUserPasswordReturn;
    }

    /**
     * Imposta il valore della proprietÓ identificaUserPasswordReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link Identita }
     *     
     */
    public void setIdentificaUserPasswordReturn(Identita value) {
        this.identificaUserPasswordReturn = value;
    }

}
