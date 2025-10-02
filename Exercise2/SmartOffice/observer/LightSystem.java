package SmartOffice.observer;

public class LightSystem implements Observer {
    private boolean on;

    @Override
    public void update(boolean occupied) {
        on = occupied;
        System.out.println("LightSystem " + (on ? "ON" : "OFF"));
    }
}
