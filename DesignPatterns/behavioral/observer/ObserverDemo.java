// Observer Pattern - Minimal Demo
interface Observer {
    void update(String message);
}

interface Subject {
    void attach(Observer observer);
    void notifyObservers(String message);
}

class ConcreteSubject implements Subject {
    private final java.util.List<Observer> observers = new java.util.ArrayList<>();

    @Override
    public void attach(final Observer observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }

    @Override
    public void notifyObservers(final String message) {
        for (final Observer obs : observers) {
            obs.update(message);
        }
    }
}

class ConcreteObserver implements Observer {
    private final String name;

    ConcreteObserver(final String name) { this.name = name; }

    @Override
    public void update(final String message) {
        System.out.println(name + " received: " + message);
    }
}

public class ObserverDemo {
    public static void main(final String[] args) {
        final Subject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver("A"));
        subject.attach(new ConcreteObserver("B"));

        subject.notifyObservers("Hello Observers");
    }
}

