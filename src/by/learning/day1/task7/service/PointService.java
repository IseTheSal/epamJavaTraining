package by.learning.day1.task7.service;

import by.learning.day1.task7.entity.Point;

public class PointService {

    public Point getNearestPoint(Point a, Point b) {
        double aHypot = Math.hypot(a.getX(), a.getY());
        double bHypot = Math.hypot(b.getX(), b.getY());
        return (aHypot > bHypot ? b : a);
    }


}
