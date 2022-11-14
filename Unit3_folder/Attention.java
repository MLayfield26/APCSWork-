public class Attention{


public static void testAttention(String phrase, String heyYou, boolean expected){
Boolean result = heyYou.equals(phrase.substring(0, 9));

System.out.print("Does " +phrase+ "'s first 9 letters equal: " + heyYou + "? ");



if(result == expected)
            System.out.println("Yes");
        else
            System.out.println("No");

}


    public static Boolean Attention(String phrase, String heyYou){

  return(heyYou.equals(phrase.substring(0, 9)) || heyYou.equals(phrase));
}

    public static void main(String[] args)
    {
   testAttention("Hello, viewer!","hey, you!", false);
     testAttention("hey, you! go away!","hey, you!", true);
       testAttention("Is this a random sentance here?","hey, you!", false);
    }

}
