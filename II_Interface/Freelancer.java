//CS5800 - HOMEWORK 4 - INTERFACE
//RAJ AHIR - 019330454

public class Freelancer implements Payable {

    private String fName;
    private String lName;
    private double hourlyR;
    private double hoursW;

    public Freelancer(String fName, String lName, double hourlyR, double hoursW) {
        this.fName = fName;
        this.lName = lName;
         if (hourlyR < 0) {
            throw new IllegalArgumentException("Hourly rate cannot be negative.");
        }
        if (hoursW < 0) {
            throw new IllegalArgumentException("Hours worked cannot be negative.");
        }
        this.hourlyR = hourlyR;
        this.hoursW = hoursW;
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

    public double gethourlyR() {
        return hourlyR;
    }

    public void sethourlyR(double hourlyR) {
        if (hourlyR >= 0) {
            this.hourlyR = hourlyR;
        } else {
            throw new IllegalArgumentException("Hourly rate cannot be negative.");
        }
    }

    public double gethoursW() {
        return hoursW;
    }

    public void sethoursW(double hoursW) {
        if (hoursW >= 0) {
            this.hoursW = hoursW;
        } else {
            throw new IllegalArgumentException("Hours worked cannot be negative.");
        }
    }

    @Override
    public double calculatePayment() {
        if (hoursW <= 40) {
            return hourlyR * hoursW;
        } else {
            double regularPay = hourlyR * 40;
            double overtimeHours = hoursW - 40;
            double overtimePay = overtimeHours * hourlyR * 1.5;

            return regularPay + overtimePay;
        }
    }

    @Override
    public String getPayeeName() {
        return fName + " " + lName;
    }

    public void print() {
        System.out.println("Freelancer: " + getPayeeName());
        System.out.printf("Payment: $%.2f%n", calculatePayment());
    }
}
