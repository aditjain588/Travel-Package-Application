package travelagency.AppFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import travelagency.Destination;
import travelagency.TravelPackage;
import travelagency.Utilities;
import travelagency.Passangers.Passangers;

 /**
  * This class adds a new Travel Package.
  */
public class AddTravelPackage {
    // Represents the Destination list for Travel Package.
    public List<Destination> destinationList;

    // Represents the Passangers list for Travel Package.
    public List<Passangers> passangersList;

    // Represents the Travel Package list in which new Travel Package will be added.
    public List<TravelPackage> travelPkgList;

    /**
     * Constructs a new AddTravelPackage instance with the specified initial value.
     * @param tpg Travel Package list.
     */
    public AddTravelPackage(List<TravelPackage> tpg) {
        this.travelPkgList = tpg;
    }

    /**
     * Adds a new Travel Packages to Travel Packages list, while taking care of edge cases as well.
     * @param scanner
     */
    public void AddNewTravelPackage (Scanner scanner) {
        System.out.println(" ");
        System.out.println("Enter the name of Travel Package ");
        String travelPackageName = scanner.nextLine();

        Utilities util = new Utilities();
        
        // Checks if User mentioned Travel Packages exists or not. If it exists, application goes back to main menu with an error message.
        if(util.ifTravelPackageExists(travelPkgList, travelPackageName)){
            System.out.println("This travel package already exixts! ");
            return;
        }

        System.out.println(" ");
        System.out.println("Enter Passanger capacity");

        // Passanger capacity for the new Travel Package.
        int travelPackagePassangerCapacity = scanner.nextInt();

        // Initialize a new empty Destination list for current Travel Package.
        destinationList = new ArrayList<>();

        // New Travel Package.
        TravelPackage tp = new TravelPackage(travelPackageName, travelPackagePassangerCapacity, destinationList, passangersList);

        // Add new Travel package to Travel Packages list.
        this.travelPkgList.add(tp);
    }
}
