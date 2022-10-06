package lesson_07_Variables;

//Дефинирайте с еnum вашата компания с имена IVAN, STOYAN, PETAR, MILEN, OGNYAN.
//Създайте променливи и ги отпечатайте със System.out.println()

public class Exercise_02_EnumOurCompany {
        enum OurCompany {
            IVAN,
            STOYAN,
            PETAR,
            MILEN,
            OGNYAN
        }
        public static void main(String[] args) {

            OurCompany name1 = OurCompany.IVAN;
            OurCompany name2 = OurCompany.STOYAN;
            OurCompany name3 = OurCompany.PETAR;
            OurCompany name4 = OurCompany.MILEN;
            OurCompany name5 = OurCompany.OGNYAN;

            System.out.println(name1);
            System.out.println(name2);
            System.out.println(name3);
            System.out.println(name4);
            System.out.println(name5);
    }
}
