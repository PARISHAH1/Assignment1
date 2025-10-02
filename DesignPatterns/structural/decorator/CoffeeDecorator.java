package DesignPatterns.structural.decorator;

public abstract class CoffeeDecorator implements Coffee {
    protected final Coffee coffee;

    protected CoffeeDecorator(final Coffee coffee) { this.coffee = coffee; }

    @Override
    public String getDescription() { return coffee.getDescription(); }

    @Override
    public double getCost() { return coffee.getCost(); }
}
