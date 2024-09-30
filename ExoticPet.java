
/**
 *
 * @author Adam Whaley and Sherin
 */
 
public class ExoticPet extends Pets {

    private String species;
   /**
    *This is a constructor that intialized the exotic pet. 
    *@param name, the name of the pet 
    *@param Species, the species of the pet 
    *@param sex, the sex of the pet
    *@param age, the age of the pet
    *@param weight, the weight of the pet
    *@param ID, the ID number of the pet
    *@param price, the price of the pet
    */
    
    public ExoticPet(String name, String species, String sex, int age, double weight, int ID, double price) {
       super(name, sex, age, weight, ID, price);
       this.species = species; 
    }

    /**
    *a getter method that returns the species of the pet
    *@return the species of the pet 
    */
    public String getSpecies() {
        return species;
    }
    /**
    *a setter method that sets the species of the pet 
    *@param the string variable that holds the species.
    */
    public void setSpecies(String species) {
        this.species = species;
    }

 
    
    
}
