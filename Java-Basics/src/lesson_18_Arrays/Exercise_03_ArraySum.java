package lesson_18_Arrays;

/*Напишете програма, която сумира елементите на масив от цели числа и отпечатва резултата на екрана.

Инициализирайте масива със следните числа: -1, 10, 4.5, 15, 3.278 */

public class Exercise_03_ArraySum {
    public static void main(String[] args) {
        double[] arr = {-1, 10, 4.5, 15, 3.278};
        double counter = 0;

        for (int i = 0; i < arr.length; i++) {
            counter += arr[i];
        }

        System.out.println(counter);
    }
}
