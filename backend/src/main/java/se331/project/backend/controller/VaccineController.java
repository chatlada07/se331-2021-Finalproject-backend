package se331.project.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import se331.project.backend.entity.Event;
import se331.project.backend.entity.Vaccine;
import se331.project.backend.service.VaccineService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
public class VaccineController {
     List<Event> VaccineList;

     @PostConstruct
    public void init() {
         vaccineList = new ArrayList<>();
         vaccineList.add(Vaccine.builder()
                    .id(001)
                    .name("Supawich")
                    .surname("Chata")
                    .age("21")
                    .hometown("ChiangMai")
                    .firstdoes("mRNA")
                    .seconddose("Pfizer")
                    .build());
     }



}
