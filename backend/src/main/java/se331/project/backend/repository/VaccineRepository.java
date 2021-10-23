package se331.project.backend.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import se331.project.backend.entity.Vaccine;

import java.util.List;

public interface VaccineRepository extends JpaRepository<Vaccinec,Long> {
    List<Vaccinec> findAll();
    Page<Vaccinec> findByTitle(String title, Pageable pageRequest);
    Page<Vaccinec> findByTitleContaining(String title, Pageable pageRequest);
    Page<Vaccinec> findByTitleContainingOrDescriptionContaining(String title, String description, Pageable pageRequest);
    Page<Vaccinec> findByTitleContainingAndDescriptionContaining(String title, String description, Pageable pageRequest);
    Page<Vaccinec> findByTitleIgnoreCaseContainingOrDescriptionIgnoreCaseContainingOrOrganizer_NameIgnoreCaseContaining(String title, String description, String organizerName, Pageable pageRequest);

}
