package org.alan.java.lambda.FunctionalInterface;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class LambdaExercise {

    private static int[] scores = {10, 50 ,3};
    private static Student[] students = {
        new Student("Hong", 90, 96),
        new Student("Kong", 80, 70),
        new Student("Dong", 85, 100)
    };

    public static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[0];
        for (int i : scores) result = operator.applyAsInt(result, i);
        return result;
    }

    public static double avg(Function<Student, Integer> function){
        int sum = 0;
        for (Student student : students) sum += function.apply(student);
        return (double) sum/students.length;
    }

    public static void main(String[] args) {
        int max = maxOrMin(
            (a, b) -> {
                return a >= b ? a : b;
            }
        );
        System.out.println(max);

        int min = maxOrMin(
            (a, b) -> {
                return a <= b ? a : b;
            }
        );
        System.out.println(min);

        double englishAvg = avg(
            (Student::getEnglishScore)
        );
        System.out.println(englishAvg);

        double mathAvg = avg(
            (Student::getMathScore)
        );
        System.out.println(mathAvg);
    }

}
