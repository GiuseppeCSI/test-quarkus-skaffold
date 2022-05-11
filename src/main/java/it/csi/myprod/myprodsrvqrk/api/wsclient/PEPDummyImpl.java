package it.csi.myprod.myprodsrvqrk.api.wsclient;

import java.util.List;

import javax.jws.WebService;


import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Actor;
import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Application;
import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.AuthException_Exception;
import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.BadRuoloException_Exception;
import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.CertOutsideValidityException_Exception;
import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.CertRevokedException_Exception;
import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.IdProviderNotFoundException_Exception;
import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Identita;
import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.IdentitaNonAutenticaException_Exception;
import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.InternalException_Exception;
import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.MalformedUsernameException_Exception;
import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.NoSuchApplicationException_Exception;
import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.NoSuchUseCaseException_Exception;
import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.PolicyEnforcerBase;
import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Ruolo;
import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.SystemException_Exception;
import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.UnrecoverableException_Exception;
import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.UseCase;


/**
 * servizio fittizio agiunto come workaround al problema descritto in 
 * https://github.com/quarkiverse/quarkiverse-cxf/issues/93
 * legato alla v. 0.3 di quarkiverse/cxf
 */
@WebService(endpointInterface = "it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.PolicyEnforcerBase")
public class PEPDummyImpl implements PolicyEnforcerBase {

    @Override
    public boolean isPersonaInRuolo(Identita in0, Ruolo in1)
            throws InternalException_Exception, SystemException_Exception, BadRuoloException_Exception,
            UnrecoverableException_Exception, IdentitaNonAutenticaException_Exception {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Actor> findActorsForPersonaInUseCase(Identita in0, UseCase in1)
            throws InternalException_Exception, NoSuchApplicationException_Exception, NoSuchUseCaseException_Exception,
            SystemException_Exception, UnrecoverableException_Exception, IdentitaNonAutenticaException_Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Identita identificaUserPassword(String in0, String in1) throws InternalException_Exception,
            IdProviderNotFoundException_Exception, MalformedUsernameException_Exception, AuthException_Exception,
            SystemException_Exception, UnrecoverableException_Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Identita identificaUserPasswordPIN(String in0, String in1, String in2) throws InternalException_Exception,
            IdProviderNotFoundException_Exception, MalformedUsernameException_Exception, AuthException_Exception,
            SystemException_Exception, UnrecoverableException_Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Ruolo> findRuoliForPersonaInUseCase(Identita in0, UseCase in1)
            throws InternalException_Exception, NoSuchApplicationException_Exception, NoSuchUseCaseException_Exception,
            SystemException_Exception, UnrecoverableException_Exception, IdentitaNonAutenticaException_Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Ruolo> findRuoliForPersonaInApplication(Identita in0, Application in1)
            throws InternalException_Exception, SystemException_Exception, NoSuchApplicationException_Exception,
            UnrecoverableException_Exception, IdentitaNonAutenticaException_Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Actor> findActorsForPersonaInApplication(Identita in0, Application in1)
            throws InternalException_Exception, SystemException_Exception, NoSuchApplicationException_Exception,
            UnrecoverableException_Exception, IdentitaNonAutenticaException_Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isPersonaAutorizzataInUseCase(Identita in0, UseCase in1)
            throws InternalException_Exception, NoSuchApplicationException_Exception, NoSuchUseCaseException_Exception,
            SystemException_Exception, UnrecoverableException_Exception, IdentitaNonAutenticaException_Exception {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<UseCase> findUseCasesForPersonaInApplication(Identita in0, Application in1)
            throws InternalException_Exception, SystemException_Exception, NoSuchApplicationException_Exception,
            UnrecoverableException_Exception, IdentitaNonAutenticaException_Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getInfoPersonaSchema(Ruolo in0) throws InternalException_Exception, SystemException_Exception,
            BadRuoloException_Exception, UnrecoverableException_Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getInfoPersonaInUseCase(Identita in0, UseCase in1)
            throws InternalException_Exception, NoSuchApplicationException_Exception, NoSuchUseCaseException_Exception,
            SystemException_Exception, UnrecoverableException_Exception, IdentitaNonAutenticaException_Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Identita identificaCertificato(byte[] in0)
            throws InternalException_Exception, IdProviderNotFoundException_Exception, SystemException_Exception,
            CertOutsideValidityException_Exception, UnrecoverableException_Exception, CertRevokedException_Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isIdentitaAutentica(Identita in0)
            throws InternalException_Exception, SystemException_Exception, UnrecoverableException_Exception {
        // TODO Auto-generated method stub
        return false;
    }
    
}
