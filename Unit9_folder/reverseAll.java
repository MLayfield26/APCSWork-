mport java.util.*;

public class Main {

    static String reverseWord(String word) {
        String reversedWord = "";
        for (int i=0; i<word.length(); i++) {
            reversedWord = word.charAt(i) + reversedWord;
        }
        return reversedWord;
    }

    public static void main(String[] args) {
        String [] words = {"one", "Two", "Three", "Four", "Five", "Six","Seven"};
        String [] reversedWords = new String[words.length];
        for (int i=0; i<words.length; i++) {
            reversedWords[i] = reverseWord(words[i]);
        }
        System.out.println(Arrays.toString(reversedWords));
    }


}
