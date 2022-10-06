package lesson_14_ConditionalExpressionsAndBranches;

import java.util.Scanner;

//Напишете програма, която прочита 2 числа със запетая от конзолата и печата кое е по-голямото.
//Отпечатаният резултат трябва да съдържа само числото без никакви допълнителни пояснения.
//Например: “резултатът е 10” e невалидно.

public class Exercise_01_BigOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

        if (firstNumber > secondNumber){
            System.out.print(firstNumber);
        }
        else {
            System.out.println(secondNumber);
        }
    }
}
