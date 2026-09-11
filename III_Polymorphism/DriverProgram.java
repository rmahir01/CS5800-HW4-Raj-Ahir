//CS5800 - HOMEWORK 4 - POLYMORPHISM
//RAJ AHIR - 019330454

public class DriverProgram {
    public static void main(String[] args) {

        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Atlantic", "1912");
        ships[1] = new CruiseShip("Montana", "2022", 6988);
        ships[2] = new CargoShip("Seafare", "2018", 220000);

        for (Ship ship : ships) {
            ship.print();
            System.out.println();
        }
    }
}