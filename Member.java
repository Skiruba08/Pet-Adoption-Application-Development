
import java.util.ArrayList;


/**
 *
 * @author Adam Whaley and Sherin
 */
public class Member {
    
    private String name;
    private int memberID;
    private boolean newsletterSubscribed;
    private ArrayList<Pets> petsOwned = new ArrayList();
    private double amountSpent = 0;

    /**
    *Constructor to intialize the member object. 
    *@param name The name of the member 
    *@param memberID the ID number of the member 
    *@param newsletterSubscribed The boolean value of wether their subscribed or not. 
    */

    public Member(String name, int memberID, boolean newsletterSubscribed) {
        this.name = name;
        this.memberID = memberID;
        this.newsletterSubscribed = newsletterSubscribed;
    }

    /**
    *getter method for the name of the member 
    *@return the name of the member 
    */

    public String getName() {
        return name;
    }
    /**
    *getter method for the Id number of the member 
    *@return the member id. 
    */
    public int getMemberID() {
        return memberID;
    }
    /**
    *the getter for wether the member is subscribed to the newsletter or not. 
    *@return true if they have, false if the member hasn't. 
    */

    public boolean isNewsletterSubscribed() {
        return newsletterSubscribed;
    }
    /**
    *getter method for the pets the members own. 
    *@return the pets they own. 
    */

    public ArrayList<Pets> getPetsOwned(){
        return petsOwned; 
    }
    /**
    *getter method for the amount spent by the member 
    *@return the amount the member spent. 
    */
    public double getAmountSpent() {
        return amountSpent;
    }
    /**
    *Setter method for the name of the member 
    *@param the member name 
    */

    public void setName(String name) {
        this.name = name;
    }

    /**
    *Setter method for the ID of the member 
    *@param the ID number of the member 
    */

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }
    /**
    *Setter method for the boolean news letter subscription 
    *@param the boolean value for if they have (true) or haven't (false). 
    */

    public void setNewsletterSubscribed(boolean newsletterSubscribed) {
        this.newsletterSubscribed = newsletterSubscribed;
    }
    /**
    *Setter method for the amount the member spends 
    *@param the double amount the member spent. 
    */
    public void setAmountSpent(double amountSpent) {
        this.amountSpent = this.amountSpent + amountSpent;
    }
    /**
    *A method that adds to the pets owned for the member. 
    *@param the pet that should be added. 
    */
     
    public void addPets (Pets p){
        petsOwned.add(p);
    }
}
