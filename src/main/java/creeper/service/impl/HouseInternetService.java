package creeper.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import creeper.dao.HouseInternetDao;
import creeper.model.HouseInternet;

@Service
public class HouseInternetService{
	
	@Autowired
	private HouseInternetDao houseInternetDao;
	
	public int insertHouseInternet(HouseInternet houseInternet) {
		return houseInternetDao.insertHouseInternet(houseInternet);
	}

}
