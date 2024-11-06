package org.example;

import sk.mba.AritmeticOperator;
import sk.mba.Operands;
import sk.mba.calculator.AbstractCalculator;
import sk.mba.calculator.CalculatorHolder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final static CalculatorHolder calculatorHolder = new CalculatorHolder();

    public static void main(String[] args) {
        do {
            System.out.println("Write number, then type of operator(+,-,*,/) and then write a number again");

            final double left, right;
            final AritmeticOperator operator;

            try{
                left = scanner.nextDouble();
                final String Line = scanner.next();
                operator = AritmeticOperator.getFromSymbol(Line);
                right = scanner.nextDouble();
            } catch (InputMismatchException | IllegalArgumentException e){
                System.out.println("Invalid input");
                scanner.nextLine();
                continue;
            }

            final Operands operands = new Operands(left, right);
            calculatorHolder.getSuitableCalculator(operator).calculate(operands, operator);
        } while (true);
    }
}