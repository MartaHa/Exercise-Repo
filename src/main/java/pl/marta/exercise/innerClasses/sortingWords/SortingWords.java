package pl.marta.exercise.innerClasses.sortingWords;

import java.util.*;

public class SortingWords {


    private static void printList(List<String> list) {
        for (String l : list) {
            System.out.println(l);
        }
    }


    public static void main(String[] args) {


//getting the words from user and adding them to list

        Scanner scanner = new Scanner(System.in);
        List<String> words = new LinkedList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a word");
            String word = scanner.nextLine();
            words.add(word);
        }

        //printing unsorted List

        System.out.println("Before sorting: ");
        printList(words);


        //using Comparator and printing sorted List

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                return word1.length() - word2.length();
            }
        });
        System.out.println("Words ater sorting");
        printList(words);

    }
}
