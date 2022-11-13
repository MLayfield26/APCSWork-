public class IsVampire{
  public static void testIsVampire(int hour, boolean expected){
    boolean result = IsVampire(hour);
  System.out.print(" Hour: " + hour + ". Expected result:"
  + expected + ". result: " + result + ". Code works? ");

          if(expected == result)
              System.out.println("Yes");
          else
              System.out.println("No");
      }

      public static boolean IsVampire(int hour)
      {
             return (6 > hour || hour > 22);
      }
      public static void main(String[] args)
      {
          testIsVampire(3, true);
          testIsVampire(23, true);
          testIsVampire(12,false);
      }

  }
