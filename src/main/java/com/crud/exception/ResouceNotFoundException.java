package com.crud.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ResouceNotFoundException extends RuntimeException{
}
