import java.util.ArrayList;

class vehicleStats{

public static int totalWheels(Arraylist<Vehicle>vehicles){
  int total = 0;

  for(Vehicle v: vehicles){
    total += v.wheelCount();
  }
  return total;
}

public static ArrayList<Vehicle> humanPowered(ArrayList<Vehicle> vehicles) {
        Arraylist<Vehicle> humanPoweredVehicles = new ArrayList<Vehicle>();
        for (Vehicle v : vehicles) {
            if (v.isHumanPowered()) {
                humanPoweredVehicles.add(v);
            }
        }
        return humanPoweredVehicles;
    }

public static void main(String[] args) {
       ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
       vehicles.add(new Car());
       vehicles.add(new Motorcycle());
       vehicles.add(new Bicycle());
       vehicles.add(new Unicycle());

       System.out.println("Total number of wheels: " + totalWheels(vehicles));

       ArrayList<Vehicle> humanPoweredVehicles = humanPowered(vehicles);
       System.out.println("Human-powered vehicles: ");
       for (Vehicle v : humanPoweredVehicles) {
           System.out.println(v.name());
       }
   }
 }
