package travelagency;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the Destination.
 */
public class Destination {
    /**
     * Represnts the Name of the Destination.
     */
    private String name;

    /**
     * Represents the Activities available at the current Destination.
     */
    private List<Activity> activityList;

    /**
     * Constructs a new Destination instance with the specified indital value.
     * @param name Name of Destination.
     * @param a List of Activities at a particular Destination.
     */
    public Destination(String name, List<Activity> a){
        this.name = name;
        this.activityList = a;
    }

    /**
     * Gets the Name of the property.
     * @return The current value of the property.
     */
    public String getName(){
        return this.name;
    }

    /**
     * Sets the Name of the property.
     * @param newName The new name for the property.
     */
    public void setName (String newName) {
        name = newName;
    }

    /**
     * Gets the List of activities of the property.
     * @return The current value of the property.
     */
    public List<Activity> getActivityList() {
        if(this.activityList == null){
            this.activityList = new ArrayList<>();
        }
        return activityList;
    }

    /**
     * Sets the List of activities of the property.
     * @param newActivityList The new activity list.
     */
    public void setActivityList(List<Activity> newActivityList) {
         activityList = newActivityList;
     }
    
     /**
      * Displays the activities available at the current Destination.
      */
    public void DisplayActivityList() {
        System.out.println("Activities available at destination " + this.name + " are: ");
        for (Activity ac : this.activityList){
            System.out.println(ac.getName());
        }
    }
}
