import java.util.ArrayList;

public class AnimalCalculator {
    public static void printAnimalInfo(ArrayList<Animal> animals) {
        for (Animal animal : animals) {

            System.out.println(animal.getName() + " has " + animal.getLegCount() + " legs and is " + animal.isFurry());
        }
    }

    public static double averageLegs(ArrayList<Animal> animals) {
        double totalLegs = 0;
        for (Animal animal : animals) {
            totalLegs += animal.getLegCount();
        }
        return totalLegs / animals.size();
    }

    public static Animal fewestLegs(ArrayList<Animal> animals) {
        Animal fewest = animals.get(0);
        for (Animal animal : animals) {
            if (animal.getLegCount() < fewest.getLegCount()) {
                fewest = animal;
            }
        }
        return fewest;
    }
    public static void main(String[] args) {
       ArrayList<Animal> animals = new ArrayList<>();

       Animal human = new Human("Madeleine", 2, false);
       Animal dog = new Dog("Ronaldo", 4, true);
       Animal cat = new Cat("Bowie", 4, true);
       Animal horse = new Horse("Sally", 100, true);

       animals.add(human);
       animals.add(cat);
       animals.add(dog);
       animals.add(horse);

       AnimalCalculator.printAnimalInfo(animals);
       System.out.println("Average number of legs: " + AnimalCalculator.averageLegs(animals));
       System.out.println("Animal with fewest legs: " + AnimalCalculator.fewestLegs(animals).getName());
   }
}
