package by.learning.task3.main;

import by.learning.task3.entity.Circle;
import by.learning.task3.entity.Square;
import by.learning.task3.service.FigureService;
import by.learning.task3.writer.FigureWriter;

public class Main {

    public static void main(String[] args) {
        FigureService figureService = new FigureService();
        Square square1 = new Square(25);
        Circle circle = new Circle();
        double sideSquare1 = figureService.receiveSquareSide(square1.getArea());
        circle.setRadius(figureService.receiveRadiusOfInscribedInSquareCircle(sideSquare1));

        Square square2 = new Square();
        square2.setArea(figureService.receiveAreaOfCircumscribedInCircleSquare(circle.getRadius()));

        FigureWriter figureWriter = new FigureWriter();
        figureWriter.printSquareInfo(sideSquare1, square1.getArea());
        double areaDifference = square1.getArea() / square2.getArea();
        figureWriter.printDifferenceTimes(areaDifference);
    }
}
