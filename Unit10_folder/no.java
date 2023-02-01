//test itemCalculator (ItemCalc)

class CalcTest{
    public void testGetAveragePrice() {

        ItemCalc calculator = new ItemCalc();

        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("a single egg", 17));
        items.add(new Item("unknown pickled substance", 7));
        items.add(new Item("bag of", 30));


        assertEquals(20, calculator.getAveragePrice(items), 0.001);
    }



    public void testGetMostExpensive() {
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("a single egg", 17));
        items.add(new Item("unknown pickled substance", 7));
        items.add(new Item("bag of", 30));
        ItemCalculator calc = new ItemCalculator();
        assertEquals("item3", calculator.getMostExpensive(items));
    }
}
