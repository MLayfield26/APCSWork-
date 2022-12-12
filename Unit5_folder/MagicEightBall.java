public class MagicEightBall {
    //USE PRIVATE FINALLLLL
  private final String[] replies = {"Outlook not so good","no", "It is certain","yes","My sources say no",
"Signs point to yes","Outlook not so good", "Very doubtful"};

  public String ask(String question) {
    //question doesnt matter
    return replies[(int)(Math.random() * replies.length)];
  }
}
