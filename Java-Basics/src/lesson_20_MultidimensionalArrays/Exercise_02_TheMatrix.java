package lesson_20_MultidimensionalArrays;

import java.util.Scanner;

/*Направете програма, която:
Очаква потребителят да въведе редове (<10). Докато потребителят не въведе коректен ред,
програмата продължава да го пита за броя на редовете. Използвайте подканващ стринг "Брой редове: "
Очаква потребителят да въведе колони (<10). Докато потребителят не въведе коректна колона,
програмата продължава да го пита за броя на колоните. Използвайте подканващ стринг "Брой колони: "
Иска от него да въведе двете матрици, които са съставени от цели числа.
Използвайте същите подканващи низове като в дадения пример.
След това тя трябва да отпечата:
Двете матрици една до друга. Отделете двете матрици с низа " | "
стринга “Сумата на матриците е:” на отделен ред
Сборът им (поелементарна сума)
стрингът “Директната сумата на матриците е:” на отделен ред
Сборът им (пряка/директна сума)
Като отпечатвате елементите на матрицата, нека те заемат 4 символа и да са подравнение наляво.*/

public class Exercise_02_TheMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Брой редове: ");
        int row = Integer.parseInt(scanner.nextLine());
        if (row > 10) {
            System.out.println("Брой редове: ");
            row = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Брой колони: ");
        int col = Integer.parseInt(scanner.nextLine());
        if (col > 10) {
            System.out.println("Брой колони: ");
            col = Integer.parseInt(scanner.nextLine());
        }
        int[][] firstMatrix = new int[row][col];
        int[][] secondMatrix = new int[row][col];
        System.out.println("Въведете матрица 1:");
        fillMatrix(scanner, firstMatrix, row, col);
        System.out.println("Въведете матрица 2:");
        fillMatrix(scanner, secondMatrix, row, col);

        printMatrices(firstMatrix, secondMatrix);

        System.out.println("Сумата на матриците е:");
        int[][] sumMatrix = new int[row][col];
        sumMatrices(firstMatrix, secondMatrix, sumMatrix);

        System.out.println("Директната сумата на матриците е:");
        directSumOfMatrices(firstMatrix, secondMatrix);
    }

    private static void directSumOfMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                System.out.print(firstMatrix[i][j] + " ");
            }
            for (int k = 0; k < firstMatrix.length; k++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                System.out.print("0 ");
            }
            for (int k = 0; k < secondMatrix.length; k++) {

                System.out.print(secondMatrix[i][k] + " ");
            }
            System.out.println();
        }

    }

    private static void sumMatrices(int[][] firstMatrix, int[][] secondMatrix, int[][] sumMatrix) {

        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[i].length; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.print("|");
            for (int k = 0; k < secondMatrix[i].length; k++) {
                System.out.print(secondMatrix[i][k] + " ");
            }

            System.out.println();
        }
    }

    private static int[][] fillMatrix(Scanner scanner, int[][] matrix, int row, int col) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

}
