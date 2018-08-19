package pl.marta.exercise.generics.FiguresBox;


public class BoxWithFigures<T extends Figure> {

    private T element;

    public BoxWithFigures(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public String getElementsName() {
        return element.getName();
    }

}


