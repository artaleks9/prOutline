package com.codenvy.qa;


public class InvalidArgumentException extends Exception {

    public InvalidArgumentException() {
        super("The input argument is invalid.");
    }
}
