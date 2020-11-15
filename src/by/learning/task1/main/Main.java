package by.learning.task1.main;

import by.learning.task1.entity.NumberValue;
import by.learning.task1.service.ValueService;
import by.learning.task1.writer.NumberWriter;

public class Main {

    public static void main(String[] args) {
        NumberValue number1 = new NumberValue(-35);
        ValueService valueService = new ValueService();
        int result1 = valueService.getLastSquareNumeralOfNumber(number1);
        NumberWriter.printNumberAndResult(number1, String.valueOf(result1));

        NumberValue number2 = new NumberValue();
        number2.writeFromConsole();
        int result2 = valueService.getLastSquareNumeralOfNumber(number2);
        NumberWriter.printNumberAndResult(number2, String.valueOf(result2));
    }

}
