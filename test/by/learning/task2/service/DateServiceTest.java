package by.learning.task2.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class DateServiceTest {

    @Test
    public void testDateIsLeap1() {
        DateService dateService = new DateService();
        int year = 2000;
        boolean actual = dateService.dateIsLeap(year);
        assertTrue(actual);
    }

    @Test
    public void testDateIsLeap2() {
        DateService dateService = new DateService();
        int year = 1764;
        boolean actual = dateService.dateIsLeap(year);
        assertTrue(actual);
    }

    @Test
    public void testDateIsLeap3() {
        DateService dateService = new DateService();
        int year = 1844;
        boolean actual = dateService.dateIsLeap(year);
        assertTrue(actual);
    }

    @Test
    public void testDateIsLeap4() {
        DateService dateService = new DateService();
        int year = 1992;
        boolean actual = dateService.dateIsLeap(year);
        assertTrue(actual);
    }

    @Test
    public void testDateIsLeap5() {
        DateService dateService = new DateService();
        int year = 1999;
        boolean actual = dateService.dateIsLeap(year);
        assertFalse(actual);
    }

    @Test
    public void testDateIsLeap6() {
        DateService dateService = new DateService();
        int year = 2021;
        boolean actual = dateService.dateIsLeap(year);
        assertFalse(actual);
    }


}