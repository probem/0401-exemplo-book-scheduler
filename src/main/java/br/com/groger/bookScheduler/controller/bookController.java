package br.com.groger.bookScheduler.controller;

import br.com.groger.bookScheduler.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.groger.bookScheduler.service.bookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

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

    @GetMapping("/books")
    public ModelAndView listaBooks(){
        ModelAndView mv = new ModelAndView("resposta");
        Iterable<Book> lista = bs.retornarBooks();
        mv.addObject("books", lista);
        return mv;
    }


}
