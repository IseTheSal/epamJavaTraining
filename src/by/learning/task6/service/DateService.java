package by.learning.task6.service;

import by.learning.task6.entity.DateValue;

public class DateService {


    public static int secondsInHour = 3600;
    public static int secondsInMinute = 3600;
    public static int secondsInDay = 86400;

    public String timePassed(int secondsValue) {
        while (secondsValue > secondsInDay) {
            secondsValue -= secondsInDay;
        }
        int hours = secondsValue / secondsInHour;
        int minutes = (secondsValue - hours * secondsInHour) / secondsInMinute;
        int seconds = secondsValue - (hours * secondsInHour) - (minutes * secondsInMinute);
        return hours + ":" + minutes + ":" + seconds;
    }

    public DateValue parseDate(String dateString) {
        String[] split = dateString.split(":");
        int hours = Integer.parseInt(split[0]);
        int minutes = Integer.parseInt(split[1]);
        int seconds = Integer.parseInt(split[2]);
        return new DateValue(hours, minutes, seconds);
    }
}
