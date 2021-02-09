package com.epam.task.third.repository;

import com.epam.task.third.figure.AnotherOval;

import java.util.HashMap;
import java.util.Map;

public class OvalsRepository implements OvalRepository {

    private Map<Integer, AnotherOval> ovalFamily;

    public OvalsRepository() {
        ovalFamily = new HashMap<>();
    }


    @Override
    public AnotherOval addOval(AnotherOval oval) {
        int newID = (int) (Math.random() * 100);
        ovalFamily.put(newID, oval);
        return oval;
    }

    @Override
    public AnotherOval updateOval(AnotherOval oval) {
        int id = oval.getId();
        ovalFamily.replace(id, oval);
        return oval;
    }

    @Override
    public void removeOval(AnotherOval oval) {
        int id = oval.getId();
        ovalFamily.remove(id);
    }
}
