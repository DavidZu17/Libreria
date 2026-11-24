package com.Libreria.Libreria.aplication.port.in;

import com.Libreria.Libreria.domain.model.Book;

public interface CreateBookUseCase {
    Book createBook(Book book);
}
