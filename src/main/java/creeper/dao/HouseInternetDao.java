package creeper.dao;

import org.springframework.stereotype.Repository;

import creeper.model.HouseInternet;

/**
 * @ClassName: HouseInternetDao
 * @Description: 房屋网络信息s信息
 * @date 2015年9月20日 下午1:15:05
 * @author 小银龙
 */
@Repository
public interface HouseInternetDao {
	/**
	 * 添加图片信息
	 * @Title: insertHouseInternet
	 * @Description: 
	 * @param @param house
	 * @param @return
	 * @return int 
	 * @throws
	 * @author 小银龙
	 * @2015年10月31日 上午11:45:06
	 */
	public int insertHouseInternet(HouseInternet houseInternet);
}
