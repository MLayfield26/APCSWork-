public class Unit4{

public static String stringSplosion(String name) {
  String result = "";
  //no thank you to codebat which told me i was doing it wrong but i was doing it right
  //codebat is evil and probably works with the college board
  for (int i=0; i<name.length(); i++) {
    result = result + name.substring(0, i+1);
  }
  return result;
}
}
