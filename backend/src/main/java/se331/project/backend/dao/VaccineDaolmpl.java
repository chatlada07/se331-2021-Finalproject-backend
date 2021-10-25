package se331.project.backend.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se331.project.backend.entity.Vaccine;
import se331.project.backend.repository.VaccineRepository;

import java.util.Optional;

@Repository
public class VaccineDaolmpl implements VaccineDao {
    @Autowired
    VaccineRepository vaccineRepository;

    @Override
    public Page<Vaccine> getVaccine(Pageable pageRequest) {
        return vaccineRepository.findAll(pageRequest);
    }

    @Override
    public Optional<Vaccine> findById(Long id) {
        return vaccineRepository.findById(id);
    }

}
