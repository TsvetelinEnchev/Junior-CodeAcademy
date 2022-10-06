import java.math.BigDecimal;
import java.util.Scanner;
import restaurant.objects.Restaurant;
import restaurant.objects.Table;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Restaurant restaurant = new Restaurant("При Шестаците", new BigDecimal(420), new BigDecimal(0), 15);
        restaurant.open();
        restaurant.work();
        restaurant.close();

        System.out.println("Изберете 1 за стартиране на нов ден или 0 за изход.");
        int choice = Integer.parseInt(scanner.nextLine());
        while (choice==1){
            restaurant.setRestaurantIsFull(false);
            for (Table table : restaurant.getTables()) {
                table.setTableIsFree(true);
                restaurant.setRestaurantTableCapacity(15);
            }
            restaurant.openNewDay();
            restaurant.work();
            restaurant.close();
            System.out.println("\nИзберете 1 за стартиране на нов ден или 0 за изход.\n");
            choice = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Край на програмата.");
    }
}

