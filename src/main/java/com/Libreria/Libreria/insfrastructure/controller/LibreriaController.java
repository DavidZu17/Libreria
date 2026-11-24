package com.Libreria.Libreria.insfrastructure.controller;

import com.Libreria.Libreria.aplication.port.in.CreateBookUseCase;
import com.Libreria.Libreria.domain.model.Book;
import com.Libreria.Libreria.insfrastructure.controller.dto.BookRequest;
import com.Libreria.Libreria.insfrastructure.controller.dto.BookResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libreria")
@RequiredArgsConstructor
public class LibreriaController {

    private final CreateBookUseCase createBookUseCase;


    @PostMapping
    public ResponseEntity<BookResponse> createBook(@Valid @RequestBody BookRequest bookRequest) {

        Book book = Book.builder()
                .nombre(bookRequest.getNombre())
                .anoPublicacion(bookRequest.getAnoPublicacion())
                .autor(bookRequest.getAutor())
                .genero(bookRequest.getGenero())
                .descripcion(bookRequest.getDescripcion())
                .build();

        Book saved = createBookUseCase.createBook(book);

        return ResponseEntity.status(HttpStatus.CREATED).body( BookResponse.from(saved));
    }
}
