package com.Libreria.Libreria.insfrastructure.persistence;

import com.Libreria.Libreria.aplication.port.out.BookRepositoryPort;
import com.Libreria.Libreria.domain.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class JpaBookRepositoryAdapter implements BookRepositoryPort {

    private final SpringDataBookRepository springDataBookRepository;
    private final BookPersistenceMapper mapper;

    @Override
    public Book save(Book book) {

        BookEntity entity = mapper.toEntity( book )
                .orElseThrow(() -> new IllegalArgumentException("No se puede mapear un Book nulo a BookEntity"));
        BookEntity saved = springDataBookRepository.save(entity);
        return mapper.toDomain(saved)
                .orElseThrow(() -> new IllegalStateException("No se pudo mapear BookEntity a Book después de guardar"));
    }

    @Override
    public List<Book> listAll(){
        return springDataBookRepository.findAll().
                stream()
                .map(mapper::toDomain)
                .flatMap(Optional::stream)
                .toList();
    }


}
