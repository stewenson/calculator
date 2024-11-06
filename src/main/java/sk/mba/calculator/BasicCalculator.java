package sk.mba.calculator;

import sk.mba.AritmeticOperator;
import sk.mba.operation.Operation;

import java.util.Map;

public class BasicCalculator extends AbstractCalculator{

    protected BasicCalculator(String name, Map<AritmeticOperator, Operation> operationMap) {
        super(name, operationMap);
    }
}
