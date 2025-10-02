package DesignPatterns.behavioral.strategy;

// Strategy Pattern - Minimal Demo
interface Strategy {
    int execute(int a, int b);
}

class AddStrategy implements Strategy {
    @Override
    public int execute(final int a, final int b) { return a + b; }
}

class MultiplyStrategy implements Strategy {
    @Override
    public int execute(final int a, final int b) { return a * b; }
}

class Calculator {
    private Strategy strategy;

    public void setStrategy(final Strategy strategy) { this.strategy = strategy; }
    public int compute(final int a, final int b) { return strategy.execute(a, b); }
}

public class StrategyDemo {
    public static void main(final String[] args) {
        final Calculator calc = new Calculator();
        calc.setStrategy(new AddStrategy());
        System.out.println("Add: " + calc.compute(3, 4));

        calc.setStrategy(new MultiplyStrategy());
        System.out.println("Multiply: " + calc.compute(3, 4));
    }
}

