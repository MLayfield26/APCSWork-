public class TestPerson {
  public static void main(String[] args) {
    // Create some Person objects
    Person person1 = new Person("Alene", 1);
    Person person2 = new Person("Sarah", 0);
    Person person3 = new Person("Madeleine",4);

    // Print out the greeting for each person
    System.out.println(person1.greeting());
    System.out.println(person2.greeting());
    System.out.println(person3.greeting());
  }
}
