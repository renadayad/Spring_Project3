package com.example.springproject.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@AllArgsConstructor @NoArgsConstructor @Data
@Entity
public class MyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
 private Integer id;
    @NotEmpty(message = "username:must be not empty")
    private String username;
    @NotEmpty(message = "Password:must be not empty")
    private String password;
}
