/***********************************************
 * CSI PIEMONTE 
 *************************************************/
package it.csi.myprod.myprodsrvqrk.api;

import it.csi.myprod.myprodsrvqrk.api.dto.*;


import java.math.BigDecimal;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/elaboration")




public interface ElaborationApi  {
   
    @GET
    @Path("/long")
    
    

    public Response elaborationLongGet( @QueryParam("duration") BigDecimal duration, @QueryParam("failureRatio") BigDecimal failureRatio,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
}
