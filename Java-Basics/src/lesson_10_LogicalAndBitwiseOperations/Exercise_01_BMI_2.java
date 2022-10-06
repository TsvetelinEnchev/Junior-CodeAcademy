package lesson_10_LogicalAndBitwiseOperations;

//Направете програма BMI, с която да изчислите моя Body Mass Index.
//Аз тежа 80кг и съм висок 171см.
//Ако съм съм надвишил малко теглото и съм Overweight
//напишете на екрана more training, less eating, ако не съм - напишете you rock!

public class Exercise_01_BMI_2 {
    public static void main(String[] args) {

        double height = 1.71;
        double weight = 80;

        double result = weight / (height * height);

        if (result >= 25){
            System.out.println("more training, less eating");
        }
        else{
            System.out.println("you rock!");
        }
    }

}
