package es.pildoras.proyecto1.Proyecto1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MIRestController {

    @GetMapping("/")
    public String saludo(){
        return "index";
    }


}
