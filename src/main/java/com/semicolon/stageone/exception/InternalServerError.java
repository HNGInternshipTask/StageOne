package com.semicolon.stageone.exception;

public class InternalServerError extends RuntimeException {
    public InternalServerError(String message){
        super(message);
    }
}
