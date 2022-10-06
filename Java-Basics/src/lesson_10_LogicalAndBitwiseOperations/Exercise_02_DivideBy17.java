package lesson_10_LogicalAndBitwiseOperations;

//Измислих си едно число - 8589935681. Чудя се дали се дели на 17.
//Напишете програма, която проверява дали числото се дели на 17.
//И ако е така - напишете на екрана yes, в противен случай напишете no.
//Подсказка - изпозвайте операторите ‘остатък от делене’ и ternary оператор.

public class Exercise_02_DivideBy17 {
    public static void main(String[] args) {

        long number = -8589935681L;

        if (number % 17 == 0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
