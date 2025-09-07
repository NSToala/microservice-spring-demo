package com.nstoala.demo.services;

import com.nstoala.demo.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    private MongoTemplate mongoTemplate;


    public List<Users> obtenerTodos() {
        return mongoTemplate.findAll(Users.class);
    }
}