package by.learning.day1.task1.service;


import by.learning.day1.task1.entity.NumberValue;

public class ValueService {

    public int getLastSquareNumeralOfNumber(NumberValue value) {
        int option = (value.getA() % 10);
        switch (Math.abs(option)) {
            case 1:
            case 9:
                return 1;
            case 2:
            case 8:
                return 4;
            case 3:
            case 7:
                return 9;
            case 4:
            case 6:
                return 6;
            case 5:
                return 5;
            case 0:
                return 0;
        }
        throw new NumberFormatException();
    }


}
