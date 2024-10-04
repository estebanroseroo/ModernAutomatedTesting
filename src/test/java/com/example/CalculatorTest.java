package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    //Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        // int result = calculator.add(2, 3);
        // assertEquals(5, result, "2 + 3 should equal 5");

        //assertEquals(5, calculator.add(2,3), "2 + 3 should equal 5");

        assertTrue(calculator.add(2, 3) == 5, "2 + 3 should equal 5");
    }

    @Test
    public void testSubtract() {
        Calculator  calculator = new Calculator();
        // int result = calculator.subtract(3,2);
        // assertEquals(1, result, "3 - 2 should equal 1");
        
        assertEquals(1, calculator.subtract(3,2), "3 - 2 should equal 1");
    }

    @Test
    public void testMultiply() {
        Calculator  calculator = new Calculator();
        assertEquals(4, calculator.multiply(2,2), "2 * 2 should equal 4");
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(4,2), "4 / 2 should equal 2");
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.divide(4, 0), "Division by zero is not valid");
    }
}