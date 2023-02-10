public class Main{
  public static void main(String[] args){
    Person drkessner = new Person("Dr. Kessner");
    System.out.println(drkessner.hello());

    Student sarah = new Student("Sarah");
    System.out.println(sarah.hello());
  }
}
