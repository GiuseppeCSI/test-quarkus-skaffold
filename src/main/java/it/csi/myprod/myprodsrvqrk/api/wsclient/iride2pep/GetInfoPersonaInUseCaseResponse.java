
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
 *         &lt;element name="getInfoPersonaInUseCaseReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getInfoPersonaInUseCaseReturn"
})
@XmlRootElement(name = "getInfoPersonaInUseCaseResponse")
public class GetInfoPersonaInUseCaseResponse {

    protected String getInfoPersonaInUseCaseReturn;

    /**
     * Recupera il valore della proprietà getInfoPersonaInUseCaseReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetInfoPersonaInUseCaseReturn() {
        return getInfoPersonaInUseCaseReturn;
    }

    /**
     * Imposta il valore della proprietà getInfoPersonaInUseCaseReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetInfoPersonaInUseCaseReturn(String value) {
        this.getInfoPersonaInUseCaseReturn = value;
    }

}
