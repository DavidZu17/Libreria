package com.Libreria.Libreria.domain.model;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode( onlyExplicitlyIncluded = true )
public class Book {
    @EqualsAndHashCode.Include
    private Long id;
    private String nombre;
    private Integer anoPublicacion;
    private String autor;
    private String genero;
    private String descripcion ;


}

