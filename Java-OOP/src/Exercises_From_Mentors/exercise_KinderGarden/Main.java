package Exercises_From_Mentors.exercise_KinderGarden;

public class Main {
    public static void main(String[] args) {

        Child child1 = new Child("Георги", "Василев", 4);
        Parent motherOfChild1 = new Parent("Минка", "Василева");
        Parent fatherOfChild1 = new Parent("Иван", "Василев");
        Garden garden1 = new Garden();
        System.out.println(garden1);

        Child child2 = new Child("Петър", "Здравков", 2);
        Parent motherOfChild2 = new Parent("Стефка", "Здравкова");
        Parent fatherOfChild2 = new Parent("Юлиян", "Здравков");
        Garden garden2 = new Garden();
        System.out.println(garden2);

        Child child3 = new Child("Илия", "Петков", 2);
        Parent motherOfChild3 = new Parent("Ивелина", "Петкова");
        Parent fatherOfChild3 = new Parent("Константин", "Петков");
        Garden garden3 = new Garden();
        System.out.println(garden3);
    }
}
