package com.gojek.ristek.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void shouldReturnCorrectResultWhenAddingTwoValues() {
        Calculator calculator = new Calculator();
        int actual = calculator.add(1, 3);
        int expected = 4;
        assertEquals(expected, actual);
    }
}
