package lesson_18_Arrays;

import java.util.Scanner;
/*Нека имаме следният масив:

int[] myArray = { 1, 4, 6, 2, 10, 5 };
Напишете програма, която очаква потребителят да въведе число
и след това намира на кой индекс се намира това число в дадения масив.

Ако числото не е в масива, нека програмата отпечата -1.*/

public class Exercise_04_FindElementIndex {
    public static void main(String[] args) {
        int[] myArray = { 1, 4, 6, 2, 10, 5 };

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        boolean finded = false;

        for (int i = 0; i < myArray.length; i++) {
            if (number == myArray[i]){
                System.out.println(i);
                finded = true;
            }
        }

        if (finded != true){
            System.out.println(-1);
        }
    }
}
