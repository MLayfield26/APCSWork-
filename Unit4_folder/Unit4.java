//i do not know what is the point in putting the word static but i am more confused the more progress i make
//what is the point??!?!?!?!?
//hello
//???
//
public class Unit4{


  static String testReverseWord(String word, String expected) {

      String result = "";
      for (int i=0; i<word.length(); i++) {
          result = word.charAt(i) + result;
      }
       System.out.println("does reverseWord work? ");
      if(result.equals(expected))
          System.out.println("Yes");
      else
         System.out.println("No");

         return expected;
  }

  static String reverseWord(String word) {
      String reversedWord = "";
      for (int i=0; i<word.length(); i++) {
          reversedWord = word.charAt(i) + reversedWord;
      }
      return reversedWord;
  }


public static String testStringSplosion(String name, String expected) {
  String result = "";
  for (int i=0; i<name.length(); i++) {
    result = result + name.substring(0, i+1);
  }
     System.out.println("does StringSplosion work? ");
      if(result.equals(expected))
          System.out.println("Yes");
      else
         System.out.println("No");

  return expected;
}
public static String stringSplosion(String name) {
  String result = "";

  //codebat is evil and probably works with the college board
  for (int i=0; i<name.length(); i++) {
    result = result + name.substring(0, i+1);
  }
  return result;
}

public static String testStringTimes(String word, int n, String expected) {
String result = "";

  for (int i=0; i<n; i++) {
    result = result + word;
  }
         System.out.println("does StringTimes work? ");
       if(result.equals(expected))
           System.out.println("Yes");
       else
          System.out.println("No");

          return expected;
}
public static String stringTimes(String word, int n){
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
       // System.out.println("Hello, world!");
      //  System.out.println("stringSplosion: " +  stringSplosion("code"));
        System.out.println("Result of StringTimes: " +  testStringTimes("code",4, "codecodecodecode"));
        System.out.println("Result of StringTimes: " +  testStringTimes("weeeeeee",1,"weeeeeee"));
        System.out.println("Result of StringTimes: " +  testStringTimes("frenchpeople? ",3,"frenchpeople? frenchpeople? frenchpeople? "));


        System.out.println("Result of StringSplosion: " +  testStringSplosion("code","ccocodcode"));
        System.out.println("Result of StringSpolsion: " +  testStringSplosion("help", "hhehelhelp"));
        System.out.println("Result of StringSpolsion: " +  testStringSplosion("madeleine","mmamadmademadelmadelemadeleimadeleinmadeleine"));

        System.out.println("Result of reverseWord: " +  testReverseWord("help","pleh"));
        System.out.println("Result of reverseWord: " +  testReverseWord("madeleine","enieledam"));
        System.out.println("Result of reverseWord: " +  testReverseWord("tacocat","tacocat"));


    }
}
