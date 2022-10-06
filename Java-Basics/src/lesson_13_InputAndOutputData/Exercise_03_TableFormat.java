package lesson_13_InputAndOutputData;

//Нека имате ученици със следните оценки: Иванчо - 2, Марийка - 6, Пенчо - 4, Голям Петко - 5.
//Използвайте printf да отпечатате оценките им в табличен вид, всеки ученик - на отделен ред.
//Нека дължината на колоната с имената е 20 символа, а колоната с оценките да е 2 символа.
//Имената са първи и са приравнени наляво. Втората колона с оценките е приравнена надясно.


public class Exercise_03_TableFormat {
    public static void main(String[] args) {

        String firstStudent = "Иванчо";
        String secondStudent = "Марийка";
        String thirdStudent = "Пенчо";
        String fourthStudent = "Голям Петко";

        int firstStudentGrade = 2;
        int secondStudentGrade = 6;
        int thirdStudentGrade = 4;
        int fourthStudentGrade = 5;

        System.out.printf("%-20s%2d%n", firstStudent, firstStudentGrade);
        System.out.printf("%-20s%2d%n", secondStudent, secondStudentGrade);
        System.out.printf("%-20s%2d%n", thirdStudent, thirdStudentGrade);
        System.out.printf("%-20s%2d%n", fourthStudent, fourthStudentGrade);
    }
}