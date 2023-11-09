package CVDS.Dina.proyecto.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import CVDS.Dina.proyecto.model.Alergia;
import CVDS.Dina.proyecto.model.Cliente;
import CVDS.Dina.proyecto.service.AlergiaService;
import CVDS.Dina.proyecto.service.ClienteService;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ClienteController {
    
    @Autowired
    ClienteService clienteService;

    @Autowired
    AlergiaService alergiaService;

    @GetMapping("/prueba")
    public String cargarDatos(){
        return "index";
    }
    @GetMapping("/crearcuenta")
    public String crearCuenta(){
        return "creacion";
    }
    @RequestMapping(value="/crearcuenta", method = RequestMethod.POST)
    public String asignarCuenta(String fname, String lname, String nickname,String pass, String comidaPreferida1, String comidaPreferida2, String comidaPreferida3, String tipoid, int cedula,HttpServletRequest request){
        String[] selectedValues = request.getParameterValues("selectedValues");
        List<String> selectedList = new ArrayList<>();
        List<Alergia> allergies = new ArrayList<>();
        if (selectedValues != null) {
            selectedList = Arrays.asList(selectedValues);
        }


        Cliente cliente = new Cliente(fname, lname);
        cliente.setNickname(nickname);
        cliente.setPassword(pass);
        cliente.setComidaPreferidaUno(comidaPreferida1);
        cliente.setComidaPreferidaDos(comidaPreferida2);
        cliente.setComidaPreferidaTres(comidaPreferida3);
        cliente.setTipoId(tipoid);
        cliente.setCedula(cedula);
        for(int i =0 ; i< selectedList.size(); i++ ){
            Alergia al = new Alergia(cliente, selectedList.get(i));
            allergies.add(al);
        }
        cliente.setAlergias(allergies);
        clienteService.addCliente(cliente);
        for(Alergia a: allergies){
            alergiaService.addAlergia(a);
        }


        return "creacion";
    }
}
