
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
 *         &lt;element name="isIdentitaAutenticaReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "isIdentitaAutenticaReturn"
})
@XmlRootElement(name = "isIdentitaAutenticaResponse")
public class IsIdentitaAutenticaResponse {

    protected boolean isIdentitaAutenticaReturn;

    /**
     * Recupera il valore della proprietà isIdentitaAutenticaReturn.
     * 
     */
    public boolean isIsIdentitaAutenticaReturn() {
        return isIdentitaAutenticaReturn;
    }

    /**
     * Imposta il valore della proprietà isIdentitaAutenticaReturn.
     * 
     */
    public void setIsIdentitaAutenticaReturn(boolean value) {
        this.isIdentitaAutenticaReturn = value;
    }

}
