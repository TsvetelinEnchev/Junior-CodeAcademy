package lesson_19_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Напишете програма, която изисква от потребителя да въвежда имена от конзолата,
като въвеждането приключва, когато потребителя въведе точка (.).
Отпечатайте 3-тото въведено име на екрана.
Сортирайте списъка и отпечатайте сортирания списък.*/

public class Exercise_06_Print3rd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        String input;

        while (true) {
            input = scanner.next();
            if (input.equals(".")){
                break;
            }
            names.add(input);

            if (names.size() == 3) {
                System.out.println(input);
            }
        }
        Collections.sort(names);
        System.out.println(names);
    }
}
