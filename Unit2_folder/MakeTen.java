public class MakeTen{


public static void testMakeTen(int number1, int number2){
System.out.print("Does " +number1+ " + " + number2 + "make ten? ");

        if(10 == number1 + number2)
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
        testMakeTen(9, 1);
        testMakeTen(3, 2);
        testMakeTen(22, 12);
    }

}
