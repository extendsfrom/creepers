package creeper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import creeper.model.User;
import creeper.service.impl.UserService;

@Controller
@RequestMapping("/user/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("register")
	public String register(User user) {
		int result = userService.insertUser(user);
		if(result != 0) {
			return "success";
		} else {
			return "error";
		}
	}
	@RequestMapping("toBackIndex")
	public ModelAndView toBackIndex() {
		return new ModelAndView("back/backIndex");
	}

	@RequestMapping("testTran")
	public void testTran() {
		User user = new User();
		user.setUsername("123");
		user.setPassword("123");
		userService.insertUser1(user);
	}
	
	
	
	
	
}
