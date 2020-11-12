package by.learning.task7.main;

import by.learning.task7.entity.Point;
import by.learning.task7.writer.PointWriter;
import by.learning.task7.service.PointService;

public class Main {

    public static void main(String[] args) {
        Point a = new Point(-4, 3);
        Point b = new Point(-1, 4);
        PointService pointService = new PointService();
        Point nearestPoint = pointService.getNearestPoint(a, b);
        PointWriter.printPoint(nearestPoint);
    }

}
