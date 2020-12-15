package org.cb.spring.petclinic.controllers;

import org.cb.spring.petclinic.services.IOwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"owner"})
public class OwnerController {

    private final IOwnerService ownerService;

    public OwnerController(IOwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/", "index.html"})
    public String list(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owner/index";
    }
}
