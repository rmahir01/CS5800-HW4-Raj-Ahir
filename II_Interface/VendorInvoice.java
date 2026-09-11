//CS5800 - HOMEWORK 4 - INTERFACE
//RAJ AHIR - 019330454

public class VendorInvoice implements Payable {

    private String vName;
    private String invoiceN;
    private double amountD;

    public VendorInvoice(String vName, String invoiceN, double amountD) {
        this.vName = vName;
        this.invoiceN = invoiceN;
        if (amountD < 0) {
            throw new IllegalArgumentException("Amount due cannot be negative.");
        }
        this.amountD = amountD;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public String getinvoiceN() {
        return invoiceN;
    }

    public void setinvoiceN(String invoiceN) {
        this.invoiceN = invoiceN;
    }

    public double getamountD() {
        return amountD;
    }

    public void setamountD(double amountD) {
        if (amountD >= 0) {
            this.amountD = amountD;
        } else {
            throw new IllegalArgumentException("Amount due cannot be negative.");
        }
    }

    @Override
    public double calculatePayment() {
        return amountD;
    }

    @Override
    public String getPayeeName() {
        return vName;
    }

    public void print() {
        System.out.println("Vendor: " + vName);
        System.out.println("Invoice Number: " + invoiceN);
        System.out.printf("Payment: $%.2f%n", calculatePayment());
    }
}