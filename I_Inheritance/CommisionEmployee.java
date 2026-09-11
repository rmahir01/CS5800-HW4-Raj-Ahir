//CS5800 - HOMEWORK 4 - INHERITANCE
//RAJ AHIR - 019330454

public class CommisionEmployee extends Employee {

    private double comRate;
    private double groSales;

    public CommisionEmployee(String fName, String lName, String ssn, double comRate, double groSales) {
        super(fName, lName, ssn);
        this.comRate = comRate;
        this.groSales = groSales;
    }

    public double getcomRate() {
        return comRate;
    }

    public double getgroSales() {
        return groSales;
    }

    public void setcomRate(double comRate) {
        this.comRate = comRate;
    }

    public void setgroSales(double groSales) {
        this.groSales = groSales;
    }
}