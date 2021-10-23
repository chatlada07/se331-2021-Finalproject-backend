package se331.project.backend.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import se331.project.backend.entity.Vaccine;

import java.util.List;

public interface VaccineRepository extends JpaRepository<Vaccine,Long> {
    List<Vaccine> findAll();
    Page<Vaccine> findByTitle(String title, Pageable pageRequest);
    Page<Vaccine> findByTitleContaining(String title, Pageable pageRequest);
    Page<Vaccine> findByTitleContainingOrDescriptionContaining(String title, String description, Pageable pageRequest);
    Page<Vaccine> findByTitleContainingAndDescriptionContaining(String title, String description, Pageable pageRequest);
    Page<Vaccine> findByTitleIgnoreCaseContainingOrDescriptionIgnoreCaseContainingOrOrganizer_NameIgnoreCaseContaining(String title, String description, String organizerName, Pageable pageRequest);

}
