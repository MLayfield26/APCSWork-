public class GoodDeal{
  public static void testGoodDeal(int NewPrice, int OGPrice, boolean expected){
    boolean result = GoodDeal(NewPrice, OGPrice);
  System.out.print(" NewPrice " +NewPrice + ". OGPrice: " + OGPrice + ". expected result: "
  + expected + ". result: "+ result + ". Is the expected result = to the result? ");

          if(result ==expected)
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
          testGoodDeal(10, 25, true);
          testGoodDeal(30,29, false);
          testGoodDeal(29,30, false);
      }

  }
