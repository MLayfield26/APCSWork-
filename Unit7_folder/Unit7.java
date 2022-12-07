//Sum of squares (array)
//Write a function that takes a single array of doubles as input, and returns the sum of squares of the values.
import java.util.*;
public class Unit7{

public static void main(String[] args){
 ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(21);
        numbers.add(5);
        numbers.add(9);
        numbers.add(7);
for(int n : numbers){
if (n % 7 == 0) {
 System.out.println(n + " is lucky");
}
else
System.out.println(n + " isnt lucky");
}

int Squares[] = {1, 2, 3, 4, 5};
int sum = 0;

for (int i : Squares){
    sum += i * i;
}
  System.out.println("some of squares: " + sum);


String[] names = {"zebra", "ziptie", "zipuZ"};
 for (int b=0; b<names.length; b++){
      String name = names[b];
//      System.out.println(name);
      int length = name.length();
      int count = 0;
      for(int i = 0; i < name.length(); i++){
        if (name.charAt(i) == 'Z' || name.charAt(i) == 'z'){
            count+=1;
      }

      }
    System.out.println(name + " number of Zs: " + count);
}
        }



}
