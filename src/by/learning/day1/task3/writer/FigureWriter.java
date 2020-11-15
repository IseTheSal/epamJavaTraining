package by.learning.day1.task3.writer;

public class FigureWriter {

    public void printCircleInfo(double radius, double area) {
        if (radius == 0) {
            System.out.println("Incorrect data");
        }
        System.out.println("Radius: " + radius + " Area: " + area);
    }

    public void printSquareInfo(double side, double area) {
        if (side == 0) {
            System.out.println("Incorrect data");
        }
        System.out.println("Side: " + side + " Area: " + area);
    }

    public void printDifferenceTimes(double difference) {
        System.out.println("Different in " + difference + " times");
    }


}
