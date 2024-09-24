package es.pildoras.proyecto1.Proyecto1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MIRestController {

    @GetMapping("/")
    public String saludo(){
        return "index";
    }

    @GetMapping("/info")
    public String informacion(){
        return "Esta es la web de los mejores programadores del mundo mundial";
    }


}
