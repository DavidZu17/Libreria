package com.Libreria.Libreria.aplication.port.out;

import com.Libreria.Libreria.domain.model.Book;

import java.util.List;

public interface BookRepositoryPort {
    Book save(Book book);
    List<Book> listAll();
}
