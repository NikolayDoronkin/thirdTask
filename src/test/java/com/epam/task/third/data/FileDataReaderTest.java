package com.epam.task.third.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FileDataReaderTest {

    private final static String TEST_FILE1 = "./src/test/resources/inputCorrect.txt";
    private final static String TEST_FILE2 = "./src/test/resources/inputCorregct.txt";

    @Test

    public void testReadFromFileWhenFilenameIsCorrect() throws DataException {
        FileDataReader fileDataReader = new FileDataReader();

        List<String> expected = Arrays.asList("142 123 234 220", "123 345 123 456");

        List<String> actual = fileDataReader.readFromFile(TEST_FILE1);
        Assert.assertEquals(expected, actual);

    }

    @Test

    public void testReadFromFileWhenFilenameIsNotCorrect() throws DataException {
        try {
            FileDataReader fileDataReader = new FileDataReader();

            List<String> expected = Arrays.asList("142 123 234 220", "123 345 123 456");

            List<String> actual = fileDataReader.readFromFile(TEST_FILE2);
            Assert.assertEquals(expected, actual);
        } catch (DataException exception) {
            System.out.println(exception.getMessage());
            System.out.println(exception.getFileName());
        }

    }

}
