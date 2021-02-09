package com.epam.task.third.figureLogic;

import com.epam.task.third.figure.AnotherOval;

import java.util.Comparator;

public class OvalComparator implements Comparator<AnotherOval> {

    @Override
    public int compare(AnotherOval ovalFirst, AnotherOval ovalSecond) {
        Integer firstID = ovalFirst.getId();
        Integer secondID = ovalSecond.getId();
        return firstID.compareTo(secondID);
    }
}
