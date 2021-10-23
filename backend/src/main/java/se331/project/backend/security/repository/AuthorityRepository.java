package se331.project.backend.security.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import se331.project.backend.security.entity.Authority;
import se331.project.backend.security.entity.AuthorityName;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    Authority findByName(AuthorityName input);
}
