package sk.mba.operation;

public class Division implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a/b;
    }
}
