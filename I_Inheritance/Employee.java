//CS5800 - HOMEWORK 4 - INHERITANCE
//RAJ AHIR - 019330454

public class Employee {

    private String fName;
    private String lName;
    private String ssn;

    public Employee(String fName, String lName, String ssn) {
        this.fName = fName;
        this.lName = lName;
        this.ssn = ssn;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getSSN() {
        return ssn;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setSSN(String ssn) {
        this.ssn = ssn;
    }
}
