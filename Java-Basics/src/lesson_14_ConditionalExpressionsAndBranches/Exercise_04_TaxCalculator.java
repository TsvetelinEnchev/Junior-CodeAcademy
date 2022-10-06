package lesson_14_ConditionalExpressionsAndBranches;

import java.util.Scanner;

//Като за начало, в нашата програма трябва да въведем годишната заплата.
// След това да изчислим данъка както следва:
// за първите 20000 няма данък
// за вторите 20000 има данък от 10%, но само върху парите надвишаващи необлагаемите доходи.
// за третите 20000 данъкът е както следва: ** 0 за първите 20000 ** 10% за вторите 20000 ** 20% за парите над 40000
// всички пари над 60000 се таксуват с 30%

public class Exercise_04_TaxCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double annualSalary = scanner.nextDouble();
        double salary = annualSalary;
        double tax = 0;

        if (annualSalary >= 20000)
            annualSalary -= 20000;

        if (annualSalary >= 0 && annualSalary < 20000) {
            tax += annualSalary * 0.1;

        }
        if (annualSalary >= 20000) {
            tax += 20000 * 0.1;
            annualSalary -= 20000;
        }
        if (annualSalary > 0 && annualSalary < 20000) {
            tax += annualSalary * 0.2;

        }
        if (annualSalary >= 20000) {
            tax += 20000 * 0.2;
            annualSalary -= 20000;
        }
        if (salary > 60000) {
            tax += annualSalary * 0.3;

        }

        System.out.printf("%.2f%n", tax);
    }
}
