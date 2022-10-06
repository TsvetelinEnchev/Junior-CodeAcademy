package Exercises_From_Mentors.exercise_DanceStudio;

import java.util.ArrayList;
import java.util.List;

public class DanceStudio {
  private List<Client> allClients = new ArrayList<Client>();
  private List<Client> clientsWithCards = new ArrayList<Client>();
  private List<Client> clientsWithoutCards = new ArrayList<Client>();
  public static double totalProfit;
  public static double allClientsInCourse;

  public DanceStudio() {
  }

  public DanceStudio(List<Client> allClients) {
    this.allClients = allClients;

  }

  public List<Client> getAllClients() {
    return allClients;
  }

  public void setAllClients(Client client) {
    this.allClients.add(client) ;
  }

  public List<Client> getClientsWithCards() {
    return clientsWithCards;
  }

  public void setClientsWithCards(Client client) {
    this.clientsWithCards.add(client);
  }

  public List<Client> getClientsWithoutCards() {
    return clientsWithoutCards;
  }

  public void setClientsWithoutCards(Client client) {
    this.clientsWithoutCards.add(client);
  }

  @Override
  public String toString() {
    return "DanceStudio{" +
        "allClients=" + allClients +
        ", clientsWithCards=" + clientsWithCards +
        ", clientsWithoutCards=" + clientsWithoutCards +
        '}';
  }
}
