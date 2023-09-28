public class BaconCheesePizza implements Pizza{
    private double price = 17.26;
    public BaconCheesePizza(){}
    @Override
    public void doSomething() {
        System.out.println("Bacon Cheese Pizza have price is : $" +  price);
    }
}
