
package solidprinciple;

public class PhoneNotification implements NotificatiionService,Call{

    @Override
    public void sendOTP() {
        System.out.println("Transaction successfull \nSend via phone");
    }

    @Override
    public void sendTransactionReport(String message) {
        System.out.println(message);
    }

    @Override
    public void makeAcall() {
        System.out.println("Incoming call");
    }
    
}
