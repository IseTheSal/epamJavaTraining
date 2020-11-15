package by.learning.day1.task2.entity;

public class CustomDate {

    private int year;
    private int month;
    private int day;


    public CustomDate() {
    }

    public CustomDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public CustomDate(int year, int month) {
        this.year = year;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Date{");
        sb.append("year=").append(year);
        sb.append(", month=").append(month);
        sb.append(", day=").append(day);
        sb.append('}');
        return sb.toString();
    }
}
