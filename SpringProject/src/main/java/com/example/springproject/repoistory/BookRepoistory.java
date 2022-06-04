package com.example.springproject.repoistory;

import com.example.springproject.model.Book;
import com.example.springproject.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepoistory extends JpaRepository<Book,Integer> {
}
