package spring.security.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.security.v1.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
