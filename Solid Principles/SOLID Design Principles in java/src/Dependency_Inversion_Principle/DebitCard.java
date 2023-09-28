package Dependency_Inversion_Principle;

public class DebitCard implements BankCard{
    public void doTransaction(long amount)
    {
        System.out.println("payment using Debit Card");
    }
}
