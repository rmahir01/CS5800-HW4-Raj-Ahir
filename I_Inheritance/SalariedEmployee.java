//CS5800 - HOMEWORK 4 - INHERITANCE
//RAJ AHIR - 019330454

public class SalariedEmployee extends Employee {

    private double weeklyS;

    public SalariedEmployee(String fName, String lName, String ssn, double weeklyS) {
        super(fName, lName, ssn);
        this.weeklyS = weeklyS;
    }

    public double getWeeklyS() {
        return weeklyS;
    }

    public void setWeeklyS(double weeklyS) {
        this.weeklyS = weeklyS;
    }
}