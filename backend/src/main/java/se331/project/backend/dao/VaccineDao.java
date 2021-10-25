package se331.project.backend.dao;

import se331.project.backend.entity.Vaccine;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface VaccineDao {
   Page<Vaccine> getVaccine(Pageable pageRequest);
   Optional<Vaccine> findById(Long id);

}
