package by.learning.task9.main;

import by.learning.task9.entity.Circle;
import by.learning.task9.service.FigureService;
import by.learning.task9.writer.CircleWriter;

public class Main {

    public static void main(String[] args) {
        int radius = 9;
        Circle circle1 = new Circle(radius);
        Circle circle2 = new Circle(radius);

        FigureService figureService = new FigureService();
        double area1 = figureService.receiveArea(circle1.getRadius());
        double circumference1 = figureService.receiveCircumference(radius);
        double area2 = figureService.receiveArea(circle2.getRadius());
        double circumference2 = figureService.receiveCircumference(radius);

        CircleWriter circleWriter = new CircleWriter();
        circleWriter.printCircleInfo(radius, area1, circumference1);
        circleWriter.printCircleInfo(radius, area2, circumference2);
    }

}
