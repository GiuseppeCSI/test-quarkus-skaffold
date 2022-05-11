
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
 *         &lt;element name="getInfoPersonaSchemaReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getInfoPersonaSchemaReturn"
})
@XmlRootElement(name = "getInfoPersonaSchemaResponse")
public class GetInfoPersonaSchemaResponse {

    protected String getInfoPersonaSchemaReturn;

    /**
     * Recupera il valore della proprietà getInfoPersonaSchemaReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetInfoPersonaSchemaReturn() {
        return getInfoPersonaSchemaReturn;
    }

    /**
     * Imposta il valore della proprietà getInfoPersonaSchemaReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetInfoPersonaSchemaReturn(String value) {
        this.getInfoPersonaSchemaReturn = value;
    }

}
