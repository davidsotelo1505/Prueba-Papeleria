package co.com.test.sincosoft.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.test.sincosoft.model.OrderUser;
import co.com.test.sincosoft.service.OrderUserService;

	@RestController
	@RequestMapping("/order")
	public class OrderUserController {
			private  OrderUserService orderUserService;
			
			@Autowired
			public OrderUserController(OrderUserService orderUserService) {
				this.orderUserService = orderUserService;
			}
			
			@RequestMapping("/delete/{id}")
			public String deleteOrderUser(@PathVariable Long id) {
				return orderUserService.deleteOrderUser(id);
			}
			
			@RequestMapping("/add")
			public OrderUser addOrderUser(@RequestBody OrderUser orderUser) {
				return orderUserService.addOrderUser(orderUser);
			}
			
			@RequestMapping("/list")
			public List<OrderUser> orderUserService(){
				return orderUserService.orderUserList();
			}
			
			@RequestMapping("/get/{id}")
			public OrderUser getOrderUser(@PathVariable Long id) {
				return orderUserService.findOne(id);
				
			
			}
			
			@RequestMapping("/getOrderByUser/{id}")
			public List<OrderUser> getAllOrdersByUser(@PathVariable Long id) {
				return orderUserService.findByUser(id);
				
			
			}
			

}