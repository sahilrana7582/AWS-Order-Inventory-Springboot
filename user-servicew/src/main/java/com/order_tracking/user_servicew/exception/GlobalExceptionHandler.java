package com.order_tracking.user_servicew.exception;


import com.order_tracking.user_servicew.enums.ResponseCode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler extends RuntimeException{


    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorDetail> handleResourceNotFoundException(CustomException exception) {
        ErrorDetail errorDetail = ErrorDetail.builder()
                .code(exception.getResponseStatus())
                .status(HttpStatus.BAD_REQUEST)
                .message(exception.getMessage())
                .time_stamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(errorDetail, exception.getResponseStatus().getHttpStatus());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetail> handleGlobalException(Exception exception) {

        ErrorDetail errorDetail = ErrorDetail.builder()
                .code(ResponseCode.INTERNAL_SERVER_ERROR)
                .message(exception.getMessage())
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .time_stamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(errorDetail, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}

