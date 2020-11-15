package by.learning.day1.task6.main;

import by.learning.day1.task6.entity.DateValue;
import by.learning.day1.task6.service.DateService;
import by.learning.day1.task6.writer.DateWriter;

public class Main {

    public static void main(String[] args) {
        DateService dateService = new DateService();
        String timePassed = dateService.timePassed(186602);
        DateValue dateValue = dateService.parseDate(timePassed);

        DateWriter dateWriter = new DateWriter();
        dateWriter.printDate(dateValue.getHours(), dateValue.getMinutes(), dateValue.getSeconds());
    }
}
