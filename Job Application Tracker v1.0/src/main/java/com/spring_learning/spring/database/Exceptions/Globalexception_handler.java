package com.spring_learning.spring.database.Exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Globalexception_handler {

    @ExceptionHandler(JobNotFoundException.class)
    public ResponseEntity<String> nojob(){
        return ResponseEntity.status(404).body("job not found");
    }
}
