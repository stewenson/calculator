package sk.mba.calculator;

import sk.mba.AritmeticOperator;
import sk.mba.Operands;
import sk.mba.operation.Operation;

import java.util.Map;

public abstract class AbstractCalculator {

    private final String name;
    private final Map<AritmeticOperator, Operation> operationMap;


    protected AbstractCalculator(String name, Map<AritmeticOperator, Operation> operationMap) {
        this.name = name;
        this.operationMap = operationMap;
    }

    public double calculate(Operands operands, AritmeticOperator operator) {
        if (this.operationMap.containsKey(operator)) {
            final Operation operation = this.operationMap.get(operator);
            final double result = this.calculateResult(operands, operation);
            this.printResult(result);
            return result;
        } else {
            throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }

    private double calculateResult(Operands operands, Operation operation) {
        final double result = operation.calculate(operands.getLeft(), operands.getRight());
        return result;
    }

    private void printResult(double result) {
        System.out.println(this.name + "Calculated result: " +result);
    }
}
