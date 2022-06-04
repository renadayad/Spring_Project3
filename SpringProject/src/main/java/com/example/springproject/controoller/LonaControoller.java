package com.example.springproject.controoller;

import com.example.springproject.model.Book;
import com.example.springproject.model.Lona;
import com.example.springproject.servies.BookServies;
import com.example.springproject.servies.LonaServies;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/lona")
public class LonaControoller {

 Logger log= LoggerFactory.getLogger(LonaControoller.class);
private final LonaServies lonaServies;



    @GetMapping
    public ResponseEntity<List<Lona>> getAllLona() {
        log.info("Lona are return by method getLona() ");
        return ResponseEntity.status(201).body(lonaServies.getAllLona());
    }

    @PostMapping
    public ResponseEntity addLona(@RequestBody @Valid Lona lona) {
        log.info("lona are add by method addLona()");
       lonaServies.addLona(lona);
        return ResponseEntity.status(200).body("New Lona added!");
    }


}
