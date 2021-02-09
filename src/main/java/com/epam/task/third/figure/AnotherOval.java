package com.epam.task.third.figure;

import com.epam.task.third.observable.OvalEvent;
import com.epam.task.third.observable.OvalObserver;

public class AnotherOval {

    private int id;
    private Oval oval;
    private OvalObserver ovalObserver;

    public AnotherOval(int id, Oval oval, OvalObserver ovalObserver) {
        this.id = id;
        this.oval = oval;
        this.ovalObserver = ovalObserver;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Oval getOval() {
        return oval;
    }

    public void setOval(Oval oval) {
        this.oval = oval;
        notifyObservers();
    }

    public OvalObserver getOvalObserver() {
        return ovalObserver;
    }

    public void setOvalObserver(OvalObserver ovalObserver) {
        this.ovalObserver = ovalObserver;
        notifyObservers();
    }


    private void notifyObservers() {
        if (ovalObserver != null) {
            ovalObserver.handleEvent(new OvalEvent(this));
        }
    }
}
