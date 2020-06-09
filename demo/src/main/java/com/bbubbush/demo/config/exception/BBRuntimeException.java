package com.bbubbush.demo.config.exception;

public class BBRuntimeException extends RuntimeException{

    public BBRuntimeException(String message) {
        super(message);
    }
    public BBRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
