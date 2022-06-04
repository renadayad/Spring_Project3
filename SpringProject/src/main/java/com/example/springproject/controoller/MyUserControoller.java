package com.example.springproject.controoller;

import com.example.springproject.model.MyUser;
import com.example.springproject.servies.MyUserServies;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.Valid;
import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/user")
public class MyUserControoller {

 Logger log= LoggerFactory.getLogger(MyUserControoller.class);
private final MyUserServies myUserServies;



    @GetMapping
    public ResponseEntity<List<MyUser>> getAllUser() {
        log.info("user are return by method getStudents() ");
        return ResponseEntity.status(201).body(myUserServies.getAlluser());
    }

    @PostMapping
    public ResponseEntity addUser(@RequestBody @Valid MyUser myUser) {
        log.info("user are add by method adduser() ");
        myUserServies.addUser(myUser);
        return ResponseEntity.status(200).body("New User added!");
    }


}
