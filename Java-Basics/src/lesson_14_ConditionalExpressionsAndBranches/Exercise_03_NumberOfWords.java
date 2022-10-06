package lesson_14_ConditionalExpressionsAndBranches;

import java.util.Scanner;

//Да се отпечата “с думи” броя на думите във въведеното изречение на български език.
//Ако са повече от 10 - просто отпечатва “твърде дълго изречение” (без кавичките)

public class Exercise_03_NumberOfWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        int length = sentence.split("\\s+").length;

        if (length == 1){
            System.out.println("едно");
        }
        else if (length == 2){
            System.out.println("две");
        }
        else if (length == 3){
            System.out.println("три");
        }
        else if (length == 4){
            System.out.println("четири");
        }
        else if (length == 5){
            System.out.println("пет");
        }
        else if (length == 6){
            System.out.println("шест");
        }
        else if (length == 7){
            System.out.println("седем");
        }
        else if (length == 8){
            System.out.println("осем");
        }
        else if (length == 9){
            System.out.println("две");
        }
        else
            System.out.println("твърде дълго изречение");

    }
}