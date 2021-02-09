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

import java.util.Arrays;
import java.util.List;

public class FigureCreatorTest {

    private final static List<String> TEST_FILE = Arrays.asList("142 123 234 220", "123 345 123 456");

    @Test
    public void testCreate() throws DataValidatorException, DataException {
        FileDataReader r = new FileDataReader();
        DataValidator v = new DataValidator();
        DataParser p = new DataParser(v);
        String inputFileName = "./src/test/resources/inputCorrect.txt";

        FigureCreator figureCreator = new FigureCreator(r, p);
        List<Oval> actual = figureCreator.create(inputFileName);

        Point firstPointForFirst = new Point(142, 123);
        Point secondPointForFirst = new Point(234, 220);
        Point firstPointForSecond = new Point(123, 345);
        Point secondPointForSecond = new Point(123, 456);

        List<Oval> expected = Arrays.asList(new Oval(firstPointForFirst, firstPointForSecond),
                new Oval(secondPointForFirst, secondPointForSecond));

        Assert.assertEquals(expected, actual);
    }

}
