package se331.project.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se331.project.backend.entity.Organizer;

public interface OrganizerRepository extends JpaRepository<Organizer,Long> {
}
