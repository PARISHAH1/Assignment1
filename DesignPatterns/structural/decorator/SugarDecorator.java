public class SugarDecorator extends CoffeeDecorator {
    private static final String DESC_SUFFIX = ", Sugar";
    private static final double COST_INCREMENT = 10.0;

    public SugarDecorator(final Coffee coffee) { super(coffee); }

    @Override
    public String getDescription() { return coffee.getDescription() + DESC_SUFFIX; }

    @Override
    public double getCost() { return coffee.getCost() + COST_INCREMENT; }
}
