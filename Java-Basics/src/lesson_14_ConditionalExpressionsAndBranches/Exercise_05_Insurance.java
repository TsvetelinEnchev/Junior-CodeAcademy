package lesson_14_ConditionalExpressionsAndBranches;

import java.util.Scanner;

//Направете програма, която изчислява осигуровките.
//За целта потребителя трябва да въведе следните данни:
//месечна заплата
//години
//Има 2 такси, които се плащат едната от служителя, а другата - от неговият работодател.
//Законът изисква:
//Ако заплатата е под 3000лв
//Ако служителя е на 55 години или по-малко, тогава таксите са: 20%(за работника) + 17%(за работодателя)
//Ако служителя е над 55 години до 60 (включително) - 13% + 13%
// Ако служителя е над 60 години до 65 (включително) - 7.5% + 9%
// Ако служителя е над 65 - 5% + 7.5%
// Ако заплатата е над 3000лв, таксите са 20% + 20%, но само върху сумата от 3000лв.

public class Exercise_05_Insurance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double montlySalary = scanner.nextDouble();
        int employeeAge = scanner.nextInt();

        double employeeTaxes = 0;
        double employerTaxes = 0;

        if (montlySalary < 3000){

            if (employeeAge <= 55){
                employeeTaxes = montlySalary * 0.2;
                employerTaxes = montlySalary * 0.17;
            }
            else if (employeeAge > 55 && employeeAge <= 60) {
                employeeTaxes = montlySalary * 0.13;
                employerTaxes = montlySalary * 0.13;
            }
            else if (employeeAge > 60 && employeeAge <= 65) {
                employeeTaxes = montlySalary * 0.075;
                employerTaxes = montlySalary * 0.09;
            }
            else if (employeeAge > 65) {
                employeeTaxes = montlySalary * 0.05;
                employerTaxes = montlySalary * 0.075;
            }
        }
        else {
            employeeTaxes = 3000 * 0.2;
            employerTaxes = 3000 * 0.2;
        }

        System.out.printf("%.2f%n", employeeTaxes);
        System.out.printf("%.2f%n", employerTaxes);
    }
}
