package lesson_19_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_08_SumOfCouples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int input;
        int sum;

        while (true){
            input = scanner.nextInt();
            if (input == 0){
                break;
            }
            numbers.add(input);
        }

        sum = scanner.nextInt();

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) + numbers.get(j) == sum){
                    System.out.println(numbers.get(i) + " " + numbers.get(j));
                }
            }
        }
    }
}
