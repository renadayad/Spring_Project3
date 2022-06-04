package com.example.springproject.servies;

import com.example.springproject.model.Book;
import com.example.springproject.model.Lona;
import com.example.springproject.repoistory.BookRepoistory;
import com.example.springproject.repoistory.LonaRepoistory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LonaServies {

private final LonaRepoistory lonaRepoistory;


public List<Lona>getAllLona(){

    return lonaRepoistory.findAll();
}


    public void addLona(Lona lona) {

    lonaRepoistory.save(lona);
    }
}
