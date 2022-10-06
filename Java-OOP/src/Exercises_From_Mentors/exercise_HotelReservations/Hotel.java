package Exercises_From_Mentors.exercise_HotelReservations;

import java.util.List;

public class Hotel {
    private List<Room>rooms;
    private List<Reservation>reservations;

    public Hotel() {
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
    public void printAll(List<Room>rooms){
        for (Room room:rooms
             ) {
            System.out.println(room);
            System.out.println();

        }

    }


}
