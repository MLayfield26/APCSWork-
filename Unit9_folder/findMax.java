import java.util.*;
public class findMax{
  public double findMax(double[] numbers) {
      double max = numbers[0];
      for (int i = 1; i < numbers.length; i++) {
          if (numbers[i] > max) {
              max = numbers[i];
          }
      }

      return max;
  }


  public static void main(String[] args){
    double[] numbers = {1.2, 3.4, 5.6, 7.8, 9.0};
    double max = findMax(numbers);

    System.out.println("Max number: " + max);
  }
}
