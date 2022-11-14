public class MonkeyTrouble{


public static void testMonkeyTrouble(boolean smileA, boolean smileB, boolean expected){
  boolean result = monkeyTrouble(smileA,smileB);
System.out.println("Is monkey A Smiling? " + smileA + " Is monkey B Smiling? " + smileB);
System.out.println("What was the result?" + result + " What was the expected result? " + expected + " Do they match? ");
        if (result == expected)
            System.out.println("Yes");
        else
              System.out.println("No");
    }

    public static boolean monkeyTrouble(boolean smileA, boolean smileB)
    {
          return (smileA == smileB);
    }
    public static void main(String[] args)
    {
        testMonkeyTrouble(true, true, true);
        testMonkeyTrouble(true, false, false);
        testMonkeyTrouble(false, false, true);
    }

}
//
