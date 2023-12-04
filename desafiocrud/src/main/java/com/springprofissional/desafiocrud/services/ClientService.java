package com.springprofissional.desafiocrud.services;

import com.springprofissional.desafiocrud.dto.ClientDTO;
import com.springprofissional.desafiocrud.entities.Client;
import com.springprofissional.desafiocrud.repositories.ClientRepository;
import com.springprofissional.desafiocrud.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Recurso nao encontrado."));
        return new ClientDTO(client);
    }
}
