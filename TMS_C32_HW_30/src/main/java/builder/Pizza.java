package builder;
public class Pizza {
    private final String size;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean mushrooms;
    // Добавить другие ингредиенты как поля

    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
        // Инициализировать другие ингредиенты
    }

    // Getters
    public String getSize() { return size; }
    public boolean hasCheese() { return cheese; }
    public boolean hasPepperoni() { return pepperoni; }
    public boolean hasMushrooms() { return mushrooms; }
    // Добавить геттеры для других ингредиентов

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", mushrooms=" + mushrooms +
                '}';
    }


    //Внутренний статический класс для создания билдера
    public static class PizzaBuilder{
        private String size = "medium";
        private boolean cheese = true;
        private boolean pepperoni = false;
        private boolean mushrooms = false;

        public PizzaBuilder setSize(String size){
            this.size = size;
            return this;
        }

        public PizzaBuilder addCheese(boolean addCheese){
            this.cheese = addCheese;
            return this;
        }

        public PizzaBuilder addPepperoni(boolean addPepperoni){
            this.pepperoni = addPepperoni;
            return this;
        }

        public PizzaBuilder addMushrooms(boolean addMushrooms){
            this.mushrooms = addMushrooms;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }
}