public class MonkeyTrouble{


public static void testMonkeyTrouble(boolean smileA, boolean smileB){
System.out.print("is monkey A Smiling? " + smileA + " is monkey B Smiling? " + smileB + " situation?");

        if (smileA == smileB)
            System.out.println(" Trouble");
        else
              System.out.println(" Safe");
    }

    public static boolean monkeyTrouble(boolean smileA, boolean smileB)
    {
          return (smileA == smileB);
    }
    public static void main(String[] args)
    {
        testMonkeyTrouble(true, true);
        testMonkeyTrouble(true, false);
        testMonkeyTrouble(false, false);
    }

}
//
// ParrotTrouble.java
//
