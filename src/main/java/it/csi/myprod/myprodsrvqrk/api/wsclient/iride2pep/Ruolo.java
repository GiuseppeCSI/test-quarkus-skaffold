
package it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Ruolo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Ruolo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codiceRuolo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mnemonico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codiceDominio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ruolo", namespace = "http://pep.base.nmsf.csi.it/", propOrder = {
    "codiceRuolo",
    "mnemonico",
    "codiceDominio"
})
public class Ruolo {

    @XmlElement(required = true, nillable = true)
    protected String codiceRuolo;
    @XmlElement(required = true, nillable = true)
    protected String mnemonico;
    @XmlElement(required = true, nillable = true)
    protected String codiceDominio;

    /**
     * Recupera il valore della propriet� codiceRuolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceRuolo() {
        return codiceRuolo;
    }

    /**
     * Imposta il valore della propriet� codiceRuolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceRuolo(String value) {
        this.codiceRuolo = value;
    }

    /**
     * Recupera il valore della propriet� mnemonico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnemonico() {
        return mnemonico;
    }

    /**
     * Imposta il valore della propriet� mnemonico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnemonico(String value) {
        this.mnemonico = value;
    }

    /**
     * Recupera il valore della propriet� codiceDominio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceDominio() {
        return codiceDominio;
    }

    /**
     * Imposta il valore della propriet� codiceDominio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceDominio(String value) {
        this.codiceDominio = value;
    }

}
