package Exam.restaurant.objects;

import Exam.restaurant.models.Staff;

public class Chef extends Staff
{
    public Chef(String firstName, String lastName, int salary) {
        super(firstName, lastName, salary);
    }

    public boolean canCook(String order, Storage storage) {

        switch (order) {

            case "Салата Капрезе":

                if (storage.getAvailableProducts().get("Домати") >= 0.200 &&
                    storage.availableProducts.get("Моцарела") >= 0.150) {

                    storage.availableProducts.computeIfPresent("Домати",
                        (k, v) -> v - 0.200);
                    storage.availableProducts.computeIfPresent("Моцарела",
                        (k, v) -> v - 0.150);

                } else {
                    if (storage.availableProducts.get("Домати") <= 0.500) {

                        System.out.println("Прави се заявка за домати!");
                        storage.getProductsThatNeedRecharging().computeIfPresent("Домати",
                            (k, v) -> v + 5.0);
                        storage.availableProducts.put("Домати", 10.0);

                    }
                    if (storage.availableProducts.get("Моцарела") < 0.300) {

                        System.out.println("Прави се заявка за моцарела!");
                        storage.availableProducts.put("Моцарела", 10.0);

                    }
                    return false;
                }
                break;
            case "Гръцка салата":
                if (storage.getAvailableProducts().get("Домати") >= 0.150 &&
                    storage.availableProducts.get("Краставици") >= 0.150 &&
                    storage.availableProducts.get("Сирене") >= 0.100 &&
                    storage.availableProducts.get("Маслини") >= 0.050) {

                    storage.availableProducts.computeIfPresent("Домати",
                        (k, v) -> v - 0.150);
                    storage.availableProducts.computeIfPresent("Краставици",
                        (k, v) -> v - 0.150);
                    storage.availableProducts.computeIfPresent("Сирене",
                        (k, v) -> v - 0.100);
                    storage.availableProducts.computeIfPresent("Маслини",
                        (k, v) -> v - 0.050);

                } else {
                    if (storage.availableProducts.get("Домати") <= 0.500) {

                        System.out.println("Прави се заявка за домати!");
                        storage.availableProducts.put("Домати", 10.0);

                    }
                    if (storage.availableProducts.get("Краставици") < 0.300) {

                        System.out.println("Прави се заявка за краставици!");
                        storage.availableProducts.put("Краставици", 10.0);


                    }
                    if (storage.availableProducts.get("Сирене") < 0.300) {

                        System.out.println("Прави се заявка за сирене!");
                        storage.availableProducts.put("Сирене", 10.0);

                    }
                    if (storage.availableProducts.get("Маслини") < 0.300) {

                        System.out.println("Прави се заявка за маслини!");
                        storage.availableProducts.put("Маслини", 10.0);

                    }
                    return false;
                }
                break;
            case "Салата Туна":
                if (storage.getAvailableProducts().get("Чери домати") >= 0.150 &&
                    storage.availableProducts.get("Риба тон") >= 0.100 &&
                    storage.availableProducts.get("Айсберг") >= 0.150 &&
                    storage.availableProducts.get("Царевица") >= 0.150) {

                    storage.availableProducts.computeIfPresent("Чери домати",
                        (k, v) -> v - 0.150);
                    storage.availableProducts.computeIfPresent("Риба тон",
                        (k, v) -> v - 0.100);
                    storage.availableProducts.computeIfPresent("Айсберг",
                        (k, v) -> v - 0.150);
                    storage.availableProducts.computeIfPresent("Царевица",
                        (k, v) -> v - 0.150);

                } else {
                    if (storage.availableProducts.get("Чери домати") <= 0.500) {

                        System.out.println("Прави се заявка за чери домати!");
                        storage.availableProducts.computeIfPresent("Чери домати",
                            (k, v) -> v + 5.0);

                    }
                    if (storage.availableProducts.get("Риба тон") < 0.300) {

                        System.out.println("Прави се заявка за риба тон!");
                        storage.availableProducts.computeIfPresent("Риба тон",
                            (k, v) -> v + 10.0);

                    }
                    if (storage.availableProducts.get("Айсберг") < 0.300) {

                        System.out.println("Прави се заявка за айсберг!");
                        storage.availableProducts.computeIfPresent("Айсберг",
                            (k, v) -> v + 10.0);

                    }
                    if (storage.availableProducts.get("Царевица") < 0.300) {

                        System.out.println("Прави се заявка за царевица!");
                        storage.availableProducts.computeIfPresent("Царевица",
                            (k, v) -> v + 10.0);

                    }
                    return false;
                }
                break;
            case "Телешки стек със сос от манатарки":
                if (storage.getAvailableProducts().get("Телешко месо") >= 0.400 &&
                    storage.availableProducts.get("Готварска сметана") >= 0.50 &&
                    storage.availableProducts.get("Гъби") >= 0.100) {

                    storage.availableProducts.computeIfPresent("Телешко месо",
                        (k, v) -> v - 0.400);
                    storage.availableProducts.computeIfPresent("Готварска сметана",
                        (k, v) -> v - 0.50);
                    storage.availableProducts.computeIfPresent("Гъби",
                        (k, v) -> v - 0.100);

                } else {
                    if (storage.availableProducts.get("Телешко месо") <= 1.0) {

                        System.out.println("Прави се заявка за телешко!");
                        storage.availableProducts.computeIfPresent("Телешко месо",
                            (k, v) -> v + 5.0);
                    }
                    if (storage.availableProducts.get("Готварска сметана") < 0.300) {

                        System.out.println("Прави се заявка за готварска сметана!");
                        storage.availableProducts.computeIfPresent("Готварска сметана",
                            (k, v) -> v + 10.0);

                    }
                    if (storage.availableProducts.get("Гъби") < 0.300) {

                        System.out.println("Прави се заявка за гъби!");
                        storage.availableProducts.computeIfPresent("Гъби",
                            (k, v) -> v + 10.0);

                    }
                    return false;
                }
                break;
            case "Свинска вратна пържола с картофи по селски":
                if (storage.getAvailableProducts().get("Свинско месо") >= 0.300 &&
                    storage.availableProducts.get("Картофи") >= 0.250) {

                    storage.availableProducts.computeIfPresent("Свинско месо",
                        (k, v) -> v - 0.300);
                    storage.availableProducts.computeIfPresent("Картофи",
                        (k, v) -> v - 0.250);

                } else {
                    if (storage.availableProducts.get("Свинско месо") < 0.300) {

                        System.out.println("Прави се заявка за свинско месо!");
                        storage.availableProducts.computeIfPresent("Свинско месо",
                            (k, v) -> v + 10.0);

                    }
                    if (storage.availableProducts.get("Картофи") < 0.300) {

                        System.out.println("Прави се заявка за картофи!");
                        storage.availableProducts.computeIfPresent("Картофи",
                            (k, v) -> v + 10.0);

                    }
                    return false;
                }
                break;
            case "Свински сач със зеленчуци":
                if (storage.getAvailableProducts().get("Свинско месо") >= 0.300 &&
                    storage.availableProducts.get("Червени пиперки") >= 0.150 &&
                    storage.availableProducts.get("Моркови") >= 0.100 &&
                    storage.availableProducts.get("Лук") >= 0.100 &&
                    storage.availableProducts.get("Тиквички") >= 0.200) {

                    storage.availableProducts.computeIfPresent("Свинско месо",
                        (k, v) -> v - 0.300);
                    storage.availableProducts.computeIfPresent("Червени пиперки",
                        (k, v) -> v - 0.150);
                    storage.availableProducts.computeIfPresent("Моркови",
                        (k, v) -> v - 0.100);
                    storage.availableProducts.computeIfPresent("Лук",
                        (k, v) -> v - 0.100);
                    storage.availableProducts.computeIfPresent("Тиквички",
                        (k, v) -> v - 0.200);

                } else {
                    if (storage.availableProducts.get("Свинско месо") <= 1.0) {

                        System.out.println("Прави се заявка за свинско!");
                        storage.availableProducts.computeIfPresent("Свинско месо",
                            (k, v) -> v + 5.0);

                    }
                    if (storage.availableProducts.get("Червени пиперки") < 0.300) {

                        System.out.println("Прави се заявка за червени пиперки!");
                        storage.availableProducts.computeIfPresent("Червени пиперки",
                            (k, v) -> v + 10.0);

                    }
                    if (storage.availableProducts.get("Моркови") < 0.75) {

                        System.out.println("Прави се заявка за моркови!");
                        storage.availableProducts.computeIfPresent("Моркови",
                            (k, v) -> v + 10.0);

                    }
                    if (storage.availableProducts.get("Лук") < 0.75) {

                        System.out.println("Прави се заявка за лук!");
                        storage.availableProducts.computeIfPresent("Лук",
                            (k, v) -> v + 10.0);

                    }
                    if (storage.availableProducts.get("Тиквички") < 0.300) {

                        System.out.println("Прави се заявка за тиквички!");
                        storage.availableProducts.computeIfPresent("Тиквички",
                            (k, v) -> v + 50.0);

                    }
                    return false;
                }
                break;
            case "Пилешка кавърма":
                if (storage.getAvailableProducts().get("Пилешко месо") >= 0.300 &&
                    storage.availableProducts.get("Червени пиперки") >= 0.100 &&
                    storage.availableProducts.get("Моркови") >= 0.75 &&
                    storage.availableProducts.get("Лук") >= 0.75) {

                    storage.availableProducts.computeIfPresent("Пилешко месо",
                        (k, v) -> v - 0.300);
                    storage.availableProducts.computeIfPresent("Червени пиперки",
                        (k, v) -> v - 0.100);
                    storage.availableProducts.computeIfPresent("Моркови",
                        (k, v) -> v - 0.75);
                    storage.availableProducts.computeIfPresent("Лук",
                        (k, v) -> v - 0.75);

                } else {
                    if (storage.availableProducts.get("Пилешко месо") <= 1.0) {

                        System.out.println("Прави се заявка за пилешко!");
                        storage.availableProducts.computeIfPresent("Пилешко месо",
                            (k, v) -> v + 5.0);

                    }
                    if (storage.availableProducts.get("Червени пиперки") < 0.300) {

                        System.out.println("Прави се заявка за червени пиперки!");
                        storage.availableProducts.computeIfPresent("Червени пиперки",
                            (k, v) -> v + 10.0);

                    }
                    if (storage.availableProducts.get("Моркови") < 0.75) {

                        System.out.println("Прави се заявка за моркови!");
                        storage.availableProducts.computeIfPresent("Моркови",
                            (k, v) -> v + 10.0);

                    }
                    if (storage.availableProducts.get("Лук") < 0.75) {

                        System.out.println("Прави се заявка за лук!");
                        storage.availableProducts.computeIfPresent("Лук",
                            (k, v) -> v + 10.0);

                    }
                    return false;
                }
                break;
            case "Пиле четири сирена":
                if (storage.getAvailableProducts().get("Пилешко месо") >= 0.300 &&
                    storage.availableProducts.get("Готварска сметана") >= 0.100 &&
                    storage.availableProducts.get("Колекция сирена") >= 0.150) {

                    storage.availableProducts.computeIfPresent("Пилешко месо",
                        (k, v) -> v - 0.300);
                    storage.availableProducts.computeIfPresent("Готварска сметана",
                        (k, v) -> v - 0.100);
                    storage.availableProducts.computeIfPresent("Колекция сирена",
                        (k, v) -> v - 0.150);

                } else {
                    if (storage.availableProducts.get("Пилешко месо") <= 1.0) {

                        System.out.println("Прави се заявка за пилешко!");
                        storage.availableProducts.computeIfPresent("Пилешко месо",
                            (k, v) -> v + 5.0);

                    }
                    if (storage.availableProducts.get("Готварска сметана") < 0.300) {

                        System.out.println("Прави се заявка за готварска сметана!");
                        storage.availableProducts.computeIfPresent("Готварска сметана",
                            (k, v) -> v + 10.0);

                    }
                    if (storage.availableProducts.get("Колекция сирена") < 0.300) {

                        System.out.println("Прави се заявка за сирена!");
                        storage.availableProducts.computeIfPresent("Колекция сирена",
                            (k, v) -> v + 10.0);

                    }
                    return false;
                }
                break;
            case "Еклерова торта":
                if (storage.getAvailableProducts().get("Еклерова торта") >= 0.250) {

                    storage.availableProducts.computeIfPresent("Еклерова торта",
                        (k, v) -> v - 0.250);

                } else {
                    if (storage.getAvailableProducts().get("Еклерова торта") < 0.250) {

                        System.out.println("Прави се заявка за еклерова торта!");
                        storage.availableProducts.computeIfPresent("Еклерова торта",
                            (k, v) -> v + 8.0);

                    }
                    return false;
                }
                break;
            case "Шоколадово суфле":
                if (storage.getAvailableProducts().get("Шоколадово суфле") >= 0.250) {

                    storage.availableProducts.computeIfPresent("Шоколадово суфле",
                        (k, v) -> v - 0.250);

                } else {
                    if (storage.getAvailableProducts().get("Шоколадово суфле") < 0.250) {

                        System.out.println("Прави се заявка за шоколадово суфле!");
                        storage.availableProducts.computeIfPresent("Шоколадово суфле",
                            (k, v) -> v + 8.0);

                    }
                    return false;
                }
                break;
            case "Палачинки с шоколад":
                if (storage.getAvailableProducts().get("Тесто") >= 0.150 &&
                    storage.getAvailableProducts().get("Течен шоколад") >= 0.100) {

                    storage.availableProducts.computeIfPresent("Тесто",
                        (k, v) -> v - 0.150);
                    storage.availableProducts.computeIfPresent("Течен шоколад",
                        (k, v) -> v - 0.100);

                } else {
                    if (storage.availableProducts.get("Тесто") < 0.300) {

                        System.out.println("Прави се заявка за тесто!");
                        storage.availableProducts.computeIfPresent("Тесто",
                            (k, v) -> v + 10.0);

                    }
                    if (storage.availableProducts.get("Течен шоколад") < 0.300) {

                        System.out.println("Прави се заявка за течен шоколад!");
                        storage.availableProducts.computeIfPresent("Течен шоколад",
                            (k, v) -> v + 10.0);

                    }
                    return false;
                }
                break;
            case "Бяло вино - Еленово Шардоне":
                if (storage.getAvailableProducts().get("Бяло вино - Еленово Шардоне") >= 0.300) {

                    storage.availableProducts.computeIfPresent("Бяло вино - Еленово Шардоне",
                            (k, v) -> v - 0.300);

                } else {
                    if (storage.getAvailableProducts().get("Бяло вино - Еленово Шардоне") <= 0.300) {

                        System.out.println("Прави се заявка за бяло вино - Еленово Шардоне!");
                        storage.availableProducts.computeIfPresent("Бяло вино - Еленово Шардоне",
                            (k, v) -> v + 20.0);

                    }
                    return false;
                }
                break;
            case "Червено вино - Еленово Каберне Совиньон":
                if (storage.getAvailableProducts().get("Червено вино - Еленово Каберне Совиньон") >= 0.300) {

                    storage.availableProducts.computeIfPresent("Червено вино - Еленово Каберне Совиньон",
                        (k, v) -> v - 0.300);

                } else {
                    if (storage.getAvailableProducts().get("Червено вино - Еленово Каберне Совиньон") <= 0.300) {

                        System.out.println("Прави се заявка за червено вино - Еленово Каберне Совиньон!");
                        storage.availableProducts.computeIfPresent("Червено вино - Еленово Каберне Совиньон",
                            (k, v) -> v + 20.0);

                    }
                    return false;
                }
                break;
            case "Росиди Розе де Пино":
                if (storage.getAvailableProducts().get("Росиди Розе де Пино") >= 0.300) {

                    storage.availableProducts.computeIfPresent("Росиди Розе де Пино",
                        (k, v) -> v - 0.300);

                } else {
                    if (storage.getAvailableProducts().get("Росиди Розе де Пино") <= 0.300) {

                        System.out.println("Прави се заявка за Росиди Розе де Пино!");
                        storage.availableProducts.computeIfPresent("Росиди Розе де Пино",
                            (k, v) -> v + 20.0);

                    }
                    return false;
                }
                break;
            case "Уиски Glenfiddich":
                if (storage.getAvailableProducts().get("Уиски Glenfiddich") >= 0.250) {

                    storage.availableProducts.computeIfPresent("Уиски Glenfiddich",
                        (k, v) -> v - 0.250);

                } else {
                    if (storage.getAvailableProducts().get("Уиски Glenfiddich") <= 0.300) {

                        System.out.println("Прави се заявка за Уиски Glenfiddich!");
                        storage.availableProducts.computeIfPresent("Уиски Glenfiddich",
                            (k, v) -> v + 20.0);

                    }
                    return false;
                }
                break;
            case "Уиски Jameson":
                if (storage.getAvailableProducts().get("Уиски Jameson") >= 0.250) {

                    storage.availableProducts.computeIfPresent("Уиски Jameson",
                        (k, v) -> v - 0.250);

                } else {
                    if (storage.getAvailableProducts().get("Уиски Jameson") <= 0.300) {

                        System.out.println("Прави се заявка за Уиски Jameson!");
                        storage.availableProducts.computeIfPresent("Уиски Jameson",
                            (k, v) -> v + 20.0);

                    }
                    return false;
                }
                break;
            case "Бира Heineken":
                if (storage.getAvailableProducts().get("Бира Heineken") >= 1) {

                    storage.availableProducts.computeIfPresent("Бира Heineken",
                        (k, v) -> v - 1);

                } else {
                    if (storage.getAvailableProducts().get("Бира Heineken") <= 2) {

                        System.out.println("Прави се заявка за Heineken!");
                        storage.availableProducts.computeIfPresent("Бира Heineken",
                            (k, v) -> v + 100.0);

                    }
                    return false;
                }
                break;
            case "Бира Starobrno":
                if (storage.getAvailableProducts().get("Бира Starobrno") >= 1) {

                    storage.availableProducts.computeIfPresent("Бира Starobrno",
                        (k, v) -> v - 1);

                } else {
                    if (storage.getAvailableProducts().get("Бира Starobrno") <= 2) {

                        System.out.println("Прави се заявка за Starobrno!");
                        storage.availableProducts.computeIfPresent("Бира Starobrno",
                            (k, v) -> v + 100.0);

                    }
                    return false;
                }
                break;
            case "Кока Кола":
                if (storage.getAvailableProducts().get("Кока Кола") >= 1) {

                    storage.availableProducts.computeIfPresent("Кока Кола",
                        (k, v) -> v - 1);

                } else {
                    if (storage.getAvailableProducts().get("Кока Кола") <= 2) {

                        System.out.println("Прави се заявка за кока кола!");
                        storage.availableProducts.computeIfPresent("Кока Кола",
                            (k, v) -> v + 100.0);

                    }
                    return false;
                }
                break;
            case "Студен чай":
                if (storage.getAvailableProducts().get("Студен чай") >= 1) {

                    storage.availableProducts.computeIfPresent("Студен чай",
                        (k, v) -> v - 1);

                } else {
                    if (storage.getAvailableProducts().get("Студен чай") <= 2) {

                        System.out.println("Прави се заявка за студен чай!");
                        storage.availableProducts.computeIfPresent("Студен чай",
                            (k, v) -> v + 100.0);

                    }
                    return false;
                }
                break;
            case "Минерална вода":
                if (storage.getAvailableProducts().get("Минерална вода") >= 1) {

                    storage.availableProducts.computeIfPresent("Минерална вода",
                        (k, v) -> v - 1);

                } else {
                    if (storage.getAvailableProducts().get("Минерална вода") <= 5) {

                        System.out.println("Прави се заявка за минерална вода!");
                        storage.availableProducts.computeIfPresent("Минерална вода",
                            (k, v) -> v + 100.0);

                    }
                    return false;
                }
                break;
        }
        return true;
    }
}


