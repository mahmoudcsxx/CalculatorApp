package calculator.service;

import calculator.operations.*;

public class CalculatorService {

    public double calculate(String op, double a, double b) {
        Operation operation;

        switch (op) {
            case "+":
                operation = new Addition();
                break;
            case "-":
                operation = new Subtraction();
                break;
            case "*":
                operation = new Multiplication();
                break;
            case "/":
                operation = new Division();
                break;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }

        return operation.execute(a, b);
    }
}