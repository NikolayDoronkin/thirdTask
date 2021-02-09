package com.epam.task.third.data;

public class DataException extends Exception {
    private final String fileName;


    public String getFileName() {
        return fileName;
    }

    public DataException(String message, String name) {
        super(message);
        fileName = name;
    }

}
