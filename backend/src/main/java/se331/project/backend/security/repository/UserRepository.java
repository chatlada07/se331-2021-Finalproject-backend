package se331.project.backend.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se331.project.backend.security.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
