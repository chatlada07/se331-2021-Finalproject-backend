package se331.project.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import se331.project.backend.service.VaccineService;

@Controller
public class VaccineController {
    @Autowired
    VaccineService vaccineService;

    @GetMapping(" ")

}
