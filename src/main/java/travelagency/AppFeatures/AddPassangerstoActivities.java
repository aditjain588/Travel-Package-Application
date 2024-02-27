package travelagency.AppFeatures;

import java.util.List;
import java.util.Scanner;

import travelagency.Activity;
import travelagency.Destination;
import travelagency.TravelPackage;
import travelagency.Utilities;
import travelagency.Passangers.Passangers;

/**
 * This class adds a new activity to a Passanger.
 */
public class AddPassangerstoActivities {
    // Represents the list of Travel packages.
    public List<TravelPackage> travelPackageList;

    /**
     * Constructs a new AddPassangerstoActivities instance with the specified initial value.
     * @param tpg Initializes Travel Package list.
     */
    public AddPassangerstoActivities(List<TravelPackage> tpg){
        this.travelPackageList = tpg;
    }

    /**
     * Adds a new activity for a Passanger.
     * @param scanner
     * @param psg Passanger
     */
    public void AddPsgToActivities(Scanner scanner, Passangers psg){
        Utilities util = new Utilities();

        System.out.println("These are the available packages. Choose which one you want to visit! ");

        // Displays all available Travel Packages to User.
        util.DisplayAllTravelPackagesName(travelPackageList);
        scanner.nextLine();
        String travelPkgName = scanner.nextLine();

        // Checks if User mentioned Travel Packages exists or not. If does not exists, application goes back to passanger sub menu with an error message.
        if(!util.ifTravelPackageExists(travelPackageList, travelPkgName)){
            System.out.println("This travel package does not exixts. Either add a new package or choose from existing ones. ");
            return;
        }

        // Iterating over all the Available Packages.
        for(TravelPackage item : travelPackageList){

            // Searching for the Travel Package entered by the User
            if(item.getName().equals(travelPkgName)){
                System.out.println("Select the destination you want to add an activity to.");

                // Displays all Destinations of the User selected Travel Package.
                util.DisplayDestinationsOfTravelPackage(item);

                // User inputs the Destination for an activity.
                String activityDest = scanner.nextLine();
                
                // Checks if User entered Destination exists or not.
                if(!util.ifDestinationExists(item, activityDest)){
                    System.out.println("Destination does not exist. Either add a new destination or choose from existing ones ");
                    return;
                }

                System.out.println("What activity would you like to sign up for? ");

                // These for loops displays all the activities at a particular destination.
                // Iterates over the Destinations.
                for (Destination d : item.getItenaryList()){        
                    
                     // Get all activities at the selected Destination.
                     if(d.getName().equals(activityDest)){
                        System.out.println("Available activities at " + d.getName() + " are: ");

                        // Iterates over available activites at a destination.
                        for (Activity a : d.getActivityList()){  

                            // Displays all activities with available capacity.
                            if(a.getCapacity() > 0){
                                System.out.println(a.getName() +" capacity: " + a.getCapacity());
                            }                                 
                        }
                     }
                     
                }

                // Input user activity in which passanger is intered in. 
                String inputActivity = scanner.nextLine();

                // Add a new Passanger to the activity.
                for (Destination d : item.getItenaryList()){
                    if(d.getName().equals(activityDest)){
                        for (Activity a : d.getActivityList()){

                            // Find the entered activity.
                            if(a.getName().equals(inputActivity)){
                                item.getPassangersList().add(psg);

                                // Decrease capacity.
                                a.checkCapacity();          
                            }
                        }
                    }
                }

                // Display the passangers for the added activity.
                for (TravelPackage i : travelPackageList){
                    if(item.getName().equals(travelPkgName)){
                        for(Passangers p : i.getPassangersList()){
                            System.out.println("Name of passangers:");
                            System.out.println(p.name);
                        }
                    }           
                }

                // for (Destination d : item.getItenaryList()){
                //     if(d.getName().equals(activityDest)){
                //         for (Activity a : d.getActivityList()){
                //             if(a.getName().equals(inputActivity)){
                //                 System.out.println("Name of passangers:");
                //                 System.out.println(p.passangerNum);       
                //             }
                //         }
                //     }
                // }

                
            }
        }

        // for (TravelPackage i : travelPackageList){

        //      for(Passangers p : i.getPassangersList()){
        //          System.out.println("Name of passangers:");
        //          System.out.println(p.passangerNum);
        //      }
        //  }
        
    }
}
