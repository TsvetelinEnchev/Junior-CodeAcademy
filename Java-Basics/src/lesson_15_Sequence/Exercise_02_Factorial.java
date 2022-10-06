package lesson_15_Sequence;

import java.math.BigInteger;
import java.util.Scanner;

//Направете програма Factorial, която изчислява факториел на положително число въведено от конзолата.
//Потребителят може да въведе невалидно число (нула или отрицателно).
// Искайте да въведе число, докато не въведе положително.

public class Exercise_02_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        while(num <= 0){
            num = scanner.nextInt();
        }

        BigInteger factorial = BigInteger.ONE;

        for(int i = 1; i <= num; ++i) {

            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factorial);

    }
}
