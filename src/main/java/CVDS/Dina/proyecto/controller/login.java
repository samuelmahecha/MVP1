package CVDS.Dina.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class login {
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(String username, String password) {
        if (username.equals("admin") && password.equals("admin")) {
            return "redirect:/lunch";
        } else {
            return "login";
        }
    }
    @RequestMapping("/lunch")
    public String lunch() {
        return "lunch";
    }
}
