package lesson_22_LetsConsolidateOurKnowledge;

/*Caesar’s Code е една от най-проститите техники за криптиране.
Всяка една буква от изречението е заменена с друга буква, която е (n) на брой позиции в азбуката.
Така ‘A’ се заменя с ‘D’, ‘B’, с ‘E‘ … ,'X’ със ‘A’ …, ‘Z’ със ‘C’.
Напишете програма която иска от потребителя да направи избор - дали да криптира или да декриптира.
Въвежда се кода (n) - броят на позицииите.
След това потребителят трябва да въведе стринг, който може да съдържа както малки,
така и големи латински букви и съответно генерира криптиран стринг, или декодира въведеният стринг.
Резултатът винаги се печата само с големи букви.
В програмата си дефинирайте статични методи, наречете ги crypt & decrypt.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_02_CaesarCode {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Въведете криптиране (1) или декриптиране (2): ");
        int type = Integer.parseInt(scanner.nextLine());

        System.out.println("Въведете код (n): ");
        int n = Integer.parseInt(scanner.nextLine());

        List<Character> text;

        if (type == 1){
            System.out.println("Въведете текст за криптиране: ");
            String input = scanner.nextLine().toUpperCase();
            text = convertStringToCharList(input);
            crypt(text,n);
        }
        if (type == 2){
            System.out.println("Въведете текст за декриптиране: ");
            String input = scanner.nextLine().toUpperCase();
            text = convertStringToCharList(input);
            decrypt(text,n);
        }
    }
    private static void crypt(List<Character> text,int n) {
        StringBuilder sb = new StringBuilder();
        int castAscii;
        for (int i = 0; i < text.size(); i++) {
            castAscii = (int)text.get(i) + n;
            if (castAscii >= 90){
                castAscii = (castAscii - 90) + 64;
            }
            sb.append((char)castAscii);
        }

        System.out.println(sb.toString().toUpperCase());
    }

    private static void decrypt(List<Character> text,int n) {
        StringBuilder sb = new StringBuilder();
        int castAscii;
        for (int i = 0; i < text.size(); i++) {
            castAscii = (int)text.get(i) - n;
            if (castAscii >= 90){
                castAscii = (castAscii - 90) + 64;
            }
            sb.append((char)castAscii);
        }

        System.out.println(sb.toString().toUpperCase());
    }

    private static List<Character> convertStringToCharList(String input)
    {
        List<Character> chars = new ArrayList<>();

        for (char ch : input.toCharArray()) {
            chars.add(ch);
        }

        return chars;
    }
}
