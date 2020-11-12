package by.learning.task5.service;

import by.learning.task5.entity.NumberValue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberServiceTest {

    @Test
    public void testIsPerfectNumber1() {
        NumberValue a = new NumberValue(6);
        NumberService numberService = new NumberService();
        boolean actual = numberService.isPerfectNumber(a.getValue());
        Assert.assertTrue(actual);
    }

    @Test
    public void testIsPerfectNumber2() {
        NumberValue a = new NumberValue(7);
        NumberService numberService = new NumberService();
        boolean actual = numberService.isPerfectNumber(a.getValue());
        Assert.assertFalse(actual);
    }
}