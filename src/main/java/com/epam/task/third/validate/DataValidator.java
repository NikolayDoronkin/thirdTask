package com.epam.task.third.validate;

import com.epam.task.third.data.FileDataReader;
import org.apache.log4j.Logger;

public class DataValidator {

    private final static Logger LOGGER = Logger.getLogger(FileDataReader.class);

    public boolean validate(String data) throws DataValidatorException {
        LOGGER.info("Checking validation.");
        if (data.isEmpty()) {
            LOGGER.error("The line is empty");
            throw new DataValidatorException("Invalid line.", data);
        }
        String[] coordinates = data.split("\\s+");

        if (coordinates.length != 4) {
            LOGGER.error("The line isn't valid, here aren't coordinates equals 4.");
            throw new DataValidatorException("Incorrect number of coordinates.", data);
        }
        for (String coordinate : coordinates) {
            if (!coordinate.matches("\\d+")) {
                LOGGER.error("Invalid coordinate.");
                throw new DataValidatorException("Not valid coordination.", coordinate);
            }
        }
        LOGGER.info("Validation was finished successfully.");
        return true;
    }
}
