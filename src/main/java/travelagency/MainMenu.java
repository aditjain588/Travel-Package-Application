package travelagency;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import travelagency.AppFeatures.AddActivity;
import travelagency.AppFeatures.AddDestination;
import travelagency.AppFeatures.AddPassangers;
import travelagency.AppFeatures.AddTravelPackage;

/**
 * Class to represent Main Menu which is displayed to user when application is started.
 */
public class MainMenu {
    /**
     * List of destinations.
     */
    public List<Destination> destinationList = new ArrayList<>();

    /**
     * List of Activities.
     */
    public List<Activity> activityList = new ArrayList<>();

    /**
     * List of Travel packages.
     */
    public List<TravelPackage> travelPkgList = new ArrayList<>();

    /**
     * Function contains the Menu to display to user after starting the application.
     */
    public void ShowMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        
        while(choice != 9){
            System.out.println("\nMAINMENU:");
            System.out.println("Select from the following");
            System.out.println("1. Add a new Passanger.");
            System.out.println("2. Add new Travel Package");
            System.out.println("3. Add a new Destination.");
            System.out.println("4. Add a new activity.");
            System.out.println("5. Print Travel Package details. ");
            System.out.println("6. Print Passander list of travel Package. ");
            System.out.println("7. Print details of individual passanger. ");
            System.out.println("5. Exit ");
            System.out.println(" ");

            choice = scanner.nextInt();
            scanner.nextLine();  
            System.out.println(" ");

            switch(choice){
                /**
                 * If user wants to add a New Passanger.
                 */
                case 1:
                    System.out.println("Add new passanger! ");
                    AddPassangers ap = new AddPassangers(travelPkgList);
                    ap.AddPassangerTypeSubMenu(scanner);
                    break;

                /**
                 * If user wants to add a new Travel Package.
                 */
                case 2:
                    System.out.println("1. Add a new Travel Package.");
                    AddTravelPackage atp = new AddTravelPackage(travelPkgList);
                    atp.AddNewTravelPackage(scanner);
                    break;

                /**
                 * If user wants to add a new Destination.
                 */
                case 3:
                    System.out.println("2. Add a new Destination");
                    AddDestination ad = new AddDestination(travelPkgList);
                    ad.AddNewDestination(scanner);
                    // System.out.println("What is name of destination you want to add? ");
                    // String dest = scanner.nextLine();

                    // for (Destination element : destinationList){
                    //     if(element.getName().equals(dest)){
                    //         System.out.println("Destination already exists try again! ");
                    //         break;
                    //     }
                    // }

                    // List<Activity> activities = new ArrayList<>();
                    // Destination di = new Destination(dest, activities);                  
                    // destinationList.add(di);
                    // di.DisplayActivityList();
                    break;

                /**
                 * If user wants to add a new Activity.
                 */
                case 4:
                    System.out.println("3. Add a new activity.");
                    AddActivity aa = new AddActivity(destinationList,travelPkgList);
                    aa.AddNewActivity(scanner);
                    // System.out.println("Select the destination you want to add an activity to.");
                
                    // for (Destination element : destinationList){
                    //     System.out.println(element.getName());
                    // }
                    
                    // String activityDest = scanner.nextLine();
                    // boolean ifDestinationExists = false;

                    // for (Destination element : destinationList){
                    //     System.out.println("Dest is " + element.getName());
                    //     if(element.getName().equals(activityDest)){
                    //         ifDestinationExists = true;
                    //     }
                    // }

                    // if(!ifDestinationExists){
                    //     System.out.println("Specified destination does not exist please try again! ");
                    //     break;
                    // }

                    // System.out.println("What is name of activity you want to add? ");
                    // String actitityToAddName = scanner.nextLine();

                    // for (Destination element : destinationList){
                    //     List<Activity> ac = element.getActivityList();
                    //     for (Activity item : ac){
                    //         if(item.name == actitityToAddName){
                    //             System.out.println("Cannot add this activity, as it already exists for destination " + element.getName());
                    //             break;
                    //         }
                    //     }
                    // }
                    
                    // System.out.println("Need few more details to add an activity ");

                    // System.out.println("Add a brief description for the activity!");
                    // String actitityToAddDescp = scanner.nextLine();

                    // System.out.println("Add cost for the activity!");
                    // int actitityToAddCost = scanner.nextInt();

                    // System.out.println("Add available capacity for the activity!");
                    // int actitityToAddAvailableCapacity = scanner.nextInt();                 

                    // for (Destination element : destinationList){
                    //     if(element.getName().equals(activityDest)){
                    //         Activity newAddedActivity = new Activity(actitityToAddName, actitityToAddDescp, actitityToAddCost, actitityToAddAvailableCapacity, activityDest);
                    //         //element.getActivityList().add(newAddedActivity);
                    //         element.addActivity(newAddedActivity);
                    //         break;
                    //     }
                    // }

                    // for (Destination d : destinationList){
                    //     System.out.println("----");
                    //     System.out.println(d.getName() + d.getActivityList());  
                    //     for (Activity a : d.getActivityList()){
                    //         a.DisplayActivityInfo();
                    //     }                 
                    // }

                    break;

                /**
                 * Exit the Application.
                 */
                case 5:
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
        scanner.close();
    }
    

}
