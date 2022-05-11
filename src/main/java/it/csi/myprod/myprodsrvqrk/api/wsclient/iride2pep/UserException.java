
package it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per UserException complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UserException"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:PolicyEnforcerBase.csi.wrapper}CSIException"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserException", namespace = "urn:PolicyEnforcerBase.csi.wrapper")
@XmlSeeAlso({
    InternalException.class,
    AuthException.class,
    IdProviderNotFoundException.class,
    MalformedUsernameException.class,
    IdentitaNonAutenticaException.class,
    NoSuchUseCaseException.class,
    NoSuchApplicationException.class,
    BadRuoloException.class,
    CertException.class
})
public class UserException
    extends CSIException
{


}
