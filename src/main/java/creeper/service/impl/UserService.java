package creeper.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import creeper.dao.UserDao;
import creeper.model.User;

@Service
public class UserService{
	
	@Autowired
	private UserDao userDao;
	
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

	public int insertUser1(User user) {
		userDao.insertUser(user);
		int i = 1/0;
		return userDao.insertUser(user);
	}

}
