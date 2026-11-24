package com.Libreria.Libreria.insfrastructure.persistence;

import com.Libreria.Libreria.domain.model.Book;
import org.springframework.stereotype.Component;

@Component
public class BookPersistenceMapper {

    public Book toDomain( BookEntity bookEntity ) {
        if (bookEntity == null) return null;
        return Book.builder()
                .id( bookEntity.getId() )
                .nombre( bookEntity.getNombre() )
                .anoPublicacion( bookEntity.getAnoPublicacion())
                .autor( bookEntity.getAutor() )
                .genero( bookEntity.getGenero())
                .descripcion( bookEntity.getDescripcion() )
                .build();
    }

    public BookEntity toEntity( Book book ) {
        if (book == null) return null;
        return BookEntity.builder()
                .id( book.getId() )
                .nombre( book.getNombre() )
                .anoPublicacion( book.getAnoPublicacion())
                .autor( book.getAutor() )
                .genero( book.getGenero())
                .descripcion( book.getDescripcion() )
                .build();
    }

}
