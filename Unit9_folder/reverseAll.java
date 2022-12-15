import java.util.*;

public class Main {

    static String reverseWord(String word) {
        String reversedWord = "";
        for (int i=0; i<word.length(); i++) {
            reversedWord = word.charAt(i) + reversedWord;
        }
        return reversedWord;
    }

    public static String[] reverseAll(String[] strings) {
        String[] reversed = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            reversed[i] = reverseWord(strings[i]);
        }
        return reversed;
    }

    public static void main(String[] args) {
        String [] words = {"one", "Two", "Three", "Four", "Five", "Six","Seven"};
      //  old code below, rewritten above
      //  String [] reversedWords = new String[words.length];
    //    for (int i=0; i<words.length; i++) {
    //        reversedWords[i] = reverseWord(words[i]);
  //      }
  String[] reversed = reverseAll(words);
        System.out.println("reverse: " + Arrays.toString(reversed));
    }


}
