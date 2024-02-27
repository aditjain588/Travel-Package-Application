package travelagency;

/**
 * This class represents an Activity.
 */
public class Activity {
    /**
     * Represents the Name of the activity.
     */
    
    private String name;
    /**
     * Represents the Description of the activity.
     */
    private String description;

    /**
     * Represents the Cost of the activity.
     */
    private int cost;

    /**
     * Represents the Passangert capacity of the activity.
     */
    private int capacity;

    /**
     * Represents the Description of the activity.
     */
    private String destination;
    
    /**
     * Constructs a new Activity instance with the specified initial value.
     * @param name Name of Activity.
     * @param description Description of Activity.
     * @param cost Cost of Activity.
     * @param capacity Total passanger capacity of Activity.
     * @param destination Deatination at which this Activity is available.
     */
    public Activity(String name, String description, int cost, int capacity, String destination){
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.destination = destination;
    }

    /**
     * Gets the name of Destination.
     * @return Name of Destination,
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the new Name for Destination.
     * @param name New name of Destination.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the name of Description.
     * @return Description of Activity
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the desccription of activity.
     * @param description Description of activity.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the cost of activity.
     * @return cost of activity.
     */
    public int getCost() {
        return cost;
    }

    /**
     * Sets the cost of Activity.
     * @param cost Cost of activity.
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * Gets the passanger capacity of Activity.
     * @return Capacity of activity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the passanger capacity of Activity.
     * @param capacity Capacity of activity
     */ 
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Gets the Destination capacity of Activity.
     * @return Destination of activity
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the Destination of an Activity.
     * @param capacity Destination of an activity
     */ 
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Checks if an Activity has any more capacity.
     */
    public void checkCapacity() {
        if(this.capacity == 0){
            System.out.println("Sorry no more capacity for passangers. ");
        }
        else{
            this.decreaseCapacity();
        }
    }

    /**
     * Displays all details of an Activity.
     */    
    public void DisplayActivityInfo(){
        System.out.println("Name of Activity: " + this.name);
        System.out.println("Description " + this.description);
        System.out.println("Cost of Activity: " + this.cost);
        System.out.println("Available capacity " + this.capacity);
        System.out.println("Destination " + this.destination);
    }

    /**
     * Decreases the capacity of an Activity by 1, and prints out the remaining capacity
     */
    public void decreaseCapacity () {
        if(this.capacity > 0){
            this.capacity--;
            System.out.print("Remaining capaccity is: " + this.capacity);
        }
        else{
            System.out.println("Sorry no more capacity for passangers. ");
        }
        
    }
}
