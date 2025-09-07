package com.nstoala.demo.controller;

import com.nstoala.demo.model.Users;
import com.nstoala.demo.services.SaludoServices;
import com.nstoala.demo.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/demo")
public class SaludoController {
    @Autowired
    private SaludoServices saludoServices;

    @Autowired
    private UsersService usersService;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @GetMapping("/saludo/{nombre}")
    public String saludar(@PathVariable String nombre) {
        return saludoServices.obtenerSaludo(nombre);
    }


    @GetMapping("/usuarios")
    public List<Users> obtenerUsuarios() {
        return usersService.obtenerTodos();
    }

        @PostMapping("/guardar/{clave}")
    public String guardarEnCache(@PathVariable String clave, @RequestBody String valor) {
        redisTemplate.opsForValue().set(clave, valor);
        return "Valor guardado en Redis con clave: " + clave;
    }

    @GetMapping("/obtener/{clave}")
    public String obtenerDeCache(@PathVariable String clave) {
        Object valor = redisTemplate.opsForValue().get(clave);
        return valor != null ? valor.toString() : "No se encontró valor para la clave: " + clave;
    }
}
