package pl.mk.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mariusz Kowalczuk
 */
@Controller
@RequestMapping("owners")
public class OwnerController {



    @RequestMapping({"/index", "", "/index.html", "/"})
    public String listVets(){

        return "owners/index";

    }
}
