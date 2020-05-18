package org.davidwightman.webapplication.webapplication.repositories;

import org.davidwightman.webapplication.webapplication.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
