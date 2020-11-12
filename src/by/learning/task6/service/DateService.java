package by.learning.task6.service;

import by.learning.task6.entity.DateValue;

public class DateService {

    public String timePassed(int secondsValue) {
        while (secondsValue > 86400) {
            secondsValue -= 86400;
        }
        int hours = secondsValue / 3600;
        int minutes = (secondsValue - hours * 3600) / 60;
        int seconds = secondsValue - (hours * 3600) - (minutes * 60);
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
