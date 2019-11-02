package com.gojek.ristek.calculator;

public class CalculatorWithHistory {
    private Calculator calculator;
    private ICalculatorRepository calculatorRepository;

    public CalculatorWithHistory(ICalculatorRepository calculatorRepository) {
        this.calculator = new Calculator();
        this.calculatorRepository = calculatorRepository;
    }

    public int add(int value1, int value2) {
        // TODO: some implementation here
        return 0;
    }
}
