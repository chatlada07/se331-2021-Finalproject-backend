package se331.project.backend.service;

import org.springframework.data.domain.Page;
import se331.project.backend.entity.Vaccine;

import java.util.List;

public interface VaccineService {
    List<Vaccine> getAllVaccine();
    Page<Vaccine> getVaccine(Integer page, Integer pageSize);

}
