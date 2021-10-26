package se331.project.backend.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.project.backend.entity.Patient;

public interface PatientService {
    Page<Patient> getPatients(Integer pageSize,Integer page);
    Patient getPatient(Long id);

    Patient save(Patient patient);
    Page<Patient> getPatients(String title, Pageable pageable);
}
