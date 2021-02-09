package com.epam.task.third.validate;

import com.epam.task.third.data.FileDataReader;
import com.epam.task.third.figure.Oval;
import com.epam.task.third.figure.Point;
import com.epam.task.third.observable.OvalObserver;
import org.apache.log4j.Logger;


public class DataParser {

    private final static Logger LOGGER = Logger.getLogger(FileDataReader.class);

    private DataValidator validator;

    public DataParser(DataValidator dataValidator) {
        validator = dataValidator;
    }

    public DataValidator getValidator() {
        return validator;
    }

    public Oval createOval(String line) throws DataValidatorException {
        if (!validator.validate(line)) {
        }
        LOGGER.info("Creating an object of the class Oval.");
        String[] coordinates = line.split("\\s+");
        int firstPositionX = Integer.parseInt(coordinates[0]);
        int firstPositionY = Integer.parseInt(coordinates[1]);
        int secondPositionX = Integer.parseInt(coordinates[2]);
        int secondPositionY = Integer.parseInt(coordinates[3]);
        LOGGER.info("Creating of object of the class Oval was finished successfully.");
        Point firstPoint = new Point(firstPositionX, firstPositionY);
        Point secondPoint = new Point(secondPositionX, secondPositionY);
        OvalObserver observer = OvalObserver.getInstance();
        return new Oval(firstPoint, secondPoint);

    }
}
