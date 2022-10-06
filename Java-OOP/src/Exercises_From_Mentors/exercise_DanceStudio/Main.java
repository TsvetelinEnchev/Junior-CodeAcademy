package Exercises_From_Mentors.exercise_DanceStudio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Client client1 = new Client("Ivan","Petrov");
    Client client2 = new Client("Ivo","Angelov");
    Client client3 = new Client("Todor","Ivanov","Dimitrov",145234,"toshi123@gmail.com",true, "card");
    Client client4 = new Client("Kaloqn","Asenov","Petrov",35413547,"dm245@gmail.com",true, "card");
    List<Client> array = new ArrayList<>(Arrays.asList(client1,client2,client3,client4));
    DanceStudio danceStudio = new DanceStudio(array);
    for (int i = 0; i < array.size(); i++) {
      if (array.get(i).getPayingMethod()==null){
        array.get(i).setPayingMethod("cash");
      }
      if(array.get(i).isHasCard()){
        array.get(i).setDiscount(20);
        danceStudio.setClientsWithCards(array.get(i));
        array.get(i).setTax();
      }else{
        danceStudio.setClientsWithoutCards(array.get(i));
      }
      DanceStudio.totalProfit+=danceStudio.getAllClients().get(i).getTax();
    }


    System.out.println(danceStudio);
    System.out.println(DanceStudio.totalProfit);
    System.out.println( danceStudio.getAllClients().size());
  }

}
