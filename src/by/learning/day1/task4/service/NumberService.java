package by.learning.day1.task4.service;

import by.learning.day1.task4.entity.NumberValue;

public class NumberService {

    public boolean atLeastTwoEvenNumbers(NumberValue a, NumberValue b, NumberValue c, NumberValue d) {
        int result = 0;
        if (a.getValue() % 2 == 0) result++;
        if (b.getValue() % 2 == 0) result++;
        if (c.getValue() % 2 == 0) result++;
        if (d.getValue() % 2 == 0) result++;
        return result >= 2;
    }
}
