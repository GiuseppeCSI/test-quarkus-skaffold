
package it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.2
 * 2020-12-21T09:41:23.654+01:00
 * Generated source version: 3.3.2
 */

@WebFault(name = "fault2", targetNamespace = "http://pep.base.nmsf.csi.it/")
public class InternalException_Exception extends Exception {

    private it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.InternalException fault2;

    public InternalException_Exception() {
        super();
    }

    public InternalException_Exception(String message) {
        super(message);
    }

    public InternalException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public InternalException_Exception(String message, it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.InternalException fault2) {
        super(message);
        this.fault2 = fault2;
    }

    public InternalException_Exception(String message, it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.InternalException fault2, java.lang.Throwable cause) {
        super(message, cause);
        this.fault2 = fault2;
    }

    public it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.InternalException getFaultInfo() {
        return this.fault2;
    }
}
