package com.example.springproject.servies;

import com.example.springproject.exceptions.InvalidException;
import com.example.springproject.model.Book;
import com.example.springproject.model.MyUser;
import com.example.springproject.repoistory.MyUserRepoistory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MyUserServies {

private final MyUserRepoistory myUserRepoistory;


public List<MyUser>getAlluser(){

    return myUserRepoistory.findAll();
}

    public MyUser getoneUser(Integer userid){
        return myUserRepoistory.findById(userid).orElseThrow(() -> {
            throw new InvalidException("User id is invaild!");
        });
    }

    public void addUser(MyUser myUser) {
        myUserRepoistory.save(myUser);
    }
}
