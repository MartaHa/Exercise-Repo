package pl.marta.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.marta.exercise.enumExercise.EyesColor;
import pl.marta.exercise.enumExercise.HairColor;
import pl.marta.exercise.enumExercise.Human;
import pl.marta.exercise.enumExercise2.Computation;

@SpringBootApplication
public class ExerciseApplication {

    public static void main(String[] args) {


    Human human = new Human(1, "Anna", EyesColor.Blue, HairColor.Black );
        System.out.println(human.toString());
        SpringApplication.run(ExerciseApplication.class, args);


    System.out.println("3 + 4 = " + Computation.ADD.perform(3, 4));
        System.out.println("3 - 4 = " + Computation.SUBSTRACT.perform(3, 4));
        System.out.println("3 * 4 = " + Computation.MULTIPLY.perform(3, 4));
        System.out.println("3 / 4 = " + Computation.DIVIDE.perform(3, 4));
}
}


