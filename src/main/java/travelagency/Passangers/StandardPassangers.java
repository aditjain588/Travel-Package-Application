package travelagency.Passangers;

public class StandardPassangers extends Passangers{

    public StandardPassangers(String name, int num, int balance) {
        super(name, num);
        this.balance = balance;
    }
    
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
