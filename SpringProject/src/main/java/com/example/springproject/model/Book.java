package com.example.springproject.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@AllArgsConstructor @NoArgsConstructor @Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
 private Integer id;
    @NotEmpty(message = "name:must be not empty")
    private String name;
    @NotEmpty(message = " genre:must be not empty")
    private String  genre;


    @ManyToMany(mappedBy = "books",cascade = CascadeType.ALL)
    private Set<Lona> loans;
}
