package lesson_15_Sequence;

import java.util.Locale;
import java.util.Scanner;

//Направете програма, която прочита дума от конзолата и проверява дали е палиндром.
//Игнорирайте малки-големи букви.
//Ако думата е палиндром, да отпечата true, в противен случай false.

public class Exercise_03_Palindrom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.next().toLowerCase(Locale.ROOT);
        String reversed = "";
        boolean isPalindrom = false;

        int lenght = word.length();

        for (int i = lenght - 1; i >= 0; i--) {
            reversed = reversed.toLowerCase() + word.charAt(i);
        }

        if (word.equals(reversed)) {
            isPalindrom = true;
        }

        System.out.println(isPalindrom);
    }
}