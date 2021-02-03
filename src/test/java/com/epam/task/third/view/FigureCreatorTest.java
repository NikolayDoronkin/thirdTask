package com.epam.task.third.view;

import com.epam.task.third.data.DataException;
import com.epam.task.third.data.FileDataReader;
import com.epam.task.third.figure.Oval;
import com.epam.task.third.figure.Point;
import com.epam.task.third.validate.DataParser;
import com.epam.task.third.validate.DataValidator;
import com.epam.task.third.validate.DataValidatorException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class FigureCreatorTest {

    private final static List<String> TEST_FILE = Arrays.asList("142 123 234 220", "123 345 123 456");
    private final static Oval TEST_OVAL1 = new Oval(new Point(142, 123), new Point(234, 220));
    private final static Oval TEST_OVAL2 = new Oval(new Point(123, 345), new Point(123, 456));

    @Test
    public void testCreate() throws DataValidatorException, DataException {
        FileDataReader r = new FileDataReader();
        DataValidator v = new DataValidator();
        DataParser p = new DataParser(v);
        String inputFileName = "./src/test/resources/inputCorrect.txt";

        FigureCreator figureCreator = new FigureCreator(r, p);
        List<Oval> actual = figureCreator.create(inputFileName);

        List<Oval> expected = Arrays.asList(new Oval
                        (new Point(142, 123), new Point(234, 220)),
                new Oval
                        (new Point(123, 345), new Point(123, 456)));

        /*FileDataReader reader = Mockito.mock(FileDataReader.class);
        when(reader.readFromFile(anyString())).thenReturn(TEST_FILE);
        DataValidator validator = Mockito.mock(DataValidator.class);
        when(validator.validate(anyString())).thenReturn(true);
        DataParser parser = Mockito.mock(DataParser.class);
        when(parser.createOval(anyString())).thenReturn(TEST_OVAL1);
        when(parser.createOval(anyString())).thenReturn(TEST_OVAL2);
        parser.setValidator(validator);

        List<Oval> expected = Arrays.asList(new Oval
                        (new Point(142, 123), new Point(234, 220)),
                new Oval
                        (new Point(123, 345), new Point(123, 456)));
        List<Oval> actual = figureCreator.create(inputFileName);*/

        Assert.assertEquals(expected, actual);
    }

}
