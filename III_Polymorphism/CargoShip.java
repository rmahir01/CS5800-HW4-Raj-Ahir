//CS5800 - HOMEWORK 4 - POLYMORPHISM
//RAJ AHIR - 019330454

public class CargoShip extends Ship {

    private int cargoCap;

    public CargoShip(String name, String yearB, int cargoCap) {
        super(name, yearB);
        this.cargoCap = cargoCap;
    }

    public int getcargoCap() {
        return cargoCap;
    }

    public void setcargoCap(int cargoCap) {
        this.cargoCap = cargoCap;
    }

    @Override
    public void print() {
        System.out.println("Ship Name: " + getName());
        System.out.println("Cargo Capacity: " + cargoCap + " tons");
    }
}