import java.util.*;
public class filter{
  public static ArrayList<Integer> filterGoodScores(ArrayList<Integer> scores) {
     ArrayList<Integer> highScores = new ArrayList<>();
     for (int score : scores) {
       if (score > 90) {
         highScores.add(score);
       }
     }
     return highScores;
   }

   public static void main(String[] args) {
     ArrayList<Integer> scores = new ArrayList<>();
     scores.add(95);
     scores.add(75);
     scores.add(85);

     ArrayList<Integer> highScores = filterGoodScores(scores);
     System.out.println(highScores);
   }
 }
