package it.csi.myprod.myprodsrvqrk.api.persistence.jpa.mapper;

import it.csi.myprod.myprodsrvqrk.api.dto.CarModel;
import it.csi.myprod.myprodsrvqrk.api.persistence.jpa.entity.CarModelEntity;

public class CarModelJpaMapper {
    public static CarModel fromDB(CarModelEntity src, boolean recursive){
        CarModel tgt = new CarModel();
        tgt.setCode(src.getCode());
        tgt.setName(src.getName());
        if(recursive){
            ///
        }
        return tgt;
    }


	public static CarModelEntity toDB(CarModel src, boolean recursive) {
        CarModelEntity tgt = new CarModelEntity();
        tgt.setCode(src.getCode());
        tgt.setName(src.getName());
        if(recursive){
            ///
        }
        return tgt;
	}
}
