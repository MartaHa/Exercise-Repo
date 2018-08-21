package pl.marta.exercise.lambda;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class EqualsExercise {
//
//    Napisz program, który wywoła funkcję equals na instancji klasy
//    Object używając mechanizmu odwoływania się do metody (przy pomocy ::).

    public static void main(String[] args) {


        Supplier<Object> newObject = Object::new;
        Object objectInstance = newObject.get();

        Predicate<Object> isEqual = objectInstance::equals;
        isEqual.test(newObject);
    }
}
