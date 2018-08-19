package pl.marta.exercise.generics.FiguresBox.Boxes;

public class GoldBox <T> extends StandardBox<T> {



    public GoldBox(T element) {
        super(element);
    }

    public void madeOf(String element){
        System.out.println("I'm made of: " + element + " gold");
    }
}


