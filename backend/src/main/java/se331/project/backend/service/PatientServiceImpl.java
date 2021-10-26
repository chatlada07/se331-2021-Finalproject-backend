package se331.project.backend.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.project.backend.entity.Patient;

public class PatientServiceImpl implements PatientService{
    @Override
    public Page<Patient> getPatients(Integer pageSize, Integer page) {
        return null;
    }

    @Override
    public Patient getPatient(Long id) {
        return null;
    }

    @Override
    public Patient save(Patient patient) {
        return patient;
    }

    @Override
    public Page<Patient> getPatients(String title, Pageable pageable) {
        return null;
    }
}
