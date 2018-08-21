package pl.marta.exercise.lambda;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class printNumbers {

    public static void main(String[] args) {


        List<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(12);
        numbers.add(3);
        numbers.add(1);

//        Consumer<Integer> integerConsumer = n -> System.out.println(n);
//        numbers.forEach(integerConsumer);

        numbers.forEach(System.out::println);
    }
}
