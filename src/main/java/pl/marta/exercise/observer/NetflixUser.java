package pl.marta.exercise.observer;

public class NetflixUser implements Observer {

    private String name;
    private int videoesToWatch;

    public NetflixUser(String name) {
        this.name = name;
        this.videoesToWatch = 0;
    }

    @Override
    public void update() {
        videoesToWatch++;


    }
}
