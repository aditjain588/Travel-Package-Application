package travelagency.Passangers;

public class PremiumPassangers extends Passangers {

    public PremiumPassangers(String name, int num) {
        super(name, num);
    }

    public void displayPassangerDetails() {
        System.out.println("Passamger details are: ");
        System.out.println("Name: " + name);
        System.out.println("Passamger number: " + passangerNum);
        System.out.println("No balance for Premium passangers");
    }
    
}
