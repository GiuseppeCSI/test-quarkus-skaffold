package it.csi.myprod.myprodsrvqrk.api.persistence.mybatis;

import java.util.Iterator;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import it.csi.myprod.myprodsrvqrk.api.dto.CarManufacturer;
import it.csi.myprod.myprodsrvqrk.api.dto.CarModel;
import it.csi.myprod.myprodsrvqrk.api.persistence.CarManufacturerDao;
import it.csi.myprod.myprodsrvqrk.api.persistence.DAOException;
import it.csi.myprod.myprodsrvqrk.api.persistence.mybatis.mapper.CarManufacturerMapper;
import it.csi.myprod.myprodsrvqrk.api.persistence.mybatis.mapper.CarModelMapper;

@ApplicationScoped
public class CarManufacturerMyBDaoImpl implements CarManufacturerDao {

	@Override
	public List<CarManufacturer> getAll(boolean details) {
		if (!details){
			return manufMapper.findAll();
		}
		else{
			return manufMapper.findAllWithDetails();
		}
	}

	@Inject
	CarManufacturerMapper manufMapper;

	@Inject
	CarModelMapper modelMapper;

	@Override
	@Transactional
	public CarManufacturer insertManufacturer(CarManufacturer manuf) throws DAOException {
		manufMapper.insert(manuf);
		if (manuf.getModels() != null){
			Iterator<CarModel> it = manuf.getModels().iterator();
			while(it.hasNext()){
				CarModel currModel = it.next();
				insertModel(currModel, manuf.getCode());
			}
		}
		return manuf;
	}

	public void insertModel(CarModel model, String manufCode){
		modelMapper.insertModel(model);
		modelMapper.attachModelToManufacturer(model.getCode(), manufCode);
	}

	@Override
	public void deleteManufacturer(String code) throws DAOException {
		manufMapper.delete(code);
	}
}
