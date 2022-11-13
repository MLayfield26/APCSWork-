public class ParrotTrouble{


public static void testParrotTrouble(int time, boolean talking, boolean expected){
    boolean result = ParrotTrouble(time,talking);
    System.out.print("talking? " + talking + ". time? " + time + ". result? "+ result +". expected result? " + expected + ".  code works?: ");

        if(result == expected)
            System.out.println("Works!");
        else
            System.out.println("Doesnt work.");
    }

    public static boolean ParrotTrouble(int time, boolean talking){
           return (talking && (time < 7 || time > 20));
    }
    public static void main(String[] args)
    {
        testParrotTrouble(9, true, false);
        testParrotTrouble(3, false, false);
        testParrotTrouble(22, true, true);
    }

}
