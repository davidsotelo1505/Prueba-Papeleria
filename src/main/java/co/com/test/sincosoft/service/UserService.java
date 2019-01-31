package co.com.test.sincosoft.service;

import java.util.List;

import co.com.test.sincosoft.model.User;

public interface UserService {
	List<User> userList();
	
	User findOne(Long id);
	
	User addUser(User user);
	
	String deleteUser(Long id);
	
}
