package lesson_19_Lists;

import java.util.Scanner;
/*Напишете програма, която събира въведените от потребителя цели числа.
 Въвеждането продължава докато потребителя въведе 0.*/

public class Exercise_05_ListSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        do {
            number = scanner.nextInt();
            sum += number;
        }while (number != 0);

        System.out.println(sum);
    }
}
