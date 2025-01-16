package com.example.exception_hadling.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@AllArgsConstructor
public class ErrorResponse {
    private int status;
    private String message;
    private ZonedDateTime timestamp;
}
