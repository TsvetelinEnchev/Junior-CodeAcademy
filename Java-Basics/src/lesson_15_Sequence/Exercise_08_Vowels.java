package lesson_15_Sequence;

import java.util.Locale;
import java.util.Scanner;

//Направете програма Vowels,
//която прочита изречение (на английски) от конзолата и отпечатва колко гласни има в него.

public class Exercise_08_Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().toLowerCase(Locale.ROOT);

        int length = sentence.length();
        int counter = 0;

        for (int i = 0; i < length; i++){
            if (sentence.charAt(i) == 'a'
                    || sentence.charAt(i) == 'e'
                    || sentence.charAt(i) == 'o'
                    || sentence.charAt(i) == 'i'
                    || sentence.charAt(i) == 'u'
                    || sentence.charAt(i) == 'y'){
                counter++;
            }
        }

        System.out.println(counter);
    }
}