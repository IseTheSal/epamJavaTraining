package by.learning.task3.main;

import by.learning.task3.entity.Circle;
import by.learning.task3.entity.Square;
import by.learning.task3.writer.FigureWriter;
import by.learning.task3.service.FigureService;

public class Main {

    public static void main(String[] args) {
        FigureService figureService = new FigureService();
        Square square1 = new Square(25);
        Circle circle = new Circle();
        circle.setRadius(figureService.getRadiusOfInscribedInSquareCircle(square1.getSide()));
        Square square2 = new Square();
        square2.setArea(figureService.getAreaOfCircumscribedInCircleSquare(circle.getRadius()));
        FigureWriter.printSquareInfo(square2);
        FigureWriter.printDifferenceTimes(square1, square2);
    }
}
