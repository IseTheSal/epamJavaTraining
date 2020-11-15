package by.learning.task8.main;

import by.learning.task8.service.FunctionService;
import by.learning.task8.writer.FunctionWriter;

public class Main {

    public static void main(String[] args) {

        FunctionService functionService = new FunctionService();
        FunctionWriter functionWriter = new FunctionWriter();

        double result1 = functionService.result(3);
        functionWriter.printFunctionResult(result1);
        double result2 = functionService.result(-3);
        functionWriter.printFunctionResult(result2);
    }
}
