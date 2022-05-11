package it.csi.myprod.myprodsrvqrk.api.impl;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.log4j.Logger;

import it.csi.myprod.myprodsrvqrk.api.ManufacturersApi;
import it.csi.myprod.myprodsrvqrk.api.dto.CarManufacturer;
import it.csi.myprod.myprodsrvqrk.api.dto.Error;
import it.csi.myprod.myprodsrvqrk.api.dto.Persistencetype;
import it.csi.myprod.myprodsrvqrk.api.persistence.CarManufacturerDao;
import it.csi.myprod.myprodsrvqrk.api.persistence.DAOException;
import it.csi.myprod.myprodsrvqrk.api.persistence.jpa.CarManufacturerDaoJpaImpl;
import it.csi.myprod.myprodsrvqrk.api.persistence.mybatis.CarManufacturerMyBDaoImpl;
import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Identita;
import it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.PolicyEnforcerBase;
import it.csi.myprod.myprodsrvqrk.utils.Constants;

public class ManufacturersApiServiceImpl implements ManufacturersApi {

    Logger log = Logger.getLogger(Constants.COD_COMPONENTE);

    @Override
    public Response createManufacturer(CarManufacturer manufacturer, String persistenceType,
            SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
        log.info("[ManufacturersApiServiceImpl::createManufacturer] - START");
        try {
            getManufDao(persistenceType).insertManufacturer(manufacturer);
        } catch (DAOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Error err = new Error();
            err.setCode("500");
            log.info("[ManufacturersApiServiceImpl::createManufacturer] - END");
            return Response.serverError().entity(err).build();
        }
        log.info("[ManufacturersApiServiceImpl::createManufacturer] - END");
        return Response.ok(manufacturer).build();
    }

    @Override
    public Response getManufacturer(String manufacturer, Boolean details, String persistenceType,
            SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Response deleteManufacturer(String manufacturer, Boolean details, String persistenceType,
            SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
        log.info("[ManufacturersApiServiceImpl::deleteManufacturer] - START");
        try {
            getManufDao(persistenceType).deleteManufacturer(manufacturer);
            return Response.ok().build();
        } catch (DAOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Error err = new Error();
            err.setCode("404");
            log.info("[ManufacturersApiServiceImpl::deleteManufacturer] - END");
            return Response.status(404).entity(err).build();
        }
    }

    @Override
    public Response getManufacturers(Boolean details, String persistenceType, SecurityContext securityContext,
            HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
        log.info("[ManufacturersApiServiceImpl::getManufacturers] - START");
        List<CarManufacturer> ris = getManufDao(persistenceType).getAll(details == null ? false : details);
        log.info("[ManufacturersApiServiceImpl::getManufacturers] - END");
        return Response.ok(ris).build();
    }

    @Override
    public Response getModels(String manufacturer, Boolean details, String persistenceType,
            SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
        // TODO Auto-generated method stub
        return null;
    }

    

    ////

    private CarManufacturerDao getManufDao(String persistenceType) {
        log.info("[ManufacturersApiServiceImpl::getManufDao] - START ("+persistenceType+")");
        if (persistenceType == null || persistenceType.equals(Persistencetype.JPA.name())){
            log.info("[ManufacturersApiServiceImpl::getManufDao] - END ("+Persistencetype.JPA.name()+")");
            return this.manufJpaDao;
        }
        else {
            log.info("[ManufacturersApiServiceImpl::getManufDao] - END ("+Persistencetype.MYBATIS.name()+")");
            return this.manufMyBatisDao;
        }
    }

    @Inject
    CarManufacturerDaoJpaImpl manufJpaDao;

    @Inject
    CarManufacturerMyBDaoImpl manufMyBatisDao;

    

    
}
