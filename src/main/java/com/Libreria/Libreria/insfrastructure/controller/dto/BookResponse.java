package com.Libreria.Libreria.insfrastructure.controller.dto;

import com.Libreria.Libreria.domain.model.Book;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BookResponse {

    private Long id;
    private String nombre;
    private Integer anoPublicacion;
    private String autor;
    private String genero;
    private String descripcion ;

    public static BookResponse from(Book book) {
        return BookResponse.builder()
                .id( book.getId())
                .nombre( book.getNombre())
                .anoPublicacion( book.getAnoPublicacion())
                .autor( book.getAutor())
                .genero( book.getGenero())
                .descripcion ( book.getDescripcion() )
                .build();
    }
}
