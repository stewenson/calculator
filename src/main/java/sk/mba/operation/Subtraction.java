package sk.mba.operation;

public class Subtraction implements Operation {

    @Override
    public double calculate(double a, double b) {
        return a-b;
    }
}
