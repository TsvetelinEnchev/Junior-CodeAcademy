package restaurant.objects;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.util.Random;

import static restaurant.interfaces.ColorAble.*;

public class Client {

    private BigDecimal wallet;
    private List<Item> order;
    private BigDecimal bill;

    public Client(BigDecimal wallet) {
        this.wallet = wallet;
    }

    public void makeOrder(Menu menu) {
        List<Item> orders = new ArrayList<>();

        orders.add(menu.getSalads().get(Restaurant.generateRandomNumber(0, menu.getSalads().size())));

        orders.add(menu.getMainDishes().get(Restaurant.generateRandomNumber(0, menu.getMainDishes().size())));

        orders.add(menu.getDrinks().get(Restaurant.generateRandomNumber(0, menu.getDrinks().size())));

        orders.add(menu.getDesserts().get(Restaurant.generateRandomNumber(0, menu.getDesserts().size())));

        setOrder(orders);
    }

    public Item makeNewDessertOrder(List<Item> desserts) {
        int randomProductIndex = Restaurant.generateRandomNumber(0, desserts.size());

        return new Item(desserts.get(randomProductIndex).getProductName(),
                desserts.get(randomProductIndex).getProductAmount(),
                desserts.get(randomProductIndex).getProductPrice());
    }

    public Item makeNewDrinkOrder(List<Item> drinks) {
        int randomProductIndex = Restaurant.generateRandomNumber(0, drinks.size());

        return new Item(drinks.get(randomProductIndex).getProductName(),
                drinks.get(randomProductIndex).getProductAmount(),
                drinks.get(randomProductIndex).getProductPrice());
    }

    public Item makeNewMainDishOrder(List<Item> mainDishes) {
        int randomProductIndex = Restaurant.generateRandomNumber(0, mainDishes.size());

        return new Item(mainDishes.get(randomProductIndex).getProductName(),
                mainDishes.get(randomProductIndex).getProductAmount(),
                mainDishes.get(randomProductIndex).getProductPrice());
    }

    public Item makeNewSaladOrder(List<Item> salads) {
        int randomProductIndex = Restaurant.generateRandomNumber(0, salads.size());

        return new Item(salads.get(randomProductIndex).getProductName(),
                salads.get(randomProductIndex).getProductAmount(),
                salads.get(randomProductIndex).getProductPrice());
    }

    public void payBill(Waiter waiter) {
        BigDecimal bill = new BigDecimal(0);
        double percentageOfTip = 0.20;

        bill = bill.add(getBill());
        if (wallet.subtract(bill).compareTo(new BigDecimal(0)) >= 0) {

            this.wallet = wallet.subtract(bill);
            Random random = new Random();
            boolean chanceToPayTip = random.nextBoolean();

            if (chanceToPayTip) {
                BigDecimal totalTip = getBill().multiply(new BigDecimal(percentageOfTip));
                this.wallet = wallet.subtract(totalTip);
                waiter.setTips(waiter.getTips().add(totalTip));
            }
        } else {
            System.out.println("\n" + ANSI_GREEN + "Вашата сметка е " + bill + "лв.");
            System.out.println("Вие имате " + wallet + "лв. в портфейла.");
            bill = wallet;
            System.out.println("НАПУСНЕТЕ НАШИЯ РЕСТОРАНТ ВЕДНАГА!!!" + ANSI_RESET + "\n");
        }
    }

    public List<Item> getOrder() {
        return order;
    }

    public void setOrder(List<Item> order) {
        this.order = order;
    }

    public BigDecimal getBill() {
        return bill;
    }

    public void setBill(BigDecimal bill) {
        this.bill = bill;
    }

}


