package com.epam.task.third.data;

import org.apache.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileDataReader {

    private final static Logger LOGGER = Logger.getLogger(FileDataReader.class);

    public final List<String> readFromFile(String fileName) throws DataException {
        try {
            FileReader fileReader = new FileReader(fileName);
            Scanner scanner = new Scanner(fileReader);
            List<String> data = new ArrayList<>();
            LOGGER.info("Reading from a file was started.");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                data.add(line);
            }
            LOGGER.info("Reading from a file was finished successfully.");
            return data;
        } catch (IOException exception) {
            LOGGER.error("A file isn't exists.");
            throw new DataException("A file isn't exists.", fileName);
        }
    }
}
