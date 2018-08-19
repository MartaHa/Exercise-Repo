package pl.marta.exercise.generics.FiguresBox.Boxes;

public class StandardBox <T> {

     private T element;

    public StandardBox(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}
