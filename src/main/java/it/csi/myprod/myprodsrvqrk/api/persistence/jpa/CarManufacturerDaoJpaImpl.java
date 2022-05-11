package it.csi.myprod.myprodsrvqrk.api.persistence.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;

import it.csi.myprod.myprodsrvqrk.api.dto.CarManufacturer;
import it.csi.myprod.myprodsrvqrk.api.persistence.CarManufacturerDao;
import it.csi.myprod.myprodsrvqrk.api.persistence.DAOException;
import it.csi.myprod.myprodsrvqrk.api.persistence.jpa.entity.CarManufacturerEntity;
import it.csi.myprod.myprodsrvqrk.api.persistence.jpa.mapper.CarManufacturerJpaMapper;
import it.csi.myprod.myprodsrvqrk.utils.Constants;

@ApplicationScoped
public class CarManufacturerDaoJpaImpl implements CarManufacturerDao {
    Logger log = Logger.getLogger(Constants.COD_COMPONENTE);

    @Transactional
    public List<CarManufacturer> getAll(boolean details) {
        List<CarManufacturerEntity> manufacturersFromDB = (List<CarManufacturerEntity>) em
                .createQuery("SELECT manuf FROM CarManufacturerEntity manuf").getResultList();
        List<CarManufacturer> manufacturers = new ArrayList<CarManufacturer>();
        for (CarManufacturerEntity currManufacturerEntity : manufacturersFromDB) {
            CarManufacturer currManuf = CarManufacturerJpaMapper.fromDB(currManufacturerEntity, details);
            manufacturers.add(currManuf);
        }
        return manufacturers;
    }

    @Inject
    EntityManager em;

    @Override
    @Transactional
    public CarManufacturer insertManufacturer(CarManufacturer manuf) throws DAOException {
        CarManufacturerEntity manufEntity = CarManufacturerJpaMapper.toDB(manuf, true);
        em.persist(manufEntity);
        return manuf;
    }

    @Override
    @Transactional
    public void deleteManufacturer(String code) throws DAOException {
        CarManufacturerEntity manuf= em.find(CarManufacturerEntity.class, code);
        if (manuf != null){
            em.remove(manuf);
        }
        else{
            throw new DAOException();
        }
        
    }
}
