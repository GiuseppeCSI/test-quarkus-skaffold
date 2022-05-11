/**********************************************
 * CSI PIEMONTE 
 **********************************************/
package it.csi.myprod.myprodsrvqrk.api;

import it.csi.myprod.myprodsrvqrk.api.dto.*;


import it.csi.myprod.myprodsrvqrk.api.dto.CarManufacturer;
import it.csi.myprod.myprodsrvqrk.api.dto.Error;

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

@Path("/manufacturers")




public interface ManufacturersApi  {
   
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })

    public Response createManufacturer( CarManufacturer manufacturer,@HeaderParam("persistenceType") String persistenceType,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @DELETE
    @Path("/{manufacturer}")
    
    @Produces({ "application/json" })

    public Response deleteManufacturer( @PathParam("manufacturer") String manufacturer, @QueryParam("details") Boolean details,@HeaderParam("persistenceType") String persistenceType,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @GET
    @Path("/{manufacturer}")
    
    @Produces({ "application/json" })

    public Response getManufacturer( @PathParam("manufacturer") String manufacturer, @QueryParam("details") Boolean details,@HeaderParam("persistenceType") String persistenceType,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @GET
    
    
    @Produces({ "application/json" })

    public Response getManufacturers( @QueryParam("details") Boolean details,@HeaderParam("persistenceType") String persistenceType,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
    @GET
    @Path("/{manufacturer}/models")
    
    @Produces({ "application/json" })

    public Response getModels( @PathParam("manufacturer") String manufacturer, @QueryParam("details") Boolean details,@HeaderParam("persistenceType") String persistenceType,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
}
