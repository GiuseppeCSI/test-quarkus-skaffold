package it.csi.myprod.myprodsrvqrk.api.persistence.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car_model_variant")
public class CarModelVariantEntity {
    private String code;
    private int doors;
    private float enginePower;
    private EngineTypes engineType;

    @Id
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public float getEnginePower() {
        return enginePower;
    }
    public void setEnginePower(float enginePower) {
        this.enginePower = enginePower;
    }
    public EngineTypes getEngineType() {
        return engineType;
    }
    public void setEngineType(EngineTypes engineType) {
        this.engineType = engineType;
    }
}
