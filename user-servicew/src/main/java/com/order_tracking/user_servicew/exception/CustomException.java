package com.order_tracking.user_servicew.exception;

import com.order_tracking.user_servicew.enums.ResponseCode;

public class CustomException extends RuntimeException{
    private ResponseCode responseStatus;
    private String message;

    public CustomException(ResponseCode responseStatus, String message) {
        this.responseStatus = responseStatus;
        this.message = message;
    }

    public CustomException(ResponseCode responseStatus) {
        this.responseStatus = responseStatus;
    }

    public ResponseCode getResponseStatus() {
        return responseStatus;
    }

    public String getMessage() {
        return message;
    }



}
