package com.Libreria.Libreria.aplication.service;

import com.Libreria.Libreria.aplication.port.in.CreateBookUseCase;
import com.Libreria.Libreria.aplication.port.in.ListBookUseCase;
import com.Libreria.Libreria.aplication.port.out.BookRepositoryPort;
import com.Libreria.Libreria.domain.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService implements CreateBookUseCase , ListBookUseCase {

    private final BookRepositoryPort bookRepositoryPort;

    @Override
    public Book createBook(Book book) {

        return bookRepositoryPort.save(book);
    }

    @Override
    public List<Book> listAll() {
        return bookRepositoryPort.listAll();
    }
}
