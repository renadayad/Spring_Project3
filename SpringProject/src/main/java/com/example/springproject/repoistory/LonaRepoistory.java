package com.example.springproject.repoistory;

import com.example.springproject.model.Book;
import com.example.springproject.model.Lona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LonaRepoistory extends JpaRepository<Lona,Integer> {
}
