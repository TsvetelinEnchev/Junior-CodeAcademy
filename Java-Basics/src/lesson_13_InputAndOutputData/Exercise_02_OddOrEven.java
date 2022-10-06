package lesson_13_InputAndOutputData;

import java.util.Scanner;

//Напишете програма, която прочита число от конзолата и отпечатва дали то е четно или нечетно.
//Ако числото е четно, трябва да се изпише “even” (без кавичките),
//а ако е нечетно - трябва да се изпише “odd”.

public class Exercise_02_OddOrEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number =  scanner.nextInt();

        String result = (number % 2 == 0)? "even" : "odd";

        System.out.println(result);
    }
}
