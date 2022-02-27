package solidprinciple;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("To get the bank service enter your name and account number : ");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Account number : ");
        String acNumber = input.nextLine();
        String option;
        int amount=0;
        System.out.println("Services : \nDeposit \nWithdraw \nLoanservice \nCheck balance \nTo sign out enter 'Exit'");
        while((option = input.next()) != "reject"){
        Balance b = new Balance();
        if (option.equalsIgnoreCase("deposit") || option.equalsIgnoreCase("withdraw")) {
            Transactions t ;
            System.out.print("Amount: ");
            amount = input.nextInt();
            if(option.equalsIgnoreCase("deposit")){
                t= (Transactions) new Deposit(name , acNumber ,amount);
                b.doCalc(amount);
            }
            else{
                t= (Transactions) new Withdraw(name , acNumber , amount);
                b.doCalc((0- amount));
            }
            String message = t.doTransaction();
            //b.doCalc(amount);
            System.out.print("Send notification at : ");
            //String medium = input.nextLine();
            String medium = input.next();
            if (medium.equalsIgnoreCase("Email")) {
                EmailNotification email = new EmailNotification();
                //email.sendOTP();
                email.sendTransactionReport(message);
                email.sendOTP();
            }
            else if(medium.equalsIgnoreCase("phone")){
                PhoneNotification pn = new PhoneNotification();
                pn.sendTransactionReport(message);
                pn.sendOTP();
            }
        }
        else if (option.equalsIgnoreCase("Loanservice")) {
            LoanService l = new LoanService(name, acNumber);
             String loantype = input.next();
             //System.out.println("test");
             String message = l.getLoanInterestInfo(loantype);
             System.out.print("Send notification at : ");
            //String medium = input.nextLine();
            String medium = input.next();
            if (medium.equalsIgnoreCase("Email")) {
                EmailNotification email = new EmailNotification();
                //email.sendOTP();
                email.sendTransactionReport(message);
                email.sendOTP();
            }
            else if(medium.equalsIgnoreCase("phone")){
                PhoneNotification pn = new PhoneNotification();
                pn.sendTransactionReport(message);
                pn.sendOTP();
            }

        }
    else if(option.equalsIgnoreCase("Check balance")){
       
       b.showBalance(name);
    }
    else if(option.equalsIgnoreCase("Exit")){
        break;
    }
    
    else{
            System.out.println("Unknown keyword");
    }

    }
    }
}
