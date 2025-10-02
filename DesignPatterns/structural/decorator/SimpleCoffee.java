package DesignPatterns.structural.decorator;

public class SimpleCoffee implements Coffee {
    private static final String DESCRIPTION = "Simple Coffee";
    private static final double COST = 50.0;

    @Override
    public String getDescription() { return DESCRIPTION; }

    @Override
    public double getCost() { return COST; }
}
