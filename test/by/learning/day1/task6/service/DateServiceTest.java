package by.learning.day1.task6.service;

import by.learning.day1.task6.entity.DateValue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DateServiceTest {

    @Test
    public void testTimePassed() {
        DateService dateService = new DateService();
        String actual = dateService.timePassed(186602);
        Assert.assertEquals(actual, "3:50:2");
    }

    @Test
    public void testParseDate() {
        String timePassed = "3:50:2";
        DateService dateService = new DateService();
        String actual = dateService.parseDate(timePassed).toString();
        String expected = new DateValue(3, 50, 2).toString();
        Assert.assertEquals(actual, expected);
    }
}