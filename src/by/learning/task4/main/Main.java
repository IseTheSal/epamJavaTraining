package by.learning.task4.main;

import by.learning.task4.entity.NumberValue;
import by.learning.task4.service.NumberService;
import by.learning.task4.writer.NumberWriter;

public class Main {

    public static void main(String[] args) {
        NumberValue a = new NumberValue(1);
        NumberValue b = new NumberValue(5);
        NumberValue c = new NumberValue(3);
        NumberValue d = new NumberValue(8);

        NumberService numberService = new NumberService();
        boolean atLeastTwoEvenNumbers = numberService.atLeastTwoEvenNumbers(a, b, c, d);

        NumberWriter numberWriter = new NumberWriter();
        numberWriter.printReport(atLeastTwoEvenNumbers);
    }
}
