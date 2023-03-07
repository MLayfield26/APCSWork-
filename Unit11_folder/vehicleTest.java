import java.util.ArrayList;

public class VehicleTest {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Car());
        vehicles.add(new Motorcycle());
        vehicles.add(new Bicycle());
        vehicles.add(new Unicycle());

        for (Vehicle v : vehicles) {
            System.out.println(v.name() + " has " + v.wheelCount() + " wheels and is " + "is human powered is "+ v.isHumanPowered());
        }
    }
}
