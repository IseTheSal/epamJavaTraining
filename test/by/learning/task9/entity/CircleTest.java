package by.learning.task9.entity;

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
        double actual = circle.getArea();
        Assert.assertEquals(actual, 78.53981633974483);
    }

    @Test
    public void testGetCircumference() {
        Circle circle = new Circle(5);
        double actual = circle.getCircumference();
        Assert.assertEquals(actual, 31.41592653589793);
    }
}