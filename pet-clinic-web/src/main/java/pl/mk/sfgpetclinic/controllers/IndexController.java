package pl.mk.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mariusz Kowalczuk
 */
@Controller
public class IndexController {

    @RequestMapping({"/", "","index", "index.html"})
    public String index(Model model){
        return "index";
    }
}
