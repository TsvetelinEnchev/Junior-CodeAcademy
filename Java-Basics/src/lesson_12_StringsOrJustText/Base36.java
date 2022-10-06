package lesson_12_StringsOrJustText;

/*Говорихме, че има различни бройни системи. Има двоична, осмична, десетична шестнадесетична… и.т.н.
Една доста интересна бройна система е 36-тичната. Защо? Защото съдържа всички цифри от 0 до 9,
така и всички букви от английската азбука - A до Z.
Сега задачата ви е да направите програма, която показва как изглеждат числата в различните бройни системи.
Затова трябва да отпечатате числото 0x7DEDEDE1 в:
Двоичен формат (с представка 0b отпред)
Осмичен формат (с представка 0 отпред)
Десетичен формат
Шестнадесетичен формат (с представка 0x и ако има букви в числото, те да са малки)
36-тично, като всички букви са главни.*/

public class Base36 {
    public static void main(String[] args) {

        int inputNumber = 0x7DEDEDE1;

        System.out.printf("0b%s\n", Integer.toBinaryString(inputNumber));

        System.out.printf("0%s\n",Integer.toOctalString(inputNumber));

        System.out.println(inputNumber);

        System.out.printf("0x%s\n", Integer.toHexString(inputNumber).toLowerCase());

        System.out.println(Integer.toString(inputNumber,36).toUpperCase());
    }
}
