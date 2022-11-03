//i do not know what is the point in putting the word static but i am more confused the more progress i make
//what is the point??!?!?!?!?
//hello
//???
//
public class Unit4{

public static String stringSplosion(String name) {
  String result = "";
  //no thank you to codebat which told me i was doing it wrong but i was doing it right
  //codebat is evil and probably works with the college board
  for (int i=0; i<name.length(); i++) {
    result = result + name.substring(0, i+1);
  }
  return result;
}

public static String stringTimes(String word, int n) {
  String result = "";
  for (int i=0; i<n; i++) {
    result = result + word;
  }
  return result;
}
//lalalalallalalalalala
//lalallala
//lalalalal
//lalallallalaa????



    public static void main(String[] args){
        System.out.println("Hello, world!");
        System.out.println("stringSplosion " +  stringSplosion("code"));
        System.out.println("stringTimes " +  stringTimes("code",4));

        System.out.println("stringSplosion2 " +  stringSplosion("help"));
        System.out.println("stringTimes2 " +  stringTimes("weeeeeee",18));

        System.out.println("stringSplosion3 " +  stringSplosion("madeleine"));
        System.out.println("stringTimes3 " +  stringTimes("frenchpeople? ",3));

        stringTimes("round",18);
    }
}
