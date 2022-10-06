package lesson_18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*Направeте програма, която прочита две думи от конзолата и отпечатва true, ако те са анаграми
и false, ако не са. Абстрахирайте се от големината на буквите.*/

public class Exercise_01_Anagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] firstWord = scanner.next().toLowerCase().toCharArray();
        char[] secondWord = scanner.next().toLowerCase().toCharArray();

        boolean isAnagram = true;

        if (firstWord.length != secondWord.length) {
            isAnagram = false;
        }

        Arrays.sort(firstWord);
        Arrays.sort(secondWord);

        for (int i = 0; i < firstWord.length; i++) {
            if (firstWord[i] != secondWord[i]) {
                isAnagram = false;
            }
        }

        System.out.println(isAnagram);
    }
}
