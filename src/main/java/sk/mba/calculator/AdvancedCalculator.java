package sk.mba.calculator;

import sk.mba.AritmeticOperator;
import sk.mba.operation.Operation;

import java.util.Map;

public class AdvancedCalculator extends AbstractCalculator {

    protected AdvancedCalculator(String name, Map<AritmeticOperator, Operation> operationMap) {
        super(name, operationMap);
    }
}
