package com.epam.task.third.figureLogic;

import com.epam.task.third.figure.AnotherOval;

public class CheckOvalsID {

    private final int id;

    public CheckOvalsID(int id) {
        this.id = id;
    }

    public boolean isSpecified(AnotherOval oval) {
        return id == oval.getId();
    }

}
