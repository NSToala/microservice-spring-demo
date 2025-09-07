package com.nstoala.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "users")
public class Users {
    @Id
    private String id;
    private String nombre;
    private String email;
    private int edad;
    private boolean activo;
    private Date fechaRegistro;
}
