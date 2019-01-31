package co.com.test.sincosoft.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.test.sincosoft.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
