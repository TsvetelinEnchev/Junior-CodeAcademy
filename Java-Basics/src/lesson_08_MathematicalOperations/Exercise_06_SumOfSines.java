package lesson_08_MathematicalOperations;

//Напишете програма SumOfSines, в която дефинирате променлива t (в градуси) и изчислява резултата от:
//sin(2t) + sin(3t)
//Използвайте функцията Math.sin().
//Внимание, в условието има уловка! Прочетете внимателно документацията на Math.sin()!
//Изберете t = 20 градуса.
//Отпечатайте решението на екрана с помощта на System.out.println()

public class Exercise_06_SumOfSines {
    public static void main(String[] args) {

        double t = Math.toRadians(20);

        double d = Math.sin(2 * t) + Math.sin(3 * t);

        System.out.println(d);
    }
}
