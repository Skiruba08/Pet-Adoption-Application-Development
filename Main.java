import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        PetStore ps = new PetStore("Sherin's Petstore"); // Give your store a name!
        System.out.println("**** Welcome to " + ps.getStoreName() + " ****");
        while (true) {

            System.out.println("Please select from one of the following menu options");
            System.out.println("\t1. Buy a new pet");
            System.out.println("\t2. Register a new member");
            System.out.println("\t3. Start adoption drive (add new pets)");
            System.out.println("\t4. Check current inventory");
            System.out.println("\t5. Register new pet to Owner profile");
            System.out.println("\t6. Compare the prices of two pets");
            System.out.println("\t7. Exit");

            int choice1 = scnr.nextInt();

            switch (choice1) {
                case 1:
                    System.out.println("-----------------------------------");
                    purchase(ps, scnr, new ArrayList<Pets>());
                    break;
                case 2:
                    System.out.println("-----------------------------------");
                    registerNewMember(ps, scnr);
                    break;
                case 3:
                    ps.adoptionDrive(ps.getAvailablePets(), 300);
                    break;
                case 4:
                    System.out.println("-----------------------------------");
                    ArrayList<Pets> info = ps.getAvailablePets();
                    int itemNum = 1; 
                    for (Pets pet : info){
                        System.out.println("\t" + itemNum + ". $" + pet.getPrice() + " - " + "(" + pet.getName() + ")");
                        itemNum++;
                    }                    
                    System.out.println("The total: " + ps.inventoryValue());
                    break;
                case 5:
                System.out.println("-----------------------------------");
                System.out.println("Select a number: ");
                int num = 1;
                for (Member member : ps.getMemberList()) {
                System.out.println(num + ". " + member.getName());
                num++;
             }
                int oMem = scnr.nextInt();
                if (oMem <= 0 || oMem > ps.getMemberList().size()) {
                System.out.println("Invalid member number. Please try again.");
                break;
              }
            System.out.println("What type of pet?");
            System.out.println("1. Dog");
            System.out.println("2. Cat");
            System.out.println("3. Exotic Pet");

            int petChoice = scnr.nextInt();
            switch (petChoice) {
                case 1:
                    System.out.println("Enter name of Dog");
                    String n = scnr.next();
                    System.out.println("Enter Breed: ");
                    String b = scnr.next();
                    System.out.println("Enter Sex: ");
                    String s = scnr.next();
                    System.out.println("Enter age: ");
                    int a = scnr.nextInt();
                    System.out.println("Enter weight: ");
                    double w = scnr.nextDouble();
                    try {
                        ps.getMemberList().get(oMem - 1).addPets(new Dog(n, b, s, a, w, 0, 0.0));
                        System.out.println("Pet added to " + ps.getMemberList().get(oMem - 1).getName());
                    } catch (InputMismatchException ime) {
                        System.out.println("Error: " + ime.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Enter name of Cat");
                    String n1 = scnr.next();
                    System.out.println("Enter Breed: ");
                    String b1 = scnr.next();
                    System.out.println("Enter Sex: ");
                    String s1 = scnr.next();
                    System.out.println("Enter age: ");
                    int a1 = scnr.nextInt();
                    System.out.println("Enter weight: ");
                    double w1 = scnr.nextDouble();
                    try {
                        ps.getMemberList().get(oMem - 1).addPets(new Cat(n1, b1, s1, a1, w1, 0, 0.0));
                        System.out.println("Pet added to " + ps.getMemberList().get(oMem - 1).getName());
                    } catch (InputMismatchException ime) {
                        System.out.println("Error: " + ime.getMessage());
                    }
                    break;
                 case 3:
                System.out.println("Enter name of exotic pet");
                String n2 = scnr.next();
                System.out.println("Enter Species: ");
                String sp2 = scnr.next();
                System.out.println("Enter Sex: ");
                String s2 = scnr.next();
                System.out.println("Enter age: ");
                int a2 = scnr.nextInt();
                System.out.println("Enter weight: ");
                double w2 = scnr.nextDouble();
                try {
                ps.getMemberList().get(oMem - 1).addPets(new ExoticPet(n2, sp2, s2, a2, w2, 0, 0.0));
                System.out.println("Pet added to " + ps.getMemberList().get(oMem - 1).getName());
                } catch (InputMismatchException ime) {
                System.out.println("Error: " + ime.getMessage());
                }
                break;
        default:
            System.out.println("Oops, you entered something invalid.");
    }
    break;

                case 6:
                 int numA = 1; 
                 int numB = 1; 
                 
                 for (Pets p : ps.getAvailablePets()){
                     System.out.println("\t" + numA + ". $" + p.getPrice() + " - " + "(" + p.getName() + ")");
                     numA++; 
                 }


                 System.out.println("Enter the ID of the first pet: ");
                 int pet1  = scnr.nextInt();
                 Pets petNum1 = ps.getAvailablePets().get(pet1 - 1); 

                 for (Pets p : ps.getAvailablePets ()){
                     System.out.println("\t" + numB + ". $" + p.getPrice() + " - " + "(" +  p.getName() + ")");
                     numB++;
                 }
                 System.out.println("Enter the ID of the second pet: ");
                 int pet2 = scnr.nextInt(); 
                 Pets petNum2 = ps.getAvailablePets().get(pet2 - 1); 


                 if (petNum1.compareTo(petNum2) == 1 ){
                     System.out.println(petNum1.getName() + " costs more than " + petNum2.getName() + ".");
                 }
                 else if (petNum1.compareTo(petNum2) == -1){
                     System.out.println(petNum1.getName() + " costs less than " + petNum2.getName() + ".");
                 }
                 else {
                     System.out.println(petNum1.getName() + " costs the same as " + petNum2.getName() + ".");
                 }
                break; 
                case 7: 
                    System.out.println("Thanks for visiting!");
                    return; 
                default: 
                    System.out.println("Invalid Choice, try again. ");

            }
        }
    }


    /**
    *This method is a purchase method, that allows users to purchase from the pet store. 
    *@param the petstore
    *@param the scanner system 
    *@param the shopping cart, the pets users want to purchase. 
    */

    private static void purchase(PetStore petStore, Scanner scnr, ArrayList<Pets> cart) {
       int itemNum = 1; 
       ArrayList <Pets> inventory = petStore.getAvailablePets(); 

       if (!inventory.isEmpty()){
           System.out.println("Which animals would you like to purchase?");

           for (Pets pet : inventory){
               System.out.println("\t" + itemNum + ". $" + pet.getPrice() + " - " + "(" + pet.getName() + ")");
               itemNum++;
           }
           int choice = scnr.nextInt(); 
           if (choice <+ inventory.size()){
               cart.add(inventory.get(choice -1));
               petStore.removePet(choice - 1);
               System.out.println(" There is " + cart.size() + " items in your cart. Are you done shopping?");
               System.out.println("\t1. yes");
               System.out.println("\t2. no");

               int exitShop = scnr.nextInt(); 
               if (exitShop == 1 ){
                   checkout(petStore, scnr, cart);
               } else if (exitShop == 2){
                   purchase(petStore, scnr, cart); 
               } else {
                   System.out.println("Invalid choice.");
               }
           } else{
               System.out.println("Plese enter a valid Product number, try again");
               purchase(petStore, scnr, cart); 
           }
       }
           else {
               System.out.println("Sorry! no animals available. ");
           }
       
    }
   /**
    *This method is a checkout method, that allows users to checkout from the pet store. 
    *@param the petstore
    *@param the scanner system 
    *@param the shopping cart, the pets users want to purchase. 
    */

    private static void checkout(PetStore petStore, Scanner scnr, ArrayList<Pets> cart) {
        // calculate total
        double total = 0;
        
        //implementing compare to 
        for (Pets pet : cart) {
            total += pet.getPrice();
        }

        System.out.println(
            "Your total comes to " + total + ". \nPlease select which member is making this" +
            " purchase."
        );
       
        // list members and option to register
        int num = 1;
        for (Member member : petStore.getMemberList()) {
            System.out.println(num + ". " + member.getName());
            num++;
        }
        System.out.println(num + ". Register a new Member.");
        
        System.out.println(""); // space line
        int memberSelect = scnr.nextInt();
        Member purchaser = null;

        if (memberSelect > petStore.getMemberList().size()+1) { // invalid selection
            System.out.println("Invalid Selection");
            checkout(petStore, scnr, cart); // recursive call if valid user input

        } else { // valid selection
            if (memberSelect == petStore.getMemberList().size() + 1) { // adding a new member
                boolean premium = registerNewMember(petStore, scnr);
                if (premium) {
                    purchaser = petStore.getMemberList().get(
                        petStore.getMemberList().size() - 1
                    );
                } else {
                    purchaser = petStore.getMemberList().get(petStore.getMemberList().size() - 1);
                }
            } else if (memberSelect <= (petStore.getMemberList().size())) {
                purchaser = petStore.getMemberList().get(memberSelect - 1);
            } else { // existing premium member
                purchaser = petStore.getMemberList().get(
                    memberSelect - petStore.getMemberList().size() - 1
                );
            }

            // check if premium member and fees are due
            if (purchaser instanceof PremiumMember) {
                PremiumMember premMember = (PremiumMember) purchaser; 
                if(!premMember.isDuesPaid()){
                System.out.println(
                    "Premium Membership dues unpaid, $5 will be added to purchase total to cover du" +
                    "es."
                );
                total += 5;
                }
                premMember.setDuesPaid(true);
                // update amount of purchases for this member
                premMember.setAmountSpent(total);
                // done
                System.out.println("Your purchase total was: " + total);
                System.out.println(
                    "Congrats on your purchase " + purchaser.getName()
                );

            } else {
                // update amount of purchases for this member
                purchaser.setAmountSpent(total);
                System.out.println("Your purchase total was: " + total);
                System.out.println("Congrats on your purchase " + purchaser.getName());

            }
          
        }
    }

    /**
    *This method allows the user to register a new premium member. 
    *@param the petstore
    *@param the scanner system 
    */

    private static boolean registerNewMember(PetStore petStore, Scanner scnr) {
        // prompt user to select membership type
        System.out.println("Let's get you registered as a new Member!");
        System.out.println( "Would you like to register as a free-tier or premium member?");
        System.out.println("\t1. Free-tier");
        System.out.println("\t2. Premium");

        // user selection
        int choice1 = scnr.nextInt();
        // if user selects a wrong choice 
        if (choice1 > 2 || choice1 < 1) {
            System.out.println("Invalid choice.");
            registerNewMember(petStore, scnr); // try again

        } else {
            // prompt user for name 
            System.out.println("Please enter your name:");
            scnr.nextLine();
            String name = scnr.nextLine();
             System.out.println("Welcome to our membership program! Thank you for registering.");
            if (choice1 == 1) { // regular membership
                petStore.addNewMember(name, false);
                return false;
            } else { // user entered 2 - premimum membership
                petStore.addNewMember(name, true);
                return true;
            }
        }
        return false;
    }



}
    


