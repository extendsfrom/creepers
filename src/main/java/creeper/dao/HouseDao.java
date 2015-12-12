package creeper.dao;

import org.springframework.stereotype.Repository;

import creeper.model.House;

/**
 * @ClassName: HouseDao
 * @Description: 房屋信息
 * @date 2015年9月20日 下午1:15:05
 * @author 小银龙
 */
@Repository
public interface HouseDao {
	/**
	 * 添加房屋信息
	 * @Title: insertHouse
	 * @Description: 
	 * @param @param house
	 * @param @return
	 * @return int 
	 * @throws
	 * @author 小银龙
	 * @2015年10月31日 上午11:45:06
	 */
	public int insertHouse(House house);
}
