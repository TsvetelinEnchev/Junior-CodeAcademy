package lesson_18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*Нека имаме следният масив: int[] myArray = { 1, 10, 15 };
Напишете програма, която очаква потребителя да въведе 3 числа, които съхранявате в масив.
Сверете дали елементите на въведения масив е същият,
като myArray и ако е, отпечатайте “true”, в противен случай - “false”.*/

public class Exercise_01_ArrayEquals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] myArray = {1, 10, 15};
        int[] inputArray = new int[3];

        boolean areTheSame = true;

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = scanner.nextInt();
        }

        Arrays.sort(myArray);
        Arrays.sort(inputArray);

        for (int i = 0; i < myArray.length; i++) {
            if (inputArray[i] != myArray[i]){
                areTheSame = false;
            }
        }

        if(areTheSame){
            System.out.println(areTheSame);
        }
        else {
            System.out.println(areTheSame);
        }
    }
}
