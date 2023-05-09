import java.util.Arrays;

public class Unit12 {
    public static void main(String[] args) {
        // a) Declare and initialize 10x10 array
        int[][] tenByTenArray = new int[10][10];
        for (int i = 0; i < tenByTenArray.length; i++) {
            for (int j = 0; j < tenByTenArray[i].length; j++) {
                if (i == j) {
                    tenByTenArray[i][j] = 1;
                } else {
                    tenByTenArray[i][j] = 0;
                }
            }
        }

        // i think this is d
        int[][] magicalArray = new int[6][5];
        int value = 1;
        for (int i = 0; i < magicalArray.length; i++) {
            for (int j = 0; j < magicalArray[i].length; j++) {
                magicalArray[i][j] = value;
                value++;
            }
        }

        // c)
        /*
        double[][] doublesArray = {
            {21.0, 22.0, 23.0, 24.0, 25.0},
            {31.0, 32.0, 33.0, 34.0, 35.0},
            {41.0, 42.0, 43.0, 44.0, 45.0},
            {51.0, 52.0, 53.0, 54.0, 55.0}
        };
        */
        // real
        double[][] doublesArray = new double[5][5];
        double thing = 11.0;
        for (int i = 0; i < doublesArray.length; i++) {
            for (int j = 0; j < doublesArray[i].length; j++) {
                doublesArray[i][j] = thing;
                thing++;
            }
        }
        ///????? thing
      String[][] stringArray = {
            {"Hello", "World"},
            {"Alene", "Sarah"}
        };

        // Testing the arrays
        //NOTE I HAD TO GOOGLE HOW TO PRINT ARRAYS OTHERWISE IT JUST PRINTS SILLY NONSENSE
      //THAT MY FEEBLE HUMAN BRAIN CANNOT COMPREHEND
        System.out.println("A:");
        System.out.println(Arrays.deepToString(tenByTenArray));

        System.out.println("B:");
        System.out.println(Arrays.deepToString(stringArray));

        System.out.println("D:");
        System.out.println(Arrays.deepToString(magicalArray));

        System.out.println("C:");
        System.out.println(Arrays.deepToString(doublesArray));
    }
}

//wake up
