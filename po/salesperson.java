public class salesperson extends employee {
    
    private double commissionPercentage;

public salesperson(String name, double salary, int age, double commissionPercentage) {
super(name, age, commissionPercentage);
this.commissionPercentage = commissionPercentage;
}
public double getCommissionPercentage() {
    return this.commissionPercentage;
} 
    public void raiseCommission() {
        if (this.commissionPercentage < .30) {
            this.commissionPercentage = this.commissionPercentage * 1.2;
            
        }
    }
}
