package observer;

import java.util.*;

public class OccupancySensor {
    private List<Observer> observers = new ArrayList<>();
    private boolean occupied = false;

    public void addObserver(Observer obs) { observers.add(obs); }
    public void removeObserver(Observer obs) { observers.remove(obs); }

    public void setOccupied(boolean state) {
        this.occupied = state;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(occupied);
        }
    }
}
