package creeper.dao;

import org.springframework.stereotype.Repository;

import creeper.model.User;

/**
 * @ClassName: UserDao
 * @Description: 房屋信息
 * @date 2015年9月20日 下午1:15:05
 * @author 小银龙
 */
@Repository
public interface UserDao {
	/**
	 * @Title: insertUser
	 * @Description: 添加用户信息
	 * @param @param user
	 * @param @return
	 * @return int 
	 * @throws
	 * @author 小银龙
	 * @2015年9月20日 下午1:15:52
	 */
	public int insertUser(User user);
}
