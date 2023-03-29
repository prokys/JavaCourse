package chapter6;

public class PhoneBill {
    private int id;
    private double cost;
    private double allottedMinutes;
    private double usedMinutes;
    private double taxRate = 0.15;


       public PhoneBill(){
        id = 0;
        cost = 0;
        allottedMinutes = 0;
        usedMinutes = 0;
    }
    public PhoneBill(int id, double cost, double allottedMinutes, double usedMinutes){
        this.id = id;
        this.cost = cost;
        this.allottedMinutes = allottedMinutes;
        this.usedMinutes = usedMinutes;
    }

    public PhoneBill(int id){
        this.id = id;
        cost = 0;
        allottedMinutes = 0;
        usedMinutes = 0;

    }
    public double tax(){
           return (cost+overage())*taxRate;
    }
    public double total(){
           return cost+overage()+tax();
    }
    public double overage(){
        if(allottedMinutes > usedMinutes){
            return 0;
        }
        else {
            return usedMinutes - allottedMinutes;
        }
    }

    public void printItemizedBill(){
        System.out.println("ID: " +id);
        System.out.println("Plan: " + cost);
        System.out.println("Overage: "+ overage());
        System.out.println("Tax: " + tax());
        System.out.println("Total: " + total());
    }
}
