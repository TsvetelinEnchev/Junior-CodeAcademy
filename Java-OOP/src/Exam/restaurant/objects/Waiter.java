package Exam.restaurant.objects;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import Exam.restaurant.models.Staff;

public class Waiter extends Staff {

    private BigDecimal tips;
    private BigDecimal turnoverWallet;
    private BigDecimal revenue;
    private List<String> takeOrders;
    private List<String> allOrdersForTheDay;


    public Waiter(String firstName, String lastName, int salary,
                  BigDecimal turnoverWallet, BigDecimal revenue, BigDecimal tips) {
        super(firstName, lastName, salary);
        this.turnoverWallet = turnoverWallet;
        this.revenue = revenue;
        this.tips = tips;
        allOrdersForTheDay = new ArrayList<>();
    }

    public void getOrder(Table table, Restaurant restaurant) {

        List<String> ordersSFromTable = new ArrayList<>();
        List<String> currOrder = new ArrayList<>();

        BigDecimal totalBill = new BigDecimal(0);

        for (Client client : table.getClientsOnTable()) {
            client.makeOrder(restaurant.getMenu());

            for (int i = 0; i < client.getOrder().size(); i++) {
                currOrder.add(client.getOrder().get(i).getProductName());

                if (!restaurant.getChefs().get(Restaurant.generateRandomNumber(0, restaurant.getChefs().size()))
                        .canCook(currOrder.get(i), restaurant.getStorage())) {
                    switch (i) {
                        case 0:
                            client.getOrder().set(0, client.makeNewSaladOrder(restaurant.getMenu().getSalads()));
                            checkIfAnySaladsAvailable(restaurant.getMenu().getSalads(), restaurant, client);
                            break;
                        case 1:
                            client.getOrder().set(1, client.makeNewMainDishOrder(restaurant.getMenu().getSalads()));
                            checkIfAnyMainDishAvailable(restaurant.getMenu().getMainDishes(), restaurant, client);
                            break;
                        case 2:
                            client.getOrder().set(2, client.makeNewDessertOrder(restaurant.getMenu().getSalads()));
                            checkIfAnyDessertAvailable(restaurant.getMenu().getDesserts(), restaurant, client);
                            break;
                        case 3:
                            client.getOrder().set(3, client.makeNewDrinkOrder(restaurant.getMenu().getSalads()));
                            checkIfAnyDrinkAvailable(restaurant.getMenu().getDrinks(), restaurant, client);
                            break;
                    }
                    currOrder.clear();
                    i--;
                    continue;
                }
                allOrdersForTheDay.add(client.getOrder().get(i).getProductName());
                totalBill = totalBill.add(new BigDecimal(String.valueOf(client.getOrder().get(i).getProductPrice())));
                client.setBill(totalBill);
            }
            ordersSFromTable.addAll(currOrder);
            currOrder.clear();
            this.turnoverWallet = turnoverWallet.add(totalBill);
            totalBill = BigDecimal.ZERO;
        }
        setAllOrdersForTheDay(allOrdersForTheDay);
        setTakeOrders(ordersSFromTable);
    }

    private void checkIfAnyDrinkAvailable(List<Item> drinks, Restaurant restaurant, Client client) {
        int counter = 0;
        for (Item drink : drinks) {
            if (!restaurant.getChefs().get(Restaurant.generateRandomNumber(0, restaurant.getChefs().size()))
                    .canCook(drink.getProductName(), restaurant.getStorage())) {

                counter++;
            }
        }
        if (counter == drinks.size()) {
            client.getOrder().remove(3);
        }
    }

    private void checkIfAnyDessertAvailable(List<Item> desserts, Restaurant restaurant, Client client) {
        int counter = 0;
        for (Item dessert : desserts) {
            if (!restaurant.getChefs().get(Restaurant.generateRandomNumber(0, restaurant.getChefs().size())).canCook(dessert.getProductName(), restaurant.getStorage())) {
                counter++;
            }
        }
        if (counter == desserts.size()) {
            client.getOrder().remove(2);
        }
    }

    private void checkIfAnyMainDishAvailable(List<Item> mainDishes, Restaurant restaurant, Client client) {
        int counter = 0;
        for (Item mainDish : mainDishes) {
            if (!restaurant.getChefs().get(Restaurant.generateRandomNumber(0, restaurant.getChefs().size())).canCook(mainDish.getProductName(), restaurant.getStorage())) {
                counter++;
            }
        }
        if (counter == mainDishes.size()) {
            client.getOrder().remove(1);
        }
    }

    private void checkIfAnySaladsAvailable(List<Item> salads, Restaurant restaurant, Client client) {
        int counter = 0;
        for (Item salad : salads) {
            if (!restaurant.getChefs().get(Restaurant.generateRandomNumber(0, restaurant.getChefs().size()))
                           .canCook(salad.getProductName(), restaurant.getStorage())) {
                counter++;
            }
        }
        if (counter == salads.size()) {
            client.getOrder().remove(0);
        }
    }

    public BigDecimal getTurnoverWallet() {
        return turnoverWallet;
    }

    public void setTurnoverWallet(BigDecimal turnoverWallet) {
        this.turnoverWallet = turnoverWallet;
    }

    public BigDecimal getRevenue() {
        return revenue;
    }

    public void setRevenue(BigDecimal revenue) {
        this.revenue = revenue;
    }

    public List<String> getTakeOrders() {
        return takeOrders;
    }

    public void setTakeOrders(List<String> takeOrders) {
        this.takeOrders = takeOrders;
    }

    public BigDecimal getTips() {
        return tips;
    }

    public void setTips(BigDecimal tips) {
        this.tips = tips;
    }

    public List<String> getAllOrdersForTheDay() {
        return allOrdersForTheDay;
    }

    public void setAllOrdersForTheDay(List<String> allOrdersForTheDay) {
        this.allOrdersForTheDay = allOrdersForTheDay;
    }
}


