
import java.util.ArrayList;

public class PersonCalc{

    public static int average(ArrayList<Person> people) {
        int sum = 0;
        for (Person p : people) {
            sum += p.getNumberOfPets();
        }
        return sum / people.size();
    }
    public void testAverage(ArrayList<Person> people) {
        int result = average(people);
        int expected = 3;

        if (result == expected) {
            System.out.println("testAverage passed");
        }
        else{
            System.out.println("testAverage failed");
        }

    }

    public static String mostPets(ArrayList<Person> people) {
        int greatest = 0;
        String mostPets = "";
        for (Person p : people) {
            if (p.getNumberOfPets() > greatest) {
                greatest = p.getNumberOfPets();
                mostPets = p.getName();
            }
        }
        return mostPets;
    }
    public void testMostPets(ArrayList<Person> people) {
      String result = mostPets(people);


        if (result.equals("jym")) {
            System.out.println("testMostPets passed");
        }
        else{
            System.out.println("testMostPets failed");
        }

    }
    public static ArrayList<Person> twoPets(ArrayList<Person> people) {
 ArrayList<Person> twoPets = new ArrayList<>();
  //String[] twoPets = new String[people.size()];
        for (Person p : people) {
            if (p.getNumberOfPets() >= 2) {
                twoPets.add(p.name());
            }
        }
        return twoPets;
    }
    public void testTwoPets(ArrayList<Person> people) {
    ArrayList<Person> twoPetsResult = twoPets(people);
 ArrayList<String> result = new ArrayList<String>();
      result.add("gim");
      result.add("jim");
      result.add("jym");

System.out.println(result);
        if (result.equals(twoPetsResult)) {
            System.out.println("testTwoPets passed");
        }
        else{
            System.out.println("testTwotPets failed");
        }

    }

    public static void main(String[] args){
     ArrayList<Person> people = new ArrayList<Person>();
     people.add(new Person("gym", 1));
     people.add(new Person("gim", 3));
     people.add(new Person("jim", 3));
     people.add(new Person("jym", 5));

     PersonCalc calculator = new PersonCalc();
     calculator.testAverage(people);
     calculator.testMostPets(people);
     calculator.testTwoPets(people);
System.out.println(twoPets(people));


   }
}
