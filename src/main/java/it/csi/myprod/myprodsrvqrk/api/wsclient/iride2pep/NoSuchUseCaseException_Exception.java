
package it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.2
 * 2020-12-21T09:41:23.692+01:00
 * Generated source version: 3.3.2
 */

@WebFault(name = "fault9", targetNamespace = "http://pep.base.nmsf.csi.it/")
public class NoSuchUseCaseException_Exception extends Exception {

    private it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.NoSuchUseCaseException fault9;

    public NoSuchUseCaseException_Exception() {
        super();
    }

    public NoSuchUseCaseException_Exception(String message) {
        super(message);
    }

    public NoSuchUseCaseException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public NoSuchUseCaseException_Exception(String message, it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.NoSuchUseCaseException fault9) {
        super(message);
        this.fault9 = fault9;
    }

    public NoSuchUseCaseException_Exception(String message, it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.NoSuchUseCaseException fault9, java.lang.Throwable cause) {
        super(message, cause);
        this.fault9 = fault9;
    }

    public it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.NoSuchUseCaseException getFaultInfo() {
        return this.fault9;
    }
}
