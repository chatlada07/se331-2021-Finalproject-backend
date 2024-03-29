package se331.project.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VaccineOwnEventsDTO {
    Long id;
    String name;
    String surname;
    String age;
    String hometown;
    String firstdoes;
    String seconddose;
    List<Participant> participantList;
}
