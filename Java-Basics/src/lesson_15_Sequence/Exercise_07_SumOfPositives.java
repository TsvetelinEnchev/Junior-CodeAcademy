package lesson_15_Sequence;

import java.util.Scanner;

//Напишете програма, която събира въведените от потребителя числа, докато въведе 0 или отрицателно число.
//Нека всеки път преди потребителят въведе число, да се отпечатва подканващ стринг "Въведете положително число:".
//Потребителят трябва да може да въведе числото на същият ред, а не на следващ.
//Отпечатайте :
//Сумата с точност до вторият знак след десетичната запетая.
//Кое е най-голямото въведено число
//Кое е най-малкото въведено число

public class Exercise_07_SumOfPositives {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете положително число: ");

        double number = scanner.nextDouble();

        double counter = 0;
        double minValue = Double.MAX_VALUE;
        double maxValue = Double.MIN_VALUE;

        while (number > 0){

            counter += number;

            if (number < minValue){
                minValue = number;
            }
            if (number > maxValue){
                maxValue = number;
            }

            System.out.print("Въведете положително число: ");

            number = scanner.nextDouble();
        }
        System.out.printf("%.2f%n", counter);
        System.out.println(maxValue);
        System.out.println(minValue);
    }
}
