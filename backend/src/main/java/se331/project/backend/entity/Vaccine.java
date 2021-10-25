package se331.project.backend.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import se331.project.backend.security.entity.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Vaccine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    Long id;
    String name;
    String surname;
    String age;
    String hometown;
    String firstdoes;
    String seconddose;
    @OneToMany(mappedBy = "vaccine")
    @Builder.Default
    List<Vaccine> ownVaccines = new ArrayList<>();
    @OneToOne
    User doctor, admin;



}
