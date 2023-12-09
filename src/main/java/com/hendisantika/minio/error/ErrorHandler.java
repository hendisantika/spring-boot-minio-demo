package com.hendisantika.minio.error;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-minio-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/10/23
 * Time: 06:17
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@RestControllerAdvice
public class ErrorHandler {
    @ExceptionHandler({
            IllegalArgumentException.class,
    })
    @ResponseStatus(BAD_REQUEST)
    ResponseEntity<ApiError> handleCustomBadRequestException(Exception ex, HttpServletRequest request) {
        ApiError response = errorDetails(ex.getMessage(), ex, BAD_REQUEST, request);
        return ResponseEntity
                .status(BAD_REQUEST)
                .contentType(getMediaType())
                .body(response);
    }
}
