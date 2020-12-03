package org.cb.spring.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"vets"})
public class VetsController {

    @RequestMapping({ "/", "/index.html"})
    public String list() {
        return "vets/index";
    }
}
