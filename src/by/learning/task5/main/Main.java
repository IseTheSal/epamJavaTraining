package by.learning.task5.main;

import by.learning.task5.entity.NumberValue;
import by.learning.task5.writer.NumberWriter;
import by.learning.task5.service.NumberService;

public class Main {

    public static void main(String[] args) {
        NumberValue a = new NumberValue(6);
        NumberService numberService = new NumberService();
        boolean isPerfectNumber = numberService.isPerfectNumber(a.getValue());
        NumberWriter.printIsPerfect(a.getValue(), isPerfectNumber);
    }

}
