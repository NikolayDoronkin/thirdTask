package com.epam.task.third.figure;

public class Point {

    private int coordinateX;
    private int coordinateY;

    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Point point = (Point) object;

        if (coordinateX != point.coordinateX) {
            return false;
        }
        return coordinateY == point.coordinateY;
    }

    @Override
    public int hashCode() {
        int result = coordinateX;
        result = 31 * result + coordinateY;
        return result;
    }
}
