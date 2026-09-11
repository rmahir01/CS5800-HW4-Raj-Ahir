//CS5800 - HOMEWORK 4 - INHERITANCE
//RAJ AHIR - 019330454

public class BaseEmployee extends Employee {

    private double baseS;

    public BaseEmployee(String fName, String lName, String ssn, double baseS) {

        super(fName, lName, ssn);
        this.baseS = baseS;
    }

    public double getbaseS() {
        return baseS;
    }

    public void setbaseS(double baseS) {
        this.baseS = baseS;
    }
}