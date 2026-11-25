package com.Libreria.Libreria.insfrastructure.persistence;

import com.Libreria.Libreria.domain.model.Book;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BookPersistenceMapper {

    public Optional<Book> toDomain(BookEntity bookEntity ) {
        if (bookEntity == null) return Optional.empty();
        return Optional.of(
                Book.builder()
                        .id(bookEntity.getId())
                        .nombre(bookEntity.getNombre())
                        .anoPublicacion(bookEntity.getAnoPublicacion())
                        .autor(bookEntity.getAutor())
                        .genero(bookEntity.getGenero())
                        .descripcion(bookEntity.getDescripcion())
                        .build());
    }

    public Optional<BookEntity> toEntity( Book book ) {
        if (book == null) return Optional.empty();
        return Optional.of(
                BookEntity.builder()
                        .id(book.getId())
                        .nombre(book.getNombre())
                        .anoPublicacion(book.getAnoPublicacion())
                        .autor(book.getAutor())
                        .genero(book.getGenero())
                        .descripcion(book.getDescripcion())
                        .build());
    }

}
