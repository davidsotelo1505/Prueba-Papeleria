package co.com.test.sincosoft.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.test.sincosoft.model.OrderUser;
import co.com.test.sincosoft.model.User;

public interface OrderUserRepository extends JpaRepository<OrderUser, Long>{
	
	List<OrderUser> findByComplete(Boolean stateOrder);
	
	List<OrderUser> findByUser(User user);
	
	OrderUser findByCodeOrder(String codOrder);

}
