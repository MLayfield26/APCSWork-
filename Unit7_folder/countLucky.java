import java.util.*;
public class countLucky{
  public static void main(String[] args){

      ArrayList<Integer> names = new ArrayList<Integer>();
        names.add(21);
        names.add(5);
        names.add(9);
        names.add(7);

//for(int i = 0;i> names.size();i++){
int result = 0;
for(int n : names){
if (n % 7 == 0) {
 System.out.println(n + " is lucky");
}
else
System.out.println(n + " isnt lucky");
}
}

}
