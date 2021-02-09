package com.epam.task.third.figureLogic;

import com.epam.task.third.figure.Oval;
import org.apache.log4j.Logger;

public class FigureLogic {

    private final static Logger LOGGER = Logger.getLogger(FigureLogic.class);

    public final double calculateArea(final Oval oval) {
        LOGGER.info("The method 'calculateSquare' was started.");
        int halfAxisX = Math.abs(calculateAxisX(oval)) / 2;
        int halfAxisY = Math.abs(calculateAxisY(oval)) / 2;
        LOGGER.info("The method 'calculateSquare' was finished.");
        return halfAxisX * halfAxisY * Math.PI;
    }

    public final double calculateLength(final Oval oval) {
        LOGGER.info("The method 'calculateLength' was started.");
        int halfAxisX = Math.abs(calculateAxisX(oval)) / 2;
        int halfAxisY = Math.abs(calculateAxisY(oval)) / 2;
        LOGGER.info("The method 'calculateLength' was finished.");
        return Math.PI * (halfAxisX + halfAxisY);
    }

    public final boolean isOval(final Oval oval) {
        LOGGER.info("The method 'isOval' was started and finished.");
        return calculateAxisX(oval) != 0 && calculateAxisY(oval) != 0;
    }

    public final boolean isCrossingAxis(final Oval oval) {
        LOGGER.info("The method 'isCrossingAxis' was started.");
        int firstPositionX = oval.getFirstPositionX();
        int firstPositionY = oval.getFirstPositionY();
        int secondPositionX = oval.getSecondPositionX();
        int secondPositionY = oval.getSecondPositionY();
        LOGGER.info("The method 'isCrossingAxis' was finished.");
        return (firstPositionX > 0 && firstPositionY > 0) &&
                (secondPositionX > 0 && secondPositionY > 0);
    }

    public final boolean isCircle(final Oval oval) {
        LOGGER.info("The method 'isCircle' was started.");
        int axisX = Math.abs(calculateAxisX(oval));
        int axisY = Math.abs(calculateAxisY(oval));
        LOGGER.info("The method 'isCircle' was finished.");
        return axisX == axisY;
    }

    private int calculateAxisX(final Oval oval) {
        LOGGER.info("The method 'calculateAxisX' was started.");
        int firstX = oval.getFirstPositionX();
        int secondX = oval.getSecondPositionX();
        LOGGER.info("The method 'calculateAxisX' was finished.");
        return secondX - firstX;
    }


    private int calculateAxisY(final Oval oval) {
        LOGGER.info("The method 'calculateAxisY' was started.");
        int firstY = oval.getFirstPositionY();
        int secondY = oval.getSecondPositionY();
        LOGGER.info("The method 'calculateAxisY' was finished.");
        return secondY - firstY;
    }
}
