//Sum of squares (array)
//Write a function that takes a single array of doubles as input, and returns the sum of squares of the values.

public class Unit7{

//dear future me pls make this 
  for (int i=0; i<names.length; i++)
  {
      String name = names[i];
      System.out.println(name);
      int length = name.length();
      int count = 0;
        if (name.charAt(i) == 'Z' || name.charAt(i) == 'z'){
      if (i < length-1 && !Character.isLetter(name.charAt(i+1)))
            count++;
        else if (i == length-1)
            count++;

      }
System.out.println("number of Zs: " + count);
  }


  System.out.println();

  // for-each loop

  for (String name : names)
  {
      System.out.println(name);
  }

public static void main(String[] args){
  String[] names = {"zebra", "ziptie", "zipuZ"};

        System.out.println(names[0]);
        System.out.println(names[1]);


        System.out.println();

  }
}
