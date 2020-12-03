package org.cb.spring.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"owner"})
public class OwnerController {
    @RequestMapping({"/", "index.html"})
    public String list() {
        return "owner/index";
    }
}
