
package it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.2
 * 2020-12-21T09:41:23.687+01:00
 * Generated source version: 3.3.2
 */

@WebFault(name = "fault10", targetNamespace = "http://pep.base.nmsf.csi.it/")
public class NoSuchApplicationException_Exception extends Exception {

    private it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.NoSuchApplicationException fault10;

    public NoSuchApplicationException_Exception() {
        super();
    }

    public NoSuchApplicationException_Exception(String message) {
        super(message);
    }

    public NoSuchApplicationException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public NoSuchApplicationException_Exception(String message, it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.NoSuchApplicationException fault10) {
        super(message);
        this.fault10 = fault10;
    }

    public NoSuchApplicationException_Exception(String message, it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.NoSuchApplicationException fault10, java.lang.Throwable cause) {
        super(message, cause);
        this.fault10 = fault10;
    }

    public it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.NoSuchApplicationException getFaultInfo() {
        return this.fault10;
    }
}
