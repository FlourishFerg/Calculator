package com.example.calculator;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {

        assertEquals(5, calculator.sum(2, 3));
    }
}