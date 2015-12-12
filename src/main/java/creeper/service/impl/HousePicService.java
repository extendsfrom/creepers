package creeper.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import creeper.dao.HousePicDao;
import creeper.model.HousePic;

@Service
public class HousePicService{
	
	@Autowired
	private HousePicDao housePicDao;
	
	public int insertHousePic(HousePic housePic) {
		return housePicDao.insertHousePic(housePic);
	}

}
