package it.csi.myprod.myprodsrvqrk.api.impl;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.log4j.Logger;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.faulttolerance.Timeout;
import org.eclipse.microprofile.faulttolerance.exceptions.TimeoutException;

import it.csi.myprod.myprodsrvqrk.api.ElaborationApi;
import it.csi.myprod.myprodsrvqrk.exceptions.CommunicationException;

public class ElaborationApiImpl implements ElaborationApi {

    static final Logger LOGGER = Logger.getLogger("MYPRODSRVQRK");

    @Override
    @Timeout(10000)
    @Retry(maxRetries = 1, delay = 2000, retryOn = {CommunicationException.class, TimeoutException.class})
    public Response elaborationLongGet(BigDecimal duration, BigDecimal failureRatio, SecurityContext securityContext, HttpHeaders httpHeaders,
            HttpServletRequest httpRequest) {
        LOGGER.info("[ElaborationApiImpl::elaborationLongGet()] - START");
        LOGGER.debug("Duration: " + duration);
        double failureRandom = 1 - Math.random();
        try {
            Thread.currentThread().sleep(duration.longValue());
            return Response.ok("OK").build();
        } catch (InterruptedException e) {
            LOGGER.error(e.getMessage(), e);
            return Response.serverError().build();
        } finally{
            LOGGER.info("[ElaborationApiImpl::elaborationLongGet()] - END");
        }
    }
    
}
