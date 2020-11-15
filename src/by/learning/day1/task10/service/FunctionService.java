package by.learning.day1.task10.service;

import by.learning.day1.task10.writer.FunctionWriter;

public class FunctionService {

    public void printCalcTan(int start, int end, int step) {
        FunctionWriter functionWriter = new FunctionWriter();
        for (int i = start; i <= end; i += step) {
            double value = calcTan(i);
            functionWriter.printFunctionValues(i, value);
        }
    }

    public double calcTan(int a) {
        return Math.tan(a);
    }


}
