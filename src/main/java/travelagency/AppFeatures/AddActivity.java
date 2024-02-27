package travelagency.AppFeatures;

import java.util.List;
import java.util.Scanner;


import travelagency.Activity;
import travelagency.Destination;
import travelagency.TravelPackage;
import travelagency.Utilities;

/**
 * This class adds a new Activity to a particular Destination.
 */
public class AddActivity {
    /**
     * List of Destinations in which an Activity needs to ne added
     */
    public List<Destination> destinationList;

    /**
     * List of Travel Packages in which an Activity needs to ne added
     */
    public List<TravelPackage> travelPackageList;

    /**
     * Constructs a new AddActivity instance with the specified initial value.
     * @param d List of destinations.
     * @param tp List of travel Packages.
     */
    public AddActivity(List<Destination> d, List<TravelPackage> tp){
        this.destinationList = d;
        this.travelPackageList = tp;
    }

    /**
     * Adds a new activity to a particular Destination in a particular Travel Package, while taking care of edge cases as well.
     * @param scanner
     */
    public void AddNewActivity(Scanner scanner) {
        Utilities util = new Utilities();
        System.out.println("Which travel package do you want to a activity to ?");
        
        // Displays all available Travel Packages to User.
        util.DisplayAllTravelPackagesName(travelPackageList);

        // Inputs the Travel Package, user wants to add an Activity to.
        String travelPkgName = scanner.nextLine();

        // Checks if User mentioned Travel Packages exists or not. If does not exists, application goes back to main menu with an error message.
        if(!util.ifTravelPackageExists(travelPackageList, travelPkgName)){
            System.out.println("This travel package does not exixts. Either add a new package or choose from existing ones. ");
            return;
        }

        // Iterating over all the Available Packages.
        for(TravelPackage item : travelPackageList){

            // Searching for the Travel Package entered by the User
            if(item.getName().equals(travelPkgName)){
                System.out.println("Select the destination you want to add an activity to.");
                // for (Destination d : item.getItenaryList()){
                //     System.out.println(d.getName());
                // }
                
                // Displays all Destinations of the User selected Travel Package.
                util.DisplayDestinationsOfTravelPackage(item);
                
                // User inputs the Destination that an Activity needs to be added to.
                String activityDest = scanner.nextLine();
                
                // Checks if User entered Destination exists or not.
                if(!util.ifDestinationExists(item, activityDest)){
                    System.out.println("Destination does not exist. Either add a new destination or choose from existing ones ");
                    return;
                }

                // boolean ifDestinationExists = false;

                // for (Destination d : item.getItenaryList()){
                //     if(d.getName().equals(activityDest)){
                //         ifDestinationExists = true;
                //     }
                // }

                // if(!ifDestinationExists){
                //     System.out.println("Specified destination does not exist please try again! ");
                //     break;
                // }

                System.out.println("What is name of activity you want to add? ");
                String actitityToAddName = scanner.nextLine();
                Boolean ifActivityExists = false;
                
                // These for loops checks if the Entered Activity exists in any Destination of the current Travel Package.
                // Iterates over the Destinations.
                for (Destination dest : item.getItenaryList()){
                    // Iterate over the activities at current Destinations.
                    for (Activity a : dest.getActivityList()){

                        // If activity already exixsts, output an error message to the user and not add the activity.
                        if(a.getName().equals(actitityToAddName)){
                            System.out.println("Activity cannot be added as it is already in " + dest.getName() + "destination. Please try again!");
                            ifActivityExists = true;
                            break;
                        }                         
                    }
                }
                
                // If activity already exists, exit out of the loop.
                if(ifActivityExists){
                    break;
                }

                // If activity does not exist, we are good to add it to current Destinatioh.
                else{
                    System.out.println("Need few more details to add an activity ");

                    // User input for Description of the Activity.
                    System.out.println("Add a brief description for the activity!");
                    String actitityToAddDescp = scanner.nextLine();
                    
                    // User input for Cost of the Activity.
                    System.out.println("Add cost for the activity!");
                    int actitityToAddCost = scanner.nextInt();
                    
                    // User input for Passanger Capacity of the Activity.
                    System.out.println("Add available capacity for the activity!");
                    int actitityToAddAvailableCapacity = scanner.nextInt();

                    // Adds activity to user chosen destination.
                    for (Destination d : item.getItenaryList()){
                        if(d.getName().equals(activityDest)){
                            Activity newAddedActivity = new Activity(actitityToAddName, actitityToAddDescp, actitityToAddCost, actitityToAddAvailableCapacity, activityDest);
                            d.getActivityList().add(newAddedActivity);
                            break;
                        }
                    } 
                    
                    // Displays all activities at the Destination user just added a new Activity to.
                    for (Destination d : item.getItenaryList()){
                        if(d.getName().equals(activityDest)){
                            d.DisplayActivityList();
                        }
                    }
                }

                break;
            }
        }
    }
}
