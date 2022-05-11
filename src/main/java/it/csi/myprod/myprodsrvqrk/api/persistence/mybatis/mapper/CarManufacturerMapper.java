package it.csi.myprod.myprodsrvqrk.api.persistence.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import it.csi.myprod.myprodsrvqrk.api.dto.CarManufacturer;
import it.csi.myprod.myprodsrvqrk.api.dto.CarModel;

@Mapper
public interface CarManufacturerMapper {
    @Select("SELECT code, name FROM testqrk.car_manufacturer")
    @Results({
        @Result(column = "code", property = "code", jdbcType = JdbcType.VARCHAR, id = true),
        @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR, id = false)
    })
    List<CarManufacturer> findAll();

    @Select("SELECT code, name FROM testqrk.car_manufacturer")
    @Results({
        @Result(column = "code", property = "code", jdbcType = JdbcType.VARCHAR, id = true),
        @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR, id = false),
        @Result(property = "models", javaType = List.class, 
        column = "code",
        many=@Many(select = "findModelsForManufacturer"))
    })
    List<CarManufacturer> findAllWithDetails();


    @Select("SELECT code, name FROM testqrk.car_manufacturer_car_model r, testqrk.car_model m WHERE r.models_code = m.code AND r.carmanufacturerentity_code = #{manufCode}")
    @Results({
        @Result(column = "code", property = "code", jdbcType = JdbcType.VARCHAR, id = true),
        @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR, id = false)
    })
    CarModel findModelsForManufacturer(String manufCode);

    @Insert("INSERT INTO testqrk.car_manufacturer (code, name) VALUES (#{code}, #{name})")
	void insert(CarManufacturer manuf);

    @Delete("DELETE FROM testqrk.car_manufacturer WHERE code = #{code}")
    void delete(String code);
    

}
