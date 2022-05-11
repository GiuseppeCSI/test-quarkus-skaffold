package it.csi.myprod.myprodsrvqrk;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/myprodsrvqrk")
public class GreetingResource {

    static final Logger LOGGER = Logger.getLogger("MYPRODSRVQRK"); 
    
    @ConfigProperty(name = "greeting.message")
    private String greetingMessage;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @RolesAllowed("writer")
    public String hello() {
        LOGGER.info("[GreetingResource::hello()] - START");
        LOGGER.debug("[GreetingResource::hello()] - questo metodo non fa nulla di particolare.");
        LOGGER.info("[GreetingResource::hello()] - END");
        return greetingMessage;

    }
}