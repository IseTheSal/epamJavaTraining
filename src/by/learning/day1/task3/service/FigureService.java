package by.learning.day1.task3.service;

public class FigureService {

    public double receiveRadiusOfInscribedInSquareCircle(double squareSide) {
        return squareSide;
    }

    public double receiveAreaOfCircumscribedInCircleSquare(double circleRadius) {
        return (circleRadius * circleRadius / 2);
    }

    public double receiveCircleArea(double radius) {
        return (radius * radius * Math.PI);
    }

    public double receiveSquareSide(double area) {
        return Math.sqrt(area);
    }


}
