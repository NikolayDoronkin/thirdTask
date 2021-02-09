package com.epam.task.third.figureLogic;

import com.epam.task.third.figure.Oval;
import com.epam.task.third.figure.Point;
import org.junit.Assert;
import org.junit.Test;

public class FigureLogicTest {

    @Test

    public void testCalculateArea() {
        Oval oval = new Oval(new Point(100, 100), new Point(120, 106));
        FigureLogic figureLogic = new FigureLogic();

        double expected = Math.PI * 10 * 3;
        double actual = figureLogic.calculateArea(oval);
        boolean result = expected == actual;

        Assert.assertTrue(result);
    }

    @Test

    public void testCalculateLength() {
        Oval oval = new Oval(new Point(100, 100), new Point(120, 106));
        FigureLogic figureLogic = new FigureLogic();

        double expected = Math.PI * (10 + 3);
        double actual = figureLogic.calculateLength(oval);
        boolean result = expected == actual;

        Assert.assertTrue(result);
    }

    @Test

    public void testIsOvalWhenItIsTrue() {
        Oval oval = new Oval(new Point(100, 100), new Point(120, 106));
        FigureLogic figureLogic = new FigureLogic();

        boolean actual = figureLogic.isOval(oval);

        Assert.assertTrue(actual);
    }

    @Test

    public void testIsOvalWhenItIsFalse() {
        Oval oval = new Oval(new Point(100, 100), new Point(100, 106));
        FigureLogic figureLogic = new FigureLogic();

        boolean actual = figureLogic.isOval(oval);

        Assert.assertFalse(actual);
    }

    @Test

    public void testIsCrossingAxisWhenItIsFalse() {
        Oval oval = new Oval(new Point(100, 100), new Point(120, 106));
        FigureLogic figureLogic = new FigureLogic();

        boolean actual = figureLogic.isCrossingAxis(oval);

        Assert.assertTrue(actual);
    }

    @Test

    public void testIsCrossingAxisWhenItIsTrue() {
        Oval oval = new Oval(new Point(-100, 100), new Point(120, 106));
        FigureLogic figureLogic = new FigureLogic();

        boolean actual = figureLogic.isCrossingAxis(oval);

        Assert.assertFalse(actual);
    }

    @Test

    public void testIsCircleWhenItIsCircle() {
        Oval oval = new Oval(new Point(100, 100), new Point(120, 120));
        FigureLogic figureLogic = new FigureLogic();

        boolean actual = figureLogic.isCircle(oval);

        Assert.assertTrue(actual);
    }

    @Test

    public void testIsCircleWhenItIsNotCircle() {
        Oval oval = new Oval(new Point(100, 100), new Point(120, 106));
        FigureLogic figureLogic = new FigureLogic();

        boolean actual = figureLogic.isCircle(oval);

        Assert.assertFalse(actual);
    }

}
