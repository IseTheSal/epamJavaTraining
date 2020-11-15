package by.learning.task10.service;

import by.learning.task10.writer.FunctionWriter;

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
