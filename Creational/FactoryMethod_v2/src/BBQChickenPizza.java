public class BBQChickenPizza implements Pizza{
    private double price = 9.99;
    public BBQChickenPizza(){}
    @Override
    public void doSomething() {
        System.out.println("BBQ Chicken Pizza have price is : $" +  price);
    }
}
