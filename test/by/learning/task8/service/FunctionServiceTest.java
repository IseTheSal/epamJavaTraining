package by.learning.task8.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FunctionServiceTest {

    @Test
    public void testResult1() {
        FunctionService functionService = new FunctionService();
        double actual = functionService.result(3);
        Assert.assertEquals(actual,9);
    }


    @Test
    public void testResult2() {
        FunctionService functionService = new FunctionService();
        double actual = functionService.result(-3);
        Assert.assertEquals(actual,-0.030303030303030304);
    }

    @Test
    public void testResult3() {
        FunctionService functionService = new FunctionService();
        double actual = functionService.result(0);
        Assert.assertEquals(actual,-0.16666666666666666);
    }
}