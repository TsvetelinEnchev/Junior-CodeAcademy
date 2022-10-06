package lesson_18_Arrays;

import java.util.Scanner;

/*Напишете програма, която подканва потребителя да въведе брой на състезателите
и след това да въведе техния резултат в секунди и се записват в масив.

Отпечатва:

Всички резултати
Най-бързия
Най-бавния
Средно аритметично (avg)
Стандартно отклонение (standard deviation). За помощ:
сд1 = сумата от всички ( (елемент - avg) на квадрат)
сд = корен квадратен ( сд1 / броя на елементите)*/

public class Exercise_05_Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of players: \n");
        int countOfPlayers = Integer.parseInt(scanner.nextLine());

        double[] scores = new double[countOfPlayers];

        double maxValue = Double.MIN_VALUE;
        double minValue = Double.MAX_VALUE;
        double counter = 0;
        double average = 0;
        double standartDeviation1 = 0;
        double standartDeviation = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Enter the player`s score: №%d \n", i);
            scores[i] = Double.parseDouble(scanner.nextLine());

            if (scores[i] >= maxValue){
                maxValue = scores[i];
            }
            if (scores[i] <= minValue){
                minValue = scores[i];
            }

            counter += scores[i];
        }

        average = counter / countOfPlayers;
        standartDeviation1 = counter / scores.length;

        for (int i = 0; i < scores.length; i++) {
            standartDeviation += Math.pow(scores[i] - standartDeviation1, 2);
        }

        standartDeviation = Math.sqrt(standartDeviation / scores.length);

        System.out.printf("Min      = %.3f\n",minValue);
        System.out.printf("Max      = %.3f\n",maxValue);
        System.out.printf("Average  = %.3f\n",average);
        System.out.printf("StdDev   = %.3f\n",standartDeviation);

    }
}
