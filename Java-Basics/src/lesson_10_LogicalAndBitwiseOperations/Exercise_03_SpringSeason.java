package lesson_10_LogicalAndBitwiseOperations;

//Напишете програма, в която дефинирате 2 int променливи - month & day.
//Програмата трябва да отпечатва true, ако денят е между 20-ти март (включително)
//и 20-ти юни (включително) и false, в противен случай.

public class Exercise_03_SpringSeason {
    public static void main(String[] args) {

        int month = 5;
        int day =  1;

        String result = (month == 3 && day >= 20 && day <= 31) ||
                (month == 4 && day >= 1 && day <= 30) ||
                (month == 5 && day >= 1 && day <= 31) ||
                (month == 6 && day >= 1 && day <= 20) ? "true" : "false";

        System.out.println(result);
    }
}
