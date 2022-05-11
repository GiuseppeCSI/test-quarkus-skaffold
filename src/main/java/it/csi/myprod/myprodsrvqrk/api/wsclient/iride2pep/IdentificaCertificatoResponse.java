
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
 *         &lt;element name="identificaCertificatoReturn" type="{urn:PolicyEnforcerBase.policy.entity}Identita" minOccurs="0"/&gt;
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
    "identificaCertificatoReturn"
})
@XmlRootElement(name = "identificaCertificatoResponse")
public class IdentificaCertificatoResponse {

    protected Identita identificaCertificatoReturn;

    /**
     * Recupera il valore della proprietà identificaCertificatoReturn.
     * 
     * @return
     *     possible object is
     *     {@link Identita }
     *     
     */
    public Identita getIdentificaCertificatoReturn() {
        return identificaCertificatoReturn;
    }

    /**
     * Imposta il valore della proprietà identificaCertificatoReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link Identita }
     *     
     */
    public void setIdentificaCertificatoReturn(Identita value) {
        this.identificaCertificatoReturn = value;
    }

}
