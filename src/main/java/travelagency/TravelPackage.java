package travelagency;

import java.util.ArrayList;
import java.util.List;

import travelagency.Passangers.Passangers;

/**
 * This class represents a Travel Package.
 */
public class TravelPackage {
    /**
     * Represents the Name of Travel Package.
     */
    private String name; 

    /**
     * Represents the Passanger capacity of Travel Package.
     */
    private int passangerCapacity;

    /**
     * Represents the list of Destinations associated to a Travel Package.
     */
    private List<Destination> itenaryList;

    /**
     * Represents the list of Passangers associated to a Travel Package.
     */
    private List<Passangers> passangersList;

    /**
     * Constructs a new Travel Package instance with the specified indital value.
     * @param name Represents the Name of Travel Package.
     * @param passangerCapacity Represents the Passanger capacity of Travel Package.
     * @param itenaryList Represents the list of Destinations associated to a Travel Package.
     * @param passangersList Represents the list of Passangers associated to a Travel Package.
     */
    public TravelPackage(String name, int passangerCapacity, List<Destination> itenaryList, List<Passangers> passangersList){
        this.name = name;
        this.passangerCapacity = passangerCapacity;
        this.itenaryList = itenaryList;
        this.passangersList = passangersList;
    }

    /**
     * Gets the Passanger list of the Travel Package.
     * @return The current value of the property.
     */
    public List<Passangers> getPassangersList() {
        if(this.passangersList == null) {
            this.passangersList = new ArrayList<>();
        }
        return passangersList;
    }

    /**
     * Sets the Passanger list of the Travel Package.
     * @param newName The new value for the property.
     */
    public void setPassangersList(List<Passangers> p) {
        this.passangersList = p;
    }

    /**
     * Gets the Destination list of the Travel Package.
     * @return The current value of the property.
     */
    public List<Destination> getItenaryList(){
        if(this.itenaryList == null){
            this.itenaryList = new ArrayList<>();
        }
        return itenaryList;
    }

    /**
     * Sets the Passanger list of the Travel Package.
     * @param newName The new value for the property.
     */
    public void setItenaryList(List<Destination> d) {
        this.itenaryList = d;
    }

    /**
     * Gets the name of travel package
     * @return name of travel package
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of travel package
     * @param name new name of travel package
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the passanger capacity of travel package
     * @return Passanger capacity
     */
    public int getPassangerCapacity() {
        return passangerCapacity;
    }

    /**
     * Sets the passanger capacity of travel package
     * @param passangerCapacity Passanger capacity 
     */
    public void setPassangerCapacity(int passangerCapacity) {
        this.passangerCapacity = passangerCapacity;
    }

    /**
     * Displays destinations of a Travel Package.
     */
    public void displayCurrentPackageDestinations() {
        for (Destination d : this.itenaryList){
            System.out.println("All destinations for current package are: ");
            System.out.print(d.getName() + " ");
        }
    }

    /**
     * Check if current passage has any more passanger capacity.
     * @return
     */
    public boolean checkCapacity() {
        if(this.passangerCapacity == 0){
            System.out.println("Sorry maximum passanger capacity reached for current destination. ");
            return false;
        }

        this.decreasePassangerCapacity();
        return true;
    }

    /**
     * Decreases passanger capacity by 1.
     */
    public void decreasePassangerCapacity(){
        this.passangerCapacity -= 1;
    }

}
