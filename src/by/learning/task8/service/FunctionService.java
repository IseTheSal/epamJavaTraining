package by.learning.task8.service;

public class FunctionService {

    public double result(double x) {
        if (x >= 3) {
            return -(x * x) + 3 * x + 9;
        } else {
            return 1 / (x * x * x - 6);
        }
    }
}
