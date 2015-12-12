package creeper.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import creeper.dao.HouseDao;
import creeper.model.House;

@Service
public class HouseService{
	
	@Autowired
	private HouseDao houseDao;
	
	public int insertHouse(House house) {
		return houseDao.insertHouse(house);
	}

}
