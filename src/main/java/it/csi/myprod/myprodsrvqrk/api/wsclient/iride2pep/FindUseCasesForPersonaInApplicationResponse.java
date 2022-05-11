
package it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="findUseCasesForPersonaInApplicationReturn" type="{urn:PolicyEnforcerBase.policy.entity}UseCase" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "findUseCasesForPersonaInApplicationReturn"
})
@XmlRootElement(name = "findUseCasesForPersonaInApplicationResponse")
public class FindUseCasesForPersonaInApplicationResponse {

    protected List<UseCase> findUseCasesForPersonaInApplicationReturn;

    /**
     * Gets the value of the findUseCasesForPersonaInApplicationReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the findUseCasesForPersonaInApplicationReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFindUseCasesForPersonaInApplicationReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UseCase }
     * 
     * 
     */
    public List<UseCase> getFindUseCasesForPersonaInApplicationReturn() {
        if (findUseCasesForPersonaInApplicationReturn == null) {
            findUseCasesForPersonaInApplicationReturn = new ArrayList<UseCase>();
        }
        return this.findUseCasesForPersonaInApplicationReturn;
    }

}
