package Exercises_From_StartIt.lesson_06_AccessControl.exercise_09_PhoneBook;

import java.util.List;
public class PhoneBook {

  private List<String> data;

  public PhoneBook(List<String> data) {
    this.data = data;
  }

  public List<String> getData() {
    return data;
  }

  public void setData(List<String> data) {
    this.data = data;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Телефонен указател:\n");
    for (String info : this.data) {
      sb.append(info).append("\n");
    }
    return sb.toString();
  }

  public void insert() {
    this.data = getData();

  }

  public boolean deleteByPhoneNumber(String phoneNumberToDelete) {

    for (String currRecord : this.data) {
      if (currRecord.contains(phoneNumberToDelete)) {
        this.data.remove(currRecord);
        return true;
      }
    }
    return false;
  }

  public void getAllNamesStartingWith(String str) {
    boolean haveAnyMatch = false;
    StringBuilder sb = new StringBuilder("Всички записи, които започват с ")
        .append(str).append(" са следните:");

    for (String currRecord : this.data) {
      if (currRecord.startsWith(str)){
        sb.append("\n").append(currRecord);
        haveAnyMatch = true;
      }
    }
    if (haveAnyMatch){
      System.out.println(sb);
    }else {
      System.out.printf("Няма намерени записи които да започват с %s.\n", str);
    }

  }
}


