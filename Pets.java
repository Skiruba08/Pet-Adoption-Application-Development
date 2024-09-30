/**
 *
 * @author Adam Whaley and Sherin
 */
 public abstract class Pets implements Comparable <Pets> {
    
    // fields for all the animals 
    private String name;
    private String sex;
    private int age;
    private double weight;
    private int ID;
    private double price;
    /**
    *Constructor to initialize a Pet object
    *@param name The name of the pet
    *@param sex The sex of the pet
    *@param age The age of the pet
    *@param weight The weight of the pet
    *@param ID The ID of the pet
    *@param price The price of the pet
    */

    // constructor 
    public Pets(String name, String sex, int age, double weight, int   ID, double price) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.ID = ID;
        this.price =  price;
    } 
    /**
    *Getter method for the ID of the pet
    *@return The ID of the pet
    */
    public int getID() {
        return ID;
    }

    /**
    *Setter method for the ID of the pet
    *@param ID The ID of the pet
    */
    public void setID(int ID) {
        this.ID = ID;
    }


    /**
    *this is a getter for the price of pets
    *@return the price of the pet. 
    */


    public double getPrice() {
        return price;
    }
    /**
    *Setter method the price of the pets. 
    *@param the double price value of the pets. 
    */

    public void setPrice(double price) {
        this.price = price;
    }
    
    /**
    *getter method for the name of the pet
    *@return the name of the pet. 
    */

    public String getName() {
        return name;
    }
    /**
    *Setter method for the name of the pet
    *@param the string name of the pet.
    */

    public void setName(String name) {
        this.name = name;
    }
    /**
    *getter method for the sex of the pet 
    *@return the sex of the pet
    */

    public String getSex() {
        return sex;
    }
    /**
    *setter method to set the sex of the pet. 
    *@param the sex of the pet 
    */

    public void setSex(String sex) {
        this.sex = sex;
    }
    /**
    *getter method for the age of the pet
    *@return the age of the pet
    */
    public int getAge() {
        return age;
    }
    /**
    *Setter method for the age of the pet 
    *@param int the age of the pet 
    */

    public void setAge(int age) {
        this.age = age;
    }
    /**
    *a getter method for the weight of the pet 
    *@return the weight of the pet. 
    */
    public double getWeight() {
        return weight;
    }
    /**
    *Setter method for the weight of the pet 
    *@param the double weight value of the pet 
    */

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
    *a overriden compare to method, that compares the prices of two pets. 
    *@param the other pet object
    */

    @Override
    public int  compareTo (Pets other){
     if (other.getPrice() > this.getPrice()) {
        return -1;
    } else if (other.getPrice() < this.getPrice()) {
        return 1;
    } else {
        return 0;
    }
    }
    
    
}
