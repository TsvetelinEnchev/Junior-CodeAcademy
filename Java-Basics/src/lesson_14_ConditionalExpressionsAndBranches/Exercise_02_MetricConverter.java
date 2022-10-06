package lesson_14_ConditionalExpressionsAndBranches;

import java.util.Scanner;

//Нека напишем програма, която конвертира между 8 метрични единици: m, mm, cm, mi, in, km, ft, yd.
//Програмата трябва да очаква от потребителя да въведе следните данни:
//дължината, която трябва да се конвертира
//нейната метрична единица
//към коя метрична единица да се конвертира

public class Exercise_02_MetricConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double value = Double.parseDouble(scanner.nextLine());
        String metricUnit = scanner.next();
        String unitToConvert = scanner.next();

        switch (metricUnit){
            case "mm":
                value /= 1000;
                break;
            case "cm":
                value /= 100;
                break;
            case "mi":
                value /= 0.000621371192;
                break;
            case "in":
                value /= 39.3700787;
                break;
            case "km":
                value /= 0.001;
                break;
            case "ft":
                value /= 3.2808399;
                break;
            case "yd":
                value /= 1.0936133;
                break;
            default:
                System.out.println("wrong metric");
                break;
        }
        switch (unitToConvert){
            case "mm":
                value *= 1000;
                break;
            case "cm":
                value *= 100;
                break;
            case "mi":
                value *= 0.000621371192;
                break;
            case "in":
                value *= 39.3700787;
                break;
            case "km":
                value *= 0.001;
                break;
            case "ft":
                value *= 3.2808399;
                break;
            case "yd":
                value *= 1.0936133;
                break;
            default:
                System.out.println("wrong metric");
                break;
        }

        System.out.printf("%.5f%n", value);
    }
}
