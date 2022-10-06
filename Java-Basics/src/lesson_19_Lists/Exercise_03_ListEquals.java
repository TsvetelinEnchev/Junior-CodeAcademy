package lesson_19_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*Създайте списък от цели числа със следните елементи: { 1, 10, 15 }
Напишете програма, която очаква потребителя да въведе 3 числа, които съхранявате в друг списък.
Сверете дали елементите на въведения списък са същите като в първия и ако са,
отпечатайте “true”, в противен случай - “false”.*/

public class Exercise_03_ListEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> myList = new ArrayList<Integer>(Arrays.asList(1, 10, 15));
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int i = 0; i < myList.size(); i++) {
            newList.add(scanner.nextInt());
        }

        if (myList.equals(newList)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
