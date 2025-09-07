package com.nstoala.demo.controller;

import com.nstoala.demo.model.Users;
import com.nstoala.demo.services.SaludoServices;
import com.nstoala.demo.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/demo")
public class SaludoController {
    @Autowired
    private SaludoServices saludoServices;

    @Autowired
    private UsersService usersService;

    @GetMapping("/saludo/{nombre}")
    public String saludar(@PathVariable String nombre) {
        return saludoServices.obtenerSaludo(nombre);
    }


    @GetMapping("/usuarios")
    public List<Users> obtenerUsuarios() {
        return usersService.obtenerTodos();
    }
}
