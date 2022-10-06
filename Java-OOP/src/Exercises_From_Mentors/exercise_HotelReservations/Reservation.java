package Exercises_From_Mentors.exercise_HotelReservations;

import java.util.List;

public class Reservation {

  //ID - int
  //UID - > Reservation - > random sequence of chars limit 8
  private int number;
  //TODO: Dates to be better
  private String from;
  private String to;
  private List<Room> bookedRooms;

  public Reservation(int number, String from, String to) {
    this.number = number;
    this.from = from;
    this.to = to;

  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public List<Room> getBookedRooms() {
    return bookedRooms;
  }


  public void setBookedRooms(List<Room> bookedRooms, List<Room> rooms, int number) {
    bookedRooms.clear();

    do {
      if (number <= 3) {
        for (Room room : rooms
        ) {
          if (room.getSpot() == number) {
            bookedRooms.add(room);
            number = number - room.getSpot();
          }
        }

      } else {

        for (Room room : rooms
        ) {
          bookedRooms.add(room);
          number = number - room.getSpot();
          break;
        }
      }

    } while (number > 0);
    this.bookedRooms = bookedRooms;

  }


  @Override
  public String toString() {
    return "Reservation{" +
        "number=" + number +
        ", from=" + from +
        ", to=" + to +
        ", bookedRooms=" + bookedRooms +
        '}';
  }
}
