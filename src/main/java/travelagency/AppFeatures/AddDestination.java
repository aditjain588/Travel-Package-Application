package travelagency.AppFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import travelagency.Activity;
import travelagency.Destination;
import travelagency.TravelPackage;
import travelagency.Utilities;

/**
 * This class adds a new Destination to a particular Travel Package.
 */
public class AddDestination {
    // List of all available Travel Packages.
    public List<TravelPackage> travelPackageList;

    // Represents the list of activities.
    List<Activity> activities;

    /**
     * Constructs a new AddDestination instance with the specified initial value.
     * @param tpg Travel Packages list.
     */
    public AddDestination(List<TravelPackage> tpg) {
        this.travelPackageList = tpg;
    }

    /**
     * Adds a new Destination to a particular Travel Package, while taking care of edge cases as well.
     * @param scanner
     */
    public void AddNewDestination(Scanner scanner) {
        Utilities util = new Utilities();

        System.out.println(" ");
        System.out.println("Which travel package do you want to a destination to ?");
        System.out.println(" ");

        // Displays all available Travel Packages to User.
        util.DisplayAllTravelPackagesName(travelPackageList);

        String travelPkgName = scanner.nextLine();
        
        // Checks if User mentioned Travel Packages exists or not. If does not exists, application goes back to main menu with an error message.
        if(!util.ifTravelPackageExists(travelPackageList, travelPkgName)){
            System.out.println("This travel package does not exixts. Either add a new package or choose from existing ones. ");
            return;
        }

        // Iterating over all the Available Packages.
        for(TravelPackage item : travelPackageList) {

            // Searching for the Travel Package entered by the User
            if(item.getName().equals(travelPkgName))
            {
                System.out.println(" ");
                System.out.println("What is name of destination you want to add? ");
                String dest = scanner.nextLine();
                
                // If the Destination already exists, then an error message is displayed.
                if(util.ifDestinationExists(item, dest)){
                    System.out.println(" ");
                    System.out.println("Destination already exists try again! ");
                    break;
                }
                
                // Initialize new empty Activities list associated to new added Destination.
                activities = new ArrayList<>();
                Destination di = new Destination(dest, activities);  
                
                // Adding new Destination to Destination list of current Travel Package.
                item.getItenaryList().add(di);
            }
        }
    }
}
