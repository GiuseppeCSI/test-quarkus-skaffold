package it.csi.myprod.myprodsrvqrk.api.persistence.mybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import it.csi.myprod.myprodsrvqrk.api.dto.CarModel;

@Mapper
public interface CarModelMapper {

    @Insert("INSERT INTO testqrk.car_model (code, name) VALUES (#{code}, #{name})")
    public void insertModel(CarModel model);

    @Insert("INSERT INTO testqrk.car_manufacturer_car_model (carmanufacturerentity_code, models_code) VALUES (#{manufCode}, #{modelCode})")
    public void attachModelToManufacturer(String modelCode, String manufCode);
}
