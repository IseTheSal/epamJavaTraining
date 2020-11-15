package by.learning.task2.main;

import by.learning.task2.entity.CustomDate;
import by.learning.task2.service.DateService;
import by.learning.task2.writer.DateWriter;

public class Main {

    public static void main(String[] args) {
        CustomDate date = new CustomDate(2132, 12);
        DateService dateService = new DateService();
        boolean isLeap = dateService.dateIsLeap(date.getYear());
        int maxDayOfMonth = dateService.receiveMaxDayOfMonth(date.getMonth(), isLeap);
        DateWriter dateWriter = new DateWriter();
        dateWriter.printDateInformation(date.getYear(), date.getMonth(), isLeap, maxDayOfMonth);
    }
}
