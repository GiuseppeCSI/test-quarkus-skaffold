
package it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AuthException complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AuthException"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:PolicyEnforcerBase.csi.wrapper}UserException"&gt;
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
@XmlType(name = "AuthException", namespace = "urn:PolicyEnforcerBase.policy.exceptions")
public class AuthException
    extends UserException
{


}
