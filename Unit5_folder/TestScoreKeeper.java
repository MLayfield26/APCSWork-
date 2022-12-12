public class TestScoreKeeper {
  public static void main(String[] args) {
    ScoreKeeper scoreKeeper = new ScoreKeeper();

    scoreKeeper.scoreNormal();
    System.out.println("Normal Score: " + scoreKeeper.getScore());
    scoreKeeper.scoreBonus();
    System.out.println("Bonus Score: " + scoreKeeper.getScore());
  }
}
