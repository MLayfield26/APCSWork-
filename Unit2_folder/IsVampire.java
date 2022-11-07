public class IsVampire{
  public static void testIcyHot(int hour){
  System.out.print(" Hour: " + hour + "IsVampire");

          if(6 > hour || hour > 22)
              System.out.println("Yes");
          else
              System.out.println("No");
      }

      public static boolean IcyHot(int hour)
      {
             return (6 > hour || hour > 22);
      }
      public static void main(String[] args)
      {
          testIcyHot(3);
          testIcyHot(23);
          testIcyHot(12);
      }

  }
