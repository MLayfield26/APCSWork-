public class MakeTen{


public static void testMakeTen(int number1, int number2, boolean expected){
boolean result = MakeTen(number1,number2);
System.out.print("Does " +number1+ " + " + number2 + " = 10? " + result + ". Was that the expected result? ");

        if(result == expected)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean MakeTen(int number1, int number2)
    {
           return (10 == number1 + number2);
    }
    public static void main(String[] args)
    {
        testMakeTen(9, 1, true);
        testMakeTen(3, 2, false);
        testMakeTen(22, -12, true);
    }

}
