package travelagency.AppFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import travelagency.TravelPackage;
import travelagency.Passangers.GoldPassangers;
import travelagency.Passangers.Passangers;
import travelagency.Passangers.PremiumPassangers;
import travelagency.Passangers.StandardPassangers;

/**
 * This class adds a new Passanger.
 */
public class AddPassangers {
    // Represents the passanger list.
    public List<Passangers> passangersList = new ArrayList<>();

    // Represents the Travel Package list.
    public List<TravelPackage> travelPkgList;

    /**
     * Constructs a new AddPassanger instance with the specified initial value.
     * @param tpg Initializes Travel Package list.
     */
    public AddPassangers (List<TravelPackage> tpg) {
        this.travelPkgList = tpg;
    }

    /**
     * Displays all the details of the passanger.
     */
    public void DisplayPassangerDetails(){
        for (Passangers pas : passangersList){
            System.out.println(pas.name);
            System.out.println(pas.passangerNum);
            System.out.println(pas.balance);
        }
    }

    /**
     * Sub menu to add a new passager of different type. Standard passanger, Gold passanger or Premium passanger.
     * @param scanner
     */
    public void AddPassangerTypeSubMenu(Scanner scanner) {
        //Scanner scanner = new Scanner(System.in);
        int subMenuChoice = 0;
        int passangerNumber = 0;
        int passangerBalance;
        String passangerName = " ";

        while(subMenuChoice != 4) {
            System.out.println("\nSUBMENU:");
            System.out.println("Which type of passanger would you like to add? ");
            System.out.println("1. Standard Passanger: ");
            System.out.println("2. Gold Passanger:");
            System.out.println("3. Platinum Passanger:");
            System.out.println("4. Exit to main menu");

            subMenuChoice = scanner.nextInt();
            scanner.nextLine();  

            switch(subMenuChoice){
                case 1:
                    // Add a new Standard Passanger.
                    System.out.println("Standard Passanger");
                    System.out.println("Please enter the name of the Passanger. ");
                    passangerName = scanner.nextLine();

                    System.out.println("Please enter the total balance of this passanger. ");
                    passangerBalance = scanner.nextInt();

                    // Initializes a new Standard passanger.
                    StandardPassangers sp = new StandardPassangers(passangerName, passangerNumber, passangerBalance);     

                    // Class AddPassangerstoActivities is used to add a new activity for a passanger.
                    AddPassangerstoActivities apaStandardPsg = new AddPassangerstoActivities(travelPkgList);
                    apaStandardPsg.AddPsgToActivities(scanner,sp);
                    
                    passangersList.add(sp);                 
                    break;

                case 2:
                    // Add a new Gold Passanger.
                    System.out.println("Gold Passanger");
                    System.out.println("Please enter the name of the Passanger. ");
                    passangerName = scanner.nextLine();

                    System.out.println("Please enter the total balance of this passanger. ");
                    passangerBalance = scanner.nextInt();

                    // Initializes a new Gold passanger.
                    GoldPassangers gp = new GoldPassangers(passangerName, passangerNumber, passangerBalance);  

                    // Class AddPassangerstoActivities is used to add a new activity for a passanger.
                    AddPassangerstoActivities apaGoldPsg = new AddPassangerstoActivities(travelPkgList);
                    apaGoldPsg.AddPsgToActivities(scanner,gp);

                    passangersList.add(gp);   
                    break;

                case 3:
                    // Add a new Premium Passanger.
                    System.out.println("Premium Passanger");
                    System.out.println("Please enter the name of the Passanger. ");
                    passangerName = scanner.nextLine();
                    
                    // Initializes a new Premium passanger.
                    PremiumPassangers pp = new PremiumPassangers(passangerName, passangerNumber); 

                    // Class AddPassangerstoActivities is used to add a new activity for a passanger.
                    AddPassangerstoActivities apaPremPsg = new AddPassangerstoActivities(travelPkgList);
                    apaPremPsg.AddPsgToActivities(scanner,pp);

                    passangersList.add(pp);   
                    break;
                
                case 4:
                    // Go back to main menu.
                    break;
                
                    default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }         
        //scanner.close();
    }

}

