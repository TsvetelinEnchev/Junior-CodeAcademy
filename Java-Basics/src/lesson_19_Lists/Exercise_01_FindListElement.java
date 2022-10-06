package lesson_19_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*Направете променлива, която е списък от цели числа.
Инициализирайте списъка със следните елементи: 1, 4, 6, 2, 10, 5.
Напишете програма, която очаква потребителя да въведе число
и след това намира на кой индекс се намира това число в даденият масив.
Ако числото не е в списъка, нека програмата отпечата -1.*/

public class Exercise_01_FindListElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int picketNumber = Integer.parseInt(scanner.nextLine());

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 4, 6, 2, 10, 5));
        boolean finded = false;

        for (int i = 0; i < numbers.size(); i++) {
            if (picketNumber == numbers.get(i)){
                finded = true;
                break;
            }
        }
        if (finded != true){
            System.out.println(-1);
        }
        else{
            System.out.println(numbers.indexOf(picketNumber));
        }
    }
}
