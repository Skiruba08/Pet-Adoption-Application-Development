/**
 *
 * @author Adam Whaley and Sherin 
 */
public class Dog extends Pets {
    
    private String breed; 
    /**
    *A constructor that intializes the Dog object 
    *@param name, the name of the pet 
    *@param breed, the breed of the pet 
    *@param sex, the sex of the pet
    *@param age, the age of the pet
    *@param weight, the weight of the pet
    *@param ID, the ID number of the pet
    *@param price, the price of the pet
    */

    public Dog(String name,String breed, String sex, int age, double weight, int ID, double price) {
       super (name, sex, age, weight, ID, price);
    }

    /**
    *a getter method that returns the breed of the pet
    *@return the breed of the pet 
    */
    
  
    public String getBreed() {
        return breed;
    }
    /**
    *a setter method that sets the breed of the pet 
    *@param the string variable that holds the breed of pet.
    */

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    
    
}
