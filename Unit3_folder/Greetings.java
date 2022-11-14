public class Greetings{


public static void testGreetings(String name, String expected){
String result = ("Hello, "+Greetings(name)+", how are you?");
System.out.println(" Greetings:" + result);
System.out.print(" Greeting works? ");


        if(result.equals(expected))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static String Greetings(String name)
    {
           return(name);
    }
    public static void main(String[] args)
    {
        testGreetings("Sarah", "Hello, Sarah, how are you?");
        testGreetings("Madeleine","Hello, Madeleine, how are you?");
        testGreetings("Dr. Kessner","Hello, Dr. Kessner, how are you?");
    }

}
