public class BuffaloChickenPizza implements Pizza{
    private double price = 14.83;
    public BuffaloChickenPizza(){}
    @Override
    public void doSomething() {
        System.out.println("Buffalo Chicken Pizza have price is : $" +  price);
    }
}
