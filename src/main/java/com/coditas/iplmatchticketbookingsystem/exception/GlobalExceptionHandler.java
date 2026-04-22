package com.coditas.iplmatchticketbookingsystem.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MatchNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleMatchNotFoundException(MatchNotFoundException ex, HttpServletRequest http) {

        ErrorResponse error = new ErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(ex.getMessage());
        error.setTimestamp(System.currentTimeMillis());
        error.setPath(http.getRequestURL().toString());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    @ExceptionHandler(StadiumFullException.class)
    public ResponseEntity<ErrorResponse> handleStadiumFullException(StadiumFullException ex, HttpServletRequest http) {

        ErrorResponse error = new ErrorResponse();
        error.setStatus(HttpStatus.NO_CONTENT.value());
        error.setMessage(ex.getMessage());
        error.setTimestamp(System.currentTimeMillis());
        error.setPath(http.getRequestURL().toString());

        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(error);
    }

    @ExceptionHandler(StadiumNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleStadiumNotFoundException(StadiumNotFoundException ex, HttpServletRequest http) {

        ErrorResponse error = new ErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(ex.getMessage());
        error.setTimestamp(System.currentTimeMillis());
        error.setPath(http.getRequestURL().toString());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
