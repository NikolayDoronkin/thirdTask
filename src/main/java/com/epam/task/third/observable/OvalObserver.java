package com.epam.task.third.observable;

import com.epam.task.third.figure.AnotherOval;
import com.epam.task.third.figure.Oval;
import com.epam.task.third.figureLogic.FigureLogic;
import com.epam.task.third.figureLogic.Parameters;

import java.util.HashMap;
import java.util.Map;

public class OvalObserver implements Observer {

    private static OvalObserver instance;
    private FigureLogic figureLogic;
    private Map<Integer, Parameters> parameters;

    private OvalObserver() {
        figureLogic = new FigureLogic();
        parameters = new HashMap<>();
    }

    public void removeObservable(AnotherOval anotherOval) {
        int id = anotherOval.getId();
        parameters.remove(id);
    }

    public static OvalObserver getInstance(){
        if(instance == null){
            instance = new OvalObserver();
        }
        return instance;
    }

    @Override
    public void handleEvent(OvalEvent event) {
        AnotherOval anotherOval = event.getSource();
        Oval oval = anotherOval.getOval();
        int id = anotherOval.getId();
        double area = figureLogic.calculateArea(oval);
        double length = figureLogic.calculateLength(oval);
        Parameters parameter = new Parameters(area, length);
        parameters.put(id, parameter);
    }
}
