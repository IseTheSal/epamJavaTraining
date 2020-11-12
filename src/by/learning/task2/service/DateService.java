package by.learning.task2.service;

public class DateService {

    public boolean dateIsLeap(int year) {
        if (year % 400 == 0) {
            return true;
        }
        return year % 4 == 0 && year % 100 != 0;
    }

    public int getMaxDayOfMonth(int month, boolean leap) {
        if (month == 2) {
            return leap ? 29 : 28;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            default:
                return 30;
        }
    }
}
