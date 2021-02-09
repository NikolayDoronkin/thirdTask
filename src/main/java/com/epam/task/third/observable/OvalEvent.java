package com.epam.task.third.observable;

import com.epam.task.third.figure.AnotherOval;

import java.util.EventObject;

public class OvalEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public OvalEvent(Object source) {
        super(source);
    }

    @Override
    public AnotherOval getSource() {
        return (AnotherOval) super.getSource();
    }

}
