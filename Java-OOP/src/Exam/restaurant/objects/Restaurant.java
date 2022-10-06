package Exam.restaurant.objects;

import Exam.restaurant.interfaces.ColorAble;
import java.math.BigDecimal;
import java.util.*;

public class Restaurant implements ColorAble
{

  private String       restaurantName;
  private BigDecimal   revenue;
  private BigDecimal   turnover;
  private List<Waiter> waiters;
  private List<Chef>   chefs;

  private List<Item> salads;
  private List<Item> mainDishes;
  private List<Item> desserts;
  private List<Item> drinks;

  private Map<String, Double> products;
  private List<Hostess>       hostesses;
  private int                 restaurantTableCapacity;
  private Menu                menu;
  private Storage             storage;
  private List<Table>         tables;
  private boolean             restaurantIsFull;

  public Restaurant(String restaurantName, BigDecimal revenue, BigDecimal turnover, int restaurantTableCapacity)
  {
    this.restaurantName = restaurantName;
    this.revenue = revenue;
    this.turnover = turnover;
    this.restaurantTableCapacity = restaurantTableCapacity;
    this.restaurantIsFull = false;
    tables = new ArrayList<>();
    waiters = new ArrayList<>();
    chefs = new ArrayList<>();
  }

  public void work()
  {

    Iterator<Client> clientIterator = generateClients().listIterator();

    List<Table> tableList = new ArrayList<>();

    while (clientIterator.hasNext()) {

      if (isRestaurantIsFull()) {
        System.out.println(ANSI_RED + "|Ресторантът е пълен, ако желаете, можете да изчакате да се "
            + "освободи маса!|");

        setRestaurantIsFull(false);

        int randomTable = generateRandomNumber(0, getTables().size());
        tableList
            .get(randomTable)
            .setTableIsFree(true);
      }

      for (Table table : getTables()) {

        if (!table.isTableIsFree()) {
          continue;
        }

        Restaurant restaurant = Restaurant.this;
        getHostesses()
            .get(generateRandomNumber(0, generateHostesses().size()))
            .getClientsOnTable(clientIterator, restaurant, table, tableList);

        checkTheWaiterInCharge(restaurant, table);

      }
      setRestaurantIsFull(true);
    }
  }

  private static void checkTheWaiterInCharge(Restaurant restaurant, Table table)
  {

    if (table.getTableNumber() <= 5) {
      restaurant
          .getWaiters()
          .get(0)
          .getOrder(table, restaurant);
      pay(restaurant
          .getWaiters()
          .get(0), table.getClientsOnTable());

    }
    else if (table.getTableNumber() > 5 && table.getTableNumber() <= 10) {
      restaurant
          .getWaiters()
          .get(1)
          .getOrder(table, restaurant);
      pay(restaurant
          .getWaiters()
          .get(1), table.getClientsOnTable());

    }
    else if (table.getTableNumber() > 10 && table.getTableNumber() <= 15) {
      restaurant
          .getWaiters()
          .get(2)
          .getOrder(table, restaurant);
      pay(restaurant
          .getWaiters()
          .get(2), table.getClientsOnTable());
    }
  }

  private static void pay(Waiter waiter, List<Client> clientGroup)
  {
    for (Client client : clientGroup) {
      client.payBill(waiter);
    }
  }

  public boolean isRestaurantIsFull()
  {
    return restaurantIsFull;
  }

  public void open()
  {

    setMenu(generateMenu());
    printMenu();
    setStorage(new Storage(generateStorage()));
    setChefs(generateChefs());
    setTables(generateTables(restaurantTableCapacity, getTables()));
    setWaiters(generateWaiters());
    setHostesses(generateHostesses());
  }

  public void openNewDay()
  {
    salads.clear();
    mainDishes.clear();
    desserts.clear();
    drinks.clear();
    setMenu(generateMenu());

    printMenu();

    products.clear();
    setStorage(new Storage(generateStorage()));
    storage.rechargeProducts();

    chefs.clear();
    setChefs(generateChefs());

    setTables(generateTables(restaurantTableCapacity, getTables()));

    waiters.clear();
    setWaiters(generateWaiters());

    hostesses.clear();
    setHostesses(generateHostesses());
  }

  public void close()
  {
    storage.printStorage();
    getProductPopularity();
    accountancy();
    System.out.println(ANSI_CYAN + "Наличност за следващия ден.");
    storage.rechargeProducts();
    storage.printStorage();
  }

  public List<Hostess> generateHostesses()
  {
    List<Hostess> hostessList = new ArrayList<>();

    hostessList.add(new Hostess("Николета", "Лозанова", 70));
    hostessList.add(new Hostess("Рая", "Пеева", 70));

    return hostessList;
  }

  public List<Waiter> generateWaiters()
  {
    List<Waiter> waiterList = new ArrayList<>();

    waiterList.add(new Waiter("Елена", "Наумова", 50, new BigDecimal(0),
        new BigDecimal(40),
        new BigDecimal(0)));

    waiterList.add(new Waiter("Биляна", "Димитрова", 50,
        new BigDecimal(0),
        new BigDecimal(40),
        new BigDecimal(0)));

    waiterList.add(new Waiter("Ивана", "Джешкович", 50,
        new BigDecimal(0),
        new BigDecimal(40),
        new BigDecimal(0)));

    return waiterList;
  }

  public List<Chef> generateChefs()
  {
    List<Chef> chefList = new ArrayList<>();

    chefList.add(new Chef("Иван", "Георгиев", 90));

    chefList.add(new Chef("Мария", "Петрова", 90));

    chefList.add(new Chef("Георги", "Георгиев", 90));

    chefList.add(new Chef("Ивана", "Тихомирова", 90));

    return chefList;
  }

  public Map<String, Integer> soldStuff(List<String> allSoldItemsFromMenu)
  {

    Map<String, Integer> products = new TreeMap<>();

    for (String item : allSoldItemsFromMenu) {
      if (products.containsKey(item)) {
        products.put(item, products.get(item) + 1);
      }
      else {
        products.put(item, 1);
      }
    }
    return products;
  }

  public void deleteFromTheMenu(String keyMin)
  {
    Menu newMenu = generateMenu();
    for (int i = 0; i < newMenu
        .getSalads()
        .size(); i++) {

      if (newMenu
          .getSalads()
          .get(i)
          .getProductName()
          .equals(keyMin)) {
        newMenu
            .getSalads()
            .remove(newMenu
                .getSalads()
                .get(i));
      }
    }
    for (int i = 0; i < newMenu
        .getMainDishes()
        .size(); i++) {

      if (newMenu
          .getMainDishes()
          .get(i)
          .getProductName()
          .equals(keyMin)) {
        newMenu
            .getMainDishes()
            .remove(newMenu
                .getMainDishes()
                .get(i));
      }

    }
    for (int i = 0; i < newMenu
        .getDesserts()
        .size(); i++) {
      if (newMenu
          .getDesserts()
          .get(i)
          .getProductName()
          .equals(keyMin)) {
        newMenu
            .getDesserts()
            .remove(newMenu
                .getDesserts()
                .get(i));
      }
    }
    for (int i = 0; i < newMenu
        .getDrinks()
        .size(); i++) {
      if (newMenu
          .getDrinks()
          .get(i)
          .getProductName()
          .equals(keyMin)) {
        newMenu
            .getDrinks()
            .remove(newMenu
                .getDrinks()
                .get(i));
      }
    }
    newMenu.printNewMenu();
  }

  public void printMenu()
  {
    System.out.println(ANSI_YELLOW + "Меню При Шестаците");
    getAllSalads();
    getAllMainDishes();
    getAllDeserts();
    getAllDrinks();
  }

  public void getAllDrinks()
  {
    int counter = 0;

    System.out.println(ANSI_RED + "Напитки");
    for (Item item : generateMenu().getDrinks()) {
      System.out.printf("|%-2d. %-45s %.3f мл. %20.2f лв.| \n",
          ++counter, item.getProductName(), item.getProductAmount(), item.getProductPrice());
    }
    System.out.println(ANSI_RESET);
  }

  public void getAllDeserts()
  {
    int counter = 0;
    System.out.println(ANSI_CYAN + "Десерти");
    for (Item item : generateMenu().getDesserts()) {
      System.out.printf("|%-2d. %-45s %.3f гр. %20.2f лв.| \n",
          ++counter, item.getProductName(), item.getProductAmount(), item.getProductPrice());
    }
    System.out.println(ANSI_RESET);
  }

  public void getAllSalads()
  {
    int counter = 0;
    System.out.println(ANSI_GREEN + "Салати");
    for (Item item : generateMenu().getSalads()) {
      System.out.printf("|%-2d. %-45s %.3f гр. %20.2f лв.| \n",
          ++counter, item.getProductName(), item.getProductAmount(), item.getProductPrice());
    }
    System.out.println(ANSI_RESET);
  }

  public void getAllMainDishes()
  {
    int counter = 0;
    System.out.println(ANSI_BLUE + "Основни ястия");
    for (Item item : generateMenu().getMainDishes()) {
      System.out.printf("|%-2d. %-45s %.3f гр. %20.2f лв.| \n",
          ++counter, item.getProductName(), item.getProductAmount(), item.getProductPrice());
    }
    System.out.println(ANSI_RESET);
  }

  public void getProductPopularity()
  {

    Map<String, Integer> allProducts = soldStuff(waiters
        .get(0)
        .getAllOrdersForTheDay());

    System.out.println(ANSI_PURPLE + "Днес бяха поръчани: ");

    allProducts
        .entrySet()
        .stream()
        .sorted((k1, k2) -> -k1
            .getValue()
            .compareTo(k2.getValue()))
        .forEach(k -> System.out.printf("%-45s %d бр. \n", k.getKey(), k.getValue()));
    System.out.println(ANSI_RESET);

    String keyMax = Collections
        .max(allProducts.entrySet(), Map.Entry.comparingByValue())
        .getKey();
    System.out.println(ANSI_CYAN + "Най-добре продаваният продукт е: " + keyMax + ANSI_RESET);
    System.out.println(ANSI_RESET);

    String keyMin = Collections
        .min(allProducts.entrySet(), Map.Entry.comparingByValue())
        .getKey();
    System.out.println(ANSI_CYAN + "Най-слабо продаваният продукт е: " + keyMin + ANSI_RESET);

    deleteFromTheMenu(keyMin);
  }

  public void accountancy()
  {

    BigDecimal turnoverForTheDay = new BigDecimal(0);

    for (Waiter waiter : getWaiters()) {
      turnoverForTheDay = turnoverForTheDay.add(waiter.getTurnoverWallet());
    }
    System.out.printf(ANSI_GREEN + "Оборотът за деня е: %.2f лв.\n", turnoverForTheDay);
    System.out.println(ANSI_RESET);

    System.out.println(ANSI_PURPLE + "Сервитьорките получили бакшиш са:");
    for (Waiter waiter : getWaiters()) {
      if (waiter
          .getTips()
          .compareTo(BigDecimal.ZERO) > 0) {
        System.out.printf("%s %s - %.2f лв. \n", waiter.getFirstName(), waiter.getLastName(), waiter.getTips());
      }
    }
    System.out.println(ANSI_RESET);
  }

  public Map<String, Double> generateStorage()
  {

    products = new HashMap<>();

    products.put("Свинско месо", 50.0);
    products.put("Пилешко месо", 50.0);
    products.put("Телешко месо", 50.0);
    products.put("Риба тон", 25.0);
    products.put("Гъби", 25.0);
    products.put("Картофи", 30.0);
    products.put("Червени пиперки", 15.0);
    products.put("Моркови", 20.0);
    products.put("Тиквички", 20.0);
    products.put("Домати", 10.5);
    products.put("Чери домати", 30.0);
    products.put("Краставици", 40.0);
    products.put("Айсберг", 30.0);
    products.put("Царевица", 15.0);
    products.put("Червен лук", 20.0);
    products.put("Лук", 25.0);
    products.put("Маслини", 10.0);
    products.put("Сирене", 20.0);
    products.put("Моцарела", 10.0);
    products.put("Колекция сирена", 15.0);
    products.put("Готварска сметана", 15.0);
    products.put("Тесто", 15.0);
    products.put("Течен шоколад", 8.0);
    products.put("Еклерова торта", 20.0);
    products.put("Шоколадово суфле", 20.0);
    products.put("Бяло вино - Еленово Шардоне", 30.0);
    products.put("Червено вино - Еленово Каберне Совиньон", 30.0);
    products.put("Росиди Розе де Пино", 30.0);
    products.put("Уиски Glenfiddich", 10.0);
    products.put("Уиски Jameson", 20.0);
    products.put("Бира Heineken", 400.0);
    products.put("Бира Starobrno", 400.0);
    products.put("Кока Кола", 360.0);
    products.put("Студен чай", 360.0);
    products.put("Минерална вода", 480.0);

    return products;
  }

  public Menu generateMenu()
  {

    salads = new ArrayList<>();
    mainDishes = new ArrayList<>();
    desserts = new ArrayList<>();
    drinks = new ArrayList<>();

    salads.add(new Item("Салата Капрезе", 0.350, new BigDecimal("9.90")));
    salads.add(new Item("Гръцка салата", 0.450, new BigDecimal("8.90")));
    salads.add(new Item("Салата Туна", 0.450, new BigDecimal("9.90")));

    mainDishes.add(new Item("Телешки стек със сос от манатарки", 0.550,
        new BigDecimal("18.90")));
    mainDishes.add(new Item("Свинска вратна пържола с картофи по селски", 0.550, new BigDecimal("12.50")));
    mainDishes.add(new Item("Свински сач със зеленчуци", 0.850, new BigDecimal("17.90")));
    mainDishes.add(new Item("Пилешка кавърма", 0.550, new BigDecimal("9.90")));
    mainDishes.add(new Item("Пиле четири сирена", 0.550, new BigDecimal("10.90")));

    desserts.add(new Item("Еклерова торта", 0.250, new BigDecimal("6.00")));
    desserts.add(new Item("Шоколадово суфле", 0.250, new BigDecimal("6.90")));
    desserts.add(new Item("Палачинки с шоколад", 0.250, new BigDecimal("4.90")));

    drinks.add(new Item("Бяло вино - Еленово Шардоне", 0.300, new BigDecimal("8.90")));
    drinks.add(new Item("Червено вино - Еленово Каберне Совиньон", 0.300, new BigDecimal("8.90")));
    drinks.add(new Item("Росиди Розе де Пино", 0.300, new BigDecimal("7.80")));
    drinks.add(new Item("Уиски Glenfiddich", 0.100, new BigDecimal("6.90")));
    drinks.add(new Item("Уиски Jameson", 0.100, new BigDecimal("5.90")));
    drinks.add(new Item("Бира Heineken", 0.500, new BigDecimal("3.50")));
    drinks.add(new Item("Бира Starobrno", 0.500, new BigDecimal("3.50")));
    drinks.add(new Item("Кока Кола", 0.350, new BigDecimal("2.50")));
    drinks.add(new Item("Студен чай", 0.350, new BigDecimal("2.50")));
    drinks.add(new Item("Минерална вода", 0.300, new BigDecimal("2.00")));

    return new Menu(salads, mainDishes, desserts, drinks);
  }

  public static int generateRandomNumber(int min, int max)
  {          //Nikolai S.
    return (int) ((Math.random() * (max - min)) + min);
  }

  public List<Client> generateClients()
  {
    List<Client> clientList = new ArrayList<>();
    int clientsForTheDay = generateRandomNumber(15, 100);
    for (int i = 0; i < clientsForTheDay; i++) {

      BigDecimal clientWallet = BigDecimal.valueOf(generateRandomNumber(40, 100));

      clientList.add(new Client(clientWallet));
    }
    return clientList;
  }

  public List<Table> generateTables(int tableCapacity, List<Table> tableList)
  {
    for (int i = 0; i < tableCapacity; i++) {
      Table table = new Table();
      tableList.add(table);
    }
    return tableList;
  }

  public void setWaiters(List<Waiter> waiters)
  {
    this.waiters = waiters;
  }

  public void setRestaurantIsFull(boolean restaurantIsFull)
  {
    this.restaurantIsFull = restaurantIsFull;
  }

  public List<Chef> getChefs()
  {
    return chefs;
  }

  public void setChefs(List<Chef> chefs)
  {
    this.chefs = chefs;
  }

  public String getRestaurantName()
  {
    return restaurantName;
  }

  public void setRestaurantName(String restaurantName)
  {
    this.restaurantName = restaurantName;
  }

  public BigDecimal getRevenue()
  {
    return revenue;
  }

  public void setRevenue(BigDecimal revenue)
  {
    this.revenue = revenue;
  }

  public BigDecimal getTurnover()
  {
    return turnover;
  }

  public void setTurnover(BigDecimal turnover)
  {
    this.turnover = turnover;
  }

  public Menu getMenu()
  {
    return menu;
  }

  public int getRestaurantTableCapacity()
  {
    return restaurantTableCapacity;
  }

  public void setRestaurantTableCapacity(int restaurantCapacity)
  {
    this.restaurantTableCapacity = restaurantCapacity;
  }

  public void setTables(List<Table> tables)
  {
    this.tables = tables;
  }

  public List<Table> getTables()
  {
    return tables;
  }

  public void setMenu(Menu menu)
  {
    this.menu = menu;
  }

  public List<Waiter> getWaiters()
  {
    return waiters;
  }

  public List<Hostess> getHostesses()
  {
    return hostesses;
  }

  public void setHostesses(List<Hostess> hostesses)
  {
    this.hostesses = hostesses;
  }

  public Storage getStorage()
  {
    return storage;
  }

  public void setStorage(Storage storage)
  {
    this.storage = storage;
  }
}

