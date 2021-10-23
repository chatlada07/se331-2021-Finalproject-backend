package se331.project.backend.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import se331.project.backend.repository.VaccineRepository;

@Repository
public class VaccineDaolmpl implements VaccineDao {
    @Autowired
    VaccineRepository vaccineRepository;

    //Method

}
