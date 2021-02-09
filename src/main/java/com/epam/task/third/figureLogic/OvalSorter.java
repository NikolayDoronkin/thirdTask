package com.epam.task.third.figureLogic;

import com.epam.task.third.figure.AnotherOval;

import java.util.List;

public class OvalSorter {

    public void sort(List<AnotherOval> ovals, OvalComparator comparator) {
        ovals.sort(comparator);
    }

}
