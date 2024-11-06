package sk.mba;

public enum AritmeticOperator {

    ADDITION('+'),
    SUBSTRACTION('-'),
    MULTIPLICATION('*'),
    DIVISION('/');

    private final char symbol;

    AritmeticOperator(char symbol) {
        this.symbol = symbol;
    }

    public static AritmeticOperator getFromSymbol(String line) {
        if (line.length() == 1) {
            for (AritmeticOperator op : AritmeticOperator.values()) {
                if (op.symbol == line.charAt(0)) {
                    return op;
                }
            }
        }
        throw new IllegalArgumentException("Illegal symbol: " + line);
    }
}
