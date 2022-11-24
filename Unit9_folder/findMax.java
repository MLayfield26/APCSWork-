public class ArrayAlgorithms{
public static ArrayList<String> generateFib(int n){
        // generate and return list of first n fizz buzz strings

        ArrayList<String> result = new ArrayList<String>();

        for (int i=0; i<n; i++){
            if (i%15 == 0)
                result.add("FizzBuzz");
            else if (i%3 == 0)
                result.add("Fizz");
            else if (i%5 == 0)
                result.add("Buzz");
            else
                result.add("" + i);
        }

        return result;
    }

  public static void main(String[] args){
   ArrayList<String> fizzBuzzOutput = generateFib(30);

  }
}
