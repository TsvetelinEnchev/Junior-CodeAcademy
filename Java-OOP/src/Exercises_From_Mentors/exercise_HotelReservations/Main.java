package Exercises_From_Mentors.exercise_HotelReservations;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 11;
        List<Reservation> reservations = new ArrayList<Reservation>();
        Hotel hotel = new Hotel();
        Room room1 = new Room();
        room1.setSpot(3);
        Room room2 = new Room();
        room2.setSpot(3);
        Room room3 = new Room();
        room3.setSpot(2);
        Room room4 = new Room();
        room4.setSpot(2);
        Room room5 = new Room();
        room5.setSpot(1);
        List<Room> rooms = new ArrayList<>();

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);
        hotel.setRooms(rooms);
        int input;
        do {

            System.out.println("1-All rooms");
            System.out.println("2-Reservations");
            System.out.println("3-Create reservation");
            System.out.println("4-Remove reservation");
            System.out.println("5-Check for prolonged reservation");
            System.out.println("6-Exit");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    hotel.printAll(rooms);
                    break;
                case 2:
                    for (Reservation reservation : reservations
                    ) {
                        System.out.println(reservation);
                    }
                    break;
                case 3:

                    System.out.println("How many people:");
                    int number = sc.nextInt();
                    Calendar cal = Calendar.getInstance();
                    SimpleDateFormat d1 = new SimpleDateFormat("yyyy/MM/dd");
                    System.out.println("From:");
                    System.out.println("Year:");
                    int fromYear = sc.nextInt();
                    System.out.println("Month:");
                    int fromMonth = sc.nextInt();
                    System.out.println("Day:");
                    int fromDay = sc.nextInt();
                    cal.set(fromYear, fromMonth - 1, fromDay);
                    String test = d1.format(cal.getTime());
                    Calendar cal2 = Calendar.getInstance();
                    System.out.println("To:");
                    System.out.println("Year:");
                    int toYear = sc.nextInt();
                    System.out.println("Month:");
                    int toMonth = sc.nextInt();
                    System.out.println("Day:");
                    int toDay = sc.nextInt();
                    cal2.set(toYear, toMonth - 1, toDay);
                    String test1 = d1.format(cal2.getTime());
                    Reservation reservation = new Reservation(number, test, test1);
                    List<Room> bookedRooms = new ArrayList<>();
                    if (number <= counter) {
                        reservation.setBookedRooms(bookedRooms, rooms, number);
                        reservations.add(reservation);
                        counter = counter - number;
                    } else {
                        System.out.println("Not enough space for everyone");
                    }
                    if (reservation.getBookedRooms() == null) {
                        reservations.remove(reservation);
                    }


                    break;
                case 4:

                    for (Reservation reservationa : reservations
                    ) {
                        System.out.println(reservationa);

                    }
                    System.out.println("Which reservation would you like to remove:");

                    int choice = sc.nextInt();
                    counter = counter + reservations.get(choice).getNumber();
                    reservations.remove(choice);
                    break;


                case 5:
                    LocalDate date = LocalDate.now();
                    SimpleDateFormat d2 = new SimpleDateFormat("yyyy/MM/dd");
                    String temp = "";
                    String test23 = date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
                    for (int i = 0; i < reservations.size(); i++) {
                        temp = reservations.get(i).getTo();
                        if (test23.equals(temp)) {
                            counter = counter + reservations.get(i).getNumber();
                            reservations.remove(reservations.get(i));

                        }
                    }

                    break;
                case 6:
                    System.out.println("Exiting..");
                    break;
                default:
            }

        } while (input != 6);


    }


}





