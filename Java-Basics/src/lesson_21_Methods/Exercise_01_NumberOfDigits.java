package lesson_21_Methods;

import java.util.Scanner;

/*Направете метод, който отпечатва броя на цифри в дадено число.
Направете програма, която очаква от потребителя да въведе цяло число
и след това извиква горният метод, за да отпечата броят на цифрите във веведеното число.*/


public class Exercise_01_NumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        numberOfDigits(num);
    }

    private static void numberOfDigits(int num) {
        int counter = 0;
        while (num != 0){
            num = num / 10;
            counter++;
        }
        System.out.println(counter);
    }
}
