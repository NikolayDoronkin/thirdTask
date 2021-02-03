package com.epam.task.third.validate;

import org.junit.Assert;
import org.junit.Test;

public class DataValidatorTest {

    @Test

    public void testValidateWhenIsCorrect() throws DataValidatorException {
        DataValidator validator = new DataValidator();
        String input = "142 4356 34 1";

        boolean actual = validator.validate(input);

        Assert.assertTrue(actual);
    }

    @Test

    public void testValidateWhenIsNotCorrect() {
        try {
            DataValidator validator = new DataValidator();
            String input = "142 4356 3g 4";

            boolean actual = validator.validate(input);

            Assert.assertTrue(actual);
        } catch (DataValidatorException exception) {
            System.out.println(exception.getMessage());
            System.out.println(exception.getLine());
        }

    }

}
