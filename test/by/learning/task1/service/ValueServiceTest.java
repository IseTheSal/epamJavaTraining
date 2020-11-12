package by.learning.task1.service;

import by.learning.task1.entity.NumberValue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValueServiceTest {

    @Test
    public void testGetLastSquareNumeralOfNumber1() {
        NumberValue number = new NumberValue(-35);
        ValueService valueService = new ValueService();
        int actual = valueService.getLastSquareNumeralOfNumber(number);
        Assert.assertEquals(actual, 5);
    }

    @Test
    public void testGetLastSquareNumeralOfNumber2() {
        NumberValue number = new NumberValue(35);
        ValueService valueService = new ValueService();
        int actual = valueService.getLastSquareNumeralOfNumber(number);
        Assert.assertEquals(actual, 5);
    }

    @Test
    public void testGetLastSquareNumeralOfNumber3() {
        NumberValue number = new NumberValue(36);
        ValueService valueService = new ValueService();
        int actual = valueService.getLastSquareNumeralOfNumber(number);
        Assert.assertEquals(actual, 6);
    }
}