package by.learning.task9.writer;

import by.learning.task9.entity.Circle;

public class CircleWriter {

    public static void printCircleInfo(Circle circle) {
        if (circle.getRadius() == 0) System.out.println("Incorrect data");
        System.out.println("Radius: " + String.format("%.3f", circle.getRadius()) +
                " Area: " + String.format("%.3f", circle.getArea()) +
                " getCircumference: " + String.format("%.3f", circle.getCircumference()));
    }

}
