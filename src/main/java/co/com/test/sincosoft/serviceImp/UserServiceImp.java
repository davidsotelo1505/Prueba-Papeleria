package co.com.test.sincosoft.serviceImp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.test.sincosoft.model.User;
import co.com.test.sincosoft.repositories.UserRepository;
import co.com.test.sincosoft.service.UserService;
@Service
public class UserServiceImp implements UserService {
	
	
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImp(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User> userList(){
		return userRepository.findAll();
	}
	
	public User findOne(Long id) {
		return userRepository.findOne(id);
	}
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	public String deleteUser(Long id) {
		userRepository.delete(id);
		return "{'message':'Usuario eliminado correctamente}";
	}
	
}
