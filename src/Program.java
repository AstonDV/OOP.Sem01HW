import java.util.*;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new WaterBottle("Evian", 1.50, 500));
        products.add(new Snack("Snickers", 0.75, "Mars"));
        products.add(new Drink("Coca-Cola", 1.00, "Regular"));
        products.add(new HotDrink("Coffee", 1.50, 80));

        DrinkVendingMachine vendingMachine = new DrinkVendingMachine();
        vendingMachine.initProducts(products);

        // Получение продуктов по имени
        System.out.println(vendingMachine.getProduct("Coca-Cola"));
        System.out.println(vendingMachine.getProduct("Snickers"));

        // Получение воды по имени и объему
        System.out.println(vendingMachine.getProduct("Evian", 500));

        // Получение горячего напитка по имени, объему и температуре
        System.out.println(vendingMachine.getProduct("Coffee", 0, 80));
    }
}