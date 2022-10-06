package lesson_19_Lists;

import java.util.ArrayList;
import java.util.Arrays;

/*Направете променлива, която е списък от цели числа.
Инициализирайте списъка със следните елементи: 1, 4, 6, 2, 10, 5.
Напишете програма, която да премахне всеки елемент на нечетна позиция от списъка.
Внимавайте с for-a - ако махнете първият елемент - вторият ще стане първи. */

public class Exercise_04_ListRemoveOdd {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 4, 6, 2, 10, 5));
        ArrayList<Integer> removedNumbers = new ArrayList<>();
        for (int i = 0; i < myList.size(); i++) {
            if (i % 2 != 0){
                removedNumbers.add(myList.get(i));
            }
        }

        System.out.println(removedNumbers);
    }
}
