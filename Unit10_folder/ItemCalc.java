//calculator

import java.util.ArrayList;

class ItemCalc{


    public void printNames(ArrayList<Item> items) {
        for (Item i: items) {
            System.out.println("the cost of " + i.getName() + " is: " + i.getPrice());
        }
    }


    public void testPrintNames(ArrayList<Item> items) {
       printNames(items);
       System.out.println("testPrintNames passed");
   }


  // a function that takes an ArrayList of Item objects as input,
  //and returns the average price of the items
  public static float AveragePrice(ArrayList<Item> items) {
      float total = 0;
  //refrenced UNIT 10 animalInfo file
      for (Item i : items) {
        total += i.getPrice();
      }
      return total/items.size();

  }

  public void testAveragePrice(ArrayList<Item> items) {
        float result = AveragePrice(items);
        float expected = 18.00f;
        if (result == expected) {
            System.out.println("expected: " + expected + " was the same as the average: "  + result);
        }
        else{
            System.out.println("expected: " + expected + " did not equal the average: "  + result);
        }
    }



// a function that takes an ArrayList of Item objects as input,
// and returns the name of the most expensive Item
    public String getExpensive(ArrayList<Item> items){
        float maxPrice = 0;
        String nameOf = "";
        for (Item i : items) {
            if (i.getPrice() > maxPrice) {
                maxPrice = i.getPrice();
                nameOf = i.getName();
            }
        }

        return nameOf;
    }
    public void testGetExpensive(ArrayList<Item> items) {
    String result = getExpensive(items);
    String expected = "bag of rocks";
    if (result.equals(expected)) {
        System.out.println("the most expensive item: " + expected + " matches the code: "  + result);
    }
    else{
        System.out.println("the most expensive item: " + expected + " does not match the code: "  + result);
    }
}
    public static void main(String[] args){
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("a single egg", 17));
        items.add(new Item("unknown pickled substance",7));
        items.add(new Item("bag of rocks", 30));
        ItemCalc calculator = new ItemCalc();
        calculator.testGetExpensive(items);
        calculator.testAveragePrice(items);
        calculator.testPrintNames(items);
    
      }


}
