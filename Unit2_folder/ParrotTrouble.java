public class ParrotTrouble{


public static void testParrotTrouble(int time, boolean talking){
System.out.print(" is talking? " +talking+ " time? " + time + " situation?");

        if(talking && (time > 7 || time > 20))
            System.out.println("Trouble");
        else
            System.out.println("Safe");
    }

    public static boolean ParrotTrouble(int time, boolean talking)
    {
           return (talking && (time > 7 || time > 20));
    }
    public static void main(String[] args)
    {
        testParrotTrouble(9, true);
        testParrotTrouble(3, false);
        testParrotTrouble(22, true);
    }

}
