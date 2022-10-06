package restaurant.objects;

import restaurant.interfaces.ColorAble;

import java.util.List;

public class Menu implements ColorAble
{

    private List<Item> salads;
    private List<Item> mainDishes;
    private List<Item> desserts;
    private List<Item> drinks;

    public Menu(List<Item> salads, List<Item> mainDishes, List<Item> desserts, List<Item> drinks) {
        this.salads = salads;
        this.mainDishes = mainDishes;
        this.desserts = desserts;
        this.drinks = drinks;
    }

    public void printNewMenu() {

        System.out.println(ANSI_YELLOW + "Ново меню");
        System.out.println(ANSI_RESET);

        int counter = 0;
        System.out.println(ANSI_GREEN + "Салати");
        for (Item item : getSalads()) {
            System.out.printf("|%-2d. %-45s %.3f гр. %20.2f лв.| \n",
                ++counter,
                item.getProductName(),
                item.getProductAmount(),
                item.getProductPrice());
        }
        System.out.println(ANSI_RESET);

        counter = 0;
        System.out.println(ANSI_BLUE + "Основни ястия");
        for (Item item : getMainDishes()) {
            System.out.printf("|%-2d. %-45s %.3f гр. %20.2f лв.| \n",
                ++counter,
                item.getProductName(),
                item.getProductAmount(),
                item.getProductPrice());
        }
        System.out.println(ANSI_RESET);

        counter = 0;
        System.out.println(ANSI_CYAN + "Десерти");
        for (Item item : getDesserts()) {
            System.out.printf("|%-2d. %-45s %.3f гр. %20.2f лв.| \n",
                ++counter,
                item.getProductName(),
                item.getProductAmount(),
                item.getProductPrice());
        }
        System.out.println(ANSI_RESET);

        counter = 0;
        System.out.println(ANSI_RED + "Напитки");
        for (Item item : getDrinks()) {
            System.out.printf("|%-2d. %-45s %.3f мл. %20.2f лв.| \n",
                ++counter,
                item.getProductName(),
                item.getProductAmount(),
                item.getProductPrice());
        }
        System.out.println(ANSI_RESET);
    }
    public List<Item> getSalads() {
        return salads;
    }

    public void setSalads(List<Item> salads) {
        this.salads = salads;
    }

    public List<Item> getMainDishes() {
        return mainDishes;
    }

    public void setMainDishes(List<Item> mainDishes) {
        this.mainDishes = mainDishes;
    }

    public List<Item> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Item> drinks) {
        this.drinks = drinks;
    }

    public List<Item> getDesserts() {
        return desserts;
    }

    public void setDesserts(List<Item> desserts) {
        this.desserts = desserts;
    }
}
