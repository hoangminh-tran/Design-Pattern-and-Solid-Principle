package Interface_Segregation_Principle;

public class GooglePay implements UPIPayments, CashBackManager{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {
        // This features is there in gpay
    }
}
