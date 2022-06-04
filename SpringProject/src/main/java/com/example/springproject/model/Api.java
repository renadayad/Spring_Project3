package com.example.springproject.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@AllArgsConstructor @NoArgsConstructor @Data
public class Api {

    private String massege;
    private Integer status;
}
