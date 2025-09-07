package com.nstoala.demo.services;

import org.springframework.stereotype.Service;

@Service
public class SaludoServices {
    public String obtenerSaludo(String nombre) {
        return "¡Hola, " + nombre + "! Este saludo viene desde el servicio 💬";
    }
    
}
