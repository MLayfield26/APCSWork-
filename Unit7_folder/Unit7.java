import java.util.*;
public class Unit8{
  public static int countLucky(int[] numbers){
    int count = 0;
    for (int number : numbers) {
      if (number % 7 == 0 || number % 10 == 7) {
        count+=1;
      }
    }
    return count;
  }
  public static int countZNames(String[] names){
    int count = 0;
    for (String n : names) {
        if (n.charAt(0) == 'Z' || n.charAt(0) == 'z'){
            count += n.length();
    }
}
    return count;
}
public static double sumOfSquares(double[] values){
    double sum = 0;
    for (double v : values){
        sum += v * v;
    }
    return sum;
}

  public static void main(String[] args){
 String[] names = new String[3];
        names[0] = "hose";
        names[1] = "Zara";
        names[2] = "Zach";
 double[] values = new double[3];
        values[0] = 2.0;
        values[1] = 5.0;
      //  numbers.add(107);
        values[2] = 7.0;
 int[] numbers = new int[3];

//







//???





///sorry







      System.out.println("count of Lucky: " + countLucky(numbers));
      System.out.println("count of Zs: " + countZNames(names));
      System.out.println("Sum of squares: " + sumOfSquares(values));
      }

}
