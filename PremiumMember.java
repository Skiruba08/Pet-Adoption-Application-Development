
import java.util.ArrayList;
    /**
    *
    * @author Adam Whaley and Sherin 
    */

public class PremiumMember extends Member {
    
    private boolean duesPaid;
    private double amountSpent = 0;

    public PremiumMember(String name, int memberID, boolean newsletterSubscribed, boolean duesPaid) {
        super(name, memberID, newsletterSubscribed);
        this.duesPaid = duesPaid; 
    }

    /*
    * A boolean method that gets the dues paid. 
    *
    *@return the boolean value of dues paid. 
    */

    public boolean isDuesPaid() {
        return duesPaid;
    }
    
    /*
    * A boolean method that sets the dues paid. 
    *@param the boolean instance variable dues paid.  
    */

    public void setDuesPaid(boolean duesPaid) {
        this.duesPaid = duesPaid;
    }

    
    /*
    * A method that gets the amount a member spends.  
    *
    *@return the double value of amount a member spends. 
    */

    public double getAmountSpent() {
        return amountSpent;
    }

    
}
