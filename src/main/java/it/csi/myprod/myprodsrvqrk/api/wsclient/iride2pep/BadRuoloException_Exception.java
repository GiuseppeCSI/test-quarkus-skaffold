
package it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.2
 * 2020-12-21T09:41:23.668+01:00
 * Generated source version: 3.3.2
 */

@WebFault(name = "fault11", targetNamespace = "http://pep.base.nmsf.csi.it/")
public class BadRuoloException_Exception extends Exception {

    private it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.BadRuoloException fault11;

    public BadRuoloException_Exception() {
        super();
    }

    public BadRuoloException_Exception(String message) {
        super(message);
    }

    public BadRuoloException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public BadRuoloException_Exception(String message, it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.BadRuoloException fault11) {
        super(message);
        this.fault11 = fault11;
    }

    public BadRuoloException_Exception(String message, it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.BadRuoloException fault11, java.lang.Throwable cause) {
        super(message, cause);
        this.fault11 = fault11;
    }

    public it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.BadRuoloException getFaultInfo() {
        return this.fault11;
    }
}
