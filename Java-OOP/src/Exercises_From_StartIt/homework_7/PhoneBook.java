package Exercises_From_StartIt.homework_7;

import java.util.Map;

public class PhoneBook {

  private Map<String, String> data;

  public PhoneBook() {
  }

  public PhoneBook(Map<String, String> data) {
    this.data = data;
  }

  public Map<String, String> getData() {
    return data;
  }

  public void setData(Map<String, String> data) {
    this.data = data;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Your phone book contacts:\n");

    for (Map.Entry<String, String> entry : data.entrySet()) {
      sb.append(entry.getKey()).append(" - ").append(entry.getValue()).append("\n");
    }

    return sb.toString();
  }

  public void insert() {
    this.data = getData();
  }

  public boolean deleteByPhoneNumber(String phoneNumber) {

    for (Map.Entry<String, String> entry : data.entrySet()) {
      if (entry.getValue().equals(phoneNumber)) {
        data.remove(entry.getKey(), entry.getValue());
        return true;
      }
    }
    return false;
  }

  public void getAllNamesStartingWith(String str) {
    boolean haveAnyMatch = false;

    StringBuilder sb = new StringBuilder("Here are all contact that starts with ")
        .append(str).append("\n");

    for (Map.Entry<String, String> entry : data.entrySet()) {
      if (entry.getKey().contains(str)) {
        sb.append(entry.getKey()).append(" - ").append(entry.getValue()).append("\n");
        haveAnyMatch = true;
      }
    }

    if (haveAnyMatch) {
      System.out.println(sb);
    } else {
      System.out.printf("No such contact number exists that starts with %s.\n", str);
    }
  }
}
