package creeper.model;

/**
 * @ClassName: User
 * @Description: 用户信息
 * @date 2015年9月20日 下午1:15:20
 * @author 小银龙
 */
public class User {
	private String userId;
	private String username;
	private String password;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
