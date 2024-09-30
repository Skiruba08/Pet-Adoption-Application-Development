/**
 *
 * @author Adam Whaley and Sherin
 */
import java.io.*;
import java.util. *;

public class PetStore implements PetStoreSpecification 
{
    private String storeName;
    private ArrayList<Pets> availablePets = new ArrayList();
    private ArrayList<Member> memberList = new ArrayList();
    private static int nextPetID = 1;
    private static int nextMemberID = 1;
    /**
    * Constructs a PetStore with the given store name. Initializes the store's pets and members.
    *
    * @param storeName the name of the pet store
    */

    public PetStore(String storeName) {
        this.storeName = storeName;
        Dog dog1 = new Dog(
            "Kaylee",
            "German Shepherd",
            "Female",
            12,
            85,
            getNextPetID(),
            500
        );
        Dog dog2 = new Dog("Poe", "Corgi", "Male", 3, 35, getNextPetID(), 450);
        Cat cat1 = new Cat(
            "Karma",
            "Orange Tabby",
            "Female",
            6,
            15,
            getNextPetID(),
            200
        );
        Cat cat2 = new Cat("Clover", "American Shorthair", "Female", 6, 18, getNextPetID(), 150);
        ExoticPet ep1 = new ExoticPet(
            "Pancake",
            "Bearded Dragon",
            "Male",
            6,
            0.8,
            getNextPetID(),
            75
        );
        ExoticPet ep2 = new ExoticPet(
            "Noodle",
            "Ball Python",
            "Male",
            4,
            2,
            getNextPetID(),
            95
        );
        Pets adPet1 = new Cat ("Butterfly", "Cat", "female", 3, 3, getNextPetID(), 90);
        Pets adPet2 = new Dog ("Frog", "Dog", "female", 3, 3, getNextPetID(), 90);
       
        // adding to the pet arraylist
        availablePets.add(dog1); 
        availablePets.add(dog2);
        availablePets.add(cat1);
        availablePets.add(cat2);
        availablePets.add(ep1);
        availablePets.add(ep2);


        


        Member member1 = new Member("Jo", getNextMemberID(), true);
        member1.addPets(new Cat("Valjean", "White tabby", "Male", 1, 10, 0, 0));
        memberList.add(member1);

        PremiumMember member2 = new PremiumMember("Sage", getNextMemberID(), false, false);
        memberList.add(member2);
        member2.addPets(new ExoticPet("Smaug", "Bearded Dragon", "Male", 5, 1, 0, 0));

    }

    /**
    * Returns the next pet ID.
    *
    * @return the nextPetID
     */

    public static int getNextPetID() {
        nextPetID++;
        return nextPetID - 1;
    }
    /**
    * Returns the next member ID 
    *
    * @return the next Member ID
    */
    
    public static int getNextMemberID() {
        nextMemberID++;
        return nextMemberID - 1;
    }
    /**
    * Returns the name of the pet store.
    *
    * @return the name of the pet store
    */
    public String getStoreName() {
        return storeName;
    }
    /**
    * sets the name of the store
    *
    * @param the store name 
    */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
    * Returns the available arraylist of pets 
    *
    * @return the arraylist with pets
    */

    public ArrayList<Pets> getAvailablePets(){
        return availablePets; 
    }

    /**
    * sets the available pets
    *
    * @param arraylist of pets
    */
    
    public void setAvailablePets(ArrayList <Pets> availablePets){
        this.availablePets = availablePets; 
    }
    /**
     * Returns the members of the petstore. 
    *
    * @return Arraylist of members stored 
    */
    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    /**
    * Sets the members of the petstores 
    *
    * @param the arraylist of members 
    */

    public void setMemberList(ArrayList<Member> memberList) {
        this.memberList = memberList;
    }

    /**
    * removed a pet for the arraylist 
    *
    * @param index of pet that is being removed. 
    */
    public void removePet(int index) {
       availablePets.remove(index);
    }

    /**
    * Adds both premium and free members. 
    * @param the boolean value of wether their premium or not. 
    * @param name of members 
    */


    public void addNewMember(String name, boolean premium) {
        if (premium) {
            memberList.add(new PremiumMember(name,getNextMemberID(),false,false));
        } else {
            memberList.add(new Member(name,getNextMemberID(), false));
        }
    }
    /**
    *Calculates the total value of all available pets in the inventory
    *@return the total value of all available pets in the inventory
    */
    @Override 
    public double inventoryValue(){
        double total = 0.00; 
        for (int i = 0; i < availablePets.size(); i++ ){
            double cost = availablePets.get(i).getPrice();
            total += cost; 

        }
        return total; 
    }

    /**
    *Adds a donated pet to the adoption drive inventory
    *@param pets An ArrayList of Pets objects representing the current inventory of pets
    *@param price The price of the donated pet
    */
    @Override 
    public void adoptionDrive (ArrayList<Pets> pets, double price){
        
        ArrayList <Pets> adopt = pets; 
        Scanner scnr = new Scanner(System.in);

        System.out.println("Select a type of pet to donate: ");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Exotic Pet");

        int animalType = scnr.nextInt(); 

        switch (animalType){
            case 1: 
            System.out.println("Enter name: ");
            String name = scnr.next(); 
            System.out.println("Enter breed: ");
            String breed = scnr.next(); 
            System.out.println("Enter sex: ");
            String sex = scnr.next(); 
            System.out.println("Enter age: ");
            int age = scnr.nextInt(); 
            System.out.println("Enter weight");
            double weight = scnr.nextDouble(); 

            adopt.add(new Dog (name, breed, sex, age, weight, 0, price));
            break; 

            case 2: 
            System.out.println("Enter name: ");
            String name2 = scnr.next(); 
            System.out.println("Enter breed: ");
            String breed2 = scnr.next(); 
            System.out.println("Enter sex: ");
            String sex2 = scnr.next(); 
            System.out.println("Enter age: ");
            int age2 = scnr.nextInt(); 
            System.out.println("Enter weight");
            double weight2 = scnr.nextDouble(); 

            adopt.add(new Cat (name2, breed2, sex2, age2, weight2,0, price));
            break; 

            case 3: 
             System.out.println("Enter name: ");
            String name1 = scnr.next(); 
            System.out.println("Enter species: ");
            String species1 = scnr.next(); 
            System.out.println("Enter sex: ");
            String sex1 = scnr.next(); 
            System.out.println("Enter age: ");
            int age1 = scnr.nextInt(); 
            System.out.println("Enter weight");
            double weight1 = scnr.nextDouble(); 

            adopt.add(new ExoticPet(name1, species1, sex1, age1, weight1, 0, price));
            break; 

            default: 
            System.out.println("Choose a number between 1-3");
        }
        System.out.println("Thanks for donating!");


    }
}
