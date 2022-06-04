package com.example.springproject.controoller;

import com.example.springproject.model.Api;
import com.example.springproject.model.Book;
import com.example.springproject.model.Lona;
import com.example.springproject.model.MyUser;
import com.example.springproject.servies.BookServies;
import com.example.springproject.servies.MyUserServies;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/book")
public class BookControoller {

 Logger log= LoggerFactory.getLogger(BookControoller.class);
private final BookServies bookServies;



    @GetMapping
    public ResponseEntity<List<Book>> getAllBook() {
        log.info("Book are return by method getBook() ");
        return ResponseEntity.status(201).body(bookServies.getAllBooks());
    }

    @GetMapping("lonaAllbook/{bookid}")

    public ResponseEntity <List<Lona>> getAllLendBook(@PathVariable Integer bookid) {
        log.info("Book id are return by method getAllLendBook() ");
        return ResponseEntity.status(201).body(bookServies.getLoansAllBooks(bookid));
    }
    @PostMapping("lonabook/{bookid}/{userid}")
    public ResponseEntity getlona(@PathVariable Integer bookid, @PathVariable Integer userid) {
        log.info("lona book are return by method getlona() ");
        bookServies.LeandBook(bookid,userid);
        return ResponseEntity.status(201).body("get lone");
    }
    @PostMapping
    public ResponseEntity addBook(@RequestBody @Valid Book book) {
        log.info("book are add by method addbook()");
        bookServies.addBook(book);
        return ResponseEntity.status(200).body("New Book added!");
    }


}
