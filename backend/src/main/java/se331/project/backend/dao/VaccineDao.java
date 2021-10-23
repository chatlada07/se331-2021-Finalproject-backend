package se331.project.backend.dao;

import se331.project.backend.entity.Vaccine;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface VaccineDao {
    Page<Vaccine> getVaccines()
}
