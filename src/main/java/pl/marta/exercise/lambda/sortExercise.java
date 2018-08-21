package pl.marta.exercise.lambda;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class sortExercise {

//    Napisz program, który pobierze o użytkownika cztery łańcuchy znaków, które umieścisz w liście.
// Następnie posortuj tę listę używając metody sort. Użyj wyrażenia lambda, które posortuje łańcuchy znaków
// malejąco po długości.


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        List<String> words = new LinkedList<>();

        for (int i = 1; i <= 4; i++) {
            System.out.println("Enter a word: ");
            String word = scanner.nextLine();
            words.add(word);
        }

        //sorting
        words.sort(Comparator.comparingInt(String::length).reversed());
        words.forEach(System.out::println);
        //sorting2
        words.sort((a,b) -> a.length() - b.length());


    }
}
