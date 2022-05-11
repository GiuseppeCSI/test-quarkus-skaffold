package it.csi.myprod.myprodsrvqrk.api.persistence.jpa.mapper;

import java.util.ArrayList;
import java.util.List;

import it.csi.myprod.myprodsrvqrk.api.dto.CarManufacturer;
import it.csi.myprod.myprodsrvqrk.api.dto.CarModel;
import it.csi.myprod.myprodsrvqrk.api.persistence.jpa.entity.CarManufacturerEntity;
import it.csi.myprod.myprodsrvqrk.api.persistence.jpa.entity.CarModelEntity;

public class CarManufacturerJpaMapper {
    public static CarManufacturer fromDB(CarManufacturerEntity src, boolean recursive){
       CarManufacturer tgt = new CarManufacturer();
       tgt.setCode(src.getCode());
       tgt.setName(src.getName());
       if(recursive){
           List<CarModelEntity> srcModels = src.getModels();
           List<CarModel> tgtModels = new ArrayList<CarModel>();
           for (CarModelEntity carModelEntity : srcModels) {
               CarModel currTgtModel = CarModelJpaMapper.fromDB(carModelEntity, recursive);
                tgtModels.add(currTgtModel);
           }
           tgt.setModels(tgtModels);
       }
       return tgt;
    }

    public static CarManufacturerEntity toDB(CarManufacturer src, boolean recursive){
        CarManufacturerEntity tgt = new CarManufacturerEntity();
        tgt.setCode(src.getCode());
        tgt.setName(src.getName());
        if(recursive){
            List<CarModel> srcModels = src.getModels();
            List<CarModelEntity> tgtModels = new ArrayList<CarModelEntity>();
            for (CarModel carModel : srcModels) {
                CarModelEntity currTgtModelEntity = CarModelJpaMapper.toDB(carModel, recursive);
                 tgtModels.add(currTgtModelEntity);
            }
            tgt.setModels(tgtModels);
        }
        return tgt;
    }
}
