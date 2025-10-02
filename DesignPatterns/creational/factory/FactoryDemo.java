package DesignPatterns.creational.factory;

// Factory Pattern - Minimal Demo
interface Beverage {
    String serve();
}

final class Coffee implements Beverage {
    @Override
    public String serve() { return "Serving Coffee"; }
}

final class Tea implements Beverage {
    @Override
    public String serve() { return "Serving Tea"; }
}

final class BeverageFactory {
    private BeverageFactory() { }

    public static Beverage create(final String type) {
        if ("coffee".equalsIgnoreCase(type)) {
            return new Coffee();
        } else if ("tea".equalsIgnoreCase(type)) {
            return new Tea();
        }
        throw new IllegalArgumentException("Unknown beverage type: " + type);
    }
}

public class FactoryDemo {
    public static void main(final String[] args) {
        final Beverage b1 = BeverageFactory.create("coffee");
        final Beverage b2 = BeverageFactory.create("tea");
        System.out.println(b1.serve());
        System.out.println(b2.serve());
    }
}

