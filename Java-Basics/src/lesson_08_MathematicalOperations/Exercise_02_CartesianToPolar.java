package lesson_08_MathematicalOperations;

//Напишете програма,
//която дефинира 2 double координати x и y и изчислява съответните им r и theta поларни координати,
//по следните формули:

public class Exercise_02_CartesianToPolar {
    public static void main(String[] args) {

        double x = 3;
        double y = 4;

        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);

        System.out.println("r     = " + r);
        System.out.println("theta = " + theta);
    }
}
