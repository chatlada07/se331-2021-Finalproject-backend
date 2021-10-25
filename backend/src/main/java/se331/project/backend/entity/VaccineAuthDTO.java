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
public class VaccineAuthDTO {
    Long id;
    String name;
    String surname;
    List<String> authorities;
}
