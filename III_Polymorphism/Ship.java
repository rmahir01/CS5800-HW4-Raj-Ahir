//CS5800 - HOMEWORK 4 - POLYMORPHISM
//RAJ AHIR - 019330454

public class Ship {

    private String name;
    private String yearB;

    public Ship(String name, String yearB) {
        this.name = name;
        this.yearB = yearB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getyearB() {
        return yearB;
    }

    public void setyearB(String yearB) {
        this.yearB = yearB;
    }

    public void print() {
        System.out.println("Ship Name: " + name);
        System.out.println("Year Built: " + yearB);
    }
}
