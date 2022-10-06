package lesson_19_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Напишете програма, която изисква от потребителя да въведе 3 имена от конзолата.
След това, имената се сортират в азбучен ред и се отпечатват на екрана.*/

public class Exercise_07_SortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            names.add(scanner.next());
        }

        Collections.sort(names);
        System.out.println(names);
    }
}
