
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
 *         &lt;element name="isPersonaAutorizzataInUseCaseReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "isPersonaAutorizzataInUseCaseReturn"
})
@XmlRootElement(name = "isPersonaAutorizzataInUseCaseResponse")
public class IsPersonaAutorizzataInUseCaseResponse {

    protected boolean isPersonaAutorizzataInUseCaseReturn;

    /**
     * Recupera il valore della proprietÓ isPersonaAutorizzataInUseCaseReturn.
     * 
     */
    public boolean isIsPersonaAutorizzataInUseCaseReturn() {
        return isPersonaAutorizzataInUseCaseReturn;
    }

    /**
     * Imposta il valore della proprietÓ isPersonaAutorizzataInUseCaseReturn.
     * 
     */
    public void setIsPersonaAutorizzataInUseCaseReturn(boolean value) {
        this.isPersonaAutorizzataInUseCaseReturn = value;
    }

}
