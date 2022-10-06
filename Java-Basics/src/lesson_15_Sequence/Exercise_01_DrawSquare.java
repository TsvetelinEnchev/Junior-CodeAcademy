package lesson_15_Sequence;

import java.util.Scanner;

//Направете програма, която очаква от потребителя да въведе размер на квадрат (0, 30] и го печата на екрана така:
//# # # #
//# # # #
//# # # #
//# # # #

public class Exercise_01_DrawSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = scanner.nextInt();

        for (int i = 0; i < lenght; i++){
            for (int j = 0; j < lenght; j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
