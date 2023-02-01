public class Person {
  // Private member variables
  private String name;
  private int numberOfPets;
  private int numberOfFingers;

  // Public constructor
  public Person(String name, int numberOfPets) {
    this.name = name;
    this.numberOfPets = numberOfPets;
    this.numberOfFingers = numberOfFingers;
  }

  // Accessor functions
  public String getName() {
    return name;
  }

  public int getNumberOfPets() {
    return numberOfPets;
  }

  // Member function
  public String greeting() {
    return "Hello, my name is,  " + name + ", and I have " + numberOfPets + " pets.";
  }
}
