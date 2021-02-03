package com.epam.task.third.validate;

public class DataValidatorException extends Exception {

    private String line;

    public String getLine() {
        return line;
    }

    public DataValidatorException(String message, String data) {
        super(message);
        line = data;
    }

}
