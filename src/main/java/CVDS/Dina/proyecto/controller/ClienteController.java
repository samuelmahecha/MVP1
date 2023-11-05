package CVDS.Dina.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import CVDS.Dina.proyecto.service.ClienteService;

@Controller
public class ClienteController {
    
    @Autowired
    ClienteService clienteService;

    @GetMapping("/prueba")
    public String cargarDatos(){
        return "index";
    }
}
