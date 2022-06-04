package com.example.springproject.exceptions;

public class InvalidException extends RuntimeException{
    public InvalidException(String message) {
        super(message);
    }
}
