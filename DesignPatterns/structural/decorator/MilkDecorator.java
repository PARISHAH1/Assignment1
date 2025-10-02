package DesignPatterns.structural.decorator;

public class MilkDecorator extends CoffeeDecorator {
    private static final String DESC_SUFFIX = ", Milk";
    private static final double COST_INCREMENT = 20.0;

    public MilkDecorator(final Coffee coffee) { super(coffee); }

    @Override
    public String getDescription() { return coffee.getDescription() + DESC_SUFFIX; }

    @Override
    public double getCost() { return coffee.getCost() + COST_INCREMENT; }
}
