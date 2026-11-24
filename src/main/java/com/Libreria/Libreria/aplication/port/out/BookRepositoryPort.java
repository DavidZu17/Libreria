package com.Libreria.Libreria.aplication.port.out;

import com.Libreria.Libreria.domain.model.Book;

public interface BookRepositoryPort {
    Book save(Book book);
}
