package travelagency.Passangers;

public abstract class Passangers {
    public String name;
    public int passangerNum;
    public int balance;
    
    public Passangers(String name, int num) {
        this.name = name;
        this.passangerNum = num;
    }
}