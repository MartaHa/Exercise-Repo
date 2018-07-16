package pl.marta.exercise.observer;

import java.util.ArrayList;

public class Netflix implements Subject {

    private ArrayList<Observer> netflixUsersList;

    public Netflix() {
        netflixUsersList = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        netflixUsersList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        netflixUsersList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : netflixUsersList) {
            o.update();
        }
    }


    public void addNewFilm(){
        System.out.println("A new film is vailable");
        notifyObservers();
    }
}
