package it.csi.myprod.myprodsrvqrk.api.persistence.jpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="car_manufacturer")
public class CarManufacturerEntity {
    private String code;
    private String name;
    private List<CarModelEntity> models;
    
    @Id
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModels(List<CarModelEntity> models) {
        this.models = models;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<CarModelEntity> getModels() {
        return models;
    }
}
