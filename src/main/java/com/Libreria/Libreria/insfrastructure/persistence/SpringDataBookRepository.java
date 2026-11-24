package com.Libreria.Libreria.insfrastructure.persistence;

import com.Libreria.Libreria.domain.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataBookRepository extends JpaRepository<BookEntity, Long> {
}
