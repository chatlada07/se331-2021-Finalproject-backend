package se331.project.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se331.project.backend.entity.Participant;

public interface ParticipantRepository extends JpaRepository<Participant,Long> {
}
