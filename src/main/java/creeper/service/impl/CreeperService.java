package creeper.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import creeper.dao.HouseDao;
import creeper.dao.HouseInternetDao;
import creeper.dao.HousePicDao;
import creeper.dao.PlotDao;
import creeper.model.House;
import creeper.model.HouseInternet;
import creeper.model.HousePic;
import creeper.model.Plot;

@Service
public class CreeperService{
	
	@Autowired
	private HouseDao houseDao;
	@Autowired
	private PlotDao plotDao;
	@Autowired
	private HousePicDao housePicDao;
	@Autowired
	private HouseInternetDao houseInternetDao;
	
	public boolean saveInternetContent(List<Map<String, String>> internetContent) {
		if(null == internetContent || internetContent.size() == 0) {
			return false;
		}
		for(Map<String, String> item : internetContent) {
			Plot plot = new Plot();
			plot.setcPlotName(item.get("cPlotName"));
			plotDao.insertPlot(plot);

			House house = new House();
			house.setiPrice(new BigDecimal(item.get("cPrice")).longValue());
			house.setcHouseName(item.get("cHouseName"));
			house.setcHouseStyle(item.get("cHouseStyle"));
			house.setcToward(item.get("cToward"));
			house.setcFloor(item.get("cFloor"));
			house.setcAddress(item.get("cAddress"));
			house.setcPlotId(plot.getCid());
			house.setcHouseType(item.get("cHouseType"));
			house.setiHouseSpace(new BigDecimal(Long.parseLong(item.get("iHouseSpace"))).longValue());
			house.setcBuildYear(item.get("cBuildYear"));
			house.setcNearSchoolId("");
			house.setcNearSubwayId("");
			house.setcNearSchoolDesc(item.get("cNearSchoolDesc"));
			house.setcNearSubwayDesc(item.get("cNearSubwayDesc"));
			house.setcTaxFree(item.get("cTaxFree"));
			house.setcIsUnique(item.get("cIsUnique"));
			item.remove("cid");
			house.setCreateTime(new Date());
			houseDao.insertHouse(house);
			
			if(null != item.get("cPicPath")) {
				for(String picPath : item.get("cPicPath").split(";")) {
					HousePic housePic = new HousePic();
					housePic.setcHouseId(house.getCid());
					housePic.setcEnable("1");
					housePic.setcHousePicPath(picPath);
					housePic.setCreateTime(new Date());
					housePicDao.insertHousePic(housePic);
				}
			}
			
			HouseInternet houseInternet = new HouseInternet();
			houseInternet.setcHouseId(house.getCid());
			houseInternet.setcInternetContent(item.toString());
			houseInternet.setCreateTime(new Date());
			houseInternetDao.insertHouseInternet(houseInternet);
		}
		return true;
	}
}
