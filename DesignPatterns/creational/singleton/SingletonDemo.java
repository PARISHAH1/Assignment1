// Singleton Pattern - Minimal Demo
final class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() { }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public String greet() { return "Hello from Singleton"; }
}

public class SingletonDemo {
    public static void main(final String[] args) {
        final Singleton s1 = Singleton.getInstance();
        final Singleton s2 = Singleton.getInstance();
        System.out.println(s1.greet() + ", same instance: " + (s1 == s2));
    }
}

