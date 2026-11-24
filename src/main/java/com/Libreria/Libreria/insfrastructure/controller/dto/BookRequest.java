package com.Libreria.Libreria.insfrastructure.controller.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class BookRequest {

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
    @Positive(message = "El anoPublicacion debe de ser un numero positivo")
    private Integer anoPublicacion;
    @NotBlank(message = "El autor es obligatorio")
    private String autor;
    @NotBlank(message = "El genero es obligatorio")
    private String genero;
    @NotBlank(message = "El descripcion es obligatorio")
    private String descripcion;
}
