public class PizzaFactory {
    public PizzaFactory(){}
    public Pizza CreatePizze(PizzaType pizzaType)
    {
        Pizza pizza = null;
        switch (pizzaType)
        {
            case DELUXE:
                pizza = new DeluxePizza();
                break;
            case BBQ_CHICKEN:
                pizza = new BBQChickenPizza();
                break;
            case BUFFALO_CHICKEN:
                pizza = new BuffaloChickenPizza();
                break;
            case BACON_CHEESE:
                pizza = new BaconCheesePizza();
                break;
        }
        return pizza;
    }
}
