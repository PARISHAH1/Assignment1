package SmartOffice.observer;

public class ACSystem implements Observer {
    private boolean running;

    @Override
    public void update(boolean occupied) {
        running = occupied;
        System.out.println("ACSystem " + (running ? "RUNNING" : "IDLE"));
    }
}
