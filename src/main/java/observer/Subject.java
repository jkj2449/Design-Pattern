package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attatch(Observer observer) {
        observers.add(observer);
    }

    public void detatch(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for(Observer o : observers) {
            o.update();
        }
    }
}
