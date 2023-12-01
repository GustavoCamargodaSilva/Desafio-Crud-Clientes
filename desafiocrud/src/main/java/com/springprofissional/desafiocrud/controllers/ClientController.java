package com.springprofissional.desafiocrud.controllers;

import com.springprofissional.desafiocrud.entities.Client;
import com.springprofissional.desafiocrud.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

    @Autowired
    private ClientService service;

}
