//CS5800 - HOMEWORK 4 - INTERFACE
//RAJ AHIR - 019330454

import java.util.ArrayList;

public class DriverProgram {
    public static void main(String[] args) {
        ArrayList<Payable> payables = new ArrayList<>();

        Freelancer f1 = new Freelancer("John", "Smith", 30, 40);
        Freelancer f2 = new Freelancer("Sarah", "Brown", 25, 45);

        VendorInvoice i1 = new VendorInvoice("ABC Supplies", "INV-001", 1200);
        VendorInvoice i2 = new VendorInvoice("XYZ Services", "INV-002", 850);

        payables.add(f1);
        payables.add(f2);
        payables.add(i1);
        payables.add(i2);

        double totalPayout = 0;

        for (Payable payable : payables) {

            if (payable instanceof Freelancer) {
                ((Freelancer) payable).print();
            } else if (payable instanceof VendorInvoice) {
                ((VendorInvoice) payable).print();
            }

            totalPayout += payable.calculatePayment();
            System.out.println();
        }

        System.out.printf("Total payout: $%.2f%n", totalPayout);
    }
}