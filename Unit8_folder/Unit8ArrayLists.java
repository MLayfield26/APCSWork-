import java.util.*;
public class Unit8ArrayLists{
  public static int countLucky(ArrayList<Integer> numbers) {
    int count = 0;
    for (int number : numbers) {
      if (number % 7 == 0 || number % 10 == 7) {
        count+=1;
      }
    }
    return count;
  }

  public static void main(String[] args){
 ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(21);
        numbers.add(5);
        numbers.add(107);
        numbers.add(7);

      System.out.println("count: " + countLucky(numbers));

      }

}
