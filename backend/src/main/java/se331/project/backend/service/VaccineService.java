package se331.project.backend.service;

import se331.project.backend.entity.Vaccine;

import java.util.List;

public interface VaccineService {
    Integer getVaccineSize();
    List<Vaccine> getVaccines(Integer pageSize, Integer page);
    Vaccine getVaccine(Long id);

}
