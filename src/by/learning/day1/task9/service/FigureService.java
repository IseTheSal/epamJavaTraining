package by.learning.day1.task9.service;

public class FigureService {

    public double receiveArea(double radius) {
        return (radius * radius * Math.PI);
    }

    public double receiveCircumference(double radius) {
        return (2 * radius * Math.PI);
    }
}
