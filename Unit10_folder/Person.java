public class Person {

  private String name;
  private int numberOfPets;
//  private int numberOfFingers;

  public Person(String name, int numberOfPets) {
    this.name = name;
    this.numberOfPets = numberOfPets;
  //  this.numberOfFingers = numberOfFingers;
  }


  public String getName() {
    return name;
  }

  public int getNumberOfPets() {
    return numberOfPets;
  }

  //hi
  public String greeting() {
    return "Hello, my name is,  " + name + ", and I have " + numberOfPets + " pets.";
  }
}
