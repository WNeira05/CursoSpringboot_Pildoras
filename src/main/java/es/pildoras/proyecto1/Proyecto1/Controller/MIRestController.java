package es.pildoras.proyecto1.Proyecto1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MIRestController {

    @GetMapping("/")
    public String saludo(){
        return "Hola alumnos de Spring boot";
    }


}
