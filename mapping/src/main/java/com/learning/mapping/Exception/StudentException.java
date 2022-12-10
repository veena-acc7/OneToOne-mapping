package com.learning.mapping.Exception;

public class StudentException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public StudentException(String message){
        super(message);
    }

    public StudentException(String message,Throwable throwable){
        super(message,throwable);
    } 
    
}

