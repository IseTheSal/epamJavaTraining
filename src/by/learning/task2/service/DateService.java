package by.learning.task2.service;

public class DateService {

    public static int longDayMonth = 31;
    public static int shortDayMonth = 30;
    public static int leapDay = 29;
    public static int notLeapDay = 28;

    public static int firstValueOfLeapYear = 400;
    public static int secondValueOfLeapYear = 4;
    public static int thirdValueOfLeapYear = 100;

    public boolean dateIsLeap(int year) {
        boolean isLeap;
        if (year % firstValueOfLeapYear == 0) {
            isLeap = true;
        } else {
            isLeap = (year % secondValueOfLeapYear == 0) && (year % thirdValueOfLeapYear != 0);
        }
        return isLeap;
    }

    public int receiveMaxDayOfMonth(int month, boolean leap) {
        if (month == 2) {
            return leap ? leapDay : notLeapDay;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return longDayMonth;
            default:
                return shortDayMonth;
        }
    }
}
