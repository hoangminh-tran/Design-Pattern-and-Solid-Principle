package Interface_Segregation_Principle;

public class Paytm implements UPIPayments{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

//    @Override
//    public void getCashBackAsCreditBalance() {
//        // This features are not applicable
//    }
}
