package br.com.groger.bookScheduler.service;

import br.com.groger.bookScheduler.model.Book;
import br.com.groger.bookScheduler.repository.bookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bookService {

    @Autowired
    private bookRepository br;

    public Book createBook(Book book) {
        return br.save(book);
    }

    public Iterable<Book> retornarBooks() {
        Iterable<Book> books = br.findAll();
        return books;
    }
}
