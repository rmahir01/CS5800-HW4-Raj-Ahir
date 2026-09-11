//CS5800 - HOMEWORK 4 - AGGREGATION
//RAJ AHIR - 019330454

public class Instructor {

    private String fName;
    private String lName;
    private String officeN;

    public Instructor(String fName, String lName, String officeN) {
        this.fName = fName;
        this.lName = lName;
        this.officeN = officeN;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getofficeN() {
        return officeN;
    }

    public void setofficeN(String officeN) {
        this.officeN = officeN;
    }
}
