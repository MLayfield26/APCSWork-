import java.util.*;

public class fibonacci {
  public static int[] fibs(int n) {
    int[] fibonacci = new int[n];
    fibonacci[0] = 1;
    fibonacci[1] = 1;
    for (int i = 2; i < n; i++) {
      //fibonacci sounds like a potato or pasta dish
  //im sorry for generalizing italian words
      fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    }
    return fibonacci;
  }

  public static void main(String[] args) {
        //this is lovely n value
    int[] fibonacci = fibs(200);
    //i dont know why but after a while my numbers display funky
    for (int i = 0; i < fibonacci.length; i++) {
      System.out.println(fibonacci[i]);
    }
  }
}
