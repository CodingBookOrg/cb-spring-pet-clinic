package org.cb.spring.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"pet"})
public class PetController {
    @RequestMapping({"", "index.html"})
    public String list() {
        return "pet/index";
    }
}
