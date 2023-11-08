package CVDS.Dina.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import CVDS.Dina.proyecto.model.Cliente;
import CVDS.Dina.proyecto.service.ClienteService;

@Controller
public class ClienteController {
    
    @Autowired
    ClienteService clienteService;

    @GetMapping("/prueba")
    public String cargarDatos(){
        return "index";
    }
    @GetMapping("/crearcuenta")
    public String crearCuenta(){
        return "creacion";
    }
    @RequestMapping(value="/crearcuenta", method = RequestMethod.POST)
    public String asignarCuenta(String fname, String lname, String nickname,String pass, String comidaPreferida1, String comidaPreferida2, String comidaPreferida3){
        Cliente cliente = new Cliente(fname, lname);
        cliente.setNickname(nickname);
        cliente.setPassword(pass);
        cliente.setComidaPreferidaUno(comidaPreferida1);
        cliente.setComidaPreferidaDos(comidaPreferida2);
        cliente.setComidaPreferidaTres(comidaPreferida3);
        clienteService.addCliente(cliente);
        return "creacion";
    }
}
