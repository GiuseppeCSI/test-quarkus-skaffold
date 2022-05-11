
package it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per UseCase complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UseCase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{urn:PolicyEnforcerBase.policy.entity}Application"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UseCase", namespace = "http://pep.base.nmsf.csi.it/", propOrder = {
    "appId",
    "id"
})
public class UseCase {

    @XmlElement(required = true, nillable = true)
    protected Application appId;
    @XmlElement(required = true, nillable = true)
    protected String id;

    /**
     * Recupera il valore della propriet� appId.
     * 
     * @return
     *     possible object is
     *     {@link Application }
     *     
     */
    public Application getAppId() {
        return appId;
    }

    /**
     * Imposta il valore della propriet� appId.
     * 
     * @param value
     *     allowed object is
     *     {@link Application }
     *     
     */
    public void setAppId(Application value) {
        this.appId = value;
    }

    /**
     * Recupera il valore della propriet� id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della propriet� id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
