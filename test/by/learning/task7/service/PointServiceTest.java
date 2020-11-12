package by.learning.task7.service;

import by.learning.task7.entity.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointServiceTest {

    @Test
    public void testGetNearestPoint() {
        Point a = new Point(-4, 3);
        Point b = new Point(-1, 4);
        PointService pointService = new PointService();
        Point actual = pointService.getNearestPoint(a, b);
        Assert.assertEquals(actual, b);
    }
}