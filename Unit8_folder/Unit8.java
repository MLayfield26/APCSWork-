import java.util.*;
public class Unit8{
  public static int countLucky(ArrayList<Integer> numbers){
    int count = 0;
    for (int number : numbers) {
      if (number % 7 == 0 || number % 10 == 7) {
        count+=1;
      }
    }
    return count;
  }
  public static int countZNames(ArrayList<String> names){
    int count = 0;
    for (String n : names) {
        if (n.charAt(0) == 'Z' || n.charAt(0) == 'z'){
            count += n.length();
    }
}
    return count;
}
public static double sumOfSquares(ArrayList<Double> values){
    double sum = 0;
    for (double v : values){
        sum += v * v;
    }
    return sum;
}

  public static void main(String[] args){
 ArrayList<String> names = new ArrayList<String>();
        names.add("hose");
        names.add("Zara");
        names.add("Zach");
 //int for array -> Integer
 ArrayList<Double> values = new ArrayList<Double>();
        values.add(2.0);
        values.add(5.0);
      //  numbers.add(107);
        values.add(7.0);
 ArrayList<Integer> numbers = new ArrayList<Integer>();

      System.out.println("count of Lucky: " + countLucky(numbers));
      System.out.println("count of Zs: " + countZNames(names));
      System.out.println("Sum of squares: " + sumOfSquares(values));
      }

}
