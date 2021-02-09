package com.epam.task.third.validate;

import com.epam.task.third.figure.Oval;
import com.epam.task.third.figure.Point;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class DataParserTest {

    @Test
    public void testCreateOvalWhenDataIsCorrect() throws DataValidatorException {
        String line = "1 2 3 5";
        DataValidator validator = Mockito.mock(DataValidator.class);
        when(validator.validate(anyString())).thenReturn(true);

        DataParser parser = new DataParser(validator);


        Oval expected = new Oval(new Point(1, 2), new Point(3, 5));
        Oval actual = parser.createOval(line);

        Assert.assertEquals(expected, actual);
    }


}
