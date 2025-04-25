package com.order_tracking.user_servicew.exception;

import com.order_tracking.user_servicew.enums.ResponseCode;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.sql.Time;
import java.time.LocalDateTime;


@Data
@Builder
public class ErrorDetail {


    private HttpStatus status;
    private ResponseCode code;
    private String message;
    private LocalDateTime time_stamp;

}
