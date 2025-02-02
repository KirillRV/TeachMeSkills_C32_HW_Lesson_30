package builder;
public class PizzaRunner {
    public static void main(String[] args) {
        // Создание пиццы с помощью статического билдера внутри класса Pizza
        Pizza pizza1 = new Pizza.PizzaBuilder()
                .setSize("large")
                .addPepperoni(true)
                .build();
        System.out.println(pizza1);

        Pizza pizza2 = new Pizza.PizzaBuilder()
                .addMushrooms(true)
                .setSize("small")
                .addCheese(false)
                .build();
        System.out.println(pizza2);
    }
}