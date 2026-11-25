package com.Libreria.Libreria.aplication.port.in;
import com.Libreria.Libreria.domain.model.Book;
import java.util.List;

public interface ListBookUseCase {
    List<Book> listAll();
}
