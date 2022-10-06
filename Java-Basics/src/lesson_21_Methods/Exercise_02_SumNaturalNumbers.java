package lesson_21_Methods;

import java.util.Scanner;

/*Целите, положителни числа 1,2,3 … се казват още натурални числа.
Нека вашата програма очаква от потребителя да въведе едно число и
после използвайки рекурсивна функция, да изчисли сбора на всички числа от 1 до въведеното число.*/

public class Exercise_02_SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        System.out.println(sumNumbersRecursion(num));

    }

    private static int sumNumbersRecursion(int num) {

        if (num == 1){
            return 1;
        }

        return num + sumNumbersRecursion(num - 1);
    }
}
