package pl.marta.exercise.generics.FiguresBox.Box;



public class MainFigures {

    public static void main(String[] args) {

        BoxWithFigures<Square> square = new BoxWithFigures<Square>(new Square());
        BoxWithFigures<Circle> circle = new BoxWithFigures<>(new Circle());
        System.out.println(square.getElementsName());
        System.out.println(circle.getElementsName());
    }
}
