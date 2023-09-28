public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.CreatePizze(PizzaType.BUFFALO_CHICKEN);
        pizza.doSomething();
    }
}