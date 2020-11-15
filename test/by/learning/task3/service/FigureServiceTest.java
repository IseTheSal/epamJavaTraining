package by.learning.task3.service;

import by.learning.task3.entity.Circle;
import by.learning.task3.entity.Square;
import by.learning.task3.writer.FigureWriter;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

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