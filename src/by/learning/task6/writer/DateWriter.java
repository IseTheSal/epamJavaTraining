package by.learning.task6.writer;

import by.learning.task6.entity.DateValue;

public class DateWriter {

    public static void printDate(DateValue dateValue) {
        System.out.println(dateValue.getHours() + ":" + dateValue.getMinutes() + ":" + dateValue.getSeconds());
    }
}
