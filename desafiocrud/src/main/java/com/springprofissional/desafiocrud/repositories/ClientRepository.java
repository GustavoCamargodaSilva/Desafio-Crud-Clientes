package com.springprofissional.desafiocrud.repositories;

import com.springprofissional.desafiocrud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <Client,Long> {

}
