package Dependency_Inversion_Principle;

public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount)
    {
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args)
    {
        BankCard debitCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        shoppingMall.doPurchaseSomething(3000);

        BankCard creditCard = new CreditCard();
        ShoppingMall shoppingMall1 = new ShoppingMall(creditCard);
        shoppingMall1.doPurchaseSomething(3000);
    }
}
