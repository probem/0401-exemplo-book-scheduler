package br.com.groger.bookScheduler.controller;

import br.com.groger.bookScheduler.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.groger.bookScheduler.service.bookService;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class bookController {

    @Autowired
    private bookService bs;

    @GetMapping
    public String home(){
        return "index";
    }

    @PostMapping("/cadastrar")
    public String cadastrar(Book book){

        bs.createBook(book);
        return "resposta";
    }


}
