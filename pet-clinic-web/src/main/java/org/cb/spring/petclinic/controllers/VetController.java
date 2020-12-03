package org.cb.spring.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"vet"})
public class VetController {

    @RequestMapping({ "/", "/index.html"})
    public String list() {
        return "vet/index";
    }
}
