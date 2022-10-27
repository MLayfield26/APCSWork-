public class IsVampire{
  public static void main(String[] args){
  int timeA = 5;
  int timeB = 7;
  int timeC = 24;

  int morning = 6;
  int night = 22;



  if(morning > timeA|| timeA > night)
  System.out.println("vampire");
  else
  System.out.println("not vampire");

  if(morning > timeB|| timeB > night)
  System.out.println("vampire");
  else
  System.out.println("not vampire");

  if(morning > timeC|| timeC > night)
  System.out.println("vampire");
  else
  System.out.println("not vampire");
  }

  }
