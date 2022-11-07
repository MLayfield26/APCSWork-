public class IcyHot{
  public static void testIcyHot(int temp1, int temp2){
  System.out.print(" Temp1: " +temp1 + " Temp2: " + temp2 + " IcyHot? ");

          if(120 < temp1 || temp1 < -1 || 120 < temp2 || temp2 < -1)
              System.out.println("Yes");
          else
              System.out.println("No");
      }

      public static boolean IcyHot(int temp1, int temp2)
      {
             return (120 < temp1 || temp1 < -1 || 120 < temp2 || temp2 < -1);
      }
      public static void main(String[] args)
      {
          testIcyHot(150, 25);
          testIcyHot(122,-3);
          testIcyHot(29,30);
      }

  }
