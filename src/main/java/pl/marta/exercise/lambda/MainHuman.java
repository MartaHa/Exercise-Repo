package pl.marta.exercise.lambda;

import java.util.function.BiFunction;

public class MainHuman {

    public static void main(String[] args) {

        BiFunction<Integer, String, Human> human = Human::new;
        Human George = human.apply(23,"George");
        System.out.println(George.getAge());
        System.out.println(George.getName());

    }
}
