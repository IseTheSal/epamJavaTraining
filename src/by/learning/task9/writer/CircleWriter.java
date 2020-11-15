package by.learning.task9.writer;

public class CircleWriter {

    public void printCircleInfo(double radius, double area, double circumference) {
        if (radius == 0) {
            System.out.println("Incorrect data");
        }
        System.out.println("Radius: " + radius + " Area: " + area +
                " getCircumference: " + circumference);
    }

}
