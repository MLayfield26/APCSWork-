//
// HelloAlgorithms.java
//


public class HelloAlgorithms
{

    public static int countA(String name)
    {
        int n = 0;

        for (int i=0; i<name.length(); i++)
        {
            String c = name.substring(i, i+1);
            if (c.equals("A") || c.equals("a"))
                n++;
        }

        return n;
    }


    public static void main(String[] args)
    {
        System.out.println("Hello, world!");

        System.out.println("position of A in Chase:" + findA("Chase"));

    }
}
