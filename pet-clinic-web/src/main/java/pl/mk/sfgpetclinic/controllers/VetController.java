package pl.mk.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mk.sfgpetclinic.services.VetService;

/**
 * @author Mariusz Kowalczuk
 */
@Controller
public class VetController {

    private VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"vets/index", "vets", "vets/index.html", "vets/"})
    public String listVets(Model model){
        model.addAttribute("vets", vetService.findAll());

        return "vets/index";

    }
}
