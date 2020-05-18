package org.davidwightman.webapplication.webapplication.repositories;

import org.davidwightman.webapplication.webapplication.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
