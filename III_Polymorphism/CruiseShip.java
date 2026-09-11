//CS5800 - HOMEWORK 4 - POLYMORPHISM
//RAJ AHIR - 019330454

public class CruiseShip extends Ship {

    private int maxPas;

    public CruiseShip(String name, String yearB, int maxPas) {
        super(name, yearB);
        this.maxPas = maxPas;
    }

    public int getmaxPas() {
        return maxPas;
    }

    public void setmaxPas(int maxPas) {
        this.maxPas = maxPas;
    }

    @Override
    public void print() {
        System.out.println("Ship Name: " + getName());
        System.out.println("Maximum Passengers: " + maxPas);
    }
}