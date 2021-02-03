package com.epam.task.third.view;

import com.epam.task.third.validate.DataParser;
import com.epam.task.third.data.DataException;
import com.epam.task.third.data.FileDataReader;
import com.epam.task.third.figure.Oval;
import com.epam.task.third.validate.DataValidator;
import com.epam.task.third.validate.DataValidatorException;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class FigureCreator {

    private final static Logger LOGGER = Logger.getLogger(FileDataReader.class);

    private FileDataReader reader;
    private DataParser parser;

    public FigureCreator(FileDataReader reader, DataParser parser) {
        this.reader = reader;
        this.parser = parser;
    }

    public List<Oval> create(String fileName) throws DataException, DataValidatorException {
        LOGGER.info("Creating objects of the class Oval from a file was started.");
        DataValidator validator = parser.getValidator();
        List<String> dataList = reader.readFromFile(fileName);
        List<Oval> resultOvalsList = new ArrayList<>();
        for (String line : dataList) {
            if (validator.validate(line)) {
                Oval oval = parser.createOval(line);
                resultOvalsList.add(oval);
            }
        }
        LOGGER.info("Creating objects of the class Oval from a file was finished successfully.");
        return resultOvalsList;
    }
}


