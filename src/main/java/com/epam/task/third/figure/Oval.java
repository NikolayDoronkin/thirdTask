package com.epam.task.third.figure;

public class Oval {

    private Point firstPosition;
    private Point secondPosition;

    public Oval(Point firstPosition, Point secondPosition) {
        this.firstPosition = firstPosition;
        this.secondPosition = secondPosition;
    }

    public int getFirstPositionX() {
        return firstPosition.getCoordinateX();
    }

    public int getFirstPositionY() {
        return firstPosition.getCoordinateY();
    }

    public int getSecondPositionX() {
        return secondPosition.getCoordinateX();
    }

    public int getSecondPositionY() {
        return secondPosition.getCoordinateY();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Oval oval = (Oval) object;

        if (!firstPosition.equals(oval.firstPosition)) {
            return false;
        }
        return secondPosition.equals(oval.secondPosition);
    }

    @Override
    public int hashCode() {
        int result = firstPosition.hashCode();
        result = 31 * result + secondPosition.hashCode();
        return result;
    }
}
