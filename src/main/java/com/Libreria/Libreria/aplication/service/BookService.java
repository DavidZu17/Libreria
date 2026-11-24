package com.Libreria.Libreria.aplication.service;

import com.Libreria.Libreria.aplication.port.in.CreateBookUseCase;
import com.Libreria.Libreria.aplication.port.out.BookRepositoryPort;
import com.Libreria.Libreria.domain.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService implements CreateBookUseCase {

    private final BookRepositoryPort bookRepositoryPort;

    @Override
    public Book createBook(Book book) {
        return bookRepositoryPort.save(book);
    }
}
