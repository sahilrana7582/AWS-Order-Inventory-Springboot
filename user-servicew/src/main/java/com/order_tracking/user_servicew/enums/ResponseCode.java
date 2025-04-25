package com.order_tracking.user_servicew.enums;

import org.springframework.http.HttpStatus;

public enum ResponseCode {

    USER_CREATED(HttpStatus.CREATED, "User created successfully"),
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "User not found"),
    USER_DELETED(HttpStatus.OK, "User deleted successfully"),
    USER_UPDATED(HttpStatus.OK, "User updated successfully"),
    USER_ALREADY_EXISTS(HttpStatus.CONFLICT, "User already exists"),
    USER_NOT_UPDATED(HttpStatus.BAD_REQUEST, "User not updated"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Internal server error"),
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "Bad request"),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "Unauthorized"),
    FORBIDDEN(HttpStatus.FORBIDDEN, "Forbidden"),
    NOT_FOUND(HttpStatus.NOT_FOUND, "Not found"),
    METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED, "Method not allowed"),
    CONFLICT(HttpStatus.CONFLICT, "Conflict"),
    UNPROCESSABLE_ENTITY(HttpStatus.UNPROCESSABLE_ENTITY, "Unprocessable entity"),
    TOO_MANY_REQUESTS(HttpStatus.TOO_MANY_REQUESTS, "Too many requests");




    private HttpStatus status;
    private String message;

    private ResponseCode(HttpStatus code, String message) {
        this.status = code;
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
