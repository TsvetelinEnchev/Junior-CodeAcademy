package restaurant.objects;

import restaurant.interfaces.ColorAble;

import java.util.Map;

public class Storage implements ColorAble {
    public Map<String, Double> availableProducts;
    public Map<String, Double> productsThatNeedRecharging;

    public Storage(Map<String, Double> availableProducts) {
        this.availableProducts = availableProducts;
    }

    public Map<String, Double> getAvailableProducts() {
        return availableProducts;
    }

    public Map<String, Double> getProductsThatNeedRecharging() {
        return productsThatNeedRecharging;
    }

    public void printStorage() {
        System.out.println(ANSI_YELLOW + "Складова наличност:" + "\n");

        for (Map.Entry<String, Double> product : availableProducts.entrySet()) {
            if (product.getKey().equalsIgnoreCase("Минерална вода") ||
                product.getKey().equalsIgnoreCase("Студен чай") ||
                product.getKey().equalsIgnoreCase("Кока Кола") ||
                product.getKey().equalsIgnoreCase("Бира Starobrno") ||
                product.getKey().equalsIgnoreCase("Бира Heineken")) {

                System.out.printf("%-40s  %.2f бр. \n", product.getKey(), product.getValue());

            } else if (product.getKey().equalsIgnoreCase("Уиски Jameson") ||
                product.getKey().equalsIgnoreCase("Уиски Glenfiddich") ||
                product.getKey().equalsIgnoreCase("Росиди Розе де Пино") ||
                product.getKey().equalsIgnoreCase("Червено вино - Еленово Каберне Совеньон") ||
                product.getKey().equalsIgnoreCase("Бяло вино - Еленово Шардоне") ||
                product.getKey().equalsIgnoreCase("Готварска сметана")) {

                System.out.printf("%-40s  %.2f л. \n", product.getKey(), product.getValue());

            } else {
                System.out.printf("%-40s  %.2f кг. \n", product.getKey(), product.getValue());
            }
        }
        System.out.println(ANSI_RESET);
    }
    public void rechargeProducts() {

        if (availableProducts.get("Свинско месо") <= 5.0) {
            availableProducts.computeIfPresent("Свинско месо", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Моцарела") <= 5.0) {
            availableProducts.computeIfPresent("Моцарела", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Пилешко месо") <= 5.0) {
            availableProducts.computeIfPresent("Пилешко месо", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Телешко месо") <= 5.0) {
            availableProducts.computeIfPresent("Телешко месо", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Риба тон") <= 5.0) {
            availableProducts.computeIfPresent("Риба тон", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Гъби") <= 5.0) {
            availableProducts.computeIfPresent("Гъби", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Картофи") <= 5.0) {
            availableProducts.computeIfPresent("Картофи", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Червени пиперки") <= 5.0) {
            availableProducts.computeIfPresent("Червени пиперки", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Моркови") <= 5.0) {
            availableProducts.computeIfPresent("Моркови", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Тиквички") <= 5.0) {
            availableProducts.computeIfPresent("Тиквички", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Домати") <= 5.0) {
            availableProducts.computeIfPresent("Домати", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Чери домати") <= 5.0) {
            availableProducts.computeIfPresent("Чери домати", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Краставици") <= 5.0) {
            availableProducts.computeIfPresent("Краставици", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Айсберг") <= 5.0) {
            availableProducts.computeIfPresent("Айсберг", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Царевица") <= 5.0) {
            availableProducts.computeIfPresent("Царевица", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Червен лук") <= 5.0) {
            availableProducts.computeIfPresent("Червен лук", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Лук") <= 5.0) {
            availableProducts.computeIfPresent("Лук", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Маслини") <= 5.0) {
            availableProducts.computeIfPresent("Маслини", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Сирене") <= 5.0) {
            availableProducts.computeIfPresent("Сирене", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Моцарела") <= 5.0) {
            availableProducts.computeIfPresent("Моцарела", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Колекция сирена") <= 5.0) {
            availableProducts.computeIfPresent("Колекция сирена", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Готварска сметана") <= 5.0) {
            availableProducts.computeIfPresent("Готварска сметана", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Тесто") <= 5.0) {
            availableProducts.computeIfPresent("Тесто", (k, v) -> v + 10.0);
        }
        if (availableProducts.get("Течен шоколад") <= 5.0) {
            availableProducts.computeIfPresent("Течен шоколад", (k, v) -> v + 5.0);
        }
        if (availableProducts.get("Еклерова торта") <= 5.0) {
            availableProducts.computeIfPresent("Еклерова торта", (k, v) -> v + 5.0);
        }
        if (availableProducts.get("Шоколадово суфле") <= 5.0) {
            availableProducts.computeIfPresent("Шоколадово суфле", (k, v) -> v + 5.0);
        }
        if (availableProducts.get("Бяло вино - Еленово Шардоне") <= 10.0) {
            availableProducts.computeIfPresent("Бяло вино - Еленово Шардоне", (k, v) -> v + 15.0);
        }
        if (availableProducts.get("Червено вино - Еленово Каберне Совиньон") <= 10.0) {
            availableProducts.computeIfPresent("Червено вино - Еленово Каберне Совиньон", (k, v) -> v + 15.0);
        }
        if (availableProducts.get("Росиди Розе де Пино") <= 10.0) {
            availableProducts.computeIfPresent("Росиди Розе де Пино", (k, v) -> v + 15.0);
        }
        if (availableProducts.get("Уиски Glenfiddich") <= 10.0) {
            availableProducts.computeIfPresent("Уиски Glenfiddich", (k, v) -> v + 20.0);
        }
        if (availableProducts.get("Уиски Jameson") <= 10.0) {
            availableProducts.computeIfPresent("Уиски Jameson", (k, v) -> v + 20.0);
        }
        if (availableProducts.get("Бира Heineken") <= 50.0) {
            availableProducts.computeIfPresent("Бира Heineken", (k, v) -> v + 100.0);
        }
        if (availableProducts.get("Бира Starobrno") <= 50.0) {
            availableProducts.computeIfPresent("Бира Starobrno", (k, v) -> v + 100.0);
        }
        if (availableProducts.get("Кока Кола") <= 50.0) {
            availableProducts.computeIfPresent("Кока Кола", (k, v) -> v + 100.0);
        }
        if (availableProducts.get("Студен чай") <= 50.0) {
            availableProducts.computeIfPresent("Студен чай", (k, v) -> v + 100.0);
        }
        if (availableProducts.get("Минерална вода") <= 50.0) {
            availableProducts.computeIfPresent("Минерална вода", (k, v) -> v + 100.0);
        }
    }
}
