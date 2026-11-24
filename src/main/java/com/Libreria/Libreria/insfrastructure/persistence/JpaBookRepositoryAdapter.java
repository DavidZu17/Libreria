package com.Libreria.Libreria.insfrastructure.persistence;

import com.Libreria.Libreria.aplication.port.out.BookRepositoryPort;
import com.Libreria.Libreria.domain.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JpaBookRepositoryAdapter implements BookRepositoryPort {

    private final SpringDataBookRepository springDataBookRepository;
    private final BookPersistenceMapper mapper;

    @Override
    public Book save(Book book) {

        BookEntity entity = mapper.toEntity( book );
        BookEntity saved = springDataBookRepository.save(entity);
        return mapper.toDomain( saved );
    }
}
