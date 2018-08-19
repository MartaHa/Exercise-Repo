package pl.marta.exercise.generics.FiguresBox.Boxes;

public class Main {

    public static void main(String[] args) {
        GoldBox<String> goldBox = new GoldBox<String>("it");
        goldBox.madeOf("200g");
    }
}
