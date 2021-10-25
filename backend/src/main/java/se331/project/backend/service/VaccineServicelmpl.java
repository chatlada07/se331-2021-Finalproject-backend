package se331.project.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.project.backend.dao.OrganizerDao;
import se331.project.backend.dao.VaccineDao;
import se331.project.backend.entity.Organizer;
import se331.project.backend.entity.Vaccine;

import java.util.List;

@Service
public class VaccineServicelmpl {
    @Autowired
    VaccineDao vaccineDao;
    @Override
    public List<Vaccine> getAllOrganizer() {
        return vaccineDao.getVaccine(Pageable.unpaged()).getContent();
    }

    @Override
    public Page<Vaccine> getOrganizer(Integer page, Integer pageSize) {
        return vaccineDao.getVaccine(PageRequest.of(page,pageSize));
    }
}
