
package solidprinciple;


public class Withdraw implements Transactions{
    int amount =0;
    String name ,  acNumber;
    Withdraw(String name , String acNumber , int amount){
        this.name = name;
        this.acNumber = acNumber;
        this.amount = amount;
    }
    @Override
    public String doTransaction(){
        String message = name+" withdraw " +amount+"$ at account "+acNumber ;
        return message;
    }
}
