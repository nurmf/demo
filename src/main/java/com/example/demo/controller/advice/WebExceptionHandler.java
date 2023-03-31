package com.example.demo.controller.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class WebExceptionHandler {

    // TODO 完善例外處理還要等HTTP工廠類別完成
    @ExceptionHandler(Exception.class)
    public String methodArgumentNotValid(Exception e) {
        // do something
        return e.getMessage();
    }


}
