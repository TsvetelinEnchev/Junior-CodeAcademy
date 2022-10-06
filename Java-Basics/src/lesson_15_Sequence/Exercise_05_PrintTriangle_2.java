package lesson_15_Sequence;

import java.util.Scanner;

//Направете програма, която очаква от потребителя да въведе размер на триъгълник (0, 30] и го печата на екрана така:
//# # # # # #
//  # # # # #
//    # # # #
//      # # #
//        # #
//          #

public class Exercise_05_PrintTriangle_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int triangleSize = scanner.nextInt();

        for (int i = 0; i < triangleSize; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("  ");
            for (int j = 0; j < triangleSize - i; j++)
                System.out.print("# ");
            System.out.println();
        }
    }
}
