
package it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Identita complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Identita"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="livelloAutenticazione" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="codFiscale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mac" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idProvider" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rappresentazioneInterna" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cognome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identita", namespace = "http://pep.base.nmsf.csi.it/", propOrder = {
    "nome",
    "livelloAutenticazione",
    "codFiscale",
    "timestamp",
    "mac",
    "idProvider",
    "rappresentazioneInterna",
    "cognome"
})
public class Identita {

    @XmlElement(required = true, nillable = true)
    protected String nome;
    protected int livelloAutenticazione;
    @XmlElement(required = true, nillable = true)
    protected String codFiscale;
    @XmlElement(required = true, nillable = true)
    protected String timestamp;
    @XmlElement(required = true, nillable = true)
    protected String mac;
    @XmlElement(required = true, nillable = true)
    protected String idProvider;
    @XmlElement(required = true, nillable = true)
    protected String rappresentazioneInterna;
    @XmlElement(required = true, nillable = true)
    protected String cognome;

    /**
     * Recupera il valore della propriet� nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il valore della propriet� nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Recupera il valore della propriet� livelloAutenticazione.
     * 
     */
    public int getLivelloAutenticazione() {
        return livelloAutenticazione;
    }

    /**
     * Imposta il valore della propriet� livelloAutenticazione.
     * 
     */
    public void setLivelloAutenticazione(int value) {
        this.livelloAutenticazione = value;
    }

    /**
     * Recupera il valore della propriet� codFiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodFiscale() {
        return codFiscale;
    }

    /**
     * Imposta il valore della propriet� codFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodFiscale(String value) {
        this.codFiscale = value;
    }

    /**
     * Recupera il valore della propriet� timestamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Imposta il valore della propriet� timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Recupera il valore della propriet� mac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMac() {
        return mac;
    }

    /**
     * Imposta il valore della propriet� mac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(String value) {
        this.mac = value;
    }

    /**
     * Recupera il valore della propriet� idProvider.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProvider() {
        return idProvider;
    }

    /**
     * Imposta il valore della propriet� idProvider.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProvider(String value) {
        this.idProvider = value;
    }

    /**
     * Recupera il valore della propriet� rappresentazioneInterna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRappresentazioneInterna() {
        return rappresentazioneInterna;
    }

    /**
     * Imposta il valore della propriet� rappresentazioneInterna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRappresentazioneInterna(String value) {
        this.rappresentazioneInterna = value;
    }

    /**
     * Recupera il valore della propriet� cognome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il valore della propriet� cognome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognome(String value) {
        this.cognome = value;
    }

}
