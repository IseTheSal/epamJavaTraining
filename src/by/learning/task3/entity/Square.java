package by.learning.task3.entity;

public class Square {

    private double area;

    public Square(double area) {
        this.area = area;
    }

    public Square() {
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getSide() {
        return Math.sqrt(area);
    }
}
