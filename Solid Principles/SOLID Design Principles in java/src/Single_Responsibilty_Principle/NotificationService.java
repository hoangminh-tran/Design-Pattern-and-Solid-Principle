package Single_Responsibilty_Principle;

public class NotificationService {
    public void sendOTP(String medium) {
        if(medium.equals("email")) {
            // write email related Logic
            // use JavaMailSenderAPI
        }
        if(medium.equals("mobile")) {
            // write Logic using twillio API
        }
    }

    public void sendTransactionReport(String medium){
        if(medium.equals("email")) {
            // write email related Logic
            // use JavaMailSenderAPI
        }
        if(medium.equals("mobile")) {
            // write Logic using twillio API
        }
    }
}
