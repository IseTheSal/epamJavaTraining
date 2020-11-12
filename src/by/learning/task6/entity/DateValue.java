package by.learning.task6.entity;

public class DateValue {

    private int hours;
    private int minutes;
    private int seconds;

    public DateValue(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 23)
            this.hours = hours;
        else
            System.out.println("Incorrect hours");
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59)
            this.minutes = minutes;
        else
            System.out.println("Incorrect minutes");
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59)
            this.seconds = seconds;
        else
            System.out.println("Incorrect seconds");
    }

    @Override
    public String toString() {
        return "DateValue{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
