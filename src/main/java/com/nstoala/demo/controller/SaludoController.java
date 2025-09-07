package com.nstoala.demo.controller;

import com.nstoala.demo.services.SaludoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class SaludoController {
    @Autowired
    private SaludoServices saludoServices;

    @GetMapping("/saludo/{nombre}")
    public String saludar(@PathVariable String nombre) {
        return saludoServices.obtenerSaludo(nombre);
    }

}
