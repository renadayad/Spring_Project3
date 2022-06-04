package com.example.springproject.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@AllArgsConstructor @NoArgsConstructor @Data
@Entity
public class Lona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
 private Integer id;
    @NotNull(message = "userid:must be not empty")
    private Integer userid;
   @NotNull(message = " bookID:must be not empty")
    private Integer bookID;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JsonIgnore
    private Set<Book> books;
}
