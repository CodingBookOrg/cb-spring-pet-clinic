package org.cb.spring.petclinic.controllers;

import org.cb.spring.petclinic.services.IVetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"vet"})
public class VetController {

    private final IVetService vetService;

    public VetController(IVetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({ "/", "/index.html"})
    public String list(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vet/index";
    }
}
