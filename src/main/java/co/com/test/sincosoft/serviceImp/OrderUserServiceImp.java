package co.com.test.sincosoft.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.test.sincosoft.model.Article;
import co.com.test.sincosoft.model.OrderUser;
import co.com.test.sincosoft.model.User;
import co.com.test.sincosoft.repositories.OrderUserRepository;
import co.com.test.sincosoft.service.ArticleService;
import co.com.test.sincosoft.service.OrderUserService;
import co.com.test.sincosoft.service.UserService;

@Service
public class OrderUserServiceImp implements OrderUserService {
	
	private OrderUserRepository orderUserRepository;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ArticleService articleService;
	
	@Autowired
	public OrderUserServiceImp(OrderUserRepository orderUserRepository) {
		this.orderUserRepository = orderUserRepository;
	}
	
	public List<OrderUser> orderUserList(){
		return orderUserRepository.findAll();
	}
	
	public OrderUser findOne(Long id) {
		
		return orderUserRepository.findOne(id);
	}
	
	public OrderUser addOrderUser(OrderUser orderUser) {
		User user = userService.findOne(orderUser.getUser().getId());
		Article article = articleService.findOne(orderUser.getArticle().getId());
		orderUser.setUser(user);
		orderUser.setArticle(article);
		return orderUserRepository.save(orderUser);
	}
	
	
	public String deleteOrderUser(Long id) {
		orderUserRepository.delete(id);
		return "{'message':'Pedido eliminado correctamente :v}";
	}

	@Override
	public List<OrderUser> findByUser(Long id) {
		User user = userService.findOne(id);
		return orderUserRepository.findByUser(user);
	}

	

	
//	public List<OrderUser> getAllOrdersByUser(Long id){
//		User user = userService.findOne(id);
//		return orderUserRepository.findByUser(user);
//	}
}
