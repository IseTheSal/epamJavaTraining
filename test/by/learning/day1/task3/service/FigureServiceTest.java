package by.learning.day1.task3.service;

import by.learning.day1.task3.entity.Circle;
import by.learning.day1.task3.entity.Square;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FigureServiceTest {


    @Test
    public void testGetAreaOfCircumscribedInCircleSquare() {
        FigureService figureService = new FigureService();
        Circle circle = new Circle();

        Square square1 = new Square(25);
        double squareSide1 = figureService.receiveSquareSide(square1.getArea());
        circle.setRadius(figureService.receiveRadiusOfInscribedInSquareCircle(squareSide1));

        Square square2 = new Square();
        square2.setArea(figureService.receiveAreaOfCircumscribedInCircleSquare(circle.getRadius()));

        double actual = square1.getArea() / square2.getArea();
        Assert.assertEquals(actual,2);
    }
}