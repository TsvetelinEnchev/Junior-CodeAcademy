package lesson_08_MathematicalOperations;

//Направете програма BMI, с която да изчислите моя Body Mass Index.
//Аз тежа 80кг и съм висок 171см.
//Отпечатайте моя BMI на екрана с помощта на System.out.println().
//Има ли надежда за мен или съм твърде дебел?

public class Exercise_01_BMI {
    public static void main(String[] args) {

        double height = 1.71;
        double weight = 80;

        double result = weight / (height * height);

        System.out.println(result);
    }
}
