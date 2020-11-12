package by.learning.task2.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DateServiceTest {

    @Test
    public void testDateIsLeap1() {
        DateService dateService = new DateService();
        boolean isLeap = dateService.dateIsLeap(2000);
        assertTrue(isLeap);
    }
   @Test
    public void testDateIsLeap2() {
       DateService dateService = new DateService();
       boolean isLeap = dateService.dateIsLeap(1764);
       assertTrue(isLeap);
    }
   @Test
    public void testDateIsLeap3() {
       DateService dateService = new DateService();
       boolean isLeap = dateService.dateIsLeap(1844);
       assertTrue(isLeap);
    }
   @Test
    public void testDateIsLeap4() {
       DateService dateService = new DateService();
       boolean isLeap = dateService.dateIsLeap(1992);
       assertTrue(isLeap);
    }
   @Test
    public void testDateIsLeap5() {
       DateService dateService = new DateService();
       boolean isLeap = dateService.dateIsLeap(1999);
       assertFalse(isLeap);
    }
   @Test
    public void testDateIsLeap6() {
       DateService dateService = new DateService();
       boolean isLeap = dateService.dateIsLeap(2021);
       assertFalse(isLeap);
    }


}