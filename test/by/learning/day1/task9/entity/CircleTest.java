package by.learning.day1.task9.entity;

import by.learning.day1.task9.service.FigureService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleTest {

    @Test
    public void testGetRadius() {
        Circle circle = new Circle(5);
        double actual = circle.getRadius();
        Assert.assertEquals(actual, 5);
    }

    @Test
    public void testGetArea() {
        Circle circle = new Circle(5);
        FigureService figureService = new FigureService();
        double actual = figureService.receiveArea(circle.getRadius());
        Assert.assertEquals(actual, 78.53981633974483);
    }

    @Test
    public void testGetCircumference() {
        Circle circle = new Circle(5);
        FigureService figureService = new FigureService();
        double actual = figureService.receiveCircumference(circle.getRadius());
        Assert.assertEquals(actual, 31.41592653589793);
    }
}