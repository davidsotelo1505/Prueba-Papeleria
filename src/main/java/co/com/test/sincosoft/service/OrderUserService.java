package co.com.test.sincosoft.service;

import java.util.List;

import co.com.test.sincosoft.model.OrderUser;
import co.com.test.sincosoft.model.User;

public interface OrderUserService {
	
	List<OrderUser> orderUserList();
	
	OrderUser findOne(Long id);
	
	OrderUser addOrderUser(OrderUser orderUser);
	
	String deleteOrderUser(Long id);
	
	List<OrderUser> findByUser(Long id);
	
	
	
	
}
