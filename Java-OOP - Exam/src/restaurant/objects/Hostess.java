package restaurant.objects;

import restaurant.models.Staff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hostess extends Staff {

  List<Hostess> hostesses = new ArrayList<>();

  public Hostess(String firstName, String lastName, int salary) {
    super(firstName, lastName, salary);
  }

  public void getClientsOnTable(Iterator<Client> clientIterator,
      Restaurant restaurant,
      Table table,
      List<Table> tableList){

    int clientsForTheTable = Restaurant.generateRandomNumber(2, 5);
    List<Client> clientGroup = new ArrayList<>();

    for (int j = 0; j < clientsForTheTable; j++) {
      if (clientIterator.hasNext()) {
        clientGroup.add(clientIterator.next());
      }
    }
    table.setTableIsFree(false);
    table.setClientsOnTable(clientGroup);

    if (tableList.size() < restaurant.getRestaurantTableCapacity()) {
      tableList.add(table);
      restaurant.setTables(tableList);
    }
  }

  public List<Hostess> getHostesses()
  {
    return hostesses;
  }

  public void setHostesses(List<Hostess> hostesses)
  {
    this.hostesses = hostesses;
  }

}
