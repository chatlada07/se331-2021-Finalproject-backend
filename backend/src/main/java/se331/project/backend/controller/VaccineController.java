package se331.project.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se331.project.backend.service.VaccineService;
import se331.project.backend.util.LabMapper;



@Controller
public class VaccineController {

     @Autowired
     VaccineService vaccineService;
     @GetMapping("/vaccines")
     ResponseEntity<?> getVaccines(){
          return ResponseEntity.ok(LabMapper.INSTANCE.getOrganizerDTO(vaccineService.getAllVaccine()));
     }

//     @PostConstruct
//    public void init() {
//         vaccineList = new ArrayList<>();
//         vaccineList.add(Vaccine.builder()
//                    .id(001L)
//                    .name("Paii")
//                    .surname("Chata")
//                    .age("21")
//                    .hometown("ChiangMai")
//                    .firstdoes("mRNA")
//                    .seconddose("Pfizer")
//                    .build());
//         vaccineList.add(Vaccine.builder()
//                 .id(002L)
//                 .name("Bool")
//                 .surname("Date")
//                 .age("45")
//                 .hometown("Bangkok")
//                 .firstdoes("Sinovac")
//                 .seconddose("Sinovac")
//                 .build());
//         vaccineList.add(Vaccine.builder()
//                 .id(003L)
//                 .name("Somka")
//                 .surname("o-cha")
//                 .age("74")
//                 .hometown("Bangkok")
//                 .firstdoes("Sinovac")
//                 .seconddose("AstraZeneca")
//                 .build());
//         vaccineList.add(Vaccine.builder()
//                 .id(004L)
//                 .name("Prayut")
//                 .surname("O-cha")
//                 .age("85")
//                 .hometown("Phuket")
//                 .firstdoes("Johnson&Johnson")
//                 .seconddose("AstraZeneca")
//                 .build());
//         vaccineList.add(Vaccine.builder()
//                 .id(005L)
//                 .name("Anutin")
//                 .surname("Charnvirakul")
//                 .age("47")
//                 .hometown("Lampang")
//                 .firstdoes("Pfizer")
//                 .seconddose("AstraZeneca")
//                 .build());
//         vaccineList.add(Vaccine.builder()
//                 .id(006L)
//                 .name("Wissanu")
//                 .surname("Ngam")
//                 .age("34")
//                 .hometown("PrachinBuri")
//                 .firstdoes("Moderna")
//                 .seconddose("AstraZeneca")
//                 .build());
//         vaccineList.add(Vaccine.builder()
//                 .id(007L)
//                 .name("Chaichan")
//                 .surname("Mongkol")
//                 .age("26")
//                 .hometown("ChiangMai")
//                 .firstdoes("MOderna")
//                 .seconddose("AstraZeneca")
//                 .build());
//         vaccineList.add(Vaccine.builder()
//                 .id(07L)
//                 .name("Don")
//                 .surname("Winai")
//                 .age("43")
//                 .hometown("ChinagRai")
//                 .firstdoes("Johnson&Johnson")
//                 .seconddose("AstraZeneca")
//                 .build());
//         vaccineList.add(Vaccine.builder()
//                 .id(11L)
//                 .name("Chalermchai")
//                 .surname("don")
//                 .age("35")
//                 .hometown("Bangkok")
//                 .firstdoes("Johnson&Johnson")
//                 .seconddose("AstraZeneca")
//                 .build());
//         vaccineList.add(Vaccine.builder()
//                 .id(010L)
//                 .name("Anuphong")
//                 .surname("Chinda")
//                 .age("73")
//                 .hometown("Tak")
//                 .firstdoes("Johnson&Johnson")
//                 .seconddose("AstraZeneca")
//                 .build());


     }

