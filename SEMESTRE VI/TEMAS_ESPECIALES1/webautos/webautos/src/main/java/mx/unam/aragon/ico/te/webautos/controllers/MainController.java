package mx.unam.aragon.ico.te.webautos.controllers;
import mx.unam.aragon.ico.te.webautos.models.Auto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


// Se utiliza un patron de diseno -> Inyeccion de dependencias
@Controller
public class MainController {

    @GetMapping("/")
    public String getHome() {
        return "home";
    }

    @GetMapping("/catalogo")
    public String getCatalogo() {
        return "catalogoautos";
    }

    @GetMapping("/altaauto")
    public String getAltaauto() {
        return "alta";
    }

    @PostMapping("/ejecutarAlta")
    public String ejecutarAlta(@RequestParam Auto auto) {
        return "ejecutarAlta";
    }
}
