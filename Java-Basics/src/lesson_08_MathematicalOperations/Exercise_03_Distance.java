package lesson_08_MathematicalOperations;

//Напишете програма, която изчислява разстоянието от точка (x,y) до (0,0) по формулата:

public class Exercise_03_Distance {
    public static void main(String[] args) {

        double x = 8.3;
        double y = 14.5;

        double d = Math.sqrt(x * x + y * y);

        System.out.println(d);
    }
}
