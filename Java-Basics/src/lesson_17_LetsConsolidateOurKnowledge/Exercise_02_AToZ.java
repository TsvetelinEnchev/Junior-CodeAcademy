package lesson_17_LetsConsolidateOurKnowledge;

//Направете програма, която отпечатва буквите от A до Z, като използвате цикъл.

public class Exercise_02_AToZ {
    public static void main(String[] args) {
        for(char letter='A'; letter<='Z'; letter++) {
            System.out.printf("%C%n", letter);
        }
    }
}
