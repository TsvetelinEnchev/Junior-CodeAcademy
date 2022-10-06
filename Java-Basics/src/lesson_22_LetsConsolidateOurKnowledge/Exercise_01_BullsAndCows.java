package lesson_22_LetsConsolidateOurKnowledge;

import java.util.Scanner;

public class Exercise_01_BullsAndCows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Тайно число: ");
        int input = Integer.parseInt(scanner.nextLine());

        int[] secretNumber = new int[4];
        secretNumber = splitInputAndFillArray(input, secretNumber);

        int[] assumption = new int[4];

        boolean winner = false;

        while (winner != true){
            int bullsCounter = 0;
            int cowsCounter = 0;

            System.out.print("-> ");
            input = Integer.parseInt(scanner.nextLine());

            if (input <= 999){
                System.out.println("Невалиден опит!");
                continue;
            }

            assumption = splitInputAndFillArray(input, assumption);

            for (int i = 0; i < secretNumber.length; i++) {
                if (secretNumber[i] == assumption[i]){
                    bullsCounter++;
                    continue;
                }else{
                    for (int j = 0; j < assumption.length; j++) {
                        if (secretNumber[i] == assumption[j]) {
                            cowsCounter++;
                        }
                    }
                }
            }
            if (bullsCounter == 4){
                winner = true;
                System.out.printf("%d бикове, %d крави\n", bullsCounter, cowsCounter);
            }else{
                System.out.printf("%d бикове, %d крави\n", bullsCounter, cowsCounter);
            }
        }
    }

    private static int[] splitInputAndFillArray(int input, int[] secretNumber) {
        int numToInsert;
        for (int i = secretNumber.length - 1; i >= 0; i--) {
            numToInsert = input % 10;
            input = input / 10;
            secretNumber[i] = numToInsert;
        }
        return secretNumber;
    }
}
