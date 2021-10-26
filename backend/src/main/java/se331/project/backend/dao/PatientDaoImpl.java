package se331.project.backend.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se331.project.backend.entity.Patient;
import se331.project.backend.repository.PatientRepository;

@Repository
@Profile("db")
public class PatientDaoImpl implements PatientDao{

    @Autowired
    PatientRepository patientRepository;

    @Override
    public Integer getEventSize() {
        return Math.toIntExact(patientRepository.count());
    }

    @Override
    public Page<Patient> getPatients(Integer pageSize, Integer page) {
        return patientRepository.findAll(PageRequest.of(page-1,pageSize));
    }

    @Override
    public Patient getPatient(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    @Override
    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Page<Patient> getPatient(String name, Pageable page) {
        return patientRepository.findByName(name, page);
    }
}
