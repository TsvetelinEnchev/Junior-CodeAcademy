package lesson_13_InputAndOutputData;

import java.util.Scanner;

//Напишете програма, която чете 1 число от конзолата,
//изчислява му корен квадратен и отпечатва резултата на екрана с точност до 5-тия знак след запетаята.

public class Exercise_01_InputAndSqrt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number = scanner.nextDouble();
        double convertToSqrt = Math.sqrt(number);

        System.out.printf("%.5f%n", convertToSqrt);
    }
}
