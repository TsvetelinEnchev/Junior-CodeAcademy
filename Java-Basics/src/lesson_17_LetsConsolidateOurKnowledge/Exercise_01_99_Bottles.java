package lesson_17_LetsConsolidateOurKnowledge;

//Използвайте цикъл, за да направите програма, която отпечатва текста на класиката: 99 Bottles

public class Exercise_01_99_Bottles {
    public static void main(String[] args) {

        int counter = 99;

        for (int i = counter; i >= 0; i--){
            if (i - 1 > 1) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.\n" +
                        "Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.");
                System.out.println();
            }

            if (i == 2){
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.\n" +
                        "Take one down and pass it around, " + (i - 1) +" bottle of beer on the wall.");
                System.out.println();
            }
            if (i == 0){
                System.out.println("1 bottle of beer on the wall, 1 bottle of beer.\n" +
                        "Take it down and pass it around, no more bottles of beer on the wall.");
                System.out.println();
            }
        }

        System.out.println("No more bottles of beer on the wall, no more bottles of beer.\n"+
                "Go to the store and buy some more, 99 bottles of beer on the wall.");
    }
}
