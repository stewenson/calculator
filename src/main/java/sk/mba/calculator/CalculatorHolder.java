package sk.mba.calculator;

import sk.mba.AritmeticOperator;
import sk.mba.operation.*;

import java.util.HashMap;
import java.util.Map;

public class CalculatorHolder {

    private BasicCalculator basicCalculator;
    private AdvancedCalculator advancedCalculator;

    public CalculatorHolder() {
        this.initializeCalculator();
    }

    public void initializeCalculator() {
        final Map<AritmeticOperator, Operation> bacisCaltulatorOperationMap = new HashMap<>();
        bacisCaltulatorOperationMap.put(AritmeticOperator.ADDITION, new Addition());
        bacisCaltulatorOperationMap.put(AritmeticOperator.SUBSTRACTION, new Subtraction());

        this.basicCalculator = new BasicCalculator("BasicCalculator", bacisCaltulatorOperationMap);

        final Map<AritmeticOperator, Operation> advancedCaltulatorOperationMap = new HashMap<>();
        advancedCaltulatorOperationMap.put(AritmeticOperator.MULTIPLICATION, new Multiplication());
        advancedCaltulatorOperationMap.put(AritmeticOperator.DIVISION, new Division());

        this.advancedCalculator = new AdvancedCalculator("AdvancedCalculator", advancedCaltulatorOperationMap);
    }

    public AbstractCalculator getSuitableCalculator(AritmeticOperator operator) {
        switch (operator) {
            case ADDITION,SUBSTRACTION -> {return this.basicCalculator;}
            case MULTIPLICATION,DIVISION-> {return this.advancedCalculator;}
            default -> throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }
}
