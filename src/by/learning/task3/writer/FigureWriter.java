package by.learning.task3.writer;

import by.learning.task3.entity.Circle;
import by.learning.task3.entity.Square;

public class FigureWriter {

    public static void printCircleInfo(Circle circle) {
        if (circle.getRadius() == 0) System.out.println("Incorrect data");
        System.out.println("Radius: " + String.format("%.3f", circle.getRadius()) +
                " Area: " + circle.getArea());
    }

    public static void printSquareInfo(Square square) {
        if (square.getSide() == 0) System.out.println("Incorrect data");
        System.out.println("Side: " + String.format("%.3f", square.getSide()) +
                " Area: " + square.getArea());
    }

    public static void printDifferenceTimes(Circle circle, Square square) {
        if (circle.getRadius() == 0 || square.getSide() == 0) System.out.println("Incorrect data");
        System.out.println("Different in " + circle.getArea() / square.getArea() + " times");
    }

    public static void printDifferenceTimes(Circle circle1, Circle circle2) {
        if (circle1.getRadius() == 0 || circle2.getRadius() == 0) System.out.println("Incorrect data");
        System.out.println("Different in " + circle1.getArea() / circle2.getArea() + " times");
    }

    public static void printDifferenceTimes(Square square1, Square square2) {
        if (square1.getSide() == 0 || square2.getSide() == 0) System.out.println("Incorrect data");
        System.out.println("Different in " + square1.getArea() / square2.getArea() + " times");
    }


}
