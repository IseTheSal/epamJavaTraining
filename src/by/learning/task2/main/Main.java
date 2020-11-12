package by.learning.task2.main;

import by.learning.task2.entity.Date;
import by.learning.task2.writer.DateWriter;
import by.learning.task2.service.DateService;

public class Main {

    public static void main(String[] args) {
        Date date = new Date(2132, 12);
        DateService dateService = new DateService();
        boolean isLeap = dateService.dateIsLeap(date.getYear());
        int maxDayOfMonth = dateService.getMaxDayOfMonth(date.getMonth(), isLeap);
        DateWriter.printDateInformation(date.getYear(), date.getMonth(), isLeap, maxDayOfMonth);
    }
}
