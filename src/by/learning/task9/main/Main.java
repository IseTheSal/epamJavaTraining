package by.learning.task9.main;

import by.learning.task9.entity.Circle;
import by.learning.task9.writer.CircleWriter;

public class Main {

    public static void main(String[] args) {
        int radius = 9;
        Circle circle1 = new Circle(radius);
        Circle circle2 = new Circle(radius);
        CircleWriter.printCircleInfo(circle1);
        CircleWriter.printCircleInfo(circle2);
    }

}
