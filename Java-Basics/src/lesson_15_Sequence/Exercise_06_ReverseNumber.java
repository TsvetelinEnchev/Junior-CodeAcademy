package lesson_15_Sequence;

import java.util.Scanner;

//Направете програма, която печата цифрите на въведено от конзолата цяло число в обратен ред.
//Ако числото е отрицателно - просто игнорирайте знака.

public class Exercise_06_ReverseNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reverse = 0;

        if (number < 0){
            number *= -1;
        }

        while(number != 0){
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
        }

        System.out.println(reverse);
    }
}
