package lesson_15_Sequence;

import java.util.Scanner;

//Направете програма, която очаква от потребителя да въведе размер на триъгълник (0, 30] и го печата на екрана така
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1

public class Exercise_04_PrintTriangle_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int triangleSize = scanner.nextInt();

        for (int i = 1; i <= triangleSize; triangleSize--){
            for (int j = i; j <= triangleSize; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
