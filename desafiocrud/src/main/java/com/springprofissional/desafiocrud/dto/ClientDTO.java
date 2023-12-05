package com.springprofissional.desafiocrud.dto;

import com.springprofissional.desafiocrud.entities.Client;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;
    @Size(min = 3, max = 80, message = "Name must be 3 to 80 characters long.")
    @NotBlank(message = "name field cannot be empty.")
    private String name;

    @NotBlank(message = "cpf field cannot be empty.")
    @Positive(message = "cpf cannot be negative")
    private String cpf;
    @Positive(message = "Income cannot be negative")
    @NotBlank(message = "Income field cannot be empty." )
    private Double income;
    @Past(message = "Birth Date cannot be present")
    private LocalDate birthDate;

    @PositiveOrZero(message = "Must be a positive number or 0.")
    private Integer children;

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client entity){
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
