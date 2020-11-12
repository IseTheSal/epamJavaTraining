package by.learning.task10.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FunctionServiceTest {

    @Test
    public void testCalcTan() {
        FunctionService functionService = new FunctionService();
        double actual = functionService.calcTan(3);
        Assert.assertEquals(actual,-0.1425465430742778);
    }
}