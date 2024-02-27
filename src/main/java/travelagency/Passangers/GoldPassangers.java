package travelagency.Passangers;

public class GoldPassangers extends Passangers{
    public String passangerType;
    
    public GoldPassangers(String name, int num, int balance) {
        super(name, num);
        this.balance = balance;
        this.passangerType = "Gold Passanger";
    }
    
    /**
     * 
     */
    public void getRemainingBalance() {
        System.out.println("Remaining balance is " + this.balance);
    }

    public void displayPassangerDetails() {
        System.out.println("Passamger details are: ");
        System.out.println("Name: " + name);
        System.out.println("Passamger number: " + passangerNum);
        System.out.println("Remaining balance " + this.balance);
    }
}
