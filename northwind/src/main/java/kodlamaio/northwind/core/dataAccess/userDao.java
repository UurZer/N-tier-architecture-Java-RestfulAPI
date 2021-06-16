package kodlamaio.northwind.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.core.entities.User;

public interface userDao extends JpaRepository<User, Integer> {

	User findByEmail(String email);
}
