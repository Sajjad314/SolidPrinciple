
package solidprinciple;

import java.util.Scanner;

public class LoanService {
    
    String name , acNumber ,message;
     Scanner in = new Scanner(System.in);
    LoanService(String name , String acNumber){
        this.name = name;
        this.acNumber = acNumber;
        System.out.println("Enter the loan type");
       
       
    }
    
    public String getLoanInterestInfo(String loanType) {
        if (loanType.equalsIgnoreCase("homeLoan")) {
            System.out.print("Enter the amount of the loan you want to apply: ");
            int amount  = in.nextInt();
            System.out.println("Do you want to get "+amount+"$ at 5% interest?");
            String confirmation = in.next();
            if(confirmation.equalsIgnoreCase("Yes"))
                message = name+"'s request for "+amount+"$ homeloan has been approved";
            else
               message = name+"'s request for "+amount+"$ homeloan has been denied";
        }
        if (loanType.equalsIgnoreCase("personalLoan")) {
            System.out.print("Enter the amount of the loan you want to apply: ");
            int amount  = in.nextInt();
            System.out.println("Do you want to get "+amount+"$ at 10% interest?");
            String confirmation = in.next();
            if(confirmation.equalsIgnoreCase("Yes"))
                message = name+"'s request for "+amount+"$ personalloan has been approved";
            else
               message = name+"'s request for "+amount+"$ personalloan has been denied";
        }
        if (loanType.equalsIgnoreCase("carloan")) {
            System.out.print("Enter the amount of the loan you want to apply: ");
            int amount  = in.nextInt();
            System.out.println("Do you want to get "+amount+"$ at 15% interest?");
            String confirmation = in.next();
            if(confirmation.equalsIgnoreCase("Yes"))
                message = name+"'s request for "+amount+"$ car loan has been approved";
            else
               message = name+"'s request for "+amount+"$ car loan has been denied";
        }
        return message;
    }
    
}
