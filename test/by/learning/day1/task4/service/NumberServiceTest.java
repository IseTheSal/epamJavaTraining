package by.learning.day1.task4.service;

import by.learning.day1.task4.entity.NumberValue;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class NumberServiceTest {

    @Test
    public void testAtLeastTwoEvenNumbers1() {
        NumberValue a = new NumberValue(1);
        NumberValue b = new NumberValue(5);
        NumberValue c = new NumberValue(3);
        NumberValue d = new NumberValue(8);

        NumberService numberService = new NumberService();
        boolean actual = numberService.atLeastTwoEvenNumbers(a, b, c, d);
        assertFalse(actual);
    }


    @Test
    public void testAtLeastTwoEvenNumbers2() {
        NumberValue a = new NumberValue(1);
        NumberValue b = new NumberValue(4);
        NumberValue c = new NumberValue(3);
        NumberValue d = new NumberValue(8);

        NumberService numberService = new NumberService();
        boolean actual = numberService.atLeastTwoEvenNumbers(a, b, c, d);
        assertTrue(actual);
    }
}