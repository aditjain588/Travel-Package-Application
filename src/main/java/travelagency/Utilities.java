package travelagency;

import java.util.List;

/**
 * This class contains utility functions that are used across different classes.
 */
public class Utilities {
    public Utilities () {

    }

    /**
     * Checks if a mentioned Travel Package exists.
     * @param travelPkgList List of Travel Packages to iterate over.
     * @param travelPackageName Name of Travel Package searching for
     * @return true if Travel package exists, false otherwise.
     */
    public Boolean ifTravelPackageExists (List<TravelPackage> travelPkgList, String travelPackageName) {
        for (TravelPackage item : travelPkgList) {
            if(item.getName().equals(travelPackageName)){
                return true;
            }           
        }
        return false;
    }

    /**
     * Checks if a mentioned Dtination esexists.
     * @param tp Name of Travel package we are looking a Destination in 
     * @param dest Name of destination we are searching for.
     * @return true if Destination exists, false otherwise.
     */
    public Boolean ifDestinationExists(TravelPackage tp, String dest) {
        for (Destination d : tp.getItenaryList()){
            System.out.println(" ");
            System.out.print("Destinations at "+ tp.getName() + " are: " + d.getName());
            System.out.println(" ");
            if(d.getName().equals(dest)){
                return true;
            }
        }
        return false;
    }

    /**
     * Displays all Travel packages that exist.
     * @param travelPackageList Travel Package list to iterate over.
     */
    public void DisplayAllTravelPackagesName (List<TravelPackage> travelPackageList) {
        System.out.println("The available Travel packages are: ");
        for (TravelPackage item : travelPackageList){
            System.out.println(item.getName());
        }
        System.out.println(" ");
    }

    /**
     * Displays all Destinations at a current Travel Package.
     * @param item Travel Package list to iterate over.
     */
    public void DisplayDestinationsOfTravelPackage (TravelPackage item) {
        for (Destination d : item.getItenaryList()){
            System.out.println(d.getName());
        }
    }
}
