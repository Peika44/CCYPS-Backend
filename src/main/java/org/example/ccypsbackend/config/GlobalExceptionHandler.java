package org.example.ccypsbackend.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.BindException;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.example.ccypsbackend.utils.Result;
import org.example.ccypsbackend.utils.ResultCode;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // non uniform binding exception
    @ExceptionHandler(BindException.class)
    public Object bindException(BindException e) {
        System.out.println("bindException: ====================" + ExceptionUtils.getStackTrace(e));
        return Result.error();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result bindException(MethodArgumentNotValidException e) {
        System.out.println("MethodArgumentNotValidException");
        System.out.println("*********************************************************");
        System.out.println(ExceptionUtils.getStackTrace(e));
        return Result.error(ResultCode.PASSWORD_COMPLEX_ERROR,e.getBindingResult().getFieldError().getDefaultMessage());
    }

    @ExceptionHandler(NullPointerException.class)
    public Object NullPointerExceptionHandler(NullPointerException e, HttpServletRequest req) {
        System.out.println("NullPointerException");
        System.out.println(ExceptionUtils.getStackTrace(e));
        return Result.error();
    }

    // catch all exceptions
    @ExceptionHandler(Exception.class)
    public Object handleException(Exception e, HttpServletRequest req) {
        System.out.println("handleException");
        System.out.println(ExceptionUtils.getStackTrace(e));
        return Result.error();
    }
}
