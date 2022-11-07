public class GoodDeal{
  public static void testGoodDeal(int NewPrice, int OGPrice){
  System.out.print(" NewPrice " +NewPrice + " OGPrice: " + OGPrice + " GoodDeal?");

          if(NewPrice <= OGPrice/4*3)
              System.out.println("Yes");
          else
              System.out.println("No");
      }

      public static boolean GoodDeal(int NewPrice, int OGPrice)
      {
             return (NewPrice <= OGPrice/4*3);
      }
      public static void main(String[] args)
      {
          testGoodDeal(10, 25);
          testGoodDeal(30,29);
          testGoodDeal(29,30);
      }

  }
