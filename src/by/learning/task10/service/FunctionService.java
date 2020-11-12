package by.learning.task10.service;

import by.learning.task10.writer.FunctionWriter;

public class FunctionService {

    public void functionCalcTan(int a, int b, int h) {
        for (int i = a; i <= b; i += h) {
            double result = calcTan(i);
            FunctionWriter.printFunctionValues(i, result);
        }
    }

    public double calcTan(int a) {
        return Math.tan(a);
    }


}
