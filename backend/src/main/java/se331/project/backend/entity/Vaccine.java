package se331.project.backend.entity;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

//@Data
//@Builder
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
public class Vaccine {
//    @Id
//    @GeneratedValue(Strategy = GenerationType.IDENTITY)
//    @EqualsAndHashCode.Exclude
    Long id;
    String name;
    String surname;
    String age;
    String hometown;
    String firstdoes;
    String seconddose;

    //เดี่ยวมาใส่ต่อตรงนี้ งงอยุ่
//    @ManyToOne (mappedBy = "vaccine")



}
