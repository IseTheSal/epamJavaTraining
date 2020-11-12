package by.learning.task6.main;

import by.learning.task6.entity.DateValue;
import by.learning.task6.writer.DateWriter;
import by.learning.task6.service.DateService;

public class Main {

    public static void main(String[] args) {
        DateService dateService = new DateService();
        String timePassed = dateService.timePassed(186602);
        DateValue dateValue = dateService.parseDate(timePassed);
        DateWriter.printDate(dateValue);
    }
}
