package pl.marta.exercise.observer;

public interface Subject {

    void register (Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
