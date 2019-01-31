package co.com.test.sincosoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.test.sincosoft.model.User;
import co.com.test.sincosoft.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
	private  UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteUser(@PathVariable Long id) {
		return userService.deleteUser(id);
	}
	
	@RequestMapping("/add")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@RequestMapping("/list")
	public List<User> userService(){
		return userService.userList();
	}
	
	@RequestMapping("/get/{id}")
	public User getUser(@PathVariable Long id) {
		
		return userService.findOne(id);
	}
}
