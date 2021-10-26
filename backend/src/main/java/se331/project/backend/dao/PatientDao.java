package se331.project.backend.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.project.backend.entity.Patient;


public interface PatientDao {
    Integer getEventSize();
    Page<Patient> getPatients(Integer pageSize, Integer page);
    Patient getPatient(Long id);

    Patient save(Patient event);
    Page<Patient> getPatient(String name, Pageable page);
}
