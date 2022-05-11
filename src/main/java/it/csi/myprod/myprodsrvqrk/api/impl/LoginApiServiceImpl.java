package it.csi.myprod.myprodsrvqrk.api.impl;

import java.net.MalformedURLException;
import java.net.URL;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.xml.rpc.ServiceException;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import it.csi.iride2.policy.base.nmsf.stub.interf.PolicyEnforcerBaseService;
import it.csi.iride2.policy.base.nmsf.stub.interf.PolicyEnforcerBaseServiceLocator;
import it.csi.myprod.myprodsrvqrk.api.LoginApi;
import it.csi.myprod.myprodsrvqrk.api.dto.Credentials;
import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Identita;
import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.PolicyEnforcerBase;

public class LoginApiServiceImpl implements LoginApi {

    @Override
    public Response login(@NotNull @QueryParam("method") String method, Credentials credentials,
            SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
        System.out.println("username:" + credentials.getUsername());
        System.out.println("password:" + credentials.getPassword());
        String welcomeMessage = "cxf".equalsIgnoreCase(method)
                ? loginCxf(credentials.getUsername(), credentials.getPassword())
                : loginAxis(credentials.getUsername(), credentials.getPassword());
        if (welcomeMessage != null) {

            return Response.ok(welcomeMessage).build();
        } else {

            return Response.status(401).entity("login incorrect22222222").build();
        }
    }

    private String loginCxf(String username, String password) {
        try {
            Identita ident = pepCxf.identificaUserPassword(username, password);
            return "Benvenuto " + ident.getNome() + " " + ident.getNome()+ " (via CXF)";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @ConfigProperty(name = "quarkus.cxf.endpoint.pep.client-endpoint-url")
    String pepWSUri;

    private String loginAxis(String username, String password) {
        PolicyEnforcerBaseServiceLocator loc = new PolicyEnforcerBaseServiceLocator();
        try {
            it.csi.iride2.policy.base.nmsf.stub.interf.PolicyEnforcerBase pep =  loc.getPolicyEnforcerBase(
                    new URL(pepWSUri));
            it.csi.iride2.policy.base.nmsf.stub.base.entity.Identita ident = pep.identificaUserPassword(username, password);
            return "Benvenuto "+ident.getNome()+" "+ident.getCognome()+" (via AXIS)";
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        } 
    }
    @Inject
    PolicyEnforcerBase pepCxf;
}

