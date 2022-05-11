package it.csi.myprod.myprodsrvqrk.api.persistence;

import java.util.List;

import it.csi.myprod.myprodsrvqrk.api.dto.CarManufacturer;

public interface CarManufacturerDao {
    public List<CarManufacturer> getAll(boolean details);

    public CarManufacturer insertManufacturer(CarManufacturer manuf) throws DAOException;

    public void deleteManufacturer(String code) throws DAOException;
}
