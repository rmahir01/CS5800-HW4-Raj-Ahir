//CS5800 - HOMEWORK 4 - INHERITANCE
//RAJ AHIR - 019330454

public class HourlyEmployee extends Employee {

    private double wage;
    private double hoursW;

    public HourlyEmployee(String fName, String lName, String ssn, double wage, double hoursW) {
        super(fName, lName, ssn);
        this.wage = wage;
        this.hoursW = hoursW;
    }

    public double getWage() {
        return wage;
    }

    public double gethoursW() {
        return hoursW;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void sethoursW(double hoursW) {
        this.hoursW = hoursW;
    }
}