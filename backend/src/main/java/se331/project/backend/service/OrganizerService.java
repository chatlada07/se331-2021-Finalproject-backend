package se331.project.backend.service;

import org.springframework.data.domain.Page;
import se331.project.backend.entity.Organizer;

import java.util.List;

public interface OrganizerService {
    List<Organizer> getAllOrganizer();
    Page<Organizer> getOrganizer(Integer page, Integer pageSize);
}
