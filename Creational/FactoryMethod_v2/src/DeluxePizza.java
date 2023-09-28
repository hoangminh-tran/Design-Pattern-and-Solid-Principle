public class DeluxePizza implements Pizza{
    private double price = 20.23;
    public DeluxePizza(){}
    @Override
    public void doSomething() {
        System.out.println("Deluxe Pizza have price is : $" +  price);
    }
}
