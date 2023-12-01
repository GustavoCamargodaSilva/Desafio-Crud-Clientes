package com.springprofissional.desafiocrud.services;

import com.springprofissional.desafiocrud.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;
}
