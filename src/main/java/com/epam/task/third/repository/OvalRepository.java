package com.epam.task.third.repository;

import com.epam.task.third.figure.AnotherOval;

public interface OvalRepository {

    AnotherOval addOval(AnotherOval oval);
    AnotherOval updateOval(AnotherOval oval);
    void removeOval(AnotherOval oval);

}
