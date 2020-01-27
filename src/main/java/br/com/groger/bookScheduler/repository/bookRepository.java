package br.com.groger.bookScheduler.repository;

import br.com.groger.bookScheduler.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface bookRepository extends CrudRepository<Book, String> {
}
